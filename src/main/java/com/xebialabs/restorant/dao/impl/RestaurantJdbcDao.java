package com.xebialabs.restorant.dao.impl;

import com.xebialabs.restorant.dao.RestaurantDao;
import com.xebialabs.restorant.models.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@ConditionalOnProperty(prefix = "spring.datasource", name = "jndi-lookup", matchIfMissing = true)
@ConditionalOnMissingBean(RestaurantDataDao.class)
public class RestaurantJdbcDao implements RestaurantDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Restaurant> getAllRestaurants(){
        List<Restaurant> allRestaurants = new ArrayList<>();
        System.out.println("RestaurantJdbcDao.getAllRestaurants");
        jdbcTemplate.query(
                "SELECT name, snippet FROM restaurant",
                (rs, rowNum) -> new Restaurant(rs.getString("name"), rs.getString("snippet"))
        ).forEach(restaurant -> allRestaurants.add(restaurant));

        return allRestaurants;
    }
}
