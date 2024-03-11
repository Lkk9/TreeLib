/**
 * simplest BST node
 */
open class BSTNode<K : Comparable<K>, V> (
    val key: K,
    val value: V
) {
    var right: BSTNode<K, V>? = null
    var left: BSTNode<K, V>? = null
}

/**
 * BST node with parent
 */
open class BSTNodeWithParent<K : Comparable<K>, V>(
    key: K,
    value: V,
    var parent: BSTNodeWithParent<K, V>?
) : BSTNode<K, V>(key, value)

/**
 * AVL node with parent, height
 */
class AVLTreeNode<K : Comparable<K>, V> (
    key: K,
    value: V,
    parent: AVLTreeNode<K, V>?,
    var height: Int
) : BSTNodeWithParent<K, V>(key, value, parent)

/**
 * RBTree node with parent, color
 */
class RedBlackTreeNode<K : Comparable<K>, V>(
    key: K,
    value: V,
    parent: RedBlackTreeNode<K, V>?,
) : BSTNodeWithParent<K, V>(key, value, parent) {
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
