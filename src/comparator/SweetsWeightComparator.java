package comparator;

import sweets.Sweet;
import java.util.Comparator;

public class SweetsWeightComparator implements Comparator<Sweet> {

    @Override
    public int compare(Sweet s1, Sweet s2) {
        return Double.compare(s1.getWeight(), s2.getWeight());
    }

}
