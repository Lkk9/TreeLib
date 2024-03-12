interface BinaryTreeBalancer<K : Comparable<K>, V, R : AbstractBSTNodeWithParent<K, V, R>> {
    fun inserter(node: R)
    fun remover(node: R)
}

abstract class AbstractBinaryTreeBalancer<K : Comparable<K>, V, R : AbstractBSTNodeWithParent<K, V, R>> : BinaryTreeBalancer<K, V, R> {
    fun rotateLeft(node: R) {
        TODO("implement")
    }

    fun rotateRight(node: R) {
        TODO("implement")
    }
}

class AVLTreeBalancer<K : Comparable<K>, V> : AbstractBinaryTreeBalancer<K, V, AVLTreeNode<K, V>>() {
    override fun inserter(node: AVLTreeNode<K, V>) {
        super.rotateRight(node) // e.g.
        super.rotateLeft(node) // e.g.
        TODO("Not yet implemented")
    }

    override fun remover(node: AVLTreeNode<K, V>) {
        TODO("Not yet implemented")
    }

}

class RedBlackTreeBalancer<K : Comparable<K>, V> : AbstractBinaryTreeBalancer<K, V, RedBlackTreeNode<K, V>>() {
    override fun inserter(node: RedBlackTreeNode<K, V>) {
        TODO("Not yet implemented")
    }

    override fun remover(node: RedBlackTreeNode<K, V>) {
        TODO("Not yet implemented")
    }

}
