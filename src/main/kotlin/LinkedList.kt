class LinkedList<T> : NodeList<T> {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size = 0
    override fun isEmpty(): Boolean {
        return size == 0
    }

    override fun nodeAt(index: Int): Node<T>? {
        // 1
        var currentNode = head
        var currentIndex = 0
        // 2
        while (currentNode != null && currentIndex < index) {
            currentNode = currentNode.next
            currentIndex++
        }
        return currentNode
    }

    override fun pop(): T? {

        return if (head == null) {
            null
        } else {
            size--
            val result = head
            head = head!!.next
            if (isEmpty()) {
                tail = null
            }
            result!!.value
        }

    }

    override fun removeLast(): T? {

        var current = this.head ?: return null

        if (this.head!!.next == null) return pop()

        var previous = current
        while (current.next != null) {
            previous = current
            current = current.next!!
        }
        previous.next = null
        tail = previous
        size--
        return current.value
    }

    override fun removeAfter(node: Node<T>): T? {
        val result = node.next?.value
        if (node.next != null) {
            if (node.next == tail) {
                tail = node
            }

            node.next = node.next?.next
            size--
        }
        return result
    }

    override fun toString(): String {
        return if (isEmpty()) {
            "Empty list"
        } else {
            head.toString()
        }
    }

    override fun push(value: T) {
        head = Node(value = value, next = head)
        if (tail == null) {
            tail = head
        }
        size++
    }

    override fun append(value: T) {
        // 1
        if (isEmpty()) {
            push(value)
            return
        }
        // 2
        tail?.next = Node(value = value)
        // 3
        tail = tail?.next
        size++
    }

    override fun insert(value: T, afterNode: Node<T>): Node<T> {
        // 1
        if (tail == afterNode) {
            append(value)
            return tail!!
        }
        // 2
        val newNode = Node(value = value, next = afterNode.next)
        // 3
        afterNode.next = newNode
        size++
        return newNode
    }
}