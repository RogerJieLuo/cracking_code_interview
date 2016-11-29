package questions_1;

/**
 * Given two strings, write a method to decide if one is a permutation of the
 other.
 */
public class q_1_2 {
    public static void main(String []args){
        System.out.print(permutationString("asdf","sdfa"));
    }

    static boolean permutationString(String s, String t){
        if(s.length() != t.length()) return false;

        int[] letters = new int[126];

        for (int i= 0;i<s.length();i++){
            char c = s.charAt(i);
            letters[c]++;
        }

        for (int i=0;i<t.length();i++){
            char c = t.charAt(i);
            letters[c]--;
            if (letters[c]<0) return false;
        }
        return true;
    }

    String sort(String s){
        char[] c = s.toCharArray();
        java.util.Arrays.sort(c);
        return new String(c);
    }
    boolean permutationString2(String s, String t){
        if (s.length() != t.length()) return false;
        return sort(s).equals(sort(t));
    }
}
