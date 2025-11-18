public class MathematicalEquation {
    public static double solveEquation(int n, int x) {
        int num = 3;
        double result = 0;
        int sign = 1;
        int pow = 2;
        for (int i = 1; i <= n; i++) {
            result += sign * (Math.pow(x, pow)/fact(num));
            num++;
            pow++;
            sign *= -1;
        }
        return result;
    }
    public static int fact(int num) {
        if (num < 0) {
            return 0;
        }
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 3;
        int x = 5;
        System.out.println(solveEquation(n, x));
    }
}
