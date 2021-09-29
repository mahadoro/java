package HomeWorkJava;

public class Task1 {

    static int num = 0;

    public static int printNumber(int x) {

        num = num + 2;
        System.out.println(num);
        return num + printNumber(num + 2);
    }

    public static void main(String[] args) {
        Task1.printNumber(num);

    }


}
