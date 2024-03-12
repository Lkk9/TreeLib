abstract class AbstractBSTNode<K : Comparable<K>, V, R : AbstractBSTNode<K, V, R>>(
    val key: K,
    val value: V
) {
    var right: R? = null
    var left: R? = null
}

abstract class AbstractBSTNodeWithParent<K : Comparable<K>, V, R : AbstractBSTNodeWithParent<K, V, R>>(
    key: K, value: V, val parent: R?
) : AbstractBSTNode<K, V, R>(key, value)

/**
 * simplest BST node
 */
class BSTNode<K : Comparable<K>, V>(key: K, value: V) : AbstractBSTNode<K, V, BSTNode<K, V>>(key, value)

/**
 * BST node with parent
 */
class BSTNodeWithParent<K : Comparable<K>, V>(key: K, value: V, parent: BSTNodeWithParent<K, V>?) : AbstractBSTNodeWithParent<K, V, BSTNodeWithParent<K, V>>(key, value, parent)

/**
 * AVL node with parent, height
 */
class AVLTreeNode<K : Comparable<K>, V> (
    key: K,
    value: V,
    parent: AVLTreeNode<K, V>?,
    var height: Int
) : AbstractBSTNodeWithParent<K, V, AVLTreeNode<K, V>>(key, value, parent)

/**
 * RBTree node with parent, color
 */
class RedBlackTreeNode<K : Comparable<K>, V>(
    key: K,
    value: V,
    parent: RedBlackTreeNode<K, V>?,
) : AbstractBSTNodeWithParent<K, V, RedBlackTreeNode<K, V>>(key, value, parent) {
    private var color = 0
    fun setRed() {
        color = 0
    }

    fun setBlack() {
        color = 1
    }

    fun getColor(): Int {
        return color
    }
}
