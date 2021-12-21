package lab3

class CollatzProblem {
    static void main(String[] args) {
        println("Solved for 15: ${calc(15)}")
        println()
        println("Solved for 27: ${calc(27)}")
    }

    static calc(int number){
        List<Integer> list = new ArrayList<>()
        do{
            number = collatzNumberCalculation(number)
            list.add(number)
        }while(number!=1)
        return list
    }

    static int collatzNumberCalculation(int numberToCalculate){
        int result= (numberToCalculate % 2 == 0) ? numberToCalculate/2 : (3* numberToCalculate) + 1
        return result
    }


}