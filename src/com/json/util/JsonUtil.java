package com.json.util;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonUtil {
	private static ObjectMapper mapper;
	static {
		mapper = new ObjectMapper();
	}

	public static String convertJavaObjToJson(Object object) {
		String jsonResult = "";
		try {
			jsonResult = mapper.writeValueAsString(object);
		} catch (JsonGenerationException e) {
			System.out.println("Exception Occurred while converting java object to json-->" + e.getMessage());
			e.printStackTrace();
		} catch (JsonMappingException e) {
			System.out.println("Exception Occurred while converting java object to json-->" + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Exception Occurred while converting java object to json-->" + e.getMessage());
			e.printStackTrace();
		}

		return jsonResult;
	}

	public static <T> T convertJsonToJavaObj(String jsonString,Class<T>cls) {
		T result = null;
		try {
			result = mapper.readValue(jsonString, cls);
		} catch (JsonParseException e) {
			System.out.println("Exception Occurred while converting json object to javaobject-->" + e.getMessage());
		} catch (JsonMappingException e) {
			System.out.println("Exception Occurred while converting json object to javaobject-->" + e.getMessage());
		} catch (IOException e) {
			System.out.println("Exception Occurred while converting json object to javaobject-->" + e.getMessage());
		}
		return result;
		
	}
}
