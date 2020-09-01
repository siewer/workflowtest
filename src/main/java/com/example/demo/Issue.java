package com.example.demo;

public class Issue {
    BugTrackingSystem bugTrackerType;
    String subject;
    String description;
    String severity;
    String asignee;


    //getters & setters


    public BugTrackingSystem getBugTrackerType() {
        return bugTrackerType;
    }

    public void setBugTrackerType(BugTrackingSystem bugTrackerType) {
        this.bugTrackerType = bugTrackerType;
    }
}
