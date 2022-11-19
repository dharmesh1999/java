import java.util.*;

public class JobSquence {
    static class Job {
        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String args[]) {
        int jobsInfo[][] = { { 1, 56, 288 }, { 2, 27, 435 }, { 3, 67, 401 }, { 4, 64, 368 }, { 5, 94, 24 },
                { 6, 54, 361 }, { 7, 43, 108 }, { 8, 96, 167 }, { 9, 73, 251, }, { 10, 96, 170, }, { 11, 14, 156 },
                { 12, 78, 184 }, { 13, 61, 370 }, { 14, 77, 424 }, { 15, 68, 397 }, { 16, 40, 375 }, { 17, 36, 218 } };

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        // object sorted
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit); // ascending order of profit

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }

        // print seq
        System.out.println("Max Jobs = " + seq.size());

        for (int i = 0; i < seq.size(); i++) {
            System.out.println(seq.get(i) + " ");
        }

    }
}
