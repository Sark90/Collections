import flowers.*;

import java.util.HashMap;

public class Maps {
    private HashMap<Flower, Double> oldPrices;
    private HashMap<Flower, Double> newPrices;
    private Flower[] flowers;

    public Maps() {
        oldPrices = new HashMap<>();
        newPrices = new HashMap<>();
        flowers = new Bouquet().getFlowers();
        for(Flower f: flowers) {
            oldPrices.put(f, 20.0);
        }
    }

    public void changePrice() {
        for(Flower f: flowers) {
            double delta = 0;
            if(f.getName().equals("rose")) {
                delta += 18;
            }
            if(f.getColor().equals("blue")) {
                delta += 40;
            }
            if(f.getColor().equals("purple")) {
                delta += 2;
            }
            //oldPrices.put(f, (f.getPrice() + delta));
            newPrices.put(f, (oldPrices.get(f) + delta));
        }
    }

    public void comparePrices() {   //TODO: override compareTo()
        for (Flower f: flowers) {
            System.out.println(f.getColor() + " " + f.getName());
            System.out.println("\told price: " + oldPrices.get(f));
            System.out.println("\tnew price: " + newPrices.get(f));
            System.out.println("\tprofit: " + (newPrices.get(f) - oldPrices.get(f)));
        }
    }

    public void demo() {
        changePrice();
        comparePrices();
    }
}
