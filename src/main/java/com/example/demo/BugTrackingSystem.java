package com.example.demo;

public class BugTrackingSystem {
    String url;
    String username;
    String password;
    BugTrackingSystemType bugTrackingSystemType;

    //getters & setters

    public BugTrackingSystemType getBugTrackingSystemType() {
        return bugTrackingSystemType;
    }

    public void setBugTrackingSystemType(BugTrackingSystemType bugTrackingSystemType) {
        this.bugTrackingSystemType = bugTrackingSystemType;
    }
}
