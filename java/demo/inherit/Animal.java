package cn.codergege.demo;

public class Animal {
	public void eat() {
		System.out.println("animal eat");
	}
	public void live() {
		eat();
		System.out.println("animal live");
	}
}

class Cat extends Animal{

	public void eat() {
		System.out.println("cat eat");
	}
	public void live() {
		super.live();
	}

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.live();
	}
}
