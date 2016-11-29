package questions_1;

/**
 * Created by jielu_000 on 2016/11/22.
 * There are three types of edits that can be performed on strings: insert a character,
 remove a character, or replace a character. Given two strings, write a function to check if they are
 one edit (or zero edits) away.
 EXAMPLE
 pale, ple -> true
 pales, pale -> true
 pale, bale -> true
 pale, bae -> false
 */
public class q_1_5 {
    boolean isEdited(String first, String second){
        if(first.length() == second.length()){
            return isReplaced(first,second);
        }else if(first.length() - 1 == second.length()){
            return isInsert(second,first);
        }else if(first.length() +1 == second.length()){
            return isInsert(first,second);
        }
        return false;
    }

    // insert a character into s1 to make s2.
    boolean isInsert(String s1, String s2){
        int index1 =0;
        int index2 = 0;
        while(index1 <s1.length() && index2 < s2.length()){
            if(s1.charAt(index1) != s2.charAt(index2)){
                if(index1 != index2){
                    return false;
                }
                index2++;
            }else{
                index1++;
                index2++;
            }
        }
        return true;
    }

    boolean isReplaced(String s1, String s2){
        boolean foundDifference = false;
        for (int i =0;i<s1.length();i++){
            if (s1.charAt(i) != s2.charAt(i)){
                if(foundDifference){
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }
}
