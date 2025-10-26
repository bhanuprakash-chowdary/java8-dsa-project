package com.java.designpatterns;

public class AdapterPattern {
	public static void main(String[] args) {
		// Create an instance of Adaptee
		Adaptee adaptee = new Adaptee();

		// Wrap it with an Adapter
		Target target = new Adapter(adaptee);

		// Call the request method, which internally calls Adaptee's specificRequest
		target.request();
	}
}

interface Target {
    void request();
}

class Adaptee {
    public void specificRequest() {
    	 System.out.println("Adaptee: Handling specific request.");
    }
}

class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
