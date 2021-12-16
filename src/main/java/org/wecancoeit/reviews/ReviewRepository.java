package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewList = new HashMap<>();

    public ReviewRepository(){
        Review reviewOne = new Review(1L,"Millenium Falcon","/images/falcon.JPG","from-The Rise Of Skywalker", "This is one of my favorite lego sets. " +
                "It took me about 12 hours to build but worth every minute. It ends up taking a lot of space so make sure to have plenty of space to display it!" +
                " The top has several sections that can be opened up which is nice for displaying in multiple different ways  ",
                "The Millennium Falcon Lego set #75257 contains 1353 pieces and is recommended for ages 9 and up. " +
                        "It comes wtih 7 minifigures: D-O, C3-PO, R2-D2, Chewbacca, Finn, Boolio, and Lando Calrissian. " );

        Review reviewTwo = new Review(2L,"Y-Wing Starfighter","/images/y-wing2.JPG","from-The Rise Of Skywalker",
                "I bought this set only because I needed it for my collection but once I started building it ended being one of the more fun builds I've put together." +
                        " It only took a couple hours and it's not very tall so it was easy to display.",
                "The Y-Wing Starfighter set #75249 contains 578 pieces and is recommended for ages 8 and up. " +
                        "It comes with 5 minifigures: Poe Dameron, Zorii Bliss, and a First Order Snowtrooper as well as 2 droids D-O and an astromech.");

        Review reviewThree = new Review(3L,"The Razor Crest","/images/razorcrest.JPG","from-The Mandalorian","The Razor Crest was an amazing build. " +
                "It took me about 8 hours to complete. It is very solid but surprisingly compact so it takes up a lot less shelf space than you would think. " +
                "The Mandalorian is one of my favorite pieces of star wars film so I had to buy this as soon as it came out.",
                "The Razor Crest Lego set #75292 contains 1023 pieces and is for ages 10 and up. It comes with 5 minifigures: The Mandalorian, " +
                        "The Child, Greef Karga, a scout trooper, and IG-11. ");

        Review reviewFour = new Review(4L,"Imperial Shuttle","/images/impshuttle.JPG","from-Return Of The Jedi",
                "This is an iconic set from my favorite movie Return of the Jedi." +
                " It took me about 3 hours to build and turned out very stable. The wings move up and down with ease as well as the cockpit and cargo space." +
                " It is a very tall set with the middle wing standing 10.5 inches. ",
                "The Imperial Shuttle Lego set #75302 contains 660 pieces and is for ages 9 and up. " +
                        "It comes with 3 minifigures: Darth Vader, Luke Skywalker, and an Imperial Officer.");

        Review reviewFive = new Review(5L,"First Order Special Forces TIE Fighter","/images/tiefighter.JPG","from-The Force Awakens",
                "This fighter, they introduced in The Force Awakens, has been my favorite type of TIE. " +
                        "This set only took me about 2 hours and it came with a stand so it wouldn't fall over. ",
                "The First Order Special Forces TIE Fighter Lego set #75101 contains 517 pieces and is for ages 8 and up. " +
                        "It comes with 4 minifigures: First Order officer, crew, and 2 pilots");

        Review reviewSix = new Review(6L,"General Grievous's Starfighter","/images/grievship.JPG","from-The Clone Wars",
                "The Clone Wars animated series concreted my love of Star Wars therefore i had to get this set. " +
                        "Not only did have my favorite Jedi, Obi-Wan, but it also included my favorite non-Sith villain. " +
                        "It was a small set so it took about an hour and a half.  ",
                "The General Grievous's Starfighter Lego set #75286 contains 487 pieces and is for ages 9 and up. " +
                        "It comes with 3 minifigures: Obi-Wan Kenobi, General Grievous, and an Airborne Clone Trooper. ");

        reviewList.put(reviewOne.getId(), reviewOne);
        reviewList.put(reviewTwo.getId(), reviewTwo);
        reviewList.put(reviewThree.getId(),reviewThree);
        reviewList.put(reviewFour.getId(),reviewFour);
        reviewList.put(reviewFive.getId(),reviewFive);
        reviewList.put(reviewSix.getId(),reviewSix);
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
