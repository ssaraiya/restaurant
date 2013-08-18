package com.project.restaurant.search.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.restaurant.search.client.model.RestaurantList;
import com.project.restaurant.search.service.IRestaurantFinder;
import com.project.restaurant.search.testdata.TestData;

@Service
public class RestaurantFinderImpl implements IRestaurantFinder {
	
	@Autowired
	private TestData testData;

	@Override
	public RestaurantList getRestaurants(String cuisine, String location) {
		return this.testData.getRestaurantList();
	}

}
