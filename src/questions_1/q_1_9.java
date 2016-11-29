package questions_1;

/**
 * Created by jielu_000 on 2016/11/24.
 * String Rotation: Assumeyou have a method isSub String which checks if one word is a substring
 of another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one
 call to isSubstring (e.g.,"waterbottle" is a rotation of"erbottlewat").
 */
public class q_1_9 {

    boolean isRotation(String s1, String s2){
        int len = s1.length();
        // check that s1 and s2 are equal length and not empty
        if (len == s2.length() && len >0){
            // Concatenate s1 and s1 within new buffer
            String s1s1 = s1+s1;
            return s1s1.contains(s2);
        }
        return false;
    }
}
