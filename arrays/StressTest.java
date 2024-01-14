import java.util.Random;

public class StressTest {
    // minimum range of random numbers
    private static int lowerBound = 0;
 
    // maximum range of random numbers
    private static int upperBound = 1000;
 
    // minimum size of reqd array
    private static int minSize = 1;
 
    // maximum size of reqd array
    private static int maxSize = 20;
 
    // Driver Code
    public static int[] getIntArray ()
    {
        Random random = new Random();
 
        int size = random.nextInt(maxSize - minSize) + 
                                                minSize;
            int[] array = new int[size];
  
            for(int j = 0; j < size; j++)
            {
                int a = random.nextInt(upperBound - lowerBound) + 
                                                    lowerBound;
                array[j] = a;
            }
        return array;
    }
    public static int[] getIntArray(int min, int max)
    {
        Random random = new Random();
 
        int size = random.nextInt(max - min) + min;
            int[] array = new int[size];
  
            for(int j = 0; j < size; j++)
            {
                int a = random.nextInt(Math.abs(size));
                array[j] = a;
            }
        return array;
    }
    
    public static long[] getLongArray ()
    {
        Random random = new Random();
        
        int size = random.nextInt(maxSize - minSize) + 
                                                minSize;
            long[] array = new long[size];
  
            for(int j = 0; j < size; j++)
            {
                long a = random.nextInt(upperBound - lowerBound) + 
                                                    lowerBound;
                array[j] = a;
            }
        return array;
    }

    public static void display(int[] arr){
        String YELLOW = "\u001B[33m"; 
        System.out.println("--------------------------");
        for(int i = 0; i < arr.length; i++){
            System.out.printf("%d ", arr[i]);
        }
        System.out.println("\n--------------------------");
    }

    public static boolean matchIntArrays(int[] expected, int[] actual){
        if(expected.length != actual.length){
            System.out.println("Actual size: "+ actual.length + " is not actual to expected size : " + expected.length);
            return false;
        }
        boolean isMatch = true;
        for(int i = 0; i < expected.length; i++){
            if(expected[i] != actual[i]){
                isMatch = false;
                break;
            }
        }
        return isMatch;
    }
    
    public static boolean matchLongArrays(long[] expected, long[] actual){
        if(expected.length != actual.length){
            System.out.println("Actual size: "+ actual.length + " is not actual to expected size : " + expected.length);
            return false;
        }
        boolean isMatch = true;
        for(int i = 0; i < expected.length; i++){
            if(expected[i] != actual[i]){
                isMatch = false;
                break;
            }
        }
        return isMatch;
    }
}
