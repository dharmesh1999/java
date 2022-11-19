package string;

public class shortestPath {
    public static int getShortestPath(String str) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                default:
                    break;
            }
        }
        int diagonal = (int) Math.sqrt((x * x) + (y * y));
        return diagonal;
    }

    public static void main(String args[]) {
        String str = "WNEENESENNN";
        System.out.print(getShortestPath(str));
    }
}
