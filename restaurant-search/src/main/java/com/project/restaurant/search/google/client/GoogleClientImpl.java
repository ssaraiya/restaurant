package com.project.restaurant.search.google.client;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.project.restaurant.search.resource.impl.RestaurantSearchImpl;
import com.project.restaurant.util.JsonUtility;

@Component
public class GoogleClientImpl implements IGoogleClient {
	
	@Autowired
	private RestTemplate restTemplate;
	@Value("${base_url}")
	private String gooleBaseUrl;
	
	private static String COMMA = ",";
	private final static Logger LOGGER = Logger.getLogger(RestaurantSearchImpl.class);
	
	@Override
	public String getZipcode(String latitude, String longitude) {
		if (StringUtils.isBlank(longitude) || StringUtils.isBlank(latitude)) {
			throw new IllegalArgumentException("Longitude or Latitude cannot be null");
		}
		
		String latlng = latitude + COMMA + longitude;	
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("latlng", latlng);
		paramMap.put("sensor", Boolean.toString(false));
		String response = restTemplate.getForObject(
				gooleBaseUrl + "?latlng={latlng}&sensor={sensor}", 
				String.class,
				paramMap);
		return JsonUtility.getZipcode(response);
	}

}
