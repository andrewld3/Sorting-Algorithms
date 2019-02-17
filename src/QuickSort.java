// Code reference was taken from https://www.geeksforgeeks.org/quick-sort/
// This code used from that website has been modified to fit this assignment.

public class QuickSort {

    private int[] array;
    private int arrayLength;
    private int begin;
    private int end;
    private int swapCount;
    private long timeIn;
    private long timeOut;

    public QuickSort(int[] unsortedArray) {
        array = unsortedArray;
        arrayLength = unsortedArray.length;
        swapCount = 0;
        begin = 0;
        end = arrayLength - 1;

    }

    public void startSort() {
        timeIn = System.currentTimeMillis();
        sortArray(array, begin, end);
        timeOut= System.currentTimeMillis();
        printSwapCount();
    }

    private void sortArray(int[] a, int begin, int end) {
        if(begin < end) {
            int mid = split(array, begin, end);
            sortArray(array, begin, mid - 1);
            sortArray(array, mid + 1, end);
        }
    }

    private int split(int[] a, int start, int finish) {
        int mid = array[finish];
        int i = (start - 1);
        for(int j = start; j < finish; j++) {
            if(array[j] <= mid) {
                i++;
                int t = array[i];
                array[i] = array[j];
                array[j] = t;
                swapCount++;
            }
        }
        int t = array[i+1];
        array[i+1] = array[finish];
        array[finish] = t;
        swapCount++;

        return i+1;
    }

    private void printSwapCount() {
        System.out.println("Number of Swaps: " + swapCount);
        System.out.println("Time Required: " + (timeOut - timeIn) + " Milliseconds \n");
    }

}
