/**
 * interface for any tree traversal
 */
interface BinaryTreeTraverse<K : Comparable<K>, V> {
    fun traverse(node: BinaryTreeNode<K, V>): List<Any>
}

/**
 * preorder
 */
class BinaryTreeTraversePreOrder<K : Comparable<K>, V>(
    val extractFunction: (BinaryTreeNode<K, V>) -> Any
) : BinaryTreeTraverse<K, V> {
    override fun traverse(node: BinaryTreeNode<K, V>): List<Any> {
        return listOf(extractFunction(node)) // TODO: implement traversal
    }
}

/**
 * inorder
 */
class BinaryTreeTraverseInOrder<K : Comparable<K>, V>(
    val extractFunction: (BinaryTreeNode<K, V>) -> Any
) : BinaryTreeTraverse<K, V> {
    override fun traverse(node: BinaryTreeNode<K, V>): List<Any> {
        return listOf(extractFunction(node)) // TODO: implement traversal
    }
}

/**
 * postorder
 */
class BinaryTreeTraversePostOrder<K : Comparable<K>, V>(
    val extractFunction: (BinaryTreeNode<K, V>) -> Any
) : BinaryTreeTraverse<K, V> {
    override fun traverse(node: BinaryTreeNode<K, V>): List<Any> {
        return listOf(extractFunction(node)) // TODO: implement traversal
    }
}

/**
 * width
 */
class BinaryTreeTraverseWidth<K : Comparable<K>, V>(
    val extractFunction: (BinaryTreeNode<K, V>) -> Any
) : BinaryTreeTraverse<K, V> {
    override fun traverse(node: BinaryTreeNode<K, V>): List<Any> {
        return listOf(extractFunction(node)) // TODO: implement traversal
    }
}
// TODO: add other ways to traverse tree
