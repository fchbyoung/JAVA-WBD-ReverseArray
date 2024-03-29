import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;

        do {
            System.out.println("Enter a size:");
            size = scanner.nextInt();
            if(size > 20) {
                System.out.println("Size doesn't exceed 20");
            }
        } while (size > 20);

        array = new int[size];
        for(int i = 0; i < array.length; i++) {
            System.out.println("Enter " + "a[" + (i+1) + "] = ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Array List: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        for(int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }

        System.out.print("\nArray List after reverse:");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }


    }
}
