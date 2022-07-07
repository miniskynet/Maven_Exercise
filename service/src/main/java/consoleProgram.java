import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Scanner;

public class consoleProgram {

    public static void main(String args[]){

        sortingAlgorithms sorter = new sortingAlgorithms();
        Scanner sc = new Scanner(System.in);
        String userInputAsString = sc.nextLine();
        ArrayList<Integer> userInputAsInts = new ArrayList<>();
        String[] valueArray = userInputAsString.split(" ");
        for(int i=0;i<valueArray.length;i++){
            userInputAsInts.add(Integer.parseInt(valueArray[i]));
        }

        Instant start = Instant.now();
        System.out.println(sorter.insertionSort(userInputAsInts));
        Instant end = Instant.now();
        System.out.println("\nTime taken for insertion sort: "+Duration.between(start, end)+"\n");
        start = Instant.now();
        System.out.println(sorter.bubbleSort(userInputAsInts));
        end = Instant.now();
        System.out.println("\nTime taken for bubble sort: "+Duration.between(start, end)+"\n");
        start = Instant.now();
        System.out.println(sorter.selectionSort(userInputAsInts));
        end = Instant.now();
        System.out.println("\nTime taken for selection sort: "+Duration.between(start, end)+"\n");
    }

}