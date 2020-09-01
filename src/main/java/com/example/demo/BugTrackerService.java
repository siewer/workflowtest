package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BugTrackerService {
    private final BugzillaClient bugzillaClient;
    private final JiraClient jiraClient;
    private static final String JIRA_TYPE = "Jira";
    private static final String BUGZILLA_TYPE = "Bugzilla";

    @Autowired
    BugTrackerService(BugzillaClient bugzillaClient, JiraClient jiraClient) {
        this.bugzillaClient = bugzillaClient;
        this.jiraClient = jiraClient;
    }

    <T extends BugzillaClient> boolean issueTicket(Issue issue) {
        if (issue.getBugTrackerType().bugTrackingSystemType.name.equals(JIRA_TYPE)) {
            return jiraClient.createAndSendIssue(issue);
        } else if (issue.getBugTrackerType().bugTrackingSystemType.name.equals(BUGZILLA_TYPE)) {
            return bugzillaClient.createAndSendIssue(issue);
        } else {
            return false;
        }
    }
}
