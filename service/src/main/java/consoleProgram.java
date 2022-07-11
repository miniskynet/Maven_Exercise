import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class consoleProgram {

    public static void main(String args[]) {

        InsertionSort insertionSorter = new InsertionSort();
        SelectionSort selectionSorter = new SelectionSort();
        BubbleSort bubbleSorter = new BubbleSort();
        Scanner sc = new Scanner(System.in);
        String userInputAsString = sc.nextLine();
        List<Integer> userInputAsInts = new ArrayList<>();
        String[] valueArray = userInputAsString.split(" ");

        for (int i = 0; i < valueArray.length; i++) {
            userInputAsInts.add(Integer.parseInt(valueArray[i]));
        }

        Instant start = Instant.now();
        System.out.println(insertionSorter.sort(userInputAsInts));
        Instant end = Instant.now();
        System.out.println("\nTime taken for insertion sort: " + Duration.between(start, end) + "\n");
        start = Instant.now();
        System.out.println(selectionSorter.sort(userInputAsInts));
        end = Instant.now();
        System.out.println("\nTime taken for selection sort: " + Duration.between(start, end) + "\n");
        start = Instant.now();
        System.out.println(bubbleSorter.sort(userInputAsInts));
        end = Instant.now();
        System.out.println("\nTime taken for bubble sort: " + Duration.between(start, end) + "\n");
    }

}