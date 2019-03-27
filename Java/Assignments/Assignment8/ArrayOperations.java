
/**
 *
 * @author zach slaunwhite (A00385522)
 */
public class ArrayOperations {

    public static int getMax(int[] a) {
        int MAX = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > MAX) {
                MAX = a[i];
            }
        }
        if (a.length == 0){
            return 0;
        }
        else{
        return MAX;
        }
    }

    public static int getMin(int[] a) {
        int MIN = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < MIN) {
                MIN = a[i];
            }
        }
        if (a.length == 0){
            return 0;
        }
        else{
        return MIN;
        }
    }

    public static int getSum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static double getAverage(int[] a) {
        return (double) ArrayOperations.getSum(a) / (a.length);
    }

    public static int getProduct(int[] a) {
        int product = a[0];
        for (int i = 1; i < a.length; i++) {
            
            product *= a[i];
        }
        return product;
    }

    public static void printArray(int[] a, int stopIndex) {
        if (a.length > stopIndex){
            for (int i = 0; i <= stopIndex; i++){
            System.out.println("array [" + i + "] = " + a[i]);
        }
            System.out.println("");
        }
        if (a.length <= stopIndex){
            for (int i = 0; i < a.length; i++){
            System.out.println("array [" + (i) + "] = " + a[i]);
        }
            System.out.println("");
        }
    }

}
