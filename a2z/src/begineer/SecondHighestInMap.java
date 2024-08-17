package begineer;
import java.util.TreeMap;
import java.util.Map;
import java.util.Arrays;
import Template.StressTestTool;

public class SecondHighestInMap {
    public static int secondMostFrequentElement(int[] nums) {
        TreeMap<Integer, Integer> frequencyMap = new TreeMap<>();

        for (int i = 0; i < nums.length; i++){
            if (frequencyMap.containsKey(nums[i])){
                frequencyMap.put(nums[i], frequencyMap.get(nums[i])+1);
            }
            else {
                frequencyMap.put(nums[i], 1);
            }
        }

        int maxElement = -1;
        int secondMax = -1;
        int maxValue = -1;
        int secondMaxValue = -1;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
            int currentKey = entry.getKey();
            int currentValue = entry.getValue();

            if (currentValue > maxValue){
                secondMaxValue = maxValue;
                maxValue = currentValue;

                if (currentKey > maxElement){
                    secondMax = maxElement;
                    maxElement = currentKey;
                }
                if (currentKey > secondMax && currentKey != maxElement){
                    secondMax = currentKey;
                }
            }

            if (currentValue > secondMaxValue && currentValue != maxValue){
                if (currentKey > secondMax && currentKey != maxElement){
                    secondMax = currentKey;
                }
            }
        }
        return secondMax;
    }

    public static void main(String[] args){
        int[] arr = null;
        arr = StressTestTool.generateDuplicates(100, 50, 0.4, 1);
        arr = new int[] {1,1,1,2,3,3};
        arr = new int[] {4, 4, 5, 5, 6, 7};
        int ans = secondMostFrequentElement(arr);
        Arrays.sort(arr);
        Arrays.stream(arr).forEach(x -> System.out.print(x+ " "));
        System.out.println();
        System.out.println(ans);

    }
}
