package com.project.restaurant.search.service;

import com.project.restaurant.search.client.model.RestaurantList;

public interface IRestaurantFinder {
	
	public RestaurantList getRestaurants(
			final String cuisine, 
			final String location);
	
	public RestaurantList getRestaurantsByLatLng(
			final String cuisine,
			final String latitude,
			final String longitude);

}
