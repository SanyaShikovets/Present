package comparator;

import sweets.Sweet;

import java.util.Comparator;

public class SweetsNameComparator implements Comparator<Sweet> {

    @Override
    public int compare(Sweet s1, Sweet s2) {
        return s1.getName().compareTo(s2.getName());
    }

}
