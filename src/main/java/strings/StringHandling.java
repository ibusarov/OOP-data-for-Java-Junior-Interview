package strings;

import java.util.HashMap;
import java.util.Map;

public class StringHandling {

    public static void main(String[] args) {

        System.out.println(longestAlphabeticalSubstring("nab"));
        System.out.println(lengthOfLongestSubstring("abcabcd"));
        System.out.println(lengthOfLongestSubstringUpgraded("abcabcd"));
        System.out.println(comparingStrings("abcdxyz", "xyzabcd"));

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

    //Length of longest substring
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                if (sb.indexOf(String.valueOf(s.charAt(j))) != -1) {
                    break;
                }
                sb.append(s.charAt(j));
                maxLength = Math.max(maxLength, sb.length());
            }
        }

        return maxLength;
    }

    public static int lengthOfLongestSubstringUpgraded(String s) {

        int maxLength = 0;
        Map<Character, Integer> movingMap = new HashMap<>();

        for (int left = 0, right = 0; right < s.length(); right++) {
            if (movingMap.containsKey(s.charAt(right)) &&
                    movingMap.get(s.charAt(right)) >= left) {
                left = movingMap.get(s.charAt(right)) +1;
            }
            maxLength = Math.max(maxLength, right - left +1);
            movingMap.put(s.charAt(right), right);

        }

        return maxLength;
    }

    /*
        Longest common substring
        string first = "abcdxyz"
        string second = "xyzabcd"
         */
    private static int comparingStrings(String first, String second){
        int ans = 0;

        for (int i = 0; i < first.length() ; i++) {
            for (int j = 0; j < second.length(); j++) {
                int k =0;
                while((i +k) < first.length() && (j +k) < second.length() &&
                        first.charAt(i +k) == second.charAt(j +k)){
                    k = k+1;
                }
                ans = Math.max(ans, k);
            }
        }

        return ans;
    }

    static int solve(char f[], char s[],
                     int firstLength, int secondLength) {


        int temp[][] = new int[firstLength + 1][secondLength + 1];
        int result = 0;

        for (int i = 0; i <= firstLength; i++) {
            for (int j = 0; j <= secondLength; j++) {
                if (i == 0 || j == 0) {
                    temp[i][j] = 0;
                } else if (f[i -1] == s[j -1]) {
                    temp[i][j] = 1 + temp[i - 1][j - 1];
                    result = Integer.max(result, temp[i][j]);

                } else {
                    temp[i][j] = 0;
                }
            }
        }

        return result;
    }



}


