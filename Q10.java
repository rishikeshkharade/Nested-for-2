
public class Q10 {
	public static void main(String[] args) {
		int rows = 6;
		for (int i = 1; i <=rows;i++) {
		int ch= 70;
		int num = rows;
		for (int j = 1; j <=rows;j++) {
			if(j%2==1) { 
			System.out.print((char)ch+"  ");
			
			}else {
			System.out.print(num+"  ");
            
			}
			ch--;
			num--;
            
		
	}
		System.out.println();
}
}
}
