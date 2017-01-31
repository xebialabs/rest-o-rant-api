package com.xebialabs.restorant.configs;

import com.xebialabs.restorant.conditions.FetchDataFromDb;
import com.xebialabs.restorant.conditions.FetchDataFromMemory;
import com.xebialabs.restorant.dao.RestaurantDao;
import com.xebialabs.restorant.dao.impl.RestaurantDataDao;
import com.xebialabs.restorant.dao.impl.RestaurantJdbcDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestaurantDaoConfig {

    @Bean(name = "restaurantDao")
    @Conditional(value = FetchDataFromDb.class)
    public RestaurantDao getJdbcDao(){
       return new RestaurantJdbcDao();
    }

    @Bean(name = "restaurantDao")
    @Conditional(value = FetchDataFromMemory.class)
    public RestaurantDao getDataDao(){
        return new RestaurantDataDao();
    }
}
