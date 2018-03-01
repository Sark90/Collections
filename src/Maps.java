import flowers.*;

import java.util.HashMap;

public class Maps {
    private HashMap<Flower, Double> prices; //flower, new price
    private Flower[] flowers;

    public Maps() {
        prices = new HashMap<>();
        flowers = new Bouquet().getFlowers();
    }

    public void changePrice() {
        double delta=0;
        for(Flower f: flowers) {
            if(f.getName().equals("rose")) {
                delta = 7;
            }
            if(f.getColor().equals("blue")) {
                delta = 60;
            }
            if(f.getColor().equals("purple")) {
                delta = 2;
            }
            prices.put(f, (f.getPrice() + delta));
        }
    }

    public void comparePrices() {
        for (Flower f: flowers) {
            System.out.println(f.getColor() + " " + f.getName());
            System.out.println("\told price: " + f.getPrice());
            System.out.println("\tnew price: " + prices.get(f));
            System.out.println("\tprofit: " + (prices.get(f) - f.getPrice()));
        }
    }

    public void demo() {
        changePrice();
        comparePrices();
    }
}
