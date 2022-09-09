package com.lulu.test;
import java.util.Scanner;

public class SI {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float principle = sc.nextFloat();
		float time = sc.nextFloat();
		float rate = sc.nextFloat();
		
		
		float SI = (principle * time * rate)/100;
		System.out.println("Simple Interest: "+SI);
		System.out.println("Total amount to be paid after Loan duration ends: "+(SI+principle));
		
	}
}
