package ro.fasttrackit.curs15.recursive;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class WordLenghtTest {
    @Test
    void testLenght() {
        WordLenght wordLenght = new WordLenght();
        assertThat(wordLenght.len("abc")).isEqualTo(3);
        assertThat(wordLenght.len(null)).isEqualTo(0);
        assertThat(wordLenght.len("")).isEqualTo(0);
        assertThat(wordLenght.len("123456789")).isEqualTo(9);
    }

    @Test
    void testRev() {
        WordLenght wordLenght = new WordLenght();
        assertThat(wordLenght.rev("abc")).isEqualTo("cba");
    }

}