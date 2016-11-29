package questions_1;

/**
 Write a method to replace all spaces in a string with '%20' You may assume that the string
 has suffiient space at the end to hold the additional characters, and that you are given the "true"
 length of the string. (Note: if implementing in Java, please use a character array so that you can
 perform this operation in place.)
 EXAMPLE
 Input: "Mr John Smith ", 13
 Output: "Mr%20John%20Smith"
 */
public class q_1_3 {
    public static void main(String []args){
        char[] str = {'T','h','i','s',' ','i','s',' ','R','o','g','e','r'};
        replaceSpaces(str,13);
        System.out.print(str);
    }

    static void replaceSpaces(char[] str, int trueLength){
        int spaceCount = 0, index,  i = 0;
        for (i=0;i<trueLength;i++){
            if (str[i] == ' '){
                spaceCount++;
            }
        }
        index = trueLength+spaceCount*2;
        if (trueLength<str.length) str[trueLength] = '\0'; // End array
        for (i = index -1;i>=0;i--){
            if (str[i] == ' '){
                str[i-0] = '0';
                str[i-1] = '2';
                str[i-2] = '%';
                i=i-2;
            }else{
                str[index-1] = str[i];
                index--;
            }
        }
    }
}
