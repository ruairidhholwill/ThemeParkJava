import Attractions.Dodgems;
import Attractions.Park;
import Attractions.Rollercoaster;
import Stalls.CandyFlossStall;
import Stalls.TobaccoStall;
import ThemePark.ThemePark;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Dodgems dodgems;
    Park park;
    Rollercoaster rollercoaster;
    CandyFlossStall candyFlossStall;
    TobaccoStall tobaccoStall;

    @Before
    public void before(){
        themePark = new ThemePark();
        dodgems = new Dodgems("dodgems", 3);
        park = new Park("park", 2);
        rollercoaster = new Rollercoaster("scary", 1);
        candyFlossStall = new CandyFlossStall("Candy", "Floss", 2, 5);
        tobaccoStall = new TobaccoStall("Tobacco", "Smoke", 3, 4);
    }

    @Test
    public void canAddReview(){
        themePark.addReview(dodgems);
        assertEquals(1, themePark.numberOfReviews());
    }

    @Test
    public void canAddMultipleReviews(){
        themePark.addReview(dodgems);
        themePark.addReview(park);
        themePark.addReview(rollercoaster);
        themePark.addReview(candyFlossStall);
        themePark.addReview(tobaccoStall);
        assertEquals(5, themePark.numberOfReviews());
    }

    @Test
    public void canSeeAllReviews(){
        themePark.addReview(dodgems);
        themePark.addReview(park);
        themePark.addReview(rollercoaster);
        themePark.addReview(candyFlossStall);
        themePark.addReview(tobaccoStall);
        assertEquals("{Tobacco=4, dodgems=3, Candy=5, scary=1, park=2}", themePark.listAllReviews());
    }
}
