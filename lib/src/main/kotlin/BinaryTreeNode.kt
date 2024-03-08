/**
 * simplest BST node
 */
open class BinaryTreeNode<K : Comparable<K>, V> (
    val key: K,
    val value: V
) {
    var right: BinaryTreeNode<K, V>? = null
    var left: BinaryTreeNode<K, V>? = null
}

/**
 * BST node with parent
 */
open class BinaryTreeNodeWithParent<K : Comparable<K>, V>(
    key: K,
    value: V,
    var parent: BinaryTreeNode<K, V>?
) : BinaryTreeNode<K, V>(key, value)

/**
 * AVL node with parent, height
 */
class AVLTreeNode<K : Comparable<K>, V> (
    key: K,
    value: V,
    parent: BinaryTreeNode<K, V>?,
    var height: Int
) : BinaryTreeNodeWithParent<K, V>(key, value, parent)

/**
 * RBTree node with parent, color
 */
class RedBlackTreeNode<K : Comparable<K>, V>(
    key: K,
    value: V,
    parent: BinaryTreeNode<K, V>?,
    var color: NodeColor
) : BinaryTreeNodeWithParent<K, V>(key, value, parent) {
    enum class NodeColor{ RED, BLACK }
}
