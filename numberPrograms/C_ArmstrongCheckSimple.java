package numberPrograms;

public class C_ArmstrongCheckSimple {
    public static void main(String[] args) {
        
        System.out.print("Enter a number: ");
        int num = 123;
        int originalNum = num, sum = 0;

        // Calculate the sum of cubes of digits
        while (num > 0) {
            int digit = num % 10;
            sum =sum +  digit * digit * digit;
            num =num/ 10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}

