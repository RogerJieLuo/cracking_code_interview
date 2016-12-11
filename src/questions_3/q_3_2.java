package questions_3;

import java.util.Stack;

/**
 * Created by jielu_000 on 2016/12/3.
 * Stack Min: How would you design a stack which, in addition to push and pop, has a function min
 which returns the minimum element? Push, pop and min should all operate in 0(1) time.
 */
public class q_3_2 extends Stack<Integer> {
    Stack<Integer> s2 ;
    public q_3_2(){
        s2 = new Stack<Integer>();
    }

    public void push(int value){
        if(value<=min()){
            s2.push(value);
        }
        super.push(value);
    }

    public Integer pop(){
        int value = super.pop();
        if(value == min()){
            s2.pop();
        }
        return value;
    }

    public int min(){
        if(s2.isEmpty()){
            return Integer.MAX_VALUE;
        }else{
            return s2.peek();
        }
    }
}