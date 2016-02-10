/*******************************************************************************
 * Copyright (C) 2015 BonitaSoft S.A.
 * BonitaSoft is a trademark of BonitaSoft SA.
 * This software file is BONITASOFT CONFIDENTIAL. Not For Distribution.
 * For commercial licensing information, contact:
 * BonitaSoft, 32 rue Gustave Eiffel – 38000 Grenoble
 * or BonitaSoft US, 51 Federal Street, Suite 305, San Francisco, CA 94107
 *******************************************************************************/
package com.bonitasoft.engine.identity;

import static org.junit.Assert.assertEquals;

import org.bonitasoft.engine.api.IdentityAPI;
import org.bonitasoft.engine.exception.BonitaException;
import org.bonitasoft.engine.identity.Role;
import org.bonitasoft.engine.session.APISession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.bonitasoft.engine.BPMTestSPUtil;
import com.bonitasoft.engine.CommonAPISPIT;
import com.bonitasoft.engine.api.TenantAPIAccessor;

public class SPRoleTest extends CommonAPISPIT {

    private static APISession session;

    @Before
    public void before() throws BonitaException {
        session = BPMTestSPUtil.loginOnDefaultTenantWithDefaultTechnicalUser();
    }

    @After
    public void after() throws BonitaException {
        BPMTestSPUtil.logoutOnTenant();
    }

    @Test
    public void aSameRoleNameCanBeUseInTwoTenants() throws BonitaException {
        final String role = "role";
        final long tenantId1 = BPMTestSPUtil.createAndActivateTenantWithDefaultTechnicalLogger("tenant1");
        final APISession session1 = BPMTestSPUtil.loginOnTenantWithDefaultTechnicalUser(tenantId1);
        final IdentityAPI identityAPI1 = TenantAPIAccessor.getIdentityAPI(session1);
        final Role role1 = identityAPI1.createRole(role);

        final APISession session2 = BPMTestSPUtil.loginOnDefaultTenantWithDefaultTechnicalUser();
        final IdentityAPI identityAPI2 = TenantAPIAccessor.getIdentityAPI(session2);
        final Role role2 = identityAPI2.createRole(role);

        assertEquals(role, role1.getName());
        assertEquals(role1.getName(), role2.getName());
        identityAPI1.deleteRole(role1.getId());
        identityAPI2.deleteRole(role2.getId());

        BPMTestSPUtil.logoutOnTenant();
        BPMTestSPUtil.deactivateAndDeleteTenant(tenantId1);
        BPMTestSPUtil.logoutOnTenant();
    }

}