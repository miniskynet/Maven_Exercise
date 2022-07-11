import java.util.ArrayList;
import java.util.List;

public class SelectionSort {

    public List<Integer> sort(List<Integer> InputArrayList) {

        List<Integer> copyOfInputArrayList = new ArrayList<>(InputArrayList);

        for (int i = 0; i < copyOfInputArrayList.size() - 1; i++) {
            int minimumValueIndex = i;
            for (int j = i + 1; j < copyOfInputArrayList.size(); j++) {
                if ((copyOfInputArrayList.get(j)) < (copyOfInputArrayList.get(minimumValueIndex))) {
                    minimumValueIndex = j;
                }
                int temp = copyOfInputArrayList.get(minimumValueIndex);
                copyOfInputArrayList.set(minimumValueIndex, (copyOfInputArrayList.get(i)));
                copyOfInputArrayList.set(i, temp);
            }
        }
        return copyOfInputArrayList;
    }

}
