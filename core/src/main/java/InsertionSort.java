import java.util.ArrayList;
import java.util.List;

public class InsertionSort {

    public List<Integer> sort(List<Integer> InputArrayList) {

        List<Integer> copyOfInputArrayList = new ArrayList<>(InputArrayList);

        for (int i = 1; i < copyOfInputArrayList.size(); i++) {
            int temp = copyOfInputArrayList.get(i);
            int j = i - 1;
            while (j >= 0 && temp <= copyOfInputArrayList.get(j)) {
                copyOfInputArrayList.set(j + 1, (copyOfInputArrayList.get(j)));
                j--;
            }
            copyOfInputArrayList.set(j + 1, temp);
        }
        return copyOfInputArrayList;
    }

}
