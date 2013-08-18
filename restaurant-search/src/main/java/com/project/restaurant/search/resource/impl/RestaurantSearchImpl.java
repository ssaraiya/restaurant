package com.project.restaurant.search.resource.impl;

import javax.ws.rs.Path;

import com.project.restaurant.search.client.model.RestaurantList;
import com.project.restaurant.search.resource.IRestaurantSearch;
import com.project.restaurant.search.service.IRestaurantFinder;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Path("/search")
@Scope("request")
public class RestaurantSearchImpl implements IRestaurantSearch {
	
	private final static Logger LOGGER = Logger.getLogger(RestaurantSearchImpl.class);
	@Autowired
	private IRestaurantFinder restaurantFinder;
	
	@Override
	public RestaurantList getRestaurants(final String cuisine, 
			final String location) {
		LOGGER.info("Calling logger");
		RestaurantList restaurantList = restaurantFinder.getRestaurants(
				cuisine, location);
		restaurantList.setStart(0);
		return restaurantList;
	}

	@Override
	public RestaurantList getRestaurants(String cuisine, String longitude,
			String latitude) {
		// TODO Auto-generated method stub
		return null;
	}

}
