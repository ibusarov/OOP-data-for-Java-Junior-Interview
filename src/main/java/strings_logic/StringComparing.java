package strings_logic;

public class StringComparing {
    public static void main(String[] args) {

        /*
        Longest common substring
        string first = "abcdxyz"
        string second = "xyzabcd"
         */


        String first = "abcdxyz";
        String second = "xyzabcd";

//        System.out.println(comparingStrings(first, second));
        System.out.println(solve(first.toCharArray(), second.toCharArray(),
                first.length(), second.length()));

    }


    private static int comparingStrings(String first, String second) {
        int ans = 0;

        for (int i = 0; i < first.length(); i++) {
            for (int j = 0; j < second.length(); j++) {
                int k = 0;
                while ((i + k) < first.length() && (j + k) < second.length()
                        && first.charAt(i + k) == second.charAt(j + k)) {
                    k = k + 1;
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
