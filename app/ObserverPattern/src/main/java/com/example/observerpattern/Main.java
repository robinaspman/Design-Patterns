package com.example.observerpattern;

import com.example.observerpattern.interfaces.Observer;
import com.example.observerpattern.model.EmailTopic;
import com.example.observerpattern.model.EmailTopicSubscriber;

public class Main {
    public static void main(String[] args) {

        EmailTopic topic = new EmailTopic();

        //create observers
        Observer firstObserver = new EmailTopicSubscriber("FirstObserver");

        Observer secondObserver = new EmailTopicSubscriber("secondObserver");

        Observer thirdObserver = new EmailTopicSubscriber("thirdObserver");

        //Register them...
        topic.register((java.util.Observer) firstObserver);
        topic.register((java.util.Observer) secondObserver);
        topic.register((java.util.Observer) thirdObserver);

        // Attaching observer to subject
        firstObserver.setSubject(topic);
        secondObserver.setSubject(topic);
        thirdObserver.setSubject(topic);

        //Check for updates
        firstObserver.update();

        //Provider/ Subject ( broadcaster )
        topic.postMessage("Hello Subscribers!");

        topic.unregister((java.util.Observer) firstObserver);

        topic.postMessage("Hello Subscribers");




    }
}