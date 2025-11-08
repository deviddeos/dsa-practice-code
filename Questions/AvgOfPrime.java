class InnerAvgOfPrime {
    public int avgOfPrime() {
        int num[]= { 1, 2, 3 ,4 , 5, 6, 7, 8, 9};
        int sum = 0, count = 0;
        for (int i = 0; i < num.length; i++) {
            if (isPrime(num[i])) {
                sum += num[i];
                count++;
            }
        }
        return sum/count;
    }

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else {
            for (int i = 2; i <= n/2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    
}
public class AvgOfPrime {
    public static void main(String[] args) {
        //Average of all prime numbers.

        InnerAvgOfPrime d = new InnerAvgOfPrime();
        System.out.println(d.avgOfPrime());

    }
}
