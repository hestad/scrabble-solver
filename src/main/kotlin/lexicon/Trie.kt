package lexicon

open class Trie(var root: Node = Node('~'), var end: Node = Node('_')) {
    //var finite: Boolean = false

    var nodeCount: Int = 1
    var wordCount: Int = 0
    var maxDepth: Int = 0

    open fun add(vararg words: String) {
        words.forEach { add(it) }
    }

    open fun add(word: String) {
        var currentNode: Node = root

        word.forEach { character ->
            val (node, isAdded) = currentNode.addOrGetChild(character)
            currentNode = node;
            if (isAdded) {
                nodeCount++;
            }
        }

        currentNode.finite = true;

        if (word.length > maxDepth) this.maxDepth = word.length
        this.wordCount++;
    }

    fun contains(value: String): Boolean {
        var node = root
        value.forEach {
            if (it in node.children) {
                node = node.children[it]!!
            } else {
                return false
            }
        }
        return node.finite
    }
}