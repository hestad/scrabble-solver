package lexicon


import assertk.assert
import assertk.assertions.isNotEmpty
import assertk.assertions.isTrue
import org.junit.Test

class GaddagTest {
    val gaddag = Gaddag()

    init {
        gaddag.add("cat", "cable", "cabbage", "cattle")
    }

    @Test
    fun normal_trie_functionality() {
        assert(gaddag.contains("cat")).isTrue();
        assert(gaddag.contains("cable")).isTrue();
        assert(gaddag.contains("cabbage")).isTrue();
        assert(gaddag.contains("cattle")).isTrue();
    }

    @Test
    fun cake() {
        val letters : Set<Char> = setOf('a','b','c','d')
        val word : String = "c?t"
        assert(gaddag.findWords(word,letters)).isNotEmpty();
    }
}