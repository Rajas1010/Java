public class SubsequenceExample {
    public static void main(String[] args) {
        String originalString = "abc";

        String subsequence1 = getSubsequence(originalString, new boolean[originalString.length()], 0);
        System.out.println("Subsequence 1: " + subsequence1); // Output: "abc"

        String subsequence2 = getSubsequence(originalString, new boolean[originalString.length()], 0);
        System.out.println("Subsequence 2: " + subsequence2); // Output: "ab"
    }

    private static String getSubsequence(String str, boolean[] include, int index) {
        if (index == str.length()) {
            StringBuilder subsequence = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (include[i]) {
                    subsequence.append(str.charAt(i));
                }
            }
            return subsequence.toString();
        }

        include[index] = false;
        String withoutChar = getSubsequence(str, include, index + 1);

        include[index] = true;
        String withChar = getSubsequence(str, include, index + 1);

        return withoutChar + withChar;
    }
}
