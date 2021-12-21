package lab3

class Course {
    static void main(String[] args) {
        Course course=new Course()
        println(course)
        println()
        Course course1 = new Course("Sebastian")
        println(course1)
        println()
        Course course2 = new Course("Marek", 5)
        println(course2)

    }
    private String name
    private int grade

    Course(){
        println("Wywolano konstruktor domyslny")
    }

    Course(String name, int grade) {
        this.name = name
        this.grade = grade
        println("Wywolano konstruktor przeciazony z dwoma parametrami (String) ${getName()}  oraz (int) ${getGrade()} ")
    }

    Course(String name) {
        this.name = name
        println("Wywolano konstruktor przeciazony z jednym parametrem (String) ${getName()}")
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    int getGrade() {
        return grade
    }

    void setGrade(int grade) {
        this.grade = grade
    }
}