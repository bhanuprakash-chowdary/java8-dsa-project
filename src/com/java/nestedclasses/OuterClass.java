package com.java.nestedclasses;

public class OuterClass {
    private String outerField = "I’m from OuterClass";

    // Static nested class
    static class StaticNestedClass {
        private String nestedField;

        // Constructor
        public StaticNestedClass(String value) {
            this.nestedField = value;
        }

        public void display() {
            System.out.println("StaticNestedClass: " + nestedField);
            // Note: Cannot access outerField directly because this is static
        }
    }

    // Non-static inner class (for comparison)
    class InnerClass {
        private String innerField;

        public InnerClass(String value) {
            this.innerField = value;
        }

        public void display() {
            System.out.println("InnerClass: " + innerField + ", OuterField: " + outerField);
            // Can access outerField because this is tied to an OuterClass instance
        }
    }

    // Method to test instantiation from within OuterClass
    public void testNestedClasses() {
        // Instantiate static nested class (no OuterClass instance needed here)
        StaticNestedClass staticObj = new StaticNestedClass("Static Instance");
        staticObj.display();

        // Instantiate non-static inner class (requires this OuterClass instance)
        InnerClass innerObj = new InnerClass("Inner Instance");
        innerObj.display();
    }

    public static void main(String[] args) {
        // Test static nested class directly (no OuterClass instance needed)
        StaticNestedClass staticObj1 = new OuterClass.StaticNestedClass("From Main 1");
        staticObj1.display();

        StaticNestedClass staticObj2 = new OuterClass.StaticNestedClass("From Main 2");
        staticObj2.display();

        // Test with an OuterClass instance
        OuterClass outer = new OuterClass();
        outer.testNestedClasses();

        // Test non-static inner class (requires OuterClass instance)
        OuterClass.InnerClass innerObj = outer.new InnerClass("From Main");
        innerObj.display();
    }
}
