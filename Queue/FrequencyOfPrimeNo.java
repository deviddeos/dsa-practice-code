package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class FrequencyOfPrimeNo {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int frequencyOfPrimeNo(Queue<Integer> queue) {
        int count= 0;
        for (Integer nums : queue) {
            if (isPrime(nums)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(19);
        q.add(13);
        q.add(12);
        q.add(5);
        int frequencyOfPrimeNo = frequencyOfPrimeNo(q);
        System.out.println("Total prime numbers in Queue: "+frequencyOfPrimeNo);
    }
}
