package Prectice;

public class PhoneNumber {

    private static void solve(String num, int index, String mapping[], StringBuilder output) {
        if (num.length() == 0) {
            return;
        }
        // basecase
        if (index >= num.length()) {
            System.out.print(output + " ");
            return;
        }
        // recursion
        int number = num.charAt(index) - '0';
        String value = mapping[number];

        for (int i = 0; i < value.length(); i++) {
            output.append(value.charAt(i));
            solve(num, index + 1, mapping, output);
            output.delete(output.length() - 1, output.length());
        }
    }

    public static void main(String args[]) {
        String num = "23";
        StringBuilder output = new StringBuilder("");
        String mapping[] = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        int index = 0;

        solve(num, index, mapping, output);

    }
}
