
public class Q9Solution2 {
	public static void main(String[] args) {
		int num=1;
		int rows=3;
		for (int i =1; i <=rows; i++) {
			int x=rows;
			int c=65+3-1;
			for (int j =1; j <=rows; j++) {
				System.out.print(num*num+""+(char)c+""+x--+" ");
				num++;
				c--;
				
			}
				System.out.println("");
		}
	}

}
