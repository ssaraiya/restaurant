package com.project.restaurant.search.service.impl;

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

	@Override
	public RestaurantList getRestaurants(String cuisine, String location) {
		return this.testData.getRestaurantList();
	}

	@Override
	public RestaurantList getRestaurantsByLatLng(
			final String latitude,
			final String longitude) {
		googleClient.getZipcode(latitude, longitude);
		return null;
	}

}
