package com.project.restaurant.search.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.restaurant.search.client.model.RestaurantList;
import com.project.restaurant.search.google.client.IGoogleClient;
import com.project.restaurant.search.service.IRestaurantFinder;
import com.project.restaurant.search.testdata.TestData;

@Service
public class RestaurantFinderImpl implements IRestaurantFinder {
	
	@Autowired
	private TestData testData;
	@Autowired
	private IGoogleClient googleClient;
	private final static Logger LOGGER = Logger.getLogger(RestaurantFinderImpl.class);
	@Override
	public RestaurantList getRestaurants(String cuisine, String location) {
		return this.testData.getRestaurantList(cuisine, location);
	}

	@Override
	public RestaurantList getRestaurantsByLatLng(
			final String cuisine,
			final String latitude,
			final String longitude) {
		String zipCode = googleClient.getZipcode(latitude, longitude);
		LOGGER.info(zipCode);
		return testData.getRestaurantList(cuisine, zipCode);
	}

}
