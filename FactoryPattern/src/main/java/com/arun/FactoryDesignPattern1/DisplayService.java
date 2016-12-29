package com.arun.FactoryDesignPattern1;

public abstract class DisplayService {
	/*
	 * Factory pattern encapsulates object creation by letting the subclass
	 * decide which object to create
	 */
	public void readAFile() {
		FormatOfFile file = createAFile();
		file.readAFile();
	}

	public abstract FormatOfFile createAFile(); // Factory pattern

}

class XMLCreator extends DisplayService {

	@Override
	public FormatOfFile createAFile() {
		return new XMLFile();
	}

}

class PDFCreator extends DisplayService {

	@Override
	public FormatOfFile createAFile() {
		return new PDFFile();
	}

}

class TextCreator extends DisplayService {

	@Override
	public FormatOfFile createAFile() {
		return new TextFile();
	}

}
