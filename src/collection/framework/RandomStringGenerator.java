package collection.framework;

import java.util.Random;

public class RandomStringGenerator {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int STRING_LENGTH = 10;

    public static String generateRandomString() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(STRING_LENGTH);
        
        for (int i = 0; i < STRING_LENGTH; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            sb.append(randomChar);
        }
        
        return sb.toString();
    }
    
    public static String generateRandomStringWithLength(int length) {
    	Random random = new Random();
    	StringBuilder sb = new StringBuilder(length);
    	
    	for (int i = 0; i < length; i++) {
    		int randomIndex = random.nextInt(CHARACTERS.length());
    		char randomChar = CHARACTERS.charAt(randomIndex);
    		sb.append(randomChar);
    	}
    	
    	return sb.toString();
    }

    public static void main(String[] args) {
        String randomString = generateRandomString();
        System.out.println("Random String: " + randomString);
    }
}
