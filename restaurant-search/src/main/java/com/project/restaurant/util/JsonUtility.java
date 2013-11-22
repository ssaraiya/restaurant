package com.project.restaurant.util;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;

public class JsonUtility {

	public static String getZipcode(String jsonString) {
		if (StringUtils.isBlank(jsonString)) {
			return null;
		}

		final JSONObject obj = new JSONObject(jsonString);
		final JSONArray geodata = obj.getJSONArray("results");
		int length = geodata.length();
		for (int i=0; i<length; i++) {
			JSONObject resultObject = geodata.getJSONObject(i);
			JSONArray addComponents = resultObject.getJSONArray("address_components");
			for (int j=0; j<addComponents.length(); j++) {
				JSONObject component = addComponents.getJSONObject(j);
				JSONArray types = component.getJSONArray("types");
				for(int n=0;n<types.length();n++) {
					if (types.getString(n).equals("postal_code")) {
						return component.getString("long_name");
					}
				}
			}
		}
		
		return null;
	}
}
