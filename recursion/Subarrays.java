import java.util.ArrayList;

public class Subarrays {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};

        generateAll(a);
    }

    private static void generateAll(int[] a){
        for (int i = 0; i < a.length; i++){
            for (int j = i; j < a.length; j++) {
                for (int k = i; k <= j; k++){
                    System.out.print(a[k]);
                }
                System.out.println();
            }
        }
    }
}
