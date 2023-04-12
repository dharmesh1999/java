package Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PQ {

    static class Student implements Comparable<Student> { // overriding
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String args[]) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("A", 4));
        pq.add(new Student("B", 6));
        pq.add(new Student("C", 9));
        pq.add(new Student("D", 2));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " -> " + pq.peek().rank); // O(1)
            pq.remove(); // O(log n)
        }
    }
}
