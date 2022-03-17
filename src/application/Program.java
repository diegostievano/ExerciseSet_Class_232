package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Course;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Set<Course> meuSet = new HashSet<>();  
		
		System.out.print("How many students for course A? ");		
		int amount = input.nextInt();		
		for (int i = 0; i < amount; i++) {			
			meuSet.add(new Course("A", input.nextInt()));
		}
		
		System.out.print("How many students for course B? ");		
		amount = input.nextInt();		
		for (int i = 0; i < amount; i++) {			
			meuSet.add(new Course("B", input.nextInt()));
		}
		
		
		System.out.print("How many students for course C? ");		
		amount = input.nextInt();		
		for (int i = 0; i < amount; i++) {			
			meuSet.add(new Course("C", input.nextInt()));
		}		
		
		System.out.println("Total Students: " + meuSet.size());
		input.close();

	}

}
