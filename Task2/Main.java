//Task 2.c
import java.util.Scanner;
//Task 2.a
class Main{
	
	public static void main(String[] args){
	//Task 2.c
	Scanner scan = new Scanner(System.in);
	//Task 2.b
	System.out.println("Please type your name");

	//Task 2.d
	String name = scan.nextLine();

	//Task 2.e
	System.out.print("Hi " + name + " Please also type your age");

	//Task 2.f
	int age = scan.nextInt();

	//Tasnk 2.g
	System.out.println(age);

	//Task 2.h
	int newAge = 67 - age;
	System.out.print(newAge);


	}


}