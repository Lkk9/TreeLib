/**
 * common abstract class for all BSTs
 */
abstract class AbstractBinarySearchTree<K : Comparable<K>, V, R : BinaryTreeNode<K, V>> {
    var root: R? = null
    abstract fun search(key: K): V?
    abstract fun insert(key: K, value: V): Boolean
    abstract fun remove(key: K): Boolean
    fun traverse(treeTraverse: BinaryTreeTraverse<K, V>): List<Any> {
        return if (root == null) listOf() else treeTraverse.traverse(root!!)
    }
    fun isEmpty(): Boolean {
        return root == null
    }
    fun getSize(): Int {
        return 0 // TODO: implement
    }
    fun getMin(): Int {
        return 0 // TODO: implement
    }
    fun getMax(): Int {
        return 0 // TODO: implement
    }
}

/**
 * Standard BST class implemented here
 */
class UnbalancedBinarySearchTree<K : Comparable<K>, V> : AbstractBinarySearchTree<K, V, BinaryTreeNode<K, V>>() {
    override fun search(key: K): V? {
        return root?.value // TODO: implement
    }
    override fun insert(key: K, value: V): Boolean {
         return false // TODO: implement
    }
    override fun remove(key: K): Boolean {
        return false // TODO: implement
    }
}

class AVLSearchTree<K : Comparable<K>, V> : AbstractBinarySearchTree<K, V, AVLTreeNode<K, V>>() {
    override fun search(key: K): V? {
        return root?.value // TODO: implement
    }
    override fun insert(key: K, value: V): Boolean {
        return false // TODO: implement
    }
    override fun remove(key: K): Boolean {
        return false // TODO: implement
    }
}

class RedBlackSearchTree<K : Comparable<K>, V> : AbstractBinarySearchTree<K, V, RedBlackTreeNode<K, V>>() {
    override fun search(key: K): V? {
        return root?.value // TODO: implement
    }
    override fun insert(key: K, value: V): Boolean {
        return false // TODO: implement
    }
    override fun remove(key: K): Boolean {
        return false // TODO: implement
    }
}
