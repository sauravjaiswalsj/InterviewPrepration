import java.util.*;

public class StressTest {
    // minimum range of random numbers
    private static int lowerBound = 0;
 
    // maximum range of random numbers
    private static int upperBound = 1000;
 
    // minimum size of reqd array
    private static int minSize = 1;
 
    // maximum size of reqd array
    private static int maxSize = 20;
    //generatehDuplicates(100, 50, 0.4);
    // Create an array of 100 elements with a maximum value of 50 and 40% probability of duplicates
    public static int[] generateDuplicates(int maxSize, int maxValue, double duplicateProbability, Integer startValue) {
        // Randomly select the size of the array within the specified maximum size
        int size = new Random().nextInt(maxSize + 1); // Ensure size is between 0 and maxSize

        int[] array = new int[size];
        Random random = new Random();

        int actualStartValue = startValue != null ? startValue : random.nextInt(maxValue + 1); // Use provided startValue or a random one

        int nextValue = actualStartValue == 0 ? random.nextInt(maxValue + 1) : actualStartValue;
        // Initialize nextValue to ensure a non-zero starting value

        for (int i = 0; i < size; i++) {
            // Generate a value within the allowed range, potentially reusing previous values
            int value = nextValue;

            // Prevent duplicate 0s if a starting value is specified
            if (actualStartValue > 0) {
                value = random.nextInt(maxValue - actualStartValue + 1) + (actualStartValue*maxValue)%maxSize; // Choose a non-zero value
            }

            // Decide whether to duplicate the value based on the probability
            if (random.nextDouble() < duplicateProbability) {
                // Find a random existing index to replace with the duplicate value
                int duplicateIndex = random.nextInt(i + 1);
                if(duplicateIndex < 0)
                    duplicateIndex = random.nextInt(size);
                    if (value == 0) {
                        value = random.nextInt(maxValue - actualStartValue + 1) + (actualStartValue * maxValue) % maxSize;
                    }
                array[duplicateIndex] = value;
            } else {
                // Assign the new value to the current index
                if(value == 0)
                    value = random.nextInt(100);
                array[i] = value;
            }

            // Prepare for the next value
            nextValue = random.nextInt(maxValue - actualStartValue + 1) + actualStartValue;
        }

        return array;
    }

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
    //String YELLOW = "\u001B[33m"; 
    public static void display(int[] arr){
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
        if(isMatch == false)
            debugIntArrays(expected, actual);
        return isMatch;
    }
    public static boolean compare(int expected, int actual){
        if(expected != actual){
            System.out.println("Actual size: "+ actual + " is not actual to expected size : " + expected);
            return false;
        }
        return true;
    }
    public static boolean compareDebug(int expected, int actual){
        System.out.println("Actual: " + actual + " Expected: " + expected);
        if(expected != actual){
            System.out.println("Actual size: "+ actual + " is not actual to expected size : " + expected);
            return false;
        }
        System.out.println(true);
        return true;
    }
    public static void debugIntArrays(int[] expected, int[] actual){
        if(expected.length != actual.length){
            System.out.println("Actual size: "+ actual.length + " is not actual to expected size : " + expected.length);
        }
        boolean isMatch = true;
        for(int i = 0; i < expected.length; i++){
            if(expected[i] != actual[i]){
                isMatch = false;
                break;
            }
        }
        System.out.println();
        System.out.println(isMatch);

        System.out.println();
        System.out.println("-----------Debug View---------------");
        System.out.println();
        System.out.println("Actual Value: ");
        for(int i : actual){
            System.out.printf("%d ",i);
        }
        System.out.println();

        System.out.println("Expected: ");

        for(int i : expected){
            System.out.printf("%d ",i);
        }
        System.out.println();
        System.out.println();
        System.out.println("-----------Debug View End---------------");

        System.out.println();
        System.out.println();
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

    public static int[] getArray(ArrayList<Integer> list){
        int[] arr = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }

        return arr;
    }

    // use case : Vector<Character> charVector = generateCharacterLists(10, Vector.class);
    public static <T> T generateCharacterLists(int length, Class<T> collectionType) {
        Random random = new Random();
        List<Character> characters = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            char randomChar = (char) (random.nextInt(26) + 'a');
            characters.add(randomChar);
        }

        if (collectionType.isArray()) {
            Character[] array = characters.toArray(new Character[0]);
            return (T) array;
        } else if (List.class.isAssignableFrom(collectionType)) {
            if (ArrayList.class.isAssignableFrom(collectionType)) {
                return (T) new ArrayList<>(characters);
            } else if (LinkedList.class.isAssignableFrom(collectionType)) {
                return (T) new LinkedList<>(characters);
            } else if (Vector.class.isAssignableFrom(collectionType)) {
                return (T) new Vector<>(characters);
            }
        }

        throw new IllegalArgumentException("Unsupported collection type");
    }

    // use case : Vector<Character> charVector = generateStringLists(count: 5,minLength: 3, maxLength: 7, String[].class);
    public static <T> T generateStringLists(int count, int minLength, int maxLength, Class<T> collectionType) {
        Random random = new Random();
        List<String> strings = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            int length = random.nextInt(maxLength - minLength + 1) + minLength;
            StringBuilder sb = new StringBuilder(length);
            for (int j = 0; j < length; j++) {
                char randomChar = (char) (random.nextInt(26) + 'a');
                sb.append(randomChar);
            }
            strings.add(sb.toString());
        }

        if (collectionType.isArray()) {
            String[] array = strings.toArray(new String[0]);
            return (T) array;
        } else if (List.class.isAssignableFrom(collectionType)) {
            if (ArrayList.class.isAssignableFrom(collectionType)) {
                return (T) new ArrayList<>(strings);
            } else if (LinkedList.class.isAssignableFrom(collectionType)) {
                return (T) new LinkedList<>(strings);
            } else if (Vector.class.isAssignableFrom(collectionType)) {
                return (T) new Vector<>(strings);
            }
        }

        throw new IllegalArgumentException("Unsupported collection type");
    }
}
