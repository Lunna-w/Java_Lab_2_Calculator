public class Calculator {
    public Calculator(){
    }

        public static void main(String[] args) {
        int firstNumber =Input.getInteger("number 1: ");
        int secondNumber=Input.getInteger("number 2: ");
        System.out.println("addition: "+(firstNumber+secondNumber));
        System.out.println("subtraction: " + (firstNumber - secondNumber));
        System.out.println("multiplication: "+firstNumber*secondNumber);
        if (secondNumber != 0) {
                System.out.println("division: " + ((double) firstNumber / secondNumber));
        } else {
            System.out.println("division: Cannot divide by zero");
        }

    }
}
