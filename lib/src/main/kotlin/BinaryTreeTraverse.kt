/**
 * interface for any tree traversal
 */
interface BinaryTreeTraversal<K : Comparable<K>, V, R : AbstractBSTNode<K, V, R>> {
    fun <T> traverse(node: R, extractionFunction: (R) -> T): List<T>
}

/**
 * in order
 */
class BinaryTreeTraversalInOrder<K : Comparable<K>, V, R : AbstractBSTNode<K, V, R>> : BinaryTreeTraversal<K, V, R> {
    override fun <T> traverse(node: R, extractionFunction: (R) -> T): List<T> {
        TODO("implement")
        return listOf(extractionFunction(node)) // e.g.
    }
}

/**
 * pre order
 */
class BinaryTreeTraversalPreOrder<K : Comparable<K>, V, R : AbstractBSTNode<K, V, R>> : BinaryTreeTraversal<K, V, R> {
    override fun <T> traverse(node: R, extractionFunction: (R) -> T): List<T> {
        TODO("implement")
    }
}

/**
 * post order
 */
class BinaryTreeTraversalPostOrder<K : Comparable<K>, V, R : AbstractBSTNode<K, V, R>> : BinaryTreeTraversal<K, V, R> {
    override fun <T> traverse(node: R, extractionFunction: (R) -> T): List<T> {
        TODO("implement")
    }
}

/**
 * level order
 */
class BinaryTreeTraversalLevelOrder<K : Comparable<K>, V, R : AbstractBSTNode<K, V, R>> : BinaryTreeTraversal<K, V, R> {
    override fun <T> traverse(node: R, extractionFunction: (R) -> T): List<T> {
        TODO("implement")
    }
}
