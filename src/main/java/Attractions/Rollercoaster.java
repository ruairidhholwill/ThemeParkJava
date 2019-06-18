package Attractions;

import ThemePark.IReviewed;
import ThemePark.ISecurity;
import ThemePark.ITicketed;
import ThemePark.Visitor;

public class Rollercoaster extends Attraction implements ITicketed, ISecurity, IReviewed {

    public Rollercoaster(String name, int rating){
        super(name, rating);
    }

    public double defaultPrice() {
        return 8.40;
    }

    public double priceFor(Visitor visitor) {
        double doublePrice = 0;
        if (visitor.getHeight() > 200){
            doublePrice = this.defaultPrice() * 2;
        }
        return doublePrice;
    }

    public boolean isAllowedTo(Visitor visitor) {
        boolean isAllowed = false;
        if (visitor.getAge() > 12 && visitor.getHeight() > 145){
            isAllowed = true;
        }
        return isAllowed;
    }
}
