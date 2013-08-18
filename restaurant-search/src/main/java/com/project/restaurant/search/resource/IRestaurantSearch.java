package com.project.restaurant.search.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.project.restaurant.search.client.model.RestaurantList;


public interface IRestaurantSearch {
	
	/**
	 * @param cuisine cuisine
	 * @param location location
	 * @return List of restaurants.
	 */
	@GET
	@Path("/restaurants")
	@Produces(MediaType.APPLICATION_JSON)
	public RestaurantList getRestaurants(
			@QueryParam("cuisine") final String cuisine, 
			@QueryParam("location") final String location);
	
	/**
	 * @param cuisine cuisine
	 * @param longitude longitude
	 * @param latitude latitude
	 * @return List of restaurants.
	 */
	@GET
	@Path("/restaurants/current_location")
	@Produces(MediaType.APPLICATION_JSON)
	public RestaurantList getRestaurants(
			final String cuisine, 
			final String longitude, 
			final String latitude);
	
	

}
