/**
 * common abstract class for all BSTs
 */
abstract class AbstractBinarySearchTree<K : Comparable<K>, V> {
    var root: BinaryTreeNode<K, V>? = null
    var totalNodes: Int = 0
    abstract fun search(key: K): V?
    abstract fun insert(key: K, value: V)
    abstract fun remove(key: K): Boolean
    fun traverse(treeTraverse: BinaryTreeTraverse<K, V>): List<Any> {
        return treeTraverse.traverse(root)
    }
    fun isEmpty(): Boolean {
        return totalNodes == 0 // TODO: implement maybe
    }
    fun getSize(): Int {
        return totalNodes // TODO: implement maybe
    }
}

/**
 * Standard BST class implemented here
 */
open class UnbalancedBinarySearchTree<K : Comparable<K>, V> : AbstractBinarySearchTree<K, V>() {
    override fun search(key: K): V? {
        return root?.value // TODO: implement
    }
    override fun insert(key: K, value: V) {
         // TODO: implement
    }
    override fun remove(key: K): Boolean {
        return false // TODO: implement
    }
}

class AVLSearchTree<K : Comparable<K>, V> : UnbalancedBinarySearchTree<K, V>() {
    override fun insert(key: K, value: V) {
        super.insert(key, value)
        // TODO: implement pos-insertion logic
    }

    override fun remove(key: K): Boolean {
        return false // TODO: implement
    }
}

class RedBlackSearchTree<K : Comparable<K>, V> : UnbalancedBinarySearchTree<K, V>() {
    override fun insert(key: K, value: V) {
        super.insert(key, value)
        // TODO: implement pos-insertion logic
    }

    override fun remove(key: K): Boolean {
        return false // TODO: implement
    }
}
