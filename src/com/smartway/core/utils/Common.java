package com.smartway.core.utils;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Common {
	public JSONObject pojo2Json(Object obj) throws  JsonGenerationException, JsonMappingException, IOException, ParseException 
	{
		/*Gson gson = new GsonBuilder().create();
		String json = gson.toJson(obj);*/
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonString = objectMapper.writeValueAsString(obj);
		JSONParser parser = new JSONParser();
		JSONObject jsonobj = (JSONObject) parser.parse(jsonString);
		return jsonobj;
	}
	public JSONObject pojo2Json(Object obj, String key) 
	{
		JSONObject object = new JSONObject();
		object.put(key,obj);
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
