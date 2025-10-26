package com.java.designpatterns;

//The Decorator pattern attaches additional responsibilities to an object dynamically.
//Decorators provide a flexible alternative to subclassing for extending functionalit
public class DecoratorPattern {
	public static void main(String[] args) {
		// Create a basic component
		Component basicComponent = new ConcreteComponent();

		// Wrap the basic component with a decorator
		Component decoratedComponent = new ConcreteDecorator(basicComponent);

		// Execute the operation
		decoratedComponent.operation();
		
		Component anotherDecoratedComponent = new AnotherDecorator(decoratedComponent);
		anotherDecoratedComponent.operation();
	}
}

interface Component {
	void operation();
}

class ConcreteComponent implements Component {
	@Override
	public void operation() {
		System.out.println("ConcreteComponent: Performing operation.");
	}
}

abstract class Decorator implements Component {
	private Component component;

	public Decorator(Component component) {
		this.component = component;
	}

	@Override
	public void operation() {
		component.operation();
	}
}

class ConcreteDecorator extends Decorator {
	public ConcreteDecorator(Component component) {
		super(component);
	}

	@Override
	public void operation() {
		super.operation(); // Call the wrapped component's operation
		addBehavior(); // Add additional behavior
	}

	private void addBehavior() {
		System.out.println("ConcreteDecorator: Adding extra behavior.");
	}
}

class AnotherDecorator extends Decorator {
    public AnotherDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        additionalBehavior();
    }

    private void additionalBehavior() {
        System.out.println("AnotherDecorator: Adding another layer of behavior.");
    }
}
