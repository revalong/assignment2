package com.fmt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class FarMart{
	private ArrayList<Items> it;
	private ArrayList<Persons> per;
	private ArrayList<Stores> st;
	private int n;
	
	public void readFiles() {
		String[] files = new String[3];
		files[0]="Persons.csv";
		files[1]= "Items.csv";
		files[2]="Stores.csv";
		for(String p : files) {
			try {
				Scanner s = new Scanner(p);
				n = Integer.parseInt(s.nextLine());
				for(int i =0;i<n;i++) {
					String line = s.nextLine();
					String tokens[] = line.split(",");
					String time = tokens[0];
					if(tokens.length==4) {
						it.add(new Items(tokens[0],tokens[1],tokens[2],tokens[3]));
					}
					if(tokens.length==8) {
						per.add(new Persons(tokens[0],tokens[1],tokens[2],tokens[3],tokens[4],tokens[5],tokens[6],tokens[7]));
					}
					if(tokens.length==7) {
						st.add(new Stores(tokens[0],tokens[1],tokens[2],tokens[3],tokens[4],tokens[5],tokens[6]));
					}
				}
				s.close();
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	
		readFiles();
	}
}
	
	
	
	
}










