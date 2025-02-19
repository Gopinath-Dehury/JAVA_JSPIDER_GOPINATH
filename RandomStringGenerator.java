import java.util.Random;

public class RandomStringGenerator {

    public static void main(String[] args) {
        int stringLength = 8; // Set the desired length of the random string

        String randomString = generateRandomString(stringLength);
        System.out.println("Random String: " + randomString);
    }

    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            char randomChar = characters.charAt(index);
            sb.append(randomChar);
        }

        return sb.toString();
    }
}
