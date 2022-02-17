package lab5

class RegularExpressions {
    static void main(String[] args) {
        RegularExpressions regularExpressions = new RegularExpressions()
        println("email pattern checking on example:")
        regularExpressions.emailCheck()
        println("url pattern checking on example:")
        regularExpressions.urlCheck()

        println()
        println("Checking for emails and url form txt file")
        regularExpressions.linkAndEmailChecker()

    }

    private String linkAndEmailChecker() {
        new File("regularExpressions.txt").eachLine {
            line ->
                if (line ==~ /[a-zA-Z0-9]+@[a-zA-Z0-9.-]+\.[A-Za-z]{2,4}/) {
                    println line
                }else if(line ==~ '^https?://([^/]*)/([^/]*)$'){
                    println line
                }
        }

    }

    private void emailCheck() {
        String email = "r1@gmail.com"
        if (email ==~ /[a-zA-Z0-9]+@[a-zA-Z0-9.-]+\.[A-Za-z]{2,4}/) {
            println("email zgodny")
        } else {
            println("email nie zgodny")
        }
    }

    private void urlCheck() {
        String url = "https://10.11.12.13/some_name"
        if (url ==~ '^https?://([^/]*)/([^/]*)$') {
            println("url zgodny")
        } else {
            println("url nie zgodny")
        }
    }

}