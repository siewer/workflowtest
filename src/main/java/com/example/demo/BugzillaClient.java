package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class BugzillaClient implements BugTracker {

    @Override
    public boolean createAndSendIssue(Issue issue) {
        //Logic for using BUGZILLA REST API
        return false;
    }

    @Override
    public boolean updateAndSendIssue(Issue issue) {
        //Logic for using BUGZILLA REST API
        return false;
    }

    @Override
    public boolean closeIssue(Issue issue) {
        //Logic for using BUGZILLA REST API
        return false;
    }
}
