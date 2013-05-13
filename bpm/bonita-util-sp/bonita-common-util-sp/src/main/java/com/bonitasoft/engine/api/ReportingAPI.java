/*******************************************************************************
 * Copyright (C) 2013 BonitaSoft S.A.
 * BonitaSoft is a trademark of BonitaSoft SA.
 * This software file is BONITASOFT CONFIDENTIAL. Not For Distribution.
 * For commercial licensing information, contact:
 * BonitaSoft, 32 rue Gustave Eiffel – 38000 Grenoble
 * or BonitaSoft US, 51 Federal Street, Suite 305, San Francisco, CA 94107
 *******************************************************************************/
package com.bonitasoft.engine.api;

import java.util.List;

import org.bonitasoft.engine.exception.CreationException;
import org.bonitasoft.engine.reporting.Report;
import org.bonitasoft.engine.reporting.ReportNotFoundException;

import com.bonitasoft.engine.reporting.ReportAlreadyExistsException;
import com.bonitasoft.engine.reporting.ReportDeletionException;

/**
 * @author Matthieu Chaffotte
 */
public interface ReportingAPI extends org.bonitasoft.engine.api.ReportingAPI {

    Report addReport(String name, final String description, byte[] content) throws ReportAlreadyExistsException, CreationException;

    void deleteReport(long reportId) throws ReportNotFoundException, ReportDeletionException;

    void deleteReports(List<Long> reportIds) throws ReportNotFoundException, ReportDeletionException;

}
