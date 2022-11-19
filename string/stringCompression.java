package string;

public class stringCompression {

    public static StringBuilder compression(StringBuilder str) {
        StringBuilder newStr = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr.append(i);
            if (count > 1) {
                newStr.append(count.toString());
            }

        }
        return newStr;
    }

    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("aaavvvvhhhhsss");
        // String str = "aaavvvvbbbb";
        System.out.print(compression(sb));
    }
}
