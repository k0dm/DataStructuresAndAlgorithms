interface NodeList<T> : AddValues<T>, RemovingValues<T> {

    fun isEmpty(): Boolean

    fun nodeAt(index: Int): Node<T>?
}