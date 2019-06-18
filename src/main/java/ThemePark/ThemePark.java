package ThemePark;

import java.util.ArrayList;
import java.util.HashMap;

public class ThemePark {

    private ArrayList<IReviewed> reviews;

    public ThemePark(){
        this.reviews = new ArrayList<IReviewed>();
    }

    public void addReview(IReviewed review){
        reviews.add(review);
    }

    public int numberOfReviews(){
        return reviews.size();
    }

    public String listAllReviews(){
        HashMap<String, Integer> reviewList = new HashMap<String, Integer>();
        for (IReviewed review: this.reviews) {
            reviewList.put(review.getName(), review.getRating());
        }
        return String.valueOf(reviewList);
    }
}
