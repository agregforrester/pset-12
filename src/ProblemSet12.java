import java.util.ArrayList;

public class ProblemSet12 {
    public long factorial(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public long fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 1 || n == 0) {
            return n;
        }

        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    public long triangle(int rows) {
       if (rows < 0) {
           return -1;
       } else if (rows == 1) {
           return 1;
       }

       return rows + triangle(rows - 1);
    }

    public long sumDigits(int n) {
       if (n < 0) {
           return -1;
       } else if (n == 0) {
           return 0;
       }

       return (n % 10) + sumDigits(n / 10);
    }

    public long powerN(int base, int exponent) {
        if (base < 0 || exponent < 0) {
            return -1;
        } else if (exponent == 0) {
            return 1;
        }

        return base * powerN(base, exponent - 1);
    }

    public String changeXY(String text) {
        if (text == null) {
            return null;
        }

        if (text.equals("")) {
            return text;
        }

        if (text.charAt(0) == 'x') {
            return "y" + changeXY(text.substring(1));
        }

        return text.charAt(0) + changeXY(text.substring(1));

    }

    public static int array11(int[] data, int index) {
        if (data == null || index < 0 || index > data.length) {
            return -1;
        } else if (index == data.length) {
            return 0;
        }

        if (data[index] == 11) {
            return 1 + array11(data, index + 1);
        }

        return array11(data, index + 1);
    }

    public int strCount(String str, String sub) {
        int strlen = str.length();
        int sublen = sub.length();

        if (strlen < sublen) {
            return 0;
        }
        if (str.substring(0,sublen).equals(sub)) {
            return 1 + strCount(str.substring(sublen), sub);
        } else {
            return strCount(str.substring(1), sub);
        }
    }


    public boolean strCopies(String str, String sub, int n) {
        return func(str, sub) == n;
    }

    private int func(String str, String sub) {

        int strlen = str.length();
        int sublen = sub.length();
        if (strlen < sublen) return 0;
        if (str.substring(0, sublen).equals(sub))
            return 1 + func(str.substring(1), sub);
        else
            return func(str.substring(1), sub);

    }


    public int strDist(String str, String sub) {
        return func1(str, sub).length();
    }

    private String func1(String str, String sub) {
        int strlen = str.length();
        int sublen = sub.length();

        if (str.equals("")) {
            return str;
        }
        if (str.startsWith(sub)) {
            if (str.substring(strlen - sublen, strlen).equals(sub)) {
                return str;
            } else {
                return func1(str.substring(0, strlen - 1), sub);
            }
        } else {
            return func1(str.substring(1), sub);
        }
    }
}
