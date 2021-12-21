package lab2

class CircularList{
    static void main(String[] args) {
        CircularList circularList= new CircularList()
        circularList.insertAtStart(3)
        circularList.insertAtStart(4)
        circularList.insertAtEnd(5)
        circularList.insertAtStart(1)
        circularList.displayClockwise()
        circularList.displayReverse()
        println("List contain "+ circularList.getLength()+" elements")
        circularList.deleteFromStart()
        circularList.displayClockwise()
        circularList.displayReverse()
        println("List contain "+ circularList.getLength()+" elements")
        circularList.deleteFromEnd()
        circularList.displayClockwise()
        circularList.displayReverse()
        println("List contain "+ circularList.getLength()+" elements")
        circularList.insertAtEnd(5)
        circularList.insertAtStart(1)
        circularList.insertAtPosition(6,2)
        circularList.displayClockwise()
        circularList.displayReverse()
        println("List contain "+ circularList.getLength()+" elements")
        circularList.deleteFromPosition(3)
        circularList.displayClockwise()
        circularList.displayReverse()
        println("List contain "+ circularList.getLength()+" elements")

    }
    private int length
    private Node start, end

    class Node {
        private int data
        private Node nextNode, previousNode

        Node(int data) {
            this.data = data
            this.nextNode = null
            this.previousNode = null
        }

        int getData() {
            return data
        }

        Node getNextNode() {
            return nextNode
        }

        void setNextNode(Node nextNode) {
            this.nextNode = nextNode
        }

        Node getPreviousNode() {
            return previousNode
        }

        void setPreviousNode(Node previousNode) {
            this.previousNode = previousNode
        }
    }

    int getLength() {
        return length
    }

    void insertAtStart (int data) {
        Node newNode = new Node(data)
        length++

        if (start == null) {
            start = newNode
            start.setNextNode(start)
            start.setPreviousNode(start)
            end = start
            return
        }
        else if (length == 1) {
            newNode.setNextNode(start)
            newNode.setPreviousNode(start)
            start.setNextNode(newNode)
            start.setPreviousNode(newNode)
            start = newNode
            return
        }

        newNode.setNextNode(start)
        newNode.setPreviousNode(end)
        start.setPreviousNode(newNode)
        start = newNode
        end.setNextNode(start)
    }

    void insertAtEnd (int data) {
        Node newNode = new Node(data)
        length++

        if (start == null) {
            start = newNode
            start.setNextNode(start)
            start.setPreviousNode(start)
            end = start
            return
        }
        else if (length == 1) {
            newNode.setNextNode(start)
            newNode.setPreviousNode(end)
            end.setNextNode(newNode)
            start.setPreviousNode(newNode)
            end = newNode
            return
        }

        newNode.setNextNode(start)
        newNode.setPreviousNode(end)
        start.setPreviousNode(newNode)
        end.setNextNode(newNode)
        end = newNode
    }

    void insertAtPosition (int data, int position) {
        if (position > length + 1) {
            System.out.println("Bad position")
            return
        }
        else if (position == 1) {
            insertAtStart(data)
            return
        }
        else if (position == length) {
            insertAtEnd(data)
            return
        }

        Node newNode = new Node(data)
        length++

        int count = 1
        Node currentNode = start
        while(count < position-1) {
            currentNode = currentNode.getNextNode()
            count++
        }

        newNode.setNextNode(currentNode.getNextNode())
        newNode.getNextNode().setPreviousNode(newNode)
        currentNode.setNextNode(newNode)
        newNode.setPreviousNode(currentNode)
    }

    void deleteFromStart () {
        if (start == null) {
            println("List is empty")
            return
        }
        else if (length == 1) {
            start = null
            end = null
            length--
            return
        }

        length--
        Node newStart = start.getNextNode()
        newStart.setPreviousNode(end)
        end.setNextNode(newStart)
        start = newStart
    }

    void deleteFromEnd() {
        if (start == null) {
            println("List is empty")
            return
        }
        else if (length == 1) {
            start = null
            end = null
            length--
            return
        }
        length--
        Node newEnd = end.getPreviousNode()
        newEnd.setNextNode(start)
        start.setPreviousNode(newEnd)
        end = newEnd
    }

    void deleteFromPosition(int position) {
        if (position > length) {
            println("Bad position")
            return
        }
        else if (position == 1) {
            deleteFromStart()
            return
        }
        else if (position == length) {
            deleteFromEnd()
            return
        }

        int count = 1
        Node currentNode = start

        while(count < position - 1) {
            currentNode = currentNode.getNextNode()
            count++
        }
        currentNode.setNextNode(currentNode.getNextNode().getNextNode())
        currentNode.getNextNode().setPreviousNode(currentNode)
        length--
    }

    void displayClockwise () {
        if (start == null) {
            println("List is empty")
            return
        }

        int count = 1
        Node currentNode = start
        print("Start ")
        while(count <= length) {
            if (count < length) {
                print(currentNode.getData() + " -> ")
            }
            else {
                println(currentNode.getData() + " -> Start")
            }
            currentNode = currentNode.getNextNode()
            count++
        }
    }

    void displayReverse () {
        if (start == null) {
            println("List is empty")
            return
        }

        int count = 1
        Node currentNode = end
        print("End ")
        while(count <= length) {
            if (count < length) {
                print(currentNode.getData() + " -> ")
            }
            else {
                println(currentNode.getData() + " -> End")
            }
            currentNode = currentNode.getPreviousNode()
            count++
        }
    }
}