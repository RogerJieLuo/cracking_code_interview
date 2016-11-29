package questions_1;

/**
 Given a string, write a function to check if it is a permutation of
 a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A
 permutation is a rearrangement of letters. The palindrome does not need to be limited to just
 dictionary words.
 EXAMPLE
 Input: Tact Coa
 Output: True (permutations: "taco cat'; "atc o eta¡¤; etc.)

 solution #1
 Implementing this algorithm is fairly straightforward. We use a hash table to count how many times each
 character appears. Then, we iterate through the hash table and ensure that no more than one character has
 an odd count.
 */
public class q_1_4 {
    public static void main(String []args) {
        System.out.print(isPermutationOfPalindrome2("hellolhe"));
    }

    // solution 1
    static boolean isPermutationOfPalindrome(String phrase){
        int countOdd = 0;
        int[] table = new int[Character.getNumericValue('z')-
                Character.getNumericValue('a')+1];

        for (char c: phrase.toCharArray()){
            int x = getCharNumber(c);
            if(x > -1){
                table[x]++;
                if(table[x] % 2 == 1){
                    countOdd++;
                }else{
                    countOdd--;
                }
            }
        }
        return countOdd <= 1; // the odd count must be 0 or 1, other wise it's no way to be palindrome.
    }
    // solution 2
    static boolean isPermutationOfPalindrome2(String phrase){
        int[] table = buildCharFrequencyTable(phrase);
        return checkMaxOneOdd(table);
    }

    /* Check that no more than one characters has an odd count. */
    static boolean checkMaxOneOdd(int[] table){
        boolean foundOdd = false;
        for (int count: table){
            if (count% 2 == 1){
                if (foundOdd){
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
    }

    /* Map each character to a number. a -> 0, b -> 1, c -> 2, etc.
     * This is case insensitive. Non-letter characters map to -1.
     */
    static int getCharNumber(Character c){ // Que: why is it Character, not char
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if(a <= val && val <= z){
            return  val - a;
        }
        return -1;
    }
    /* Count how many times each character appears. */
    static int[] buildCharFrequencyTable(String phrase){
        int[] table = new int[Character.getNumericValue('z') -
                Character.getNumericValue('a') + 1];
        for (char c : phrase.toCharArray()){
            int x = getCharNumber(c);
            if (x != -1){
                table[x] ++;
            }
        }
        return table;
    }

    // solution 3  // not understand yet.
    boolean isPermutationOfPalindrome3(String phrase){
        int bitVector = createBitVector(phrase);
        return bitVector==0 || checkExactlyOneBitSet(bitVector);
    }
    /* Create a bit vector for the string. For each letter with value i, toggle
     the ith bit
     */
    int createBitVector(String phrase){
        int bitVector = 0;
        for (char c: phrase.toCharArray()){
            int x = getCharNumber(c);
            bitVector = toggle(bitVector, x);
        }
        return bitVector;
    }
    /* Toggle the ith bit in the integer.*/
    int toggle(int bitVector, int index){
        if (index< 0 ) return  bitVector;

        int mask = 1 << index;
        if ((bitVector & mask) == 0){
            bitVector |= mask;
        }else{
            bitVector &= ~mask;
        }
        return bitVector;
    }
    /*
    Check that exactly one bit is set by substracting one from the integer and
    ANDing it with the original integer
     */
    boolean checkExactlyOneBitSet(int bitVector){
        return (bitVector & (bitVector - 1)) == 0;
    }
}
