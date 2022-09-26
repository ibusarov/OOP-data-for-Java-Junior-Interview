package comparator;

import java.util.Comparator;

public class BicycleComparator implements Comparator<Bicycle>{

    @Override
    public int compare(Bicycle o1, Bicycle o2) {
        return o2.getFrameSize().compareTo(o1.getFrameSize());
    }
}
