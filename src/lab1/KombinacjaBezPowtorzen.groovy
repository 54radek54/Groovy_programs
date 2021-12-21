package lab1

class WithoutRepetition {
    static void main(String[] args) {
        List<String> signs = List.of("a", "b", "c")

        System.out.println("Combination without repetition for given signs: ")
        System.out.print(combinationWithoutRepetition(signs))
    }
    static combinationWithoutRepetition(List signs) {
        List<String> AllCombinations = new ArrayList<>()
        for (sign1 in signs) {
            for (sign2 in signs) {
                if (!(AllCombinations.contains(sign2 + sign1) || AllCombinations.contains(sign1 + sign2))) {
                    AllCombinations.add(sign1 + sign2)
                }
            }
        }
        return AllCombinations
    }
}