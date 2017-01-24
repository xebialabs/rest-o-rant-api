package com.xebialabs.restorant.services;

import com.xebialabs.restorant.dao.RestaurantDao;
import com.xebialabs.restorant.models.Restaurant;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by atiwary on 23/01/17.
 */
@Service
public class RestaurantService {

    private RestaurantDao restaurantDao;

    public RestaurantService(RestaurantDao restaurantDao) {
        this.restaurantDao = restaurantDao;
    }

    public List<Restaurant> getAllRestaurants(String q) {
        return restaurantDao.getAllRestaurants()
                .stream()
                .filter(restaurant -> restaurant.matches(q))
                .collect(Collectors.toList());
    }
}
