import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.junit.Assert.assertThat;

import java.util.List;
import org.junit.Test;

public class AnagramTest {
  @Test
  public void extract_anagram_from_a_char(){
    List<String> actual = Anagram.makeAnagrams("a");
    assertThat(actual, hasItems("a"));
  }

  @Test
  public void extract_anagram_from_two_chars(){
    List<String> actual = Anagram.makeAnagrams("ab");
    assertThat(actual, hasItems("ab", "ba"));
  }

  @Test
  public void extract_anagram_from_three_chars(){
    List<String> actual = Anagram.makeAnagrams("abc");
    assertThat(actual, hasItems("abc", "acb", "bac", "bca", "cab", "cba"));
  }

  @Test
  public void extract_anagram_from_same_chars(){
    List<String> actual = Anagram.makeAnagrams("aab");
    assertThat(actual, hasItems("aab", "baa", "aba"));
  }

}
