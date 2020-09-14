package anton;

import java.util.ArrayList;
import java.util.stream.Collectors;

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

    public static int getTotalPrice(){
        return prices().stream().reduce(Integer::sum).get();
    }

    private static ArrayList<Integer> prices(){
        return (ArrayList<Integer>) preorders.stream().map(entry->Integer.valueOf(entry.split(" ")[1])).collect(Collectors.toList());
    }

}
