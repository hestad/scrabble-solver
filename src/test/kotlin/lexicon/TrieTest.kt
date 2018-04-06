package lexicon


import assertk.assert
import assertk.assertions.isTrue
import org.junit.Test

class TrieTest {

    @Test
    fun foo() {
        val trie = Trie()
        trie.add("cat", "cable", "cabbage", "cattle")
        assert(trie.contains("cat")).isTrue();
        assert(trie.contains("cable")).isTrue();
        assert(trie.contains("cabbage")).isTrue();
        assert(trie.contains("cattle")).isTrue();
    }
}