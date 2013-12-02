/**
 * Copyright (C) 2013 BonitaSoft S.A.
 * BonitaSoft, 32 rue Gustave Eiffel - 38000 Grenoble
 * This library is free software; you can redistribute it and/or modify it under the terms
 * of the GNU Lesser General Public License as published by the Free Software Foundation
 * version 2.1 of the License.
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License along with this
 * program; if not, write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth
 * Floor, Boston, MA 02110-1301, USA.
 **/
package com.bonitasoft.engine.looknfeel.impl;

import java.util.Arrays;
import java.util.Date;

import org.bonitasoft.engine.bpm.BaseElementImpl;

import com.bonitasoft.engine.looknfeel.LookNFeel;
import com.bonitasoft.engine.looknfeel.LookNFeelType;

/**
 * @author Celine Souchet
 */
public class LookNFeelImpl extends BaseElementImpl implements LookNFeel {

    private static final long serialVersionUID = 5445403438892593799L;

    private byte[] content;

    private boolean isDefault;

    private Date lastUpdatedDate;

    private LookNFeelType type;

    public LookNFeelImpl(final byte[] content, final boolean isDefault, final LookNFeelType type, final Date lastUpdatedDate) {
        super();
        this.content = content;
        this.isDefault = isDefault;
        this.lastUpdatedDate = lastUpdatedDate;
        this.type = type;
    }

    @Override
    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    @Override
    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    @Override
    public LookNFeelType getType() {
        return type;
    }

    public void setType(LookNFeelType type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((lastUpdatedDate == null) ? 0 : lastUpdatedDate.hashCode());
        result = prime * result + (isDefault ? 1231 : 1237);
        result = prime * result + Arrays.hashCode(content);
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LookNFeelImpl other = (LookNFeelImpl) obj;
        if (!super.equals(obj)) {
            return false;
        }
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        if (lastUpdatedDate == null) {
            if (other.lastUpdatedDate != null)
                return false;
        } else if (!lastUpdatedDate.equals(other.lastUpdatedDate))
            return false;
        if (!Arrays.equals(content, other.content))
            return false;
        return true;
    }

}
