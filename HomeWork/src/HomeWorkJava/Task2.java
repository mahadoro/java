package HomeWorkJava;

import java.util.StringTokenizer;

public class Task2 {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        String string = "         onE    oF the biGGest REASONS why    Java is SO poPular is the platform     independence.     PROGRAMS can run on several different types   OF COMPUTER; as long as THE    computer    has a    JaVa RUNtime environment (jRE) installed, a jAVA program CAN run oN it.";
        String str = task2.removeSpaces(string);
        String s = task2.toUpperCase(str);
        System.out.println(s);


    }

    public String removeSpaces(String string) {
        StringTokenizer st = new StringTokenizer(string, " ");
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreElements()) {
            sb.append(st.nextElement()).append(" ");
        }
        String newString = sb.toString();
        newString = newString.trim();
        return newString;

    }

    public String toUpperCase(String string) {
        StringBuilder sb = new StringBuilder(string);

        for (int i = 0; i < sb.length(); i++) {
            if (i == 0 || sb.charAt(i - 1) == ' ')
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));

            else if (Character.isUpperCase(sb.charAt(i))) {
                sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
            }
        }
        return sb.toString();
    }
}

