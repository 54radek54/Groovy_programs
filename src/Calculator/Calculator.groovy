package Calculator

import javax.swing.*
import java.awt.*
import java.awt.event.ActionEvent
import java.awt.event.ActionListener

class Calculator implements ActionListener {
    static void main(String[] args)
    {
        new Calculator()
    }
    double component, component2 // additional variables to help calculations making
    int calcType, operation=0 //variable needed to switch between calculations like plus, minus etc


    Calculator() {
        GUI()
        addActionEvent()
    }

    JFrame frame
    JLabel label = new JLabel()
    JTextField textField = new JTextField()
    JButton buttonSignChange = new JButton("+/-")
    JButton buttonZero = new JButton("0")
    JButton buttonOne = new JButton("1")
    JButton buttonTwo = new JButton("2")
    JButton buttonThree = new JButton("3")
    JButton buttonFour = new JButton("4")
    JButton buttonFive = new JButton("5")
    JButton buttonSix = new JButton("6")
    JButton buttonSeven = new JButton("7")
    JButton buttonEight = new JButton("8")
    JButton buttonNine = new JButton("9")
    JButton buttonDot = new JButton(".")
    JButton buttonClear = new JButton("C")
    JButton buttonBackspace = new JButton("\u232B")
    JButton buttonEqual = new JButton("=")
    JButton buttonMultiplication = new JButton("x")
    JButton buttonDivision = new JButton("/")
    JButton buttonPlus = new JButton("+")
    JButton buttonMinus = new JButton("-")
    JButton buttonSquare = new JButton("x\u00B2")
    JButton buttonInverse = new JButton("1/x")
    JButton buttonSqrt = new JButton("\u221A")
    JButton buttonSin = new JButton("Sin")
    JButton buttonCos = new JButton("Cos")

    void GUI() {
        //setting the window
        frame = new JFrame()
        frame.setTitle("Groovy Calculator")
        frame.setSize(300, 440)
        frame.getContentPane().setLayout(null)
        frame.getContentPane().setBackground(Color.white)
        frame.setResizable(false)
        frame.setLocationRelativeTo(null)
        frame.setVisible(true)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)

        //holding the value
        label.setForeground(Color.black)
        label.setHorizontalAlignment(SwingConstants.RIGHT)
        frame.add(label).setBounds(10, 0, 260, 40)
        //the field for the entered value
        textField.setFont(new Font("Arial", Font.BOLD, 18))
        textField.setEditable(false)
        textField.setHorizontalAlignment(SwingConstants.RIGHT)
        frame.add(textField).setBounds(10, 40, 260, 40)

        //adding buttons to frame and setting up their position
        frame.add(buttonSin).setBounds(10, 90, 60, 40)
        frame.add(buttonCos).setBounds(80, 90, 60, 40)
        frame.add(buttonClear).setBounds(150, 90, 60, 40)
        frame.add(buttonBackspace).setBounds(220, 90, 60, 40)

        frame.add(buttonSqrt).setBounds(10, 140, 60, 40)
        frame.add(buttonSquare).setBounds(80, 140, 60, 40)
        frame.add(buttonInverse).setBounds(150, 140, 60, 40)
        frame.add(buttonDivision).setBounds(220, 140, 60, 40)

        frame.add(buttonSeven).setBounds(10, 190, 60, 40)
        frame.add(buttonEight).setBounds(80, 190, 60, 40)
        frame.add(buttonNine).setBounds(150, 190, 60, 40)
        frame.add(buttonMultiplication).setBounds(220, 190, 60, 40)

        frame.add(buttonFour).setBounds(10, 240, 60, 40)
        frame.add(buttonFive).setBounds(80, 240, 60, 40)
        frame.add(buttonSix).setBounds(150, 240, 60, 40)
        frame.add(buttonMinus).setBounds(220, 240, 60, 40)

        frame.add(buttonOne).setBounds(10, 290, 60, 40)
        frame.add(buttonTwo).setBounds(80, 290, 60, 40)
        frame.add(buttonThree).setBounds(150, 290, 60, 40)
        frame.add(buttonPlus).setBounds(220, 290, 60, 40)

        frame.add(buttonSignChange).setBounds(10, 340, 60, 40)
        frame.add(buttonZero).setBounds(80, 340, 60, 40)
        frame.add(buttonDot).setBounds(150, 340, 60, 40)
        frame.add(buttonEqual).setBounds(220, 340, 60, 40)

    }

    void addActionEvent() {
        buttonSignChange.addActionListener(this)
        buttonClear.addActionListener(this)
        buttonBackspace.addActionListener(this)
        buttonDivision.addActionListener(this)
        buttonSqrt.addActionListener(this)
        buttonSquare.addActionListener(this)
        buttonInverse.addActionListener(this)
        buttonMinus.addActionListener(this)
        buttonSeven.addActionListener(this)
        buttonEight.addActionListener(this)
        buttonNine.addActionListener(this)
        buttonMultiplication.addActionListener(this)
        buttonFour.addActionListener(this)
        buttonFive.addActionListener(this)
        buttonSix.addActionListener(this)
        buttonPlus.addActionListener(this)
        buttonOne.addActionListener(this)
        buttonTwo.addActionListener(this)
        buttonThree.addActionListener(this)
        buttonEqual.addActionListener(this)
        buttonZero.addActionListener(this)
        buttonDot.addActionListener(this)
        buttonSin.addActionListener(this)
        buttonCos.addActionListener(this)
    }

    @Override
    void actionPerformed(ActionEvent e) {
        Object pressedButton = e.getSource()
        if (pressedButton == buttonClear) {
            label.setText("")
            textField.setText("")
        } else if (pressedButton == buttonBackspace) {
            int length = textField.getText().length()
            int component = length - 1
            if (length > 0) {
                StringBuilder back = new StringBuilder(textField.getText())
                back.deleteCharAt(component)
                textField.setText(back.toString())
            }
            if (textField.getText().endsWith("")) {
                label.setText("")
            }
        }else if (pressedButton == buttonSignChange) {
                double before = Double.parseDouble(textField.getText())
                Double changed = before*(-1)
                String string = Double.toString(changed)
                textField.setText(string)

        } else if (pressedButton == buttonZero) {
            if (!(textField.getText() == "0")) {
                textField.setText(textField.getText() + "0")
            }
        }  else if (pressedButton == buttonOne) {
            textField.setText(textField.getText() + "1")
        } else if (pressedButton == buttonTwo) {
            textField.setText(textField.getText() + "2")
        } else if (pressedButton == buttonThree) {
            textField.setText(textField.getText() + "3")
        } else if (pressedButton == buttonFour) {
            textField.setText(textField.getText() + "4")
        } else if (pressedButton == buttonFive) {
            textField.setText(textField.getText() + "5")
        } else if (pressedButton == buttonSix) {
            textField.setText(textField.getText() + "6")
        } else if (pressedButton == buttonSeven) {
            textField.setText(textField.getText() + "7")
        } else if (pressedButton == buttonEight) {
            textField.setText(textField.getText() + "8")
        } else if (pressedButton == buttonNine) {
            textField.setText(textField.getText() + "9")
        } else if (pressedButton == buttonDot) {
            if (!textField.getText().contains(".")) {
                textField.setText(textField.getText() + ".")
            }
        } else if (pressedButton == buttonSqrt) {
            component = Double.parseDouble(textField.getText())
            Double sqrt = Math.sqrt(component)
            textField.setText(Double.toString(sqrt))

        } else if (pressedButton == buttonSin) {
            component = Double.parseDouble(textField.getText())
            Double sin = Math.sin(component)
            textField.setText(Double.toString(sin))
        } else if (pressedButton == buttonCos) {
            component = Double.parseDouble(textField.getText())
            Double cos = Math.cos(component)
            textField.setText(Double.toString(cos))
        } else if (pressedButton == buttonSquare) {
            component = Double.parseDouble(textField.getText())
            double square = Math.pow(component, 2)
            String string = Double.toString(square)
            textField.setText(string)
        } else if (pressedButton == buttonInverse) {
            component = Double.parseDouble(textField.getText())
            double inverse = 1 / component
            String string = Double.toString(inverse)
            textField.setText(string)

        } else if (pressedButton == buttonPlus) {
            if(operation == 0){
                String str = textField.getText()
                component = Double.parseDouble(textField.getText())
                textField.setText("")
                label.setText(str + "+")
                calcType = 1
                operation++
            }

        } else if (pressedButton == buttonMinus) {
            if(operation == 0){
                String str = textField.getText()
                component = Double.parseDouble(textField.getText())
                textField.setText("")
                label.setText(str + "-")
                calcType = 2
                operation++
            }
        } else if (pressedButton == buttonMultiplication) {
            if(operation==0){
                String str = textField.getText()
                component = Double.parseDouble(textField.getText())
                textField.setText("")
                label.setText(str + "X")
                calcType = 3
                operation++
            }

        } else if (pressedButton == buttonDivision) {
            if(operation==0){
                String str = textField.getText()
                component = Double.parseDouble(textField.getText())
                textField.setText("")
                label.setText(str + "/")
                calcType = 4
                operation++
            }

        } else if (pressedButton == buttonEqual) {
            component2=Double.parseDouble(textField.getText())
            switch (calcType) {
                case 1:
                    textField.setText((component + (component2)).toString())
                    break
                case 2:
                    textField.setText((component-(component2)).toString())
                    break
                case 3:
                    textField.setText(((component)*(component2)).toString())
                    break
                case 4:
                    textField.setText(((component)/(component2)).toString())
                    break
            }
            label.setText("")
            operation=0
        }
    }

}