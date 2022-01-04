package org.wecancoeit.reviews;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewRepoTest {
    private ReviewRepository underTest;
    private Review reviewOne = new Review(1L,"First Review","image",
            "Jedi","Obi-Wan Kenobi","Number one on my list for many reasons");
    private Review reviewTwo = new Review(2L,"Second View","2nd image",
            "Sith","Darth Maul","Although Maul is considered a Sith i like to think he leans towards the grey side of the force");


    @Test
    public void shouldFindReviewOne(){
        underTest = new ReviewRepository(reviewOne);
        Review foundReview = underTest.findOne(1L);
        assertEquals(reviewOne,foundReview);
    }

    @Test
    public void shouldFindAllReviews(){
        underTest = new ReviewRepository(reviewOne,reviewTwo);
        Collection<Review> foundReviews = underTest.findAll();
        assertThat(foundReviews).contains(reviewOne,reviewTwo);
    }

}
