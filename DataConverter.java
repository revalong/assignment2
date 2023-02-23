package com.fmt;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.Gson;




public class DataConverter {
	public void DataConverter(ArrayList<Items> items, ArrayList<Stores> stores,ArrayList<Persons> persons) {
		Gson gson = new Gson();
		
		// Serialization
		//Needs to iterage through array lists of objects 
		//T
		gson.toJson(ints);     // ==> [1,2,3,4,5]
		gson.toJson(strings);  // ==> ["abc", "def", "ghi"]

		// Deserialization
		int[] ints2 = gson.fromJson("[1,2,3,4,5]", int[].class);
		// ==> ints2 will be same as ints
	}
}
