package com.company;

import java.util.ArrayList;
import java.util.List;

class Container<T extends Number>{
	T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public void show(){
		System.out.println(value.getClass().getName());
	}

	public void demo(ArrayList<? extends T> obj) {

	}

//	public void demo(ArrayList<? super T> obj) {
//
//	}
}

public class Main {

    public static void main(String[] args) {
//	    int value = 5;

//      //Generics provides type safty at compile time.
//	    List<Integer> values = new ArrayList<Integer>();
//
//	    values.add(7);
//	    values.add("Shang");


		//in the <>. it has to be classes like Integer/Double, not int/double
		Container<Number> obj = new Container<>();
//		obj.value=9.9;
		obj.show();
		obj.demo(new ArrayList<Number>());

    }
}
