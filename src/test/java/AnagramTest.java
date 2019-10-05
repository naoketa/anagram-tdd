import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.junit.Assert.assertThat;

import java.util.Set;
import org.junit.Test;

public class AnagramTest {
  @Test
  public void extract_anagram_from_a_char(){
    Set<String> actual = Anagram.makeAnagrams("a");
    assertThat(actual, hasItems("a"));
  }

  @Test
  public void extract_anagram_from_two_chars(){
    Set<String> actual = Anagram.makeAnagrams("ab");
    assertThat(actual, hasItems("ab", "ba"));
  }

  @Test
  public void extract_anagram_from_three_chars(){
    Set<String> actual = Anagram.makeAnagrams("abc");
    assertThat(actual, hasItems("abc", "acb", "bac", "bca", "cab", "cba"));
  }

  @Test
  public void extract_anagram_from_same_chars(){
    Set<String> actual = Anagram.makeAnagrams("aab");
    assertThat(actual, hasItems("aab", "baa", "aba"));
  }

  @Test
  public void remove_duplicated_word(){
    int actual = Anagram.makeAnagrams("aab").size();
    assertThat(actual, is(3));
  }
}
