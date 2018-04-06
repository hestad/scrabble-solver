package lexicon

class Node(var value: Char? = null, var children: MutableMap<Char, Node> = mutableMapOf()) {
    var finite: Boolean = false

    fun hasChild(c: Char): Boolean {
        return children.containsKey(c)
    }

    fun getChild(c: Char): Node {
        return children.get(c)!!
    }

    fun addChild(c: Char) {
        children.put(c, Node(c))

    }

    fun addOrGetChild(c: Char): Pair<Node, Boolean> {
        var isAdded: Boolean = false;
        if (!children.containsKey(c)) {
            children.put(c, Node(c))
            isAdded = true
        }
        return Pair(children.get(c)!!, isAdded)
    }

}