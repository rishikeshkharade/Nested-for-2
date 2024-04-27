public class Q8 {
    public static void main(String[] args) {
        int N = 4;
        char c = 'A';
        char ch = 'a';
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (j%2==0  ) {
                    System.out.print(ch + " ");

                } else {
                    System.out.print(c + " ");

                }
                c++;
                ch++;
            }
            System.out.println();
        }

    }
}
