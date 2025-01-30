import java.util.*;

class SortOfArrays {
    public void Sorting(int[] num1, int[] num2) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int digit : num1) {
            list.add(digit);
        }
        for (int digit : num2) {
            list.add(digit);
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == 0) {
                list.remove(i);
            }
        }

        int arrayLength = list.size();

        for (int i = 0; i < arrayLength - 1; i++) {
            for (int j = 0; j < arrayLength - i - 1; j++) {
                if (list.get(j) >= list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                } else {
                    continue;
                }
            }
        }
        System.out.println(list);
    }
}

public class main {
    public static void main(String[] args) {
        SortOfArrays sort = new SortOfArrays();

        sort.Sorting(new int[] { 9, 3, 3, 5, 6, 0, 0 }, new int[] { 4, 2, 5, 3, 3, 0, 0 });
    }
}