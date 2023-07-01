package junit_examples;

import junit.Vokabeln;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VokablenTest {
    @Test
    void testCokablenI(){
        Vokabeln vokabeln = new Vokabeln();
        String wort = "Hallo";
        String permutiertesWort = Vokabeln.permute (wort); // cba
        assertThat(permutiertesWort).isNotEqualTo(wort);
        assertThat(permutiertesWort.toCharArray()).containsExactlyInAnyOrder(wort.toCharArray());
    }
}
