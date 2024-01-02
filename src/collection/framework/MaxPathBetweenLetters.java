package collection.framework;

public class MaxPathBetweenLetters {
    public static void main(String[] args) {
     
        String s2 = "abcadeaj";

        System.out.println(countSpacesBetweenLetters(s2, 'a')); // Output: 5
    }

    public static int countSpacesBetweenLetters(String s, char letter) {
        int firstIndex = -1;
        int lastIndex = -1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letter) {
                if (firstIndex == -1) {
                    firstIndex = i;
                }
                lastIndex = i;
            }
        }

        return (firstIndex != -1 && lastIndex != -1) ? (lastIndex - firstIndex - 1) : -1;
    }
}









