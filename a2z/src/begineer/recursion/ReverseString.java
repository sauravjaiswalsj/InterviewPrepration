package begineer.recursion;

import Template.StressTestTool;
import java.util.Vector;

public class ReverseString {
    public static void main(String[] args){

        for (int i = 0; i < 10; i++){
            check(i *1000 +12);
        }
    }

    public static void check(int j){
        Vector<Character> s = StressTestTool.generateCharacterLists(j, Vector.class);

        String exp = "";
        for (int i = s.size() -1; i>= 0; i--){
            exp += s.get(i);
        }

        Vector <Character> c = reverseString(s);
        String out = "";
        for (Character t : c){
            out += t;
        }

        if (exp.equals(out))
            System.out.println(StressTestTool.TextColor.GREEN.colorize("Pass"));

        if (exp.equals(out) == false){
            System.out.println(StressTestTool.TextColor.RED.colorize("Failed"));

            System.out.println(exp);
            System.out.println(out);
        }

    }
    public static Vector<Character> reverseString(Vector<Character> s) {
        //your code goes here

        reverse(s, 0, s.size()-1);

        return s;
    }

    private static void reverse(Vector<Character> arr, int low, int high){
        if (low >= high)
            return;

        Character temp = arr.get(low);
        arr.set(low, arr.get(high));
        arr.set(high, temp);

        reverse(arr, low+1, high-1);
    }
}
