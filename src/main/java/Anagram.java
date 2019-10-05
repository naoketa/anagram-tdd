import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Anagram {

  public static Set<String> makeAnagrams(String word) {
    if(word.length() <= 1){
      return new HashSet<>(Arrays.asList(word));
    }
    Set<String> anagrams = new HashSet<>();
    char[] chars = word.toCharArray();
    for(int i = 0; i< chars.length; i++){
      for(String str: makeAnagrams(word.substring(0,i) + word.substring(i+1))){
        anagrams.add(chars[i] + str);
      }
    }
    return anagrams;
  }

}
