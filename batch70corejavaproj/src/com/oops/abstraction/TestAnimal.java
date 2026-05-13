package com.oops.abstraction;

public class TestAnimal {

	public static void main(String[] args) {

//		List<Integer> al = new ArrayList<>();
//		al.add(100);

		System.out.println("************Dog Object info ***************");
//		Dog Object we are storing it into Animal interface : UpCasting or abstraction
//		Animal d  = new Animal();//Cannot instantiate the type Animal

		Animal d = new Dog();
		System.out.println(Animal.ORGANISANTION_NAME);
		d.sleep();
		d.sound();
		d.eat();
		d.walk();
		d.hunt();
		d.drink();
//		Actual class static methods, we can call by using Object reference variables but not 
//		interface static methods, interface static methods, we can call only by using interface names. 
//		This static method of interface Animal can only be accessed as Animal.breath
//		d.breath(); CE 
		Animal.breath();
		Animal.hello();

		System.out.println("**************Cat Object info ");
		Animal c = new Cat();
		c.sleep();
		c.eat();
		c.sound();
		c.walk();
		c.drink();
		Animal.breath();
		

		d.hunt();

		Animal l = new Lion();
		l.hunt();

	}
}
