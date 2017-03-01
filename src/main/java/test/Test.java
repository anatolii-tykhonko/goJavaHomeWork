package test;


import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String[] s = new String[5];
        s[1] = "sds";
        s[3] = "sdsss";
        Arrays.sort(s);

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
