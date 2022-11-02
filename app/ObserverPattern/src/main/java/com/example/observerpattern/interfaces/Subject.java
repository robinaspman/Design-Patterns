package com.example.observerpattern.interfaces;

import java.util.Observer;

public interface Subject {
    public void register(Observer observer);
    public void unregister(Observer observer);

    public void notifyObservers();

    public Object getUpdate(Observer observer);
}
