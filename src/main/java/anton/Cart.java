package anton;

import java.util.ArrayList;
import java.util.HashMap;

public class Cart {
    private final HashMap<String, Integer> filling;
    private final String userName;

    public Cart(String userName, HashMap<String, Integer> filling){
        this.filling = filling;
        this.userName = userName;
    }

    public HashMap<String, Integer> getFilling() {
        return filling;
    }

    public String getUserName() {
        return userName;
    }
    public int getTotal(){
        int total= 0;
        for (int price : this.filling.values()){
            total+=price;
        }
        return total;
    }

}
