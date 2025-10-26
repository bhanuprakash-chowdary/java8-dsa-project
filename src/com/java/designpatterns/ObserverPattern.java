package com.java.designpatterns;

import java.util.ArrayList;
import java.util.List;

//The Observer pattern defines a one-to-many dependency between objects
//so that when one object changes state, all its dependents are notified and updated automatically.
public class ObserverPattern {

	public static void main(String[] args) {
		Subject subject=new Subject();
		
		Observer observer1=new ConcreteObserver("Observer 1");
		Observer observer2=new ConcreteObserver("Observer 2");
		subject.addObserver(observer2);
		subject.addObserver(observer1);
		
		subject.notifyObservers("All Observers");
	}
}

interface Observer {
    void update(String message);
}

class ConcreteObserver implements Observer {
	
	private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }
    @Override
    public void update(String message) {
    	 System.out.println(name + " received message: " + message);
    }
}

class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
