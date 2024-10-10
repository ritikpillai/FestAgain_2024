public class ArmStrongNumber {
    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int result = 0;
        int digits = String.valueOf(number).length(); // Get the number of digits

        while (number != 0) {
            int remainder = number % 10;
            result += Math.pow(remainder, digits);
            number /= 10;
        }
        return result == originalNumber;
    }

    public static void main(String[] args) {
        int number = 153; // Example Armstrong number
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
