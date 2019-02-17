public class BubbleSort {

    private int[] array;
    private int arrayLength;
    private int swapCount;
    private long timeIn;
    private long timeOut;
    private boolean notDone;

    public BubbleSort(int[] a) {
        array = a;
        arrayLength = a.length;
        swapCount = 0;
    }

    public void sortArray() {
        timeIn = System.currentTimeMillis();
        for(int i = 0; i < arrayLength - 1; i++) {
            notDone = false;
            for(int j = 0; j < arrayLength-i-1; j++) {
                if(array[j] > array[j+1]) {
                    int a = array[j];
                    array[j] = array[j+1];
                    array[j+1] = a;
                    swapCount++;
                    notDone = true;
                }
            }
            if(notDone == false)
                break;
        }
        timeOut = System.currentTimeMillis();
        printSwapCount();
    }

    private void printSwapCount() {
        System.out.println("Number of Swaps: " + swapCount);
        System.out.println("Time Required: " + (timeOut - timeIn) + " Milliseconds \n");
    }
}
