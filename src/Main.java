import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(2, 3, 4, 5, 6, 3, 2, 4, 6));
        Object[] sorteds = MyArrayList.bubbleSort(arrayList);
        Arrays.stream(sorteds).forEach(x -> System.out.print(x + " "));
        myArrayList.add(1);
        System.out.println(myArrayList);
        myArrayList.addAll(List.of(1, 2, 3, 5, 2, 1, 6, 3, 7));

        System.out.println(myArrayList);
    }
}