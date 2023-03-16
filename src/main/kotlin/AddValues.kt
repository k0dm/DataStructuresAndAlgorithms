interface AddValues<T> {

    fun append(value: T)

    fun push(value: T)

    fun insert(value: T, afterNode: Node<T>): Node<T>
}