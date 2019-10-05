import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

  public static List<String> getAnagram(String word) {
    List<String> anagrams = new ArrayList<>();
    anagrams.add(word);
    if(word.length() > 1){
      anagrams.add(String.valueOf(word.charAt(1))+String.valueOf(word.charAt(0)));
    }
    return anagrams;
  }
}
