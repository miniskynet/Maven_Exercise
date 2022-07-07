import java.util.ArrayList;

public class sortingAlgorithms {

    public ArrayList<Integer> insertionSort(ArrayList<Integer> InputArrayList){
        ArrayList<Integer> copyOfInputArrayList = new ArrayList<>(InputArrayList);
        for(int i=1; i<copyOfInputArrayList.size(); i++)   {
            int temp = copyOfInputArrayList.get(i);
            int j= i-1;
            while(j>=0 && temp <= copyOfInputArrayList.get(j))   {
                copyOfInputArrayList.set(j+1,copyOfInputArrayList.get(j));
                j--;
            }
            copyOfInputArrayList.set(j+1,temp);
        }
        return copyOfInputArrayList;
    }

    public ArrayList<Integer> selectionSort(ArrayList<Integer> InputArrayList){
        ArrayList<Integer> copyOfInputArrayList = new ArrayList<>(InputArrayList);
        for (int i = 0; i < copyOfInputArrayList.size()-1; i++)
        {
            int minimumValueIndex = i;
            for (int j = i+1; j < copyOfInputArrayList.size(); j++)
                if (copyOfInputArrayList.get(j) < copyOfInputArrayList.get(minimumValueIndex))
                    minimumValueIndex = j;

            int temp = copyOfInputArrayList.get(minimumValueIndex);
            copyOfInputArrayList.set(minimumValueIndex,copyOfInputArrayList.get(i));
            copyOfInputArrayList.set(i,temp);
        }
        return copyOfInputArrayList;
    }

    public ArrayList<Integer> bubbleSort(ArrayList<Integer> InputArrayList){

        for(int i=0;i< InputArrayList.size();i++){
            for(int j=1;j<(InputArrayList.size()-i);j++){
                if(InputArrayList.get(j-1)>InputArrayList.get(j)){
                    int temp = InputArrayList.get(j-1);
                    InputArrayList.set(j-1, InputArrayList.get(j));
                    InputArrayList.set(j,temp);
                }
            }
        }
        return InputArrayList;
    }

}