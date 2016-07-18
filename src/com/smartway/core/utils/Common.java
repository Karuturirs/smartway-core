package com.smartway.core.utils;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Common {
	public JSONObject pojo2Json(Object obj) throws JAXBException,
	JsonParseException, JsonMappingException, IOException,
	ParseException 
	{
		JSONObject object = new JSONObject();
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonString = objectMapper.writeValueAsString(obj);
		System.out.println("-->"+jsonString);
		JSONParser jsonParser = new JSONParser();
		object = (JSONObject) jsonParser.parse(jsonString);
		return object;
	}
}
