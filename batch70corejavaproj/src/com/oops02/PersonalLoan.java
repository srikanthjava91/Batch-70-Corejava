package com.oops02;

import java.util.Scanner;

//Child or Sub or Derived class 
public class PersonalLoan extends LoanImpl {

	static Scanner sc = new Scanner(System.in);

	void getPersonalLoanDocInfo() {
		System.out.println("Submitted all the documents Successfully !!");
	}

//	Method Overriding Rules : 

//	1) Method signature must be same. 
//	Note : Method signature means method name + arguments, but not return type.

//	2) Method Return type must be same Until 1.4 version, 
//	From 1.5 onwards we can use Co-varient return types.

//	Note : If the Parent class method return type is Primitive data type, 
//	child class must be same primitive return type even after 1.5 version. 

//	     : If the Parent class method return type is any Object data type, 
//	then the Child class can be same return type or it's sub-type is the concept called co-varient return type.

//	Co-varient return type ex: 
//	P --> Number --> Child --> Number, Long, Double, Integer ......
//	P --> Object --> Child --> Object, String, StringBuffer, Employee....any obj
//  P --> String --> Child --> String only because String does not have any sub classes.

//	3) The Scope of method Overriding should not reduced.
//	CE : Cannot reduce the visibility of the inherited method from Loan

//	Note : private < <default> < protected < public  
//	If the Parent class method access modifier is public    --> child class access modifier  must be public.
//	If the Parent class method access modifier is protected --> child class access modifier  can be protected or public.
//	If the Parent class method access modifier is <default> --> child class access modifier can be <default> or protected or public.
//  If the Parent class method access modifier is private   --> we cannot override those methods into child class.

//	4) From Parent class, private methods we cannot override, because the scope private is within the class.
//	Note : If I am creating private method in Parent class, 
//	Should I create same method in child class with private access modifier or any access modifier.?
//	Yes until you use @Override annotation. If we use @Override annotation its not considering as MOR (CE).

//	5) If the Parent class method is static, We cannot override, because the static methods are loading when the class is loading, 
//	but MOR concepts is depending on Object creation. This process is called Method Hiding.

//	Note : If the Parent class consist of static method, should we create same method in child class with static ..? 
//	Yes until you use @Override annotation. If we use @Override annotation its not considering as MOR (CE).

//	6) If the Parent class method is final, we cannot override final methods into child class.

//	Note : final is a non-access modifier to provide some specifications in Java like below.
//	i)If the class is final, we cannot extends that class for Child. 
//	(The type TestB cannot subclass the final class TestA)
//	ii) If the Parent class method is final, we cannot override those methods into child.
//	(Cannot override the final method from TestA)
//	Note: If the class is final, all methods inside that class is also final.
//	ii) If the variable is final, we cannot change the value of a variable.
//	Note : : If the class is final, all variables inside that class is not final.

//	Note : final methods or variables we can access outside of the classes or packages Based on Access modifier.

//	7) If The Parent class method throws any Exception, the child method no need to throws the any exception.
//	But, If the child class method throws any Exception, then the Parent class must throws the same exception or it's parent Exception.

//	8) abstract methods from Abstract class must Override it into child class 
//	and the Implemented method from child class is also have a another child class which is abstract, 
//	Can we Override the Implemented method as abstract method from 1st child class to next child class..? Yes

	String hello() {
		return "hello";
	}

	public Number getPhone() throws CloneNotSupportedException {
		int l = 9972677;
		return l;
	}

	@Override
	public double getROI() {
		return 8.5;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Vcube Personal Loan Banking !!");

//		Scenario 1: By using Child Object & Child Reference, we can call both 
//		Parent class functionalities as well as child class functionalities.
		PersonalLoan pl = new PersonalLoan();

//		Scenario 2: By using Parent Object & Parent Reference, what we call ..? 
//		ans : We can call only Parent Loan class functionalities but not child class functionalities.
		Loan l1 = new LoanImpl();

//		Scenario3 : Can we store Child Object into parent reference ..? 
//		ans : Yes !! which will consider as Up-Casting.
//		If yes ..? Which methods we can call By using Child Object with Parent reference, 
//		Only Parent or Only Child or Both ..? 
//		ans : Only parent functionalities 

//		Dynamic Method Dispatching : Whenever the child object storing into Parent reference,
//		then we can call only Parent class functionalities, 
//		But If any of the method is Overriding from the parent to child 
//		then it calls the child class overridden method only.

		Loan l2 = new PersonalLoan();
		System.out.println("*********" + l2.getROI());

//		Scenario4: Can we store Parent Object into child Reference ..? 
//		If yes ..? Which methods we can call, Only Parent or Only Child or Both ..?
//		Ans : No, we cannot store Parent Object into Child Reference.
//		Down-casting is not possible in Java directly, 
//		but we can TypeCaste the Object with Child just for namesake.

//		After TypeCasting If we call any methods, we will get a Runtime Exception 
//		java.lang.ClassCastException:
//		class com.oops02.Loan cannot be cast to class com.oops02.PersonalLoan 

		PersonalLoan p2 = (PersonalLoan) new LoanImpl();// Type mismatch: cannot convert from Loan to PersonalLoan
		p2.getROI();

		int cibil = pl.getCibiliScore();
		double salary = pl.getCustomerSalary();
		int age = pl.getCustomerAge();

		if (cibil > 760 && salary > 1000000.00 && age > 25 && pl.isValidAadhaar() && pl.isValidPAN()
				&& pl.isValidPhone()) {
			System.out.println("Congrtulations !! Your  Personal Loan got approved ");
			System.out.println("Your Personal Loan ROI is : " + pl.getROI());
			System.out.println("As entered Confirming Your Detials are : ");
			System.out.println(pl.getCustomerAddressDetails());
			pl.getPersonalLoanDocInfo();

		} else {
			System.out.println("Sorry !! Your  Personal Loan got Rejected ");
		}

	}

}
