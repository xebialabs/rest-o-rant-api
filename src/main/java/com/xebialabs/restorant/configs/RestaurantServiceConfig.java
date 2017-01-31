package com.xebialabs.restorant.configs;

import com.xebialabs.restorant.dao.RestaurantDao;
import com.xebialabs.restorant.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestaurantServiceConfig {

    @Autowired
    private RestaurantDao restaurantDao;

    @Bean
    public RestaurantService restaurantService(){
      return new RestaurantService(restaurantDao);
    }
}
