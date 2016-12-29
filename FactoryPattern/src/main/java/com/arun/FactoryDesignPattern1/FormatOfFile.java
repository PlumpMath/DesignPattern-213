package com.arun.FactoryDesignPattern1;

public interface FormatOfFile {
	void readAFile();
}

class PDFFile implements FormatOfFile {
	public void readAFile() {
		System.out.println("Reading a PDF file");
	}
}

class TextFile implements FormatOfFile {

	public void readAFile() {
		System.out.println("Reading a Text File");
	}

}

class XMLFile implements FormatOfFile {

	public void readAFile() {
		System.out.println("Reading an XML File");
	}

}

class AdobeReaderFile implements FormatOfFile{

	public void readAFile() {
		System.out.println("Reading an Adobe reader file");
	}
	
}
