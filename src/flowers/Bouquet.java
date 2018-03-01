package flowers;

public class Bouquet {
    private Flower[] flowers;

    public Bouquet() {
        Flower rose1 = new Flower("rose", "red", 35);
        Flower rose2 = new Flower("rose", "blue", 85);
        Flower pink = new Flower("pink", "purple", 20);
        addFlowers(rose1, rose2, pink);
    }

    public void addFlowers(Flower...flowers) {
        this.flowers = flowers;
    }

    public void showFlowers() {
        if (flowers == null) return;
        for (Flower f: flowers) {
            System.out.println("Name: " + f.getName() + ", color: " + f.getColor() + ", price: " + f.getPrice());
        }
    }

    public Flower[] getFlowers() {
        return flowers;
    }
}

