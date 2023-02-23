package com.fmt;

import java.io.FileWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.io.File;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class DataConverter {
	private ArrayList<Items> it;
	private ArrayList<Stores> st;
	private ArrayList<Persons> per;
	
	
	public DataConverter(ArrayList<Items> it, ArrayList<Stores> st, ArrayList<Persons> per) {
		this.it=it;
		this.per=per;
		this.st=st;
	}

		public void convert() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		String persons = gson.toJson(per);
		String items = gson.toJson(it);
		String stores = gson.toJson(st);
		try
		{
		    String filename= "Persons.json";
		    FileWriter fw = new FileWriter(filename,true); //the true will append the new data
		    fw.write(persons);//appends the string to the file
		    fw.close();
		}
		catch(IOException ioe)
		{
		    System.err.println("IOException: " + ioe.getMessage());
		}
		try
		{
		    String filename= "Items.json";
		    FileWriter fw = new FileWriter(filename,true); //the true will append the new data
		    fw.write(items);//appends the string to the file
		    fw.close();
		}
		catch(IOException ioe)
		{
		    System.err.println("IOException: " + ioe.getMessage());
		}
		try
		{
		    String filename= "Stores.json";
		    FileWriter fw = new FileWriter(filename,true); //the true will append the new data
		    fw.write(stores);//appends the string to the file
		    fw.close();
		}
		catch(IOException ioe)
		{
		    System.err.println("IOException: " + ioe.getMessage());
		}
		System.out.println("complete");
	
	}
		public static void main(String[] args) {
			
		}

}
