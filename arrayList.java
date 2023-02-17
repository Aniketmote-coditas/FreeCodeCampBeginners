import java.util.*;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(15);
        arr.add(1);
        arr.add(2);
        arr.add(20);
        arr.add(3);
        arr.add(6);
        arr.add(19);
        arr.add(12);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(6);
        System.out.println(arr);
        System.out.println(arr.get(3));
        arr.remove(2);
        System.out.println(arr);
        arr.remove(Integer.valueOf(12));
        System.out.println(arr);
        arr.sort(Comparator.naturalOrder());
        System.out.println(arr);
        arr.sort(Comparator.reverseOrder());
        System.out.println(arr);
        System.out.println(arr.contains(Integer.valueOf(19)));
        arr.forEach(i -> {
            System.out.println(i);
        });
        arr.forEach(i -> {
            System.out.println(i);
        });
    }
}
