package permutation;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Admin on 26.11.14.
 */
public class PermutationString {

    public static String charInsert(String str, char ch, int j)
    {
        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + ch + end;
    }
    public static Set<String> permutation(String str)
    {
        System.out.println("PermStr: " + str);

        Set<String> perm = new HashSet<String>();
        if (str == null)
        {
            System.out.println("str == null");
            return null;
        } else if (str.length() == 0)
        {
            System.out.println("str.length == 0");
            perm.add("");
            return perm;
        }
        char initial = str.charAt(0);
        String rem = str.substring(1);
        Set<String> words = permutation(rem);
        System.out.println("word : " + words);
        for (String word : words){
            for (int i = 0; i <= word.length(); i++){
                perm.add(charInsert(word, initial, i));
            }
        }
        return perm;
    }
    public static void main (String[] args)
    {
        System.out.println(permutation("ABC"));
    }
}
