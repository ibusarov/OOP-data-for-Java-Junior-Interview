package task;

public class StringHandling {

    public static void main(String[] args) {

        System.out.println(longestAlphabeticalSubstring("nab"));

    }

    public static String longestAlphabeticalSubstring(String text) {
        // Example: the longest alphabetical substring in "asdfaaaabbbbcttavvfffffdf" is "aaaabbbbctt".

        String result = "";
        String iResult = "";

        for (int i = 0; i < text.length(); i++) {
            iResult += text.charAt(i);

            if (iResult.length() > result.length())
                result = iResult;
            if (i > text.length() - 2)
                break;
            if (text.charAt(i) > text.charAt(i + 1))
                iResult = "";
        }

        return result;

    }

}
