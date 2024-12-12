package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	String name;
	int age;
	String breed;
	
	public Dog() {
		name = "Clifford";
		breed = "Big red dog";
		age = 3;
	}
	
	public Dog(String name) {
		this.name = name;
		breed = "dog dog";
		age = 1;
	}
	
	public Dog(String name, int age) {
		this.name = name;
		breed = "dog dog";
		this.age = age;
	}
	
	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
		age = 1;
	}
	
	public void setName(String input) {
		this.name = input;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public static boolean isSleeping() {
		int randomNum = (int) (Math.random() * 131132) + 781389;
		
		if(randomNum % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void bark() {
		System.out.println(name + ": BARK BARK");
	}
	
	

}
