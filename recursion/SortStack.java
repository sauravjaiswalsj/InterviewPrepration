import java.util.Collection;
import java.util.Collections;
import java.util.Stack;
public class SortStack {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(0);
        stack.push(2);
        System.out.println("Before Sort");
        stack.forEach(x -> System.out.print(x + " "));
        System.out.println();

        sort(stack);

        System.out.println("After Sort");
        stack.forEach(x -> System.out.print(x + " "));
        System.out.println();
        while (!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
    private static void sort(Stack<Integer> stack){
        //base
        if (stack.empty())
            return;
        // hypothesis
        int temp = stack.peek();
        stack.pop();
        sort(stack);
        // induction step
        insert(stack, temp);
    }

    private static void insert(Stack<Integer> stack, int val) {
        //base
        if (stack.isEmpty() || val >= stack.peek()){
            stack.push(val);
            return;
        }
        // hypothesis
        int temp = stack.peek();
        stack.pop();
        insert(stack, val);
        // induction step
        stack.push(temp);
    }
}
