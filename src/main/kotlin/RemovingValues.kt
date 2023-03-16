interface RemovingValues<T> {

    fun pop() : T?

    fun removeLast(): T?
    fun removeAfter(node: Node<T>): T?
}