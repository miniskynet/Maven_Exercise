import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

    public List<Integer> sort(List<Integer> InputArrayList) {

        List<Integer> copyOfInputArrayList = new ArrayList<>(InputArrayList);

        for (int i = 0; i < copyOfInputArrayList.size(); i++) {
            for (int j = 1; j < (copyOfInputArrayList.size() - i); j++) {
                if ((copyOfInputArrayList.get(j - 1)) > (copyOfInputArrayList.get(j))) {
                    int temp = copyOfInputArrayList.get(j - 1);
                    copyOfInputArrayList.set(j - 1, (copyOfInputArrayList.get(j)));
                    copyOfInputArrayList.set(j, temp);
                }
            }
        }
        return copyOfInputArrayList;
    }

}
