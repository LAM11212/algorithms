
import java.util.ArrayList;
import java.util.Random;

public class MyFrame extends Main {

    public static class player {
        public int health;
        String name;
        ArrayList<String> items = new ArrayList<>();

        public player(String name, int health) {
            this.name = name;
            this.health = health;
        }

        public int getHealth() {
            return health;
        }

        public String getName() {
            return name;
        }

        public ArrayList<String> getItems() {
            return items;
        }

        public int getAttacked(int health) {
            Random random = new Random();
            int hit = random.nextInt(20);
            int newHealth = health - hit;
            System.out.println("Monster did "+hit +" damage!");
            if(newHealth < 0) {
                newHealth = 0;
            }
            return newHealth;
        }

        public static int binarySearch(int[] array, int target) {
            int low = 0;
            int high = array.length -1;

            while(low <= high) {
                int middle = low + (high - low) / 2;
                int value = array[middle];

                System.out.println("middle: " +middle);

                if(value < target) {
                    low = middle + 1;
                }else if(value > target) {
                    high = middle - 1;
                }else {
                    return middle;
                }
            }
            return -1;
        }

        public static long bubbleSort(int[] array2) {
            long time = System.nanoTime();
            for(int i = 0; i < array2.length -1; i++) {
                for(int j = 0; j < array2.length - i - 1; j++) {
                    if(array2[j] > array2[j + 1]) {
                        int temp = array2[j];
                        array2[j] = array2[j + 1];
                        array2[j + 1] = temp;
                    }
                }
            }
            return System.nanoTime() - time;
        }

        public static long mergeSort(int[] array3) {
            long time = System.nanoTime();
            int length = array3.length;
            if(length <= 1) return -1;

            int middle = length / 2;
            int[] leftArray = new int[middle];
            int[] rightArray = new int[length - middle];

            int i = 0;
            int j = 0;

            for(; i < length; i++) {
                if(i < middle) {
                    leftArray[i] = array3[i];
                }else {
                    rightArray[j] = array3[i];
                    j++;
                }
            }
            mergeSort(leftArray);
            mergeSort(rightArray);
            merge(leftArray, rightArray, array3);
            return System.nanoTime() - time;
        }

    }
    public static void merge(int[] left, int[] right, int[] array3) {
        int leftSize = array3.length / 2;
        int rightSize = array3.length - leftSize;
        int i = 0, l = 0, r = 0;

        while(l < leftSize && r < rightSize) {
            if(left[l] < right[r]) {
                array3[i] = left[l];
                i++;
                l++;
            }else {
                array3[i] = right[r];
                i++;
                r++;
            }
        }
    }
}
