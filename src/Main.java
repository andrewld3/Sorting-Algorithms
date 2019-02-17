import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        int[] unsorted;
        int[] original = null;

        do{
            System.out.println();
            System.out.println("MENU");
            System.out.println("1) Generate Random Number List");
            System.out.println("2) Print Number List");
            System.out.println("3) Bubble Sort");
            System.out.println("4) Insertion Sort");
            System.out.println("5) Quick Sort");
            System.out.println("6) Quit");
            System.out.print("Choice: ");
            choice = in.nextInt();

            switch(choice) {
                case 1:
                    original = createRandomList();
                    break;
                case 2:
                    printArray(original);
                    break;
                case 3:
                    unsorted = original.clone();
                    sortBubble(unsorted);
                    break;
                case 4:
                    unsorted = original.clone();
                    sortInsertion(unsorted);
                    break;
                case 5:
                    unsorted = original.clone();
                    sortQuick(unsorted);
                    break;
                default:
                    break;
            }
        } while(choice != 6);
    }

    private static int[] createRandomList() {
        int quantity;
        Scanner in = new Scanner(System.in);
        Random numGen = new Random();
        IntStream randoms;

        System.out.print("Enter Quantity of Numbers: ");
        quantity = in.nextInt();
        randoms = numGen.ints(quantity,0,10000000);

        return randoms.toArray();
    }

    private static void printArray(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(i % 10 == 0){
                System.out.println();
            }
            System.out.print(nums[i] + ", ");
        }
        System.out.println();
    }

    private static void sortQuick(int[] unsortedArray) {
        QuickSort q = new QuickSort(unsortedArray);
        q.startSort();
    }

    private static void sortInsertion(int[] unsortedArray) {
        System.out.println("Insertion Sort");
        InsertionSort i = new InsertionSort(unsortedArray);
        i.sortArray();
    }

    private static void sortBubble(int[] unsortedArray) {
        System.out.println("Bubble Sort");
        BubbleSort b = new BubbleSort(unsortedArray);
        b.sortArray();
    }
}
