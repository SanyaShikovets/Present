package present;

import comparator.SweetsWeightComparator;
import sweets.Sweet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

import comparator.SweetsNameComparator;

public class Present {

    private List<Sweet> present;

    public Present(){
        present = new ArrayList<>();
    }

    public void addSweet(Sweet sweets) {
        present.add(sweets);
    }

    public List<Sweet> getPresent() {
        return present;
    }

    public double countTotalWeight() {
        double totalWeight = 0;
        for (Sweet sw : present) {
            totalWeight += sw.getWeight();
        }
        return totalWeight;
    }

    public TreeSet<Sweet> sortSweetByName() {
        Comparator<Sweet> scomp = new SweetsNameComparator();
        TreeSet<Sweet> sSort = new TreeSet<>(scomp);
        for(Sweet s: present){
            sSort.add(s);
        }
        return sSort;
    }

    public TreeSet<Sweet> sortSweetByWeight() {
        Comparator<Sweet> scomp = new SweetsWeightComparator();
        TreeSet<Sweet> sSort = new TreeSet<>(scomp);
        for(Sweet s: present){
            sSort.add(s);
        }
        return sSort;
    }

    public List<Sweet> selectSweetByWeightRange(double minWeight, double maxWeight) {
        return present.stream()
                .filter(sweet -> sweet.getWeight() >= minWeight && sweet.getWeight() <= maxWeight)
                .collect(Collectors.toList());
    }

    public List<Sweet> selectSweetByWeight(double weight) {
        return selectSweetByWeightRange(weight, weight);
    }

    public List<Sweet> selectSweetByName(String name) {
        return present.stream()
                .filter(sweet -> sweet.getName().equals(name))
                .collect(Collectors.toList());
    }
}
