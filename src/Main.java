import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(sol.romanToInt(s));
    }
}

class Solution {
    public int romanToInt(String s) {

        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        s = s.replace("IV", "IIII");
        s = s.replace("IX", "VIIII");
        s = s.replace("XL", "XXXX");
        s = s.replace("XC", "LXXXX");
        s = s.replace("CD", "CCCC");
        s = s.replace("CM", "DCCCC");

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += hm.get(s.charAt(i));
        }

        return sum;
    }
}