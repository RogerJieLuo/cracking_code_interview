package questions_1;

/**
 * Created by jielu_000 on 2016/11/22.
 * String Compression: Implement a method to perform basic string compression using the counts
 of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
 "compressed" string would not become smaller than the original string, your method should return
 the original string.You can assume the string has only uppercase and lowercase letters (a - z)
 */
public class q_1_6 {

    String compress(String str){
        int count = countCompression(str);
        StringBuilder sb = new StringBuilder(count);
        int countConseutive = 0;
        for (int i=0;i<str.length();i++){
            countConseutive++;
            if (i+1>=str.length() || str.charAt(i) !=str.charAt(i+1)){
                sb.append(str.charAt(i));
                sb.append(countConseutive);
                countConseutive = 0;
            }
        }
        return sb.toString();
    }
    int countCompression(String str){
        int count = 0;
        int countConseutive = 0;
        for (int i = 0;i<str.length();i++){
            countConseutive ++;
            if(i+1>=str.length() || str.charAt(i) != str.charAt(i+1)){
                count += 1 + String.valueOf(countConseutive).length();
                countConseutive = 0;
            }
        }
        return count;
    }
    String compressBasd(String str){
        String compressedString = "";
        int countConsecutive = 0;
        for (int i=0;i<str.length();i++){
            countConsecutive++;

            if(str.charAt(i) != str.charAt(i+1) || i+1 >= str.length() ){
                compressedString += str.charAt(i)+countConsecutive;
                countConsecutive = 0;
            }
        }
        return  compressedString;
    }
}
