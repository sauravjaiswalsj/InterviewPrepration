import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
// KH4TK1RF1Z1BPLM8JCSVWLVP
public class stream {

        public long[] printFirstNegativeInteger(long A[], int N, int K)
        {
            Deque<Long> deque = new ArrayDeque<>();

            int i = 0, j = 0;
            ArrayList<Long> list = new ArrayList<>();
            while (j < N){
                if (A[j] < 0)
                    deque.add(A[j]);

                int window = j - i +1;

                if (window < K)
                    j++;
                else if (window == K){
                    if (!deque.isEmpty()){
                        long val = deque.removeFirst();
                        list.add(val);
                    }
                    else list.add((long)0);
                    i++;
                    j++;
                }
            }
            return list.stream().mapToLong(Long::longValue).toArray();
        }
    }

