package HomeWorkGeneric;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8");
        GenericTry<List<String>> generic = new GenericTry<>();
        generic.setT(list);
        generic.findElement();
    }

}

class GenericTry<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    void findElement() {
        int first = 0;
        int second = 1;
        int third;
        List<String> list = (List<String>) t;
        System.out.println(list.get(first));
        System.out.println(list.get(second));
        for (int i = 0; i < list.size(); i++) {
            third = first + second;
            first = second;
            second = third;
            if (list.size() <= third) {
                break;
            }
            System.out.println(list.get(third));
        }


    }
}

