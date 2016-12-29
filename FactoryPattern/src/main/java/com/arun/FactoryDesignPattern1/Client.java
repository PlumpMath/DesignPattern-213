package com.arun.FactoryDesignPattern1;

public class Client {
	public static void main(String[] args) {
		DisplayService ds = new PDFCreator();
		ds.readAFile();
		
		ds = new TextCreator();
		ds.readAFile();
		
		ds = new XMLCreator();
		ds.readAFile();
	}

}
