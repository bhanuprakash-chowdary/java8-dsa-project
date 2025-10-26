package com.java.generics;

public class Generics {

	public static void main(String[] args) {

		Generic<String> value = new Generic<>();

		value.setValue("String");
		String values = value.getValue();
		System.out.println(values);

	}

}

class Generic<T> {
	public T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}