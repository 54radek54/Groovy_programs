package lab1

class First {
    static void main(String[] args) {

        println("The program displays prime numbers between to given numbers")
        print("First number: ")
        def beginning = System.in.newReader().readLine() as Integer
        print("Second number: ")
        def ending = System.in.newReader().readLine() as Integer
        println("Prime numbers: ")
        print(firstsBetween(beginning, ending))
    }

    static boolean isFirst(int numberToCheck) {
        if (numberToCheck <= 0) return false
        if (numberToCheck == 1) return false

        for (int i = 2; i < numberToCheck; i++) {
            if (numberToCheck % i == 0) return false
        }

        return true
    }


    static firstsBetween(int begin, int end) {
        List<Integer> Numbers = new ArrayList<>()
        for (; begin <= end; begin++) {
            if (isFirst(begin)) {
               Numbers.add(begin)
            }
        }
        return Numbers
    }

}