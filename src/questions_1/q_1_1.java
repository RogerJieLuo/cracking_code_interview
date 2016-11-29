package questions_1;

/**
 * Implement an algorithm to determine if a string has all unique characters  What if
 you can not use additional data structures?
 */
public class q_1_1 {
    public static void main(String []args){
        //System.out.print(isUniqueChars2("scratch"));
        isUniqueChars(("testing"));
    }

    // bit vector
    public static boolean isUniqueChars(String str){
        int checker =0;
        for (int i=0;i<str.length();++i){
            int val = str.charAt(i) -'a';System.out.println(Integer.toBinaryString(val));
            if ((checker & (1 << val))>0) return false;
            checker |= (1 << val);System.out.println(Integer.toBinaryString((1 << val)));
            System.out.println(Integer.toBinaryString(checker));
        }
        return true;
    }
    public static boolean isUniqueChars2(String str){
        boolean[] char_set = new boolean[256];
        for (int i = 0;i<str.length();i++){
            int val = str.charAt(i);
            if(char_set[val]) return false;
            char_set[val] = true;
        }
        return  true;
    }
}
