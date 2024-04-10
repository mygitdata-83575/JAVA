/*Q1. Define a new exception, called ExceptionLineTooLong, that prints out the error message "The
strings is too long". Write a program that reads a String from user and calculates its length. and
throws an exception of type ExceptionLineTooLong in the case where a string of length is more
than 80 characters.
(Hint- Use String class length() method)*/
package com.sunbeam;


import java.util.Scanner;

public class Program {
	
	private String name;
	
	public Program() {
		
	}
	public void accept() throws  ExceptionLineTooLong{
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a name - ");
		name = sc.next();
		if(name.length()>80)
			throw new ExceptionLineTooLong("The String is too long");
		
		}
	
	public String toString() {
		return "Name - "+name;
	}
	
	
	
	public static void main(String[] args) {
		
		Program p = new Program();
		try {
			p.accept();
		}
		catch( ExceptionLineTooLong e){
			e.printStackTrace();
		}
		
		System.out.println("Program run successfully");
		p.toString();
		

	}

}
