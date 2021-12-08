package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewList = new HashMap<>();

//gonna need a proper constructor later
    public ReviewRepository(Review ...reviewsToAdd) {
        for(Review review: reviewsToAdd){
            reviewList.put(review.getId(), review);
        }
    }


    public Review findOne(long id) {
        return reviewList.get(id);
    }


    public Collection<Review> findAll() {

        return reviewList.values();
    }
}
