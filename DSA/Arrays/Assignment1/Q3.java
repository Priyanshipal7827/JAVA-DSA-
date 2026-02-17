package DSA.Arrays.Assignment1;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        String[]  words = {
            "hello","priyanshi","what","about","you"
        };
        System.out.println(Arrays.toString(words));
        for(int  i=0;i<words.length;i++){
            String word = words[i];
            System.out.println(word+ " : "+word.length());
        }
    }
}
