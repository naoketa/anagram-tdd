import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class AnagramTest {
  @Test
  public void extract_anagram_from_a_char(){
    String[] actual = Anagram.getAnagram("a");
    assertThat(actual, is(arrayContainingInAnyOrder("a")));
  }

}
