public class Q5 {
    public static void main(String[] args) {
        int N = 4;
        char c = 'Z';
        int num = 26;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (j % 2 == 0) {
                    System.out.print(c+"  ");
                    c--;
                } else {
                    System.out.print(num-- +"  ");
                }
            }System.out.println();
        }
    }}
