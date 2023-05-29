package be.rosoco.encoding;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EncodingTest {


    @Test
    void testEncodingEmptyString() {
        assertThat(Encoding.encode("")).isEqualTo("");
    }

    @Test
    void testEncodingNull() {
        assertThat(Encoding.encode(null)).isEqualTo(null);
    }

    @Test
    void testEncodingA() {
        assertThat(Encoding.encode("a")).isEqualTo("a");
    }

    @Test
    void testEncodingABC() {
        assertThat(Encoding.encode("abc")).isEqualTo("abc");
    }

    @Test
    void testEncodingAAABC() {
        assertThat(Encoding.encode("aaabc")).isEqualTo("3abc");
    }

    @Test
    void testEncodingAAAABBBBCCE() {
        assertThat(Encoding.encode("aaaabbbbcce")).isEqualTo("4a4b2ce");
    }

    @Test
    void testEncodingAAAABBBBCCEWithUpperCase() {
        assertThat(Encoding.encode("aaAabbbBcce")).isEqualTo("2aAa3bB2ce");
    }
}
