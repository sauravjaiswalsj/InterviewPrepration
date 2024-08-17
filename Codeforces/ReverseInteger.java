public class ReverseInteger {
    public static void main(String[] args){
        int x = 1534236469;

        x = 1546852272;
        System.out.println(reverse(x));

    }
    public static int reverse(int x) {
        int m = x;
        int val = 0;

        try{
            while (m != 0){
                int rem = m % 10;
                val = (val * 10) + rem;
                m /= 10;
            }

            if (val == Integer.MAX_VALUE || val == Integer.MIN_VALUE)
                return 0;
        }catch (Exception e){
            return 0;
        }
        return val;
    }
}
