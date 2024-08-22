package begineer.maths;

public class gcd {
    public static void main(String[] args) {
        int a = 4, b = 12;
        System.out.println(lcm(a,b));
    }
    private static int gcd(int a, int b){
        if (b == 0)
            return a;
        return gcd(b, a%b);
    }
    private static int lcm(int a, int b){
        return a*b / gcd(a,b);
    }
}
