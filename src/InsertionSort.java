public class InsertionSort {

    private int[] array;
    private int arrayLength;
    private int swapCount;
    private long timeIn;
    private long timeOut;

    public InsertionSort(int[] a) {
        array = a;
        arrayLength = a.length;
        swapCount = 0;
    }

    public void sortArray() {
        timeIn = System.currentTimeMillis();
        for(int i = 1; i < arrayLength; ++i) {
            int target = array[i];
            int j = i-1;

            while(j >=0 && array[j] > target) {
                array[j+1] = array[j];
                j = j -1;
                swapCount++;
            }
            array[j+1] = target;
        }
        timeOut = System.currentTimeMillis();
        printSwapCount();
    }

    private void printSwapCount() {
        System.out.println("Number of Swaps: " + swapCount);
        System.out.println("Time Required: " + (timeOut - timeIn) + " Milliseconds \n");
    }
}
