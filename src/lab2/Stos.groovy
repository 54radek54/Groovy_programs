package lab2

class Stack<T> {
    static void main(String[] args) {

        Stack<Integer> element = new Stack<>()
        element.push(111)
        element.push(123)
        element.push(321)
        println(element)
        element.pop()
        println(element)
        println(element.peek())

    }

    private ArrayList<T> stackList = new ArrayList<>()

    def push(T){
        stackList.push(T)
    }

    T pop(){
        return stackList.pop()
    }

    T peek(){
        stackList.get(stackList.size()-1)
    }

    @Override
    String toString(){
        stackList.toString()
    }
}