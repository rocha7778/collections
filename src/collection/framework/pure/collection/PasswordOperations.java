package collection.framework.pure.collection;

public class PasswordOperations {

    public static int countMinimumOperations(String password) {
    	
    	
    	if (password.length() < 2) {
            // Handle the case when inputStr is less than 2
            return 0;
        }
    	
    	if (password.length() > Math.pow(10, 5)) {
            // Handle the case when inputStr is less than 2
            return 0;
        }
    	
        int vowels = countVowels(password);
        int consonants = password.length() - vowels;

        // Check if the password is already similar
        if (vowels == consonants) {
            return 0;
        }

        // Calculate the minimum operations needed to balance vowels and consonants
        return Math.abs(vowels - consonants) / 2;
    }

    private static int countVowels(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (isVowel(ch)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        String password = "abcd";
        int minOperations = countMinimumOperations(password);
        System.out.println("Minimum Operations: " + minOperations);
    }
}

