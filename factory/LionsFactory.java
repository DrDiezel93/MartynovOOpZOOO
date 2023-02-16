package factory;

import animals.Lion;
import cage.LionCage;

import java.util.ArrayList;

public class LionsFactory {
    public static ArrayList<Lion> createLions(int lionCount){
        ArrayList<Lion> lionsCage = new ArrayList<>(lionCount);
        for (int i = 0; i < lionCount; i++) {
            lionsCage.add(new Lion());
        }
        return lionsCage;
    }
}
