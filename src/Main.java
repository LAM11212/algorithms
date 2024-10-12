
import java.util.Scanner;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println("welcome traveller would you like to play?");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        MyFrame.player hero = new MyFrame.player("Link", 100);

        if(choice.equalsIgnoreCase("yes")) {
            System.out.println("Incredible, then let us continue!");
            System.out.println("Your name is: "+hero.getName()+ " you currently have: "+hero.getHealth()+ " health!");
            System.out.println("anyways, i am going to show you a bunch of sorting algorithms now");
        }else{
            System.out.println("aw man, maybe next time");
            return;
        }


        int[] array = new int[100];

        for(int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        int[] array2 = {2, 6, 5, 9, 1, 8, 3, 7};

        int[] array3 = {6, 9, 1, 4, 2, 0, 3, 5, 4};

        System.out.println("Select which one you would like to see (type 1-3):\n1.Bubble sort\n2. Binary Search\n3. Merge Sort");
        String ahh = scanner.nextLine();
        switch(ahh) {
            case "1":
                System.out.print("Original array: ");
                for(int i : array2) {
                    System.out.print(i + " ");
                }
                long time = MyFrame.player.bubbleSort(array2);
                System.out.println("Sorted array: ");
                for(int i : array2) {
                    System.out.print(i + " ");
                }
                System.out.println("This function took "+ time+ " nano seconds!");

                break;
            case "2":
                System.out.println("Enter a target to search for in an array of 100 numbers: ");
                int target = scanner.nextInt();
                long time2 = System.nanoTime();
                int index = MyFrame.player.binarySearch(array, target);
                long time3 = System.nanoTime() - time2;
                if(index != -1) {
                    System.out.println("Element "+target+" found at index: "+index);
                    System.out.println("This function took "+time3+" nano seconds!");
                }else {
                    System.out.println("element not found sorry");
                    System.out.println("This function took "+time3+" nano seconds!");
                }
                break;
            case "3":
                System.out.println("Original array: ");
                for(int i : array3) {
                    System.out.print(i + " ");
                }
                long timee = MyFrame.player.mergeSort(array3);
                if(timee == -1) {
                    System.out.println("function failed sorry");
                } else {
                    System.out.println("Sorted array: ");
                    for(int i : array3) {
                        System.out.print(i + " ");
                    }
                    System.out.println("This function took "+timee+ " nano seconds!");
                }

        }
    }
}



