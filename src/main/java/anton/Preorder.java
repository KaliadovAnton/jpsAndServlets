package anton;

import java.util.ArrayList;

public class Preorder {
    private static final ArrayList<String> preorders = new ArrayList<>();

    private Preorder(){
    }

    public static ArrayList<String> getPreorders() {
        return preorders;
    }

    public static void addPreorder(String preorder){
        preorders.add(preorder);
    }
}
