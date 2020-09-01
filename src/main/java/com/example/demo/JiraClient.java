package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class JiraClient implements BugTracker {
    @Override
    public boolean createAndSendIssue(Issue issue) {
        //Logic for using JIRA REST API
        return false;
    }

    @Override
    public boolean updateAndSendIssue(Issue issue) {
        //Logic for using JIRA REST API
        return false;
    }

    @Override
    public boolean closeIssue(Issue issue) {
        //Logic for using JIRA REST API
        return false;
    }
}
