import java.util.ArrayDeque;
import java.util.Random;

public class Stacks {
    private ArrayDeque<Integer> ad1;
    private ArrayDeque<Integer> ad2;
    private static final int BOUND = 1000;
    private int size1 = 10;
    private int size2 = 12;
    private int maxSize;

    public Stacks() {
        if (size1 > size2) { maxSize = size1; }
        else { maxSize = size2; }
        ad1 = new ArrayDeque<>(size1);
        ad2 = new ArrayDeque<>(size2);
        Random random = new Random();
        System.out.println("Stack 1:\t\tStack2:");
        for(int i = 0; i< maxSize; i++) {
            int rand = random.nextInt(BOUND);
            if (i<size1) {
                ad1.offerLast(rand);
                System.out.print(rand + "\t\t\t\t");
            } else {
                System.out.print(" \t\t\t\t");
            }
            rand = random.nextInt(BOUND);
            if (i<size2) {
                ad2.offerLast(rand);
                System.out.println(rand);
            } else {
                System.out.println();
            }
        }
    }

    public void getStacks() {
        System.out.println("Stack 1:\t\tStack2:");
        for(int i = 0; i< maxSize; i++) {
            if (i<size1) {
                System.out.print(ad1.pop() + "\t\t\t\t");
            } else {
                System.out.print(" \t\t\t\t");
            }
            if (i<size2) {
                System.out.println(ad2.pop());
            }
            else {
                System.out.println();
            }
        }
    }

    public void replace() {
        ArrayDeque<Integer> tmp = new ArrayDeque<>(size1);
        for(int i = 0; i< size1; i++) {
            tmp.offerLast(ad1.pollFirst());
        }
        for(int i = 0; i< size2; i++) {
            ad1.offerLast(ad2.pollFirst());
        }
        ad2 = tmp;
        size1 = ad1.size();
        size2 = ad2.size();
    }

    public void demo() {
        replace();
        System.out.println("\nAfter replace");
        getStacks();
    }
}
