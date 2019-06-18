package Stalls;

import ThemePark.IReviewed;
import ThemePark.ISecurity;
import ThemePark.ITicketed;
import ThemePark.Visitor;

public class TobaccoStall extends Stall implements ITicketed, ISecurity, IReviewed {

    public TobaccoStall(String name, String ownerName, int parkingSpot, int rating){
        super(name, ownerName, parkingSpot, rating);
    }

    public double defaultPrice() {
        return 6.60;
    }

    public double priceFor(Visitor visitor) {
        return 6.60;
    }

    public boolean isAllowedTo(Visitor visitor) {
        boolean isAllowed = false;
        if(visitor.getAge() >= 18){
            isAllowed = true;
        }
        return isAllowed;
    }
}
