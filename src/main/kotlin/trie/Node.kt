package trie

import kotlin.collections.HashMap

class Node(var children: MutableMap<Char, Node> = mutableMapOf(), var value: String? = null) {

    fun insert(value: String) {
        var node = this
        var i = 0
        while (i < value.length) {
            if (value[i] in node.children) {
                node = node.children[value[i]]!!
                i++
            } else {
                break;
            }
        }
        while (i < value.length) {
            node.children[value[i]] = Node()
            node = node.children[value[i]]!!
            i += 1
        }
        node.value = value
    }

    fun contains(value: String) : Boolean {
        return find(value) == value
    }

    fun find(value: String): String? {
        var node = this
        value.forEach {
            if (it in node.children) {
                node = node.children[it]!!
            } else {
                return null
            }
        }
        return node.value
    }
}