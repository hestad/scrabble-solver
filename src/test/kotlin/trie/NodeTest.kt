package trie


import assertk.assert
import assertk.assertions.isTrue
import org.junit.Test

class NodeTest {

    @Test
    fun foo() {
        var root = Node()
        root.insert("cat")
        root.insert("cable")
        root.insert("cabbage")
        root.insert("cattle")
        assert(root.contains("cat")).isTrue();
        assert(root.contains("cable")).isTrue();
        assert(root.contains("cabbage")).isTrue();
        assert(root.contains("cattle")).isTrue();
    }
}