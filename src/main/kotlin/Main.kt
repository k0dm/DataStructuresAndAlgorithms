fun main(args: Array<String>) {

    val linkedList2 = LinkedList<Int>().apply {
        push(1)
        push(2)
        push(3)
        push(4)
        push(5)
    }
    println(linkedList2)
    println(linkedList2.pop())
    linkedList2.pop()
    linkedList2.pop()
    println(linkedList2)


    val linkedList1 = LinkedList<Int>().apply {
        append(1)
        append(2)
        append(3)
        insert(4,nodeAt(1) as Node<Int>)
    }
    println( linkedList1.removeLast())
    println(linkedList1)

}