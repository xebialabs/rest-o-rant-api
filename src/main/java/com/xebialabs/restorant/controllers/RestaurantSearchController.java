package com.xebialabs.restorant.controllers;

import com.xebialabs.restorant.models.Restaurant;
import com.xebialabs.restorant.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantSearchController {

  @Autowired
  private RestaurantService restaurantService;

  @RequestMapping(value = "/findrestaurants" , method = RequestMethod.GET)
  public List<Restaurant> greeting(@RequestParam(value = "q", defaultValue = "") String q) {
    return restaurantService.getAllRestaurants(q);
  }

}
