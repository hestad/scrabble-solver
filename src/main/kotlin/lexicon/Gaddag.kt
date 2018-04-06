package lexicon

import java.util.*

class Gaddag(var reverse: Node = Node('<')) : Trie() {

    init {
        nodeCount = 2
    }

    override fun add(vararg words: String) {
        words.forEach { add(it) }
    }

    override fun add(word: String) {
        super.add(word)
        word.drop(1).forEachIndexed { index, c ->
            addPref(word.substring(0, index).reversed() + "<" + word.substring(index))
        }
    }

    private fun addPref(word: String) {
        var tmp: Node = this.reverse;

        word.forEach { c ->
            val (node, isAdded) = tmp.addOrGetChild(c)
            tmp = node;
            if (isAdded) {
                nodeCount++;
            }
        }
        tmp.finite = true
    }


    /**
     * boardVector: row or column in a scrabble like board. can contain empty, blank, letter
     */
    fun findWords(boardVector: String, letters: Set<Char>): List<String> {
        val q: Queue<Node> = ArrayDeque()
        q.add(root)
        while (q.isNotEmpty()) {
            val node = q.poll()
            val boardSquare = boardVector.first()
            if (boardSquare == '?') {
                letters.forEach {
                    letters.forEach(

                    )
                }
            } else {
                letters.forEach {
                    val node = root
                    letters.forEach(

                    )
                }

            }
        }
    }
}
