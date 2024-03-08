/**
 * interface for any tree traversal
 */
interface BinaryTreeTraverse<K : Comparable<K>, V> {
    fun traverse(node: BinaryTreeNode<K, V>?): List<Any> // TODO: maybe allow without null
}

/**
 * preorder
 */
class BinaryTreeTraversePreOrder<K : Comparable<K>, V>(
    private val extractFunction: (BinaryTreeNode<K, V>?) -> Any
) : BinaryTreeTraverse<K, V> {
    override fun traverse(node: BinaryTreeNode<K, V>?): List<Any> {
        return if (node == null) listOf() else listOf(extractFunction(node)) // TODO: implement traversal
    }
}

/**
 * inorder
 */
class BinaryTreeTraverseInOrder<K : Comparable<K>, V>(
    private val extractFunction: (BinaryTreeNode<K, V>?) -> Any
) : BinaryTreeTraverse<K, V> {
    override fun traverse(node: BinaryTreeNode<K, V>?): List<Any> {
        return if (node == null) listOf() else listOf(extractFunction(node)) // TODO: implement traversal
    }
}

/**
 * postorder
 */
class BinaryTreeTraversePostOrder<K : Comparable<K>, V>(
    private val extractFunction: (BinaryTreeNode<K, V>?) -> Any
) : BinaryTreeTraverse<K, V> {
    override fun traverse(node: BinaryTreeNode<K, V>?): List<Any> {
        return if (node == null) listOf() else listOf(extractFunction(node)) // TODO: implement traversal
    }
}

/**
 * bfs-like
 */
// TODO: change name
class BinaryTreeTraverseBFS<K : Comparable<K>, V>(
    private val extractFunction: (BinaryTreeNode<K, V>?) -> Any
) : BinaryTreeTraverse<K, V> {
    override fun traverse(node: BinaryTreeNode<K, V>?): List<Any> {
        return if (node == null) listOf() else listOf(extractFunction(node)) // TODO: implement traversal
    }
}

// TODO: add other ways to traverse tree
