package collection.framework.pure.collection;

public class SecurePassword {

    public static int minChangesToSecure(String pwd) {
        int changesNeeded = 0;

        for (int i = 0; i < pwd.length(); i++) {
            char currentChar = pwd.charAt(i);

            // Check if the current substring violates the condition
            if (i % 2 == 0 && currentChar != '0') {
                changesNeeded++;
            } else if (i % 2 != 0 && currentChar != '1') {
                changesNeeded++;
            }
        }

        return changesNeeded - 1;
    }

    public static void main(String[] args) {
        // Example usage
        String password = "100110";
        int changes = minChangesToSecure(password);
        System.out.println("Minimum changes needed: " + changes);
    }
}






