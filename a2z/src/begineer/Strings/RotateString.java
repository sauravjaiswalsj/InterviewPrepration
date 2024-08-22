package begineer.Strings;

public class RotateString {
    public static void main(String[] args) {
        boolean val = rotateString("hello", "elloh");
        System.out.println("val = " + val);
    }
    public static boolean rotateString(String s, String goal) {
        //your code goes here
        if (s.length() != goal.length() || s.isEmpty() || goal.isEmpty()) {
            return false;
        }
        String doubled = s + s;

        return doubled.contains(goal);
    }
}
