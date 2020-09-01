package com.example.demo;

public interface BugTracker {
    boolean createAndSendIssue(Issue issue);

    boolean updateAndSendIssue(Issue issue);

    boolean closeIssue(Issue issue);
}
