package com.example.observerpattern.model;

import com.example.observerpattern.interfaces.Observer;
import com.example.observerpattern.interfaces.Subject;

import sun.jvm.hotspot.debugger.win32.coff.DebugVC50SSSrcLnSeg;

public class EmailTopicSubscriber implements Observer {
    private String name;

    //Reference to our Subject class
    private Subject topic;

    public EmailTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String) topic.getUpdate((java.util.Observer) this);
        if (msg == null)
            System.out.println(name + " No new message on this topic!");
        else
            System.out.println(name + " Retrieving message: " + msg);
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;

    }
}
