package com.designpattern.CreationalDesignPattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingleTon {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Samosa samosa1 = Samosa.getSamosa();
		System.out.println(samosa1.hashCode());
		Samosa samosa2 = Samosa.getSamosa();
		System.out.println(samosa2.hashCode());
		
		
		Apple apple1 = Apple.getApple();
		Apple apple2 = Apple.getApple();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abs.ob"));
		oos.writeObject(apple1);
		
		System.out.println("Serization done..");
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abs.ob"));
		Apple a2 = (Apple)ois.readObject();
		System.out.println(a2.hashCode());
		
		System.out.println(apple1.hashCode());
		System.out.println(apple2.hashCode());
	}
}

// Constructor private;
// Object created with the help of method
// create field to store object is private
//

class Samosa {
	private static Samosa samosa;
	
	private Samosa() {
		
	};
	// Lazy way to create single object 
	public static Samosa getSamosa() {
		if(samosa == null) {
			samosa = new Samosa();
		}
		return samosa;
	}
}


// for synchronized case

class Apple{
	private static Apple apple;
	
	private Apple() {
		
	}
	
	public static Apple getApple() {
		if(apple == null) {
			synchronized(Apple.class) {
				apple = new Apple();
			}
		}
		return apple;
	}
}






















