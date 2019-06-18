package Attractions;

import ThemePark.IReviewed;
import ThemePark.ISecurity;
import ThemePark.Visitor;

public class Playground extends Attraction implements ISecurity, IReviewed {

    public Playground(String name, int rating){
        super(name, rating);

    }

    public boolean isAllowedTo(Visitor visitor) {
        boolean isAllowed = false;
        if (visitor.getAge() <= 15) {
            isAllowed = true;
        }
        return isAllowed;
    }
}
