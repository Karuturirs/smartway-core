package com.smartway.core.utils;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Common {
	
	/*
	 * @obj :: object that need to be converted to JSONArray
	 * @key :: The key name in the JSONObject that is returned 
	 * Returns : JSONObject
	 */
	public JSONObject pojo2JsonObject(Object obj) 
	{
		/*Gson gson = new GsonBuilder().create();
		String json = gson.toJson(obj);*/
		JSONObject jsonobj = new JSONObject();
		try{
			ObjectMapper objectMapper = new ObjectMapper();
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a z");
			objectMapper.setDateFormat(df);
			String jsonString = objectMapper.writeValueAsString(obj);
			JSONParser parser = new JSONParser();
			jsonobj = (JSONObject) parser.parse(jsonString);
		}catch(Exception e){
			jsonobj.put("ERROR", "Not able to convert to JSON :: "+e.getMessage());
			jsonobj.put("state", "false");
		}
		return jsonobj;
	}
	
	/*
	 * @obj :: The arraylist of object that need to be converted to JSONArray
	 * Returns : JSONArray 
	 */
	public JSONArray pojo2JsonArray(Object obj) 
	{
		JSONArray object = new JSONArray();
		try{
			ObjectMapper objectMapper = new ObjectMapper();
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a z");
			objectMapper.setDateFormat(df);
			String jsonString = objectMapper.writeValueAsString(obj);
			JSONParser parser = new JSONParser();
			object = (JSONArray) parser.parse(jsonString);
		}catch(Exception e){
			JSONObject ob = new JSONObject();
			ob.put("ERROR", "Not able to convert to JSON :: "+e.getMessage());
			ob.put("state", "false");
			object.add(ob);
		}
		return object;
	}
	public java.util.Date toDate(Timestamp timestamp) {
	    long milliseconds = timestamp.getTime() + (timestamp.getNanos() / 1000000);
	    return new java.util.Date(milliseconds);
	}
	public String toDateFormat(Timestamp timestamp,String format) {
		return (new SimpleDateFormat(format).format(timestamp));
	}
}
