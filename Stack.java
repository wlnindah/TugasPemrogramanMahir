import java.util.Scanner;

public class Stack {
    public static void main(String[] args) {

        StackIndah stack = new StackIndah(25);
        String input = "f(x)=(2x+y)-(3+(2x-x)+20)";
        Scanner scn = new Scanner(input);

        scn.useDelimiter("");

        for (int i = 0; i < input.length(); i++) {
            String karakter = scn.next();
            if (karakter.equals("(")) {
                stack.push("(");
            } else if (karakter.equals(")")) {
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            System.out.println("valid");
        } else {
            System.out.println("tidak valid");
        }
    }
}


