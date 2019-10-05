import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

  public static List<String> makeAnagrams(String word) {
    if(word.length() <= 1){
      return Arrays.asList(word);
    }
    List<String> anagrams = new ArrayList<>();
    char[] chars = word.toCharArray();
    for(int i = 0; i< chars.length; i++){
      for(String str: makeAnagrams(word.substring(0,i) + word.substring(i+1))){
        anagrams.add(chars[i] + str);
      }
    }
    return anagrams;
  }

}
