import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.arrayContainingInAnyOrder;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.junit.Assert.assertThat;

import java.util.List;
import org.junit.Test;

public class AnagramTest {
  @Test
  public void extract_anagram_from_a_char(){
    List<String> actual = Anagram.getAnagram("a");
    assertThat(actual, hasItems("a"));
  }

}
