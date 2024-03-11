/**
 * class for all trees
 */
abstract class AbstractBST<K : Comparable<K>, V, R : BSTNode<K, V>> {
    abstract var root: R?
    abstract fun search(key: K): V?
    abstract fun insert(key: K, value: V): Boolean
    abstract fun remove(key: K): V?
}

/**
 *  Unbalanced Tree
 */
abstract class UnbalancedBST<K : Comparable<K>, V, R : BSTNode<K, V>> : AbstractBST<K, V, R>() {
    override var root: R? = null
    override fun search(key: K): V? {
        TODO("Not yet implemented")
    }

    override fun insert(key: K, value: V): Boolean {
        TODO("Not yet implemented")
    }

    override fun remove(key: K): V? {
        TODO("Not yet implemented")
    }

    fun <T> traverse(traverseMethod: BinaryTreeTraversal<K, V, R>, extractFunction: (R) -> T): List<T> {
        return if (root == null) listOf() else traverseMethod.traverse(root!!, extractFunction)
    }

    fun isEmpty(): Boolean {
        return root == null
    }

    fun getSize(): Int {
        return traverse(BinaryTreeTraversalInOrder()) { it.key }.size
    }
}

/**
 * Adds balancer to unbalanced tree
 */
abstract class BalancedBST<K : Comparable<K>, V, R : BSTNodeWithParent<K, V>> : UnbalancedBST<K, V, R>() {
    abstract var balancer: AbstractBinaryTreeBalancer<K, V, R>

    fun balance(balanceFunction: (R) -> Unit) {
        if (root == null) return
        balanceFunction(root!!)
    }
}

/**
 * Lib
 */
class BSTRegularTree<K : Comparable<K>, V> : UnbalancedBST<K, V, BSTNode<K, V>>() {
    override fun search(key: K): V? {
        super.search(key)
        TODO("Not yet implemented")
    }

    override fun insert(key: K, value: V): Boolean {
        super.insert(key, value)
        TODO("Not yet implemented")
    }

    override fun remove(key: K): V? {
        super.remove(key)
        TODO("Not yet implemented")
    }

}

class BSTAVLTree<K : Comparable<K>, V> : BalancedBST<K, V, AVLTreeNode<K, V>>() {
    override var balancer: AbstractBinaryTreeBalancer<K, V, AVLTreeNode<K, V>> = AVLTreeBalancer()

    override fun search(key: K): V? {
        return super.search(key)
    }
    override fun remove(key: K): V? {
        super.remove(key)
        super.balance(balancer::remover)
        return null
    }
    override fun insert(key: K, value: V): Boolean {
        super.insert(key, value)
        super.balance(balancer::inserter)
        return false
    }
}

class BSTRedBlackTree<K : Comparable<K>, V> : BalancedBST<K, V, RedBlackTreeNode<K, V>>() {
    override var balancer: AbstractBinaryTreeBalancer<K, V, RedBlackTreeNode<K, V>> = RedBlackTreeBalancer()

    override fun search(key: K): V? {
        return super.search(key)
    }
    override fun remove(key: K): V? {
        super.remove(key)
        super.balance(balancer::remover)
        return null
    }
    override fun insert(key: K, value: V): Boolean {
        super.insert(key, value)
        super.balance(balancer::inserter)
        return false
    }
}




