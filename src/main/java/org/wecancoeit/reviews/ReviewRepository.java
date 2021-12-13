package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewList = new HashMap<>();

    public ReviewRepository(){
        Review numberOne = new Review(1L,"Millenium Falcon","","Lego", "This is a Lego set", "This set if from rise of skywalker and took 16 hours to build" );

        reviewList.put(numberOne.getId(), numberOne);
    }




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
