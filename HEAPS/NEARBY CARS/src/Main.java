import java.util.PriorityQueue;

public class Main {
    static class Point implements Comparable<Point> {
        int x;
        int y;
        int distanceSquare;
        int index;

        public Point(int x, int y, int distanceSquare, int index) {
            this.x = x;
            this.y = y;
            this.distanceSquare = distanceSquare;
            this.index = index;
        }

        @Override
        public int compareTo(Point p2) {
            return this.distanceSquare - p2.distanceSquare;
        }
    }

    public static void main(String[] args) {
        int[][] pts = {{3,3}, {5,-1}, {-2,4}};
        int k = 2;

        PriorityQueue<Point> pq  = new PriorityQueue<>();
        for (int i = 0; i < pts.length; i++) {
            int distanceSquare = pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1];
            pq.add(new Point(pts[i][0], pts[i][1], distanceSquare, i));
        }

        for (int i = 0; i < k; i++) {
            System.out.println("C" + pq.remove().index);
        }
    }
}
