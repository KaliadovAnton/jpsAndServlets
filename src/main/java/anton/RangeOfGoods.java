package anton;

import java.util.ArrayList;

public class RangeOfGoods {
    static ArrayList<Good> range = new ArrayList<>();

    private RangeOfGoods() {
    }

    public static ArrayList<Good> initRangeOfGoods() {
        if (!range.isEmpty()) {
            return range;
        }
        range.add(new Good("Book", 5));
        range.add(new Good("Postcard", 2));
        range.add(new Good("Newspaper", 1));
        range.add(new Good("Brochure", 3));
        return range;
    }
}
