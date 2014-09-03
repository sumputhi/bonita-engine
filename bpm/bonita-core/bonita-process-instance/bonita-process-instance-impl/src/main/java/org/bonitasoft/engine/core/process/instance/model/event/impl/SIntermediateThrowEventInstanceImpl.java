/**
 * Copyright (C) 2012 BonitaSoft S.A.
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
package org.bonitasoft.engine.core.process.instance.model.event.impl;

import org.bonitasoft.engine.core.process.definition.model.SFlowNodeType;
import org.bonitasoft.engine.core.process.instance.model.event.SIntermediateThrowEventInstance;

/**
 * @author Matthieu Chaffotte
 * @author Celine Souchet
 */
public class SIntermediateThrowEventInstanceImpl extends SThrowEventInstanceImpl implements SIntermediateThrowEventInstance {

    private static final long serialVersionUID = -7858545825600523724L;

    public SIntermediateThrowEventInstanceImpl() {
        super();
    }

    public SIntermediateThrowEventInstanceImpl(final String name, final long flowNodeDefinitionId, final long rootContainerId, final long parentContainerId,
            final long logicalGroup1, final long logicalGroup2) {
        super(name, flowNodeDefinitionId, rootContainerId, parentContainerId, logicalGroup1, logicalGroup2);
    }

    @Override
    public SFlowNodeType getType() {
        return SFlowNodeType.INTERMEDIATE_THROW_EVENT;
    }

}