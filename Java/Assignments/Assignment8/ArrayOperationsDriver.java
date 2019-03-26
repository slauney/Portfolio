import java.util.Scanner;
/**
 * To test ArrayOperations.java class
 *
 * @author y. akiyama
 */
public class ArrayOperationsDriver {


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        //get the size of the 1st array
        System.out.print("How many elements in the 1st array? ");
        int len = kb.nextInt();
        kb.nextLine();
        int[] a = new int[len];

        //get the values
        if(a.length>0){
            System.out.println("\nEnter values for the 1st array");
            for (int i = 0; i < len; i++) {
                a[i] = kb.nextInt();
            }
            kb.nextLine();
        }

        System.out.print("Press enter...");
        kb.nextLine();
        System.out.println();

        //get the size of the 2nd array
        System.out.print("How many elements in the 2nd array? ");
        len = kb.nextInt();
        kb.nextLine();
        int[] b = new int[len];

        //get the values
        if(b.length>0){
            System.out.println("\nEnter values for the 2nd array.");
            for (int i = 0; i < len; i++) {
                b[i] = kb.nextInt();
            }
            kb.nextLine();
        }

        System.out.print("\n\nPress enter...");
        kb.nextLine();
        System.out.println();

        System.out.println("Testing getSum() method");
        System.out.printf("The sum of the 1st array is %5d\n",
                ArrayOperations.getSum(a));
        System.out.printf("The sum of the 2nd array is %5d\n",
                ArrayOperations.getSum(b));

        System.out.print("\n\nPress enter...");
        kb.nextLine();
        System.out.println();


        System.out.println("Testing getMax() method");
        System.out.printf("The max of the 1st array is %5d\n",
                ArrayOperations.getMax(a));
        System.out.printf("The max of the 2nd array is %5d\n",
                ArrayOperations.getMax(b));

        System.out.print("\n\nPress enter...");
        kb.nextLine();
        System.out.println();

        System.out.println("Testing getMin() method");
        System.out.printf("The min of the 1st array is %5d\n",
                ArrayOperations.getMin(a));
        System.out.printf("The min of the 2nd array is %5d\n",
                ArrayOperations.getMin(b));

        System.out.print("\n\nPress enter...");
        kb.nextLine();
        System.out.println();

        System.out.println("Testing getProduct() method");
        System.out.printf("The product of the 1st array is %5d\n",
                ArrayOperations.getProduct(a));
        System.out.printf("The product of the 2nd array is %5d\n",
                ArrayOperations.getProduct(b));

        System.out.print("\n\nPress enter...");
        kb.nextLine();
        System.out.println();

        System.out.println("Testing getAverage() method");
        System.out.printf("The average of the 1st array is %5.2f\n",
                ArrayOperations.getAverage(a));
        System.out.printf("The average of the 2nd array is %5.2f\n",
                ArrayOperations.getAverage(b));

        System.out.print("\n\nPress enter...");
        kb.nextLine();
        System.out.println();

        System.out.println("Testing printArray() method");
        ArrayOperations.printArray(a, 0);
        ArrayOperations.printArray(a, 2);
        ArrayOperations.printArray(a, a.length);
        ArrayOperations.printArray(b, 0);
        ArrayOperations.printArray(b, 2);
        ArrayOperations.printArray(b, b.length);

        System.out.print("\n\nPress enter...");
        kb.nextLine();
        System.out.println();
        
    }

}
