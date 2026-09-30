/*
 * Program to generate six-digit OTP numbers.
 * The program generates 10 OTPs using Math.random(),
 * stores them in an array, and checks whether all generated
 * OTP numbers are unique.
 */

package Methods.Level3;

class OTPAnalysis {

    // Generates a six-digit OTP number
    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }

    // Checks whether all OTP numbers in the array are unique
    public static boolean checkUnique(int[] otpNumbers) {

        for (int i = 0; i < otpNumbers.length; i++) {

            for (int j = i + 1; j < otpNumbers.length; j++) {

                if (otpNumbers[i] == otpNumbers[j]) {
                    return false;
                }
            }
        }

        return true;
    }
}

public class OTPValidation {

    public static void main(String[] args) {

        // Create an array to store 10 generated OTP numbers
        int[] otpNumbers = new int[10];

        // Generate 10 six-digit OTP numbers
        for (int i = 0; i < otpNumbers.length; i++) {
            otpNumbers[i] = OTPAnalysis.generateOTP();
        }

        // Check whether all generated OTPs are unique
        boolean unique = OTPAnalysis.checkUnique(otpNumbers);

        System.out.println("Generated OTP numbers:");

        for (int i = 0; i < otpNumbers.length; i++) {
            System.out.println("OTP-" + (i + 1) + ": " + otpNumbers[i]);
        }

        System.out.println("Are all OTPs unique: " + unique);
    }
}