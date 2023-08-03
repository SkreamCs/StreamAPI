package Homework;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Comparator<Integer> comparator = (x, v) -> {
            if (x > v) return 1;
            else if (x < v) return -1;
            else return 0;
        };

        TreeSet<Integer> intTree = new TreeSet<>(comparator);
        intTree.addAll(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        Iterator<Integer> iterator = intTree.iterator();
        while (iterator.hasNext()) {
            int element = iterator.next();
            if (element % 2 != 0 || element < 0) {
                iterator.remove();
            }
        }
        System.out.println(intTree);
    }
}
