public class Q3 {
    public static void main(String[] args) {
        int N = 4;
       int num = 14;
        for (int i =1; i <=N; i++) {
                                      //  int num = 14+i-1;
            for (int j =1; j <=N; j++) {
                System.out.print(num++ +"   ");
            }    num=num-3;
            System.out.println();
                                    //num = num+1;
        }
    }
}
