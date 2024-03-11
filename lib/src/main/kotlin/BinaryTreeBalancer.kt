interface BinaryTreeBalancer<K : Comparable<K>, V, R : BSTNodeWithParent<K, V>> {
    fun inserter(node: R)
    fun remover(node: R)
}

abstract class AbstractBinaryTreeBalancer<K : Comparable<K>, V, R : BSTNodeWithParent<K, V>> : BinaryTreeBalancer<K, V, R> {
    fun rotateLeft(node: R) {
        TODO("implement")
    }

    fun rotateRight(node: R) {
        TODO("implement")
    }
}

class AVLTreeBalancer<K : Comparable<K>, V, R : AVLTreeNode<K, V>> : AbstractBinaryTreeBalancer<K, V, R>() {
    override fun inserter(node: R) {
        super.rotateRight(node) // e.g.
        super.rotateLeft(node) // e.g.
        TODO("Not yet implemented")
    }

    override fun remover(node: R) {
        TODO("Not yet implemented")
    }

}

class RedBlackTreeBalancer<K : Comparable<K>, V, R : RedBlackTreeNode<K, V>> : AbstractBinaryTreeBalancer<K, V, R>() {
    override fun inserter(node: R) {
        TODO("Not yet implemented")
    }

    override fun remover(node: R) {
        TODO("Not yet implemented")
    }

}
