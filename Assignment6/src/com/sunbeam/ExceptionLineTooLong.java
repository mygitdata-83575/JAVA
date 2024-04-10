/*Q1. Define a new exception, called ExceptionLineTooLong, that prints out the error message "The
strings is too long". Write a program that reads a String from user and calculates its length. and
throws an exception of type ExceptionLineTooLong in the case where a string of length is more
than 80 characters.
(Hint- Use String class length() method)*/

package com.sunbeam;

public class ExceptionLineTooLong extends RuntimeException{
	private String message;
	
	public ExceptionLineTooLong() {
		this.message = "";
	}
	
	public ExceptionLineTooLong(String message) {
		this.message = message;
	}
	
	public void printStackTrace() {
		System.out.println("Exception : ");
		System.out.println("ExceptionLineTooLong - "+ message);
	}
}
