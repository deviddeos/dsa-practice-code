class InnerAtoi {
    public int atoi() {
        String str = "-0012gfg4";
        int res = 0;
        int sign = 1;
        int index = 0;
        while (index < str.length() && str.charAt(index) == ' ') {
            index++;
        }
        if (index < str.length() && str.charAt(index) == '-' || str.charAt(index) == '+') {
            if (str.charAt(index++)=='-') {
                sign = -1;
            }
        }
        while (index < str.length() && str.charAt(index) >= '0' && str.charAt(index) <= '9') {
            if (res > Integer.MAX_VALUE/10 || (res == Integer.MIN_VALUE / 10 && str.charAt(index) - '0' > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res * 10 + (str.charAt(index++)-'0');
        }
        return res * sign;
    }    
}
public class Atoi {
    public static void main(String[] args) {
        InnerAtoi d = new InnerAtoi();
        int result = d.atoi();
        System.out.println(result);
    }
}