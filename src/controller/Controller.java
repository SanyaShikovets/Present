package controller;

import present.Present;
import sweets.Sweet;

public class Controller {

    private Present present;

    Sweet s1 = new Sweet("Snikers" , 500);
    Sweet s2 = new Sweet("Kit-kat", 300);
    Sweet s3 = new Sweet("Baunti", 550);

    public Controller(Present pr) {
        this.present = pr;
        present.addSweet(s1);
        present.addSweet(s2);
        present.addSweet(s3);
        System.out.println("Present: " + present.getPresent());

        System.out.println("Total weight: " + present.countTotalWeight());

        System.out.println("Sort by Name: " + present.sortSweetByName());

        System.out.println("Sort by Weight: " + present.sortSweetByWeight());

        System.out.println("Select weight range 400 for 550: " + present.selectSweetByWeightRange(400, 550));

        System.out.println("Select weight 500: " + present.selectSweetByWeight(500));

        System.out.println("Select name Kit-kat: " + present.selectSweetByName("Kit-kat"));
    }
}
