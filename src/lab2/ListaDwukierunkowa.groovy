package lab2

class DoubleLinkedList {
    static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList()
        doubleLinkedList.insertEnd(4)
        doubleLinkedList.insertFirst(2)
        doubleLinkedList.insertFirst(3)
        doubleLinkedList.insertEnd(6)

        doubleLinkedList.displayForward()
        doubleLinkedList.displayBackward()
        println("List contain"+doubleLinkedList.length() + " elements")
        doubleLinkedList.deleteFirst()
        doubleLinkedList.displayForward()
        doubleLinkedList.displayBackward()
        println("List contain "+doubleLinkedList.length() + " elements")
        doubleLinkedList.deleteLast()
        doubleLinkedList.displayForward()
        doubleLinkedList.displayBackward()
        println("List contain "+doubleLinkedList.length() + " elements")
    }
    private ListNode head
    private ListNode tail
    private int length

    private class ListNode {
        private int data
        private ListNode next
        private ListNode previous

        ListNode(int data) {
            this.data = data
        }

    }

    DoubleLinkedList() {
        this.head = null
        this.tail = null
        this.length = 0
    }

    boolean isEmpty() {
        return length == 0
    }

    int length() {
        return length
    }

    void displayForward() {
        if(head == null) {
            return
        }

        ListNode temp = head
        while(temp != null) {
            print(temp.data + " --> ")
            temp = temp.next
        }
        println("END")
    }

    void displayBackward() {
        if(head == null) {
            return
        }

        ListNode temp = tail
        while(temp != null) {
            print(temp.data + " --> ")
            temp = temp.previous
        }
        println("BEGIN")
    }

    void insertFirst(int value) {
        ListNode newNode = new ListNode(value)
        if(isEmpty()) {
            tail = newNode
        } else {
            head.previous = newNode
        }
        newNode.next = head
        head = newNode
        length++
    }

    void insertEnd(int value) {
        ListNode newNode = new ListNode(value)
        if(isEmpty()) {
            head = newNode
        } else {
            tail.next = newNode
            newNode.previous = tail
        }
        tail = newNode
        length++
    }

    ListNode deleteFirst() {
        if(isEmpty()) {
            throw new NoSuchElementException()
        }

        ListNode temp = head
        if(head == tail) {
            tail = null
        } else {
            head.next.previous = null
        }
        head = head.next
        temp.next = null
        length--
        return temp
    }

    ListNode deleteLast() {
        if(isEmpty()) {
            throw new NoSuchElementException()
        }

        ListNode temp = tail
        if(head == tail) {
            head = null
        } else {
            tail.previous.next = null
        }
        tail = tail.previous
        temp.previous = null
        length--
        return temp
    }


}