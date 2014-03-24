/**
 * Copyright (C) 2012-2013 BonitaSoft S.A.
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
package org.bonitasoft.engine.search.descriptor;

/**
 * @author Matthieu Chaffotte
 * @author Zhang Bole
 * @author Yanyan Liu
 * @author Celine Souchet
 */
public class SearchEntitiesDescriptor {

    private final SearchUserDescriptor searchUserDescriptor;

    private final SearchRoleDescriptor searchRoleDescriptor;

    private final SearchGroupDescriptor searchGroupDescriptor;

    private final SearchProcessInstanceDescriptor searchProcessInstanceDescriptor;

    private final SearchArchivedProcessInstancesDescriptor searchArchivedProcessInstanceDescriptor;

    private final SearchHumanTaskInstanceDescriptor searchHumanTaskInstanceDescriptor;

    private final SearchArchivedHumanTaskInstanceDescriptor searchArchivedHumanTaskInstanceDescriptor;

    private final SearchProcessDefinitionsDescriptor searchProcessDefinitionsDescriptor;

    private final SearchCommentDescriptor searchCommentDescriptor;

    private final SearchDocumentDescriptor searchDocumentDescriptor;

    private final SearchEntityMemberUserDescriptor searchEntityMemberUserDescriptor;

    private final SearchArchivedDocumentDescriptor searchArchivedDocumentDescriptor;

    private final SearchActivityInstanceDescriptor searchActivityInstanceDescriptor;

    private final SearchFlowNodeInstanceDescriptor searchFlowNodeInstanceDescriptor;

    private final SearchArchivedActivityInstanceDescriptor searchArchivedActivityInstanceDescriptor;

    private final SearchArchivedCommentsDescriptor searchArchivedCommentsDescriptor;

    private final SearchArchivedConnectorInstanceDescriptor searchArchivedConnectorInstanceDescriptor;

    private final SearchCommandDescriptor searchCommandDescriptor;

    private final SearchArchivedFlowNodeInstanceDescriptor searchArchivedFlowNodeInstanceDescriptor;

    private final SearchConnectorInstanceDescriptor searchConnectorInstanceDescriptor;

    private final SearchProfileDescriptor searchProfileDescriptor;

    private final SearchProfileEntryDescriptor searchProfileEntryDescriptor;

    private final SearchProfileMemberUserDescriptor searchProfileMemberUserDescriptor;

    private final SearchProfileMemberGroupDescriptor searchProfileMemberGroupDescriptor;

    private final SearchProfileMemberRoleDescriptor searchProfileMemberRoleDescriptor;

    private final SearchProfileMemberRoleAndGroupDescriptor searchProfileMemberRoleAndGroupDescriptor;

    private final SearchThemeDescriptor searchThemeDescriptor;

    public SearchEntitiesDescriptor() {
        searchUserDescriptor = new SearchUserDescriptor();
        searchRoleDescriptor = new SearchRoleDescriptor();
        searchGroupDescriptor = new SearchGroupDescriptor();
        searchProcessInstanceDescriptor = new SearchProcessInstanceDescriptor();
        searchArchivedProcessInstanceDescriptor = new SearchArchivedProcessInstancesDescriptor();
        searchHumanTaskInstanceDescriptor = new SearchHumanTaskInstanceDescriptor();
        searchArchivedHumanTaskInstanceDescriptor = new SearchArchivedHumanTaskInstanceDescriptor();
        searchProcessDefinitionsDescriptor = new SearchProcessDefinitionsDescriptor();
        searchCommentDescriptor = new SearchCommentDescriptor();
        searchConnectorInstanceDescriptor = new SearchConnectorInstanceDescriptor();
        searchDocumentDescriptor = new SearchDocumentDescriptor();
        searchEntityMemberUserDescriptor = new SearchEntityMemberUserDescriptor();
        searchArchivedDocumentDescriptor = new SearchArchivedDocumentDescriptor();
        searchActivityInstanceDescriptor = new SearchActivityInstanceDescriptor();
        searchArchivedActivityInstanceDescriptor = new SearchArchivedActivityInstanceDescriptor();
        searchArchivedCommentsDescriptor = new SearchArchivedCommentsDescriptor();
        searchArchivedConnectorInstanceDescriptor = new SearchArchivedConnectorInstanceDescriptor();
        searchFlowNodeInstanceDescriptor = new SearchFlowNodeInstanceDescriptor();
        searchCommandDescriptor = new SearchCommandDescriptor();
        searchArchivedFlowNodeInstanceDescriptor = new SearchArchivedFlowNodeInstanceDescriptor();
        searchProfileDescriptor = new SearchProfileDescriptor();
        searchProfileEntryDescriptor = new SearchProfileEntryDescriptor();
        searchProfileMemberUserDescriptor = new SearchProfileMemberUserDescriptor();
        searchProfileMemberGroupDescriptor = new SearchProfileMemberGroupDescriptor();
        searchProfileMemberRoleDescriptor = new SearchProfileMemberRoleDescriptor();
        searchProfileMemberRoleAndGroupDescriptor = new SearchProfileMemberRoleAndGroupDescriptor();
        searchThemeDescriptor = new SearchThemeDescriptor();
    }

    public SearchUserDescriptor getSearchUserDescriptor() {
        return searchUserDescriptor;
    }

    public SearchRoleDescriptor getSearchRoleDescriptor() {
        return searchRoleDescriptor;
    }

    public SearchGroupDescriptor getSearchGroupDescriptor() {
        return searchGroupDescriptor;
    }

    public SearchProcessInstanceDescriptor getSearchProcessInstanceDescriptor() {
        return searchProcessInstanceDescriptor;
    }

    public SearchArchivedProcessInstancesDescriptor getSearchArchivedProcessInstanceDescriptor() {
        return searchArchivedProcessInstanceDescriptor;
    }

    public SearchHumanTaskInstanceDescriptor getSearchHumanTaskInstanceDescriptor() {
        return searchHumanTaskInstanceDescriptor;
    }

    public SearchArchivedHumanTaskInstanceDescriptor getSearchArchivedHumanTaskInstanceDescriptor() {
        return searchArchivedHumanTaskInstanceDescriptor;
    }

    public SearchProcessDefinitionsDescriptor getSearchProcessDefinitionsDescriptor() {
        return searchProcessDefinitionsDescriptor;
    }

    public SearchCommentDescriptor getSearchCommentDescriptor() {
        return searchCommentDescriptor;
    }

    public SearchDocumentDescriptor getSearchDocumentDescriptor() {
        return searchDocumentDescriptor;
    }

    public SearchEntityMemberUserDescriptor getSearchEntityMemberUserDescriptor() {
        return searchEntityMemberUserDescriptor;
    }

    public SearchArchivedDocumentDescriptor getSearchArchivedDocumentDescriptor() {
        return searchArchivedDocumentDescriptor;
    }

    public SearchActivityInstanceDescriptor getSearchActivityInstanceDescriptor() {
        return searchActivityInstanceDescriptor;
    }

    public SearchFlowNodeInstanceDescriptor getSearchFlowNodeInstanceDescriptor() {
        return searchFlowNodeInstanceDescriptor;
    }

    public SearchArchivedActivityInstanceDescriptor getSearchArchivedActivityInstanceDescriptor() {
        return searchArchivedActivityInstanceDescriptor;
    }

    public SearchArchivedCommentsDescriptor getSearchArchivedCommentsDescriptor() {
        return searchArchivedCommentsDescriptor;
    }

    public SearchArchivedConnectorInstanceDescriptor getSearchArchivedConnectorInstanceDescriptor() {
        return searchArchivedConnectorInstanceDescriptor;
    }

    public SearchCommandDescriptor getSearchCommandDescriptor() {
        return searchCommandDescriptor;
    }

    public SearchArchivedFlowNodeInstanceDescriptor getSearchArchivedFlowNodeInstanceDescriptor() {
        return searchArchivedFlowNodeInstanceDescriptor;
    }

    public SearchConnectorInstanceDescriptor getSearchConnectorInstanceDescriptor() {
        return searchConnectorInstanceDescriptor;
    }

    public SearchProfileDescriptor getSearchProfileDescriptor() {
        return searchProfileDescriptor;
    }

    public SearchProfileEntryDescriptor getSearchProfileEntryDescriptor() {
        return searchProfileEntryDescriptor;
    }

    public SearchProfileMemberUserDescriptor getSearchProfileMemberUserDescriptor() {
        return searchProfileMemberUserDescriptor;
    }

    public SearchProfileMemberGroupDescriptor getSearchProfileMemberGroupDescriptor() {
        return searchProfileMemberGroupDescriptor;
    }

    public SearchProfileMemberRoleDescriptor getSearchProfileMemberRoleDescriptor() {
        return searchProfileMemberRoleDescriptor;
    }

    public SearchProfileMemberRoleAndGroupDescriptor getSearchProfileMemberRoleAndGroupDescriptor() {
        return searchProfileMemberRoleAndGroupDescriptor;
    }

    public SearchThemeDescriptor getSearchThemeDescriptor() {
        return searchThemeDescriptor;
    }

}