package com.project.restaurant.search.client.model;

import java.util.ArrayList;
import java.util.List;

public class RestaurantList extends BaseList {

	private List<Restaurant> restaurantList = new ArrayList<Restaurant>();

	public List<Restaurant> getRestaurantList() {
		return restaurantList;
	}

	public void setRestaurantList(List<Restaurant> restaurantList) {
		this.restaurantList = restaurantList;
	}

	@Override
	public int getSize() {
		return restaurantList.size();
	}
}
