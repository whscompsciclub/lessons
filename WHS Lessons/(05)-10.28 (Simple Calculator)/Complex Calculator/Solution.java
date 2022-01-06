import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double res = new Calculator(sc.nextLine()).value();
        NumberFormat outputFormat = new DecimalFormat("#.0#######");  
        System.out.println(outputFormat.format(res));
        sc.close();
    }

}

class Calculator {
    private String s;
    private int idx;
    private Double val;

    public Calculator(String input) {
        s = input.replaceAll(" ", "");
        val = expr();
    }

    public Double value() {
        return val;
    }

    private boolean hasMore() {
        return idx < s.length();
    }

    private boolean found(String toFind) {
        if (hasMore() && s.indexOf(toFind, idx) == idx) {
            idx += toFind.length();
            return true;
        }
        return false;
    }

    private Double expr() {
        return addSub();
    }

    private Double addSub() {
        Double num = multDiv();
        while (true) {
            if (found("+"))
                num += multDiv();
            else if (found("-"))
                num -= multDiv();
            else
                break;
        }
        return num;
    }

    private Double multDiv() {
        Double num = unary();
        while (true) {
            if (found("*"))
                num *= unary();
            else if (found("/"))
                num /= unary();
            else
                break;
        }
        return num;
    }

    private Double unary() {
        boolean negative = false;
        if (found("+")) {
            // already false
        }
        else if (found("-")) {
            negative = true;
        }
        Double num = exp();
        return negative? -num : num;
    }

    private Double exp() {
        ArrayList<Double> nums = new ArrayList<Double>(Arrays.asList(number()));
        while (true) {
            if (found("^"))
                nums.add(number());
            else
                break;
        }
        Double num = nums.remove(nums.size() - 1);
        for (int i = nums.size() - 1; i >= 0; i--)
            num = Math.pow(nums.get(i), num);
        return num;
    }

    private Double number() {
        if (found("(")) {
            double num = expr();
            if (!found(")"))
                throw new RuntimeException(
                        "Expected a closing parenthesis at char " + (idx + 1));
            return num;
        }
        Pattern p = Pattern.compile("^\\d+(\\.\\d+)?(e-?\\d+)?");
        // substring() is O(n) for new JDKs, so maybe use another method
        Matcher m = p.matcher(s.substring(idx));
        if (m.find()) {
            String res = m.group();
            idx += res.length();
            return Double.parseDouble(res);
        }
        else
            throw new RuntimeException("Expected a number at char " + (idx + 1));
    }

}
