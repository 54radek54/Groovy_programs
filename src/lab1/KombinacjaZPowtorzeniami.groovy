package lab1

class WithRepetition {
    static void main(String[] args) {
        List<String> signs = List.of("a", "b", "c")

        System.out.println("Combination with repetition for given signs: ")
        System.out.print(combinationWithRepetition(signs))
    }
    static combinationWithRepetition(List signs) {
        List<String> AllCombinations = new ArrayList<>()
        for (sign1 in signs) {
            for (sign2 in signs) {
                AllCombinations.add(sign1 + sign2)
            }
        }
        return AllCombinations
    }
}