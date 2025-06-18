import java.util.*;

public class OTPGenerator {

    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000); // range: 100000 to 999999
    }

    // Method to check if all OTPs are unique
    public static boolean areUnique(int[] otps) {
        Set<Integer> set = new HashSet<>();
        for (int otp : otps) {
            set.add(otp);
        }
        return set.size() == otps.length;
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];

        // Generate 10 OTPs and store
        System.out.println("Generated OTPs:");
        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
            System.out.println(otpArray[i]);
        }

        // Check uniqueness
        boolean unique = areUnique(otpArray);
        System.out.println("All OTPs Unique? " + unique);
    }
}
