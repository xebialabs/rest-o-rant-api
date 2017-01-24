package com.xebialabs.restorant.configs;

import com.xebialabs.restorant.conditions.ThreeTierCondition;
import com.xebialabs.restorant.conditions.TwoTierCondition;
import com.xebialabs.restorant.dao.RestaurantDao;
import com.xebialabs.restorant.dao.impl.RestaurantDataDao;
import com.xebialabs.restorant.dao.impl.RestaurantJdbcDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by atiwary on 23/01/17.
 */
@Configuration
public class RestaurantDaoConfig {

    @Bean(name = "restaurantDao")
    @Conditional(value = ThreeTierCondition.class)
    public RestaurantDao getJdbcDao(){
       return new RestaurantJdbcDao();
    }

    @Bean(name = "restaurantDao")
    @Conditional(value = TwoTierCondition.class)
    public RestaurantDao getDataDao(){
        return new RestaurantDataDao();
    }
}
