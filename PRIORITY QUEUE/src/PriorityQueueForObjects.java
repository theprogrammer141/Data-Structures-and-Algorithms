import java.util.PriorityQueue;

public class PriorityQueueForObjects {
    public static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student o) {
            return this.rank - o.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("Bob", 5));
        pq.add(new Student("John", 3));
        pq.add(new Student("Jane", 2));
        pq.add(new Student("Jack", 1));

        while(!pq.isEmpty()) {
            System.out.println(pq.peek().name + "->" + pq.peek().rank);
            pq.remove();
        }
    }

}
