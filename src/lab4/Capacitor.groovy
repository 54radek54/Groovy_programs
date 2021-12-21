package lab4

class Capacitor {
    static void main(String[] args) {
        Capacitor capacitor = new Capacitor()
        println("Value of default constructor: " + capacitor.capacitorCapacity)
        println("Change of the value by void method")
        capacitor.changeCapacity(5)
        println("Value of double method: " + capacitor.capacity())
        Capacitor capacitor1 = new Capacitor(3)
        Capacitor capacitor2 = new Capacitor(7)
        Capacitor capacitor3 = new Capacitor(6)
        println("Value of setting value constructor: " + capacitor1.capacitorCapacity)
        println()
        print("Polaczenie rownolegle ${capacitor1.capacitorCapacity} i ${capacitor2.capacitorCapacity}: ")
        println(capacitor1 + capacitor2)
        print("Polaczenie rownolegle ${capacitor1.capacitorCapacity}, ${capacitor2.capacitorCapacity} i ${capacitor3.capacitorCapacity}: ")
        println(capacitor1+capacitor2+capacitor3)
        println()
        print("Polaczenie szeregowe ${capacitor1.capacitorCapacity} i ${capacitor2.capacitorCapacity}: ")
        println(capacitor1*capacitor2)
        print("Polaczenie szeregowe ${capacitor1.capacitorCapacity}, ${capacitor2.capacitorCapacity} i ${capacitor3.capacitorCapacity}: ")
        println(capacitor1*capacitor2*capacitor3)
        println()
        print("operator << \n wynik znajduje sie w pliku capacitors.txt")
        capacitor1<<capacitor2
    }
    //capacity field
    private double capacitorCapacity
    //default constructor value=0
    Capacitor() {
        capacitorCapacity = 0
    }
    //constructor that set value
    Capacitor(double capacitorCapacityValue) {
        capacitorCapacity = capacitorCapacityValue
    }
    //double method that returns value of capacity
    private double capacity() {
        return capacitorCapacity
    }
    //void method that changes the value of capacity
    private void changeCapacity(double newValue) {
        capacitorCapacity = newValue
    }

    Capacitor multiply(Capacitor other) {
        return new Capacitor(this.capacitorCapacity + other.capacitorCapacity)
    }

    Capacitor plus(Capacitor other) {
        return new Capacitor(1 / (1 / this.capacitorCapacity + 1 / other.capacitorCapacity))
    }

    Capacitor leftShift(Capacitor other) {
        File file = new File("capacitors.txt")
        file.append("Capacitor value: "+this.capacitorCapacity)
        file.append("\n")
        file.append("Capacitor value: "+other.capacitorCapacity)
    }
    @Override
    String toString(){
        capacitorCapacity.toString()
    }

}