package com.project.restaurant.search.testdata;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;
import com.project.restaurant.search.client.model.Restaurant;
import com.project.restaurant.search.client.model.RestaurantList;

@Component
public class TestData {
	
	private Map<String, List<Restaurant>> restaurantMap;
	
	public TestData() {
		this.restaurantMap = generateTestData();
	}

	private Map<String, List<Restaurant>> generateTestData() {
		Map<String, List<Restaurant>> restaurantMap = new HashMap<String, List<Restaurant>>();
		Restaurant r1 = new Restaurant();
		r1.setAddress("123 XYZ");
		r1.setCity("Ahmedabad");
		r1.setCloseTime(new Date().getTime());
		r1.setOpenTime(new Date().getTime());
		r1.setLatitude("23.0345011");
		r1.setLongitude("72.55301709999999");
		r1.setPhoneNumber("1234567");
		r1.setId("1");
		r1.setCuisine("Indian");
		r1.setName("Sangam");
		r1.setState("Gujarat");
		r1.setZipcode("380009");
		
		Restaurant r2 = new Restaurant();
		r2.setAddress("123 XYZ");
		r2.setCity("Ahmedabad");
		r2.setCloseTime(new Date().getTime());
		r2.setOpenTime(new Date().getTime());
		r2.setLatitude("23.0345011");
		r2.setLongitude("72.55301709999999");
		r2.setPhoneNumber("1234567");
		r2.setId("2");
		r2.setCuisine("Indian");
		r2.setName("Sangam");
		r2.setState("Gujarat");
		r2.setZipcode("380009");
		
		Restaurant r3 = new Restaurant();
		r3.setAddress("123 XYZ");
		r3.setCity("Ahmedabad");
		r3.setCloseTime(new Date().getTime());
		r3.setOpenTime(new Date().getTime());
		r3.setLatitude("23.0345011");
		r3.setLongitude("72.55301709999999");
		r3.setPhoneNumber("1234567");
		r3.setId("3");
		r3.setCuisine("Indian");
		r3.setName("Sangam");
		r3.setState("Gujarat");
		r3.setZipcode("380009");
		
		Restaurant r4 = new Restaurant();
		r4.setAddress("123 XYZ");
		r4.setCity("Ahmedabad");
		r4.setCloseTime(new Date().getTime());
		r4.setOpenTime(new Date().getTime());
		r4.setLatitude("23.0345011");
		r4.setLongitude("72.55301709999999");
		r4.setPhoneNumber("1234567");
		r4.setId("4");
		r4.setCuisine("Indian");
		r4.setName("Sangam");
		r4.setState("Gujarat");
		r4.setZipcode("380009");	
		
		restaurantMap.put("380009",Lists.newArrayList(r1, r2, r3, r4));
		return restaurantMap;

	}

	public RestaurantList getRestaurantList(String cuisine, String zipcode) {
		
		if (StringUtils.isBlank(zipcode)) {
			return null;
		}
		
		List<Restaurant> listRestaurant =  restaurantMap.get(zipcode);
		RestaurantList rList = new RestaurantList();
		if (StringUtils.isBlank(cuisine)) {
			rList.setRestaurantList(listRestaurant);
			return rList;
		}
		
		List<Restaurant> cuisineRList = Lists.newArrayList();
		for (Restaurant restaurant : listRestaurant) {
			if (cuisine.equalsIgnoreCase(restaurant.getCuisine())) {
				cuisineRList.add(restaurant);
			}
		}
		
		rList.setRestaurantList(cuisineRList);
		return rList;
		
	}
	
}
