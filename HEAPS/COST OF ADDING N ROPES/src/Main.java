import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        int[] ropes = {2, 3, 3, 4, 6};
        int cost = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < ropes.length; i++) {
            pq.add(ropes[i]);
        }

        while(pq.size() > 1) {
            int min = pq.remove();
            int min2 = pq.remove();
            cost += min + min2;
            pq.add(min + min2);
        }

        System.out.println("Cost of adding n ropes = " + cost);
    }
}
