package lab1

class Factorial {
    static void main(String[] args) {
        System.out.println("Enter number to factorial: ")
        def x = System.in.newReader().readLine() as Integer

        System.out.println("Result of factorial is: " + factorial(x))
    }
    static long factorial(int n){
        long result=1
        if(n==0){return 1}
        for (int i = 1; i <=n; i++) {
            result*=i
        }
        return result
    }
}