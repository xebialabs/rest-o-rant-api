package com.xebialabs.restorant.dao.impl;

import com.xebialabs.restorant.dao.RestaurantDao;
import com.xebialabs.restorant.models.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RestaurantDataDao implements RestaurantDao {
    @Override
    public List<Restaurant> getAllRestaurants() {
        List<Restaurant> allRestaurants = new ArrayList<>();
        allRestaurants.add(new Restaurant("Anchor & Hope", "Once there was just St John, then former St John chefs started to create their own restaurants using the same template – head-to-tail ingredients in simple but artful combinations, served up in a relaxed setting. The Anchor &amp; Hope, which opened more than a decade ago, is still showing how it's done."));
        allRestaurants.add(new Restaurant("Jugged Hare", "After many years of very thin pickings, the Barbican has recently acquired not one but two classy gastropubs. This, and the Chiswell Street Dining Rooms (opened in 2011) are both part of Ed and Tom Martin's ten-strong empire. The Jugged Hare was once called the King's Head; it's been handsomely remodelled, with a lovely oak floor, red leather seating and more than a scattering of stuffed and mounted animals."));
        allRestaurants.add(new Restaurant("Old Red Cow", "The old red cow herself, if she wasn't apocryphal, probably didn't have a pleasant visit to this pub's manor – Long Lane was an ancient cattle route to Smithfield meat market. You can see the cupolas, domes and reliefs of London's temple of butchery through the front windows of this refurbed Victorian site, which no longer uses its antique 'Ye Olde' prefix and has turned its focus to serving very good beer."));
        return allRestaurants;
    }
}
