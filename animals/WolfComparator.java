package animals;

import java.util.Comparator;

public class WolfComparator implements Comparator<Wolf> {
    @Override
    public int compare(Wolf wolf1, Wolf wolf2) {
//        int temp = Integer.compare(wolf1.getWeight(), wolf2.getWeight());
//        if (temp != 0){
//            return temp;
//        }
//        return Integer.compare(wolf1.getAge(), wolf2.getAge());
        if (wolf1.getWeight() > wolf2.getWeight()) return 1;
        else if (wolf1.getWeight() < wolf2.getWeight()) return -1;
        else {
            if (wolf1.getAge() > wolf2.getAge()) return 1;
            else if (wolf1.getAge() < wolf2.getAge()) return -1;
            return 0;
        }
    }
}



