/**
 * 
 */

/**
 * @author HP
 *
 */

/*
 * 
1 1 1 
2 2 2 
3 3 3

1 1 1 1 1 1 1 
2 2 2 2 2 2 2 
3 3 3 3 3 3 3 
4 4 4 4 4 4 4 
5 5 5 5 5 5 5 
6 6 6 6 6 6 6 
7 7 7 7 7 7 7 
dynamic 
 */
import java.util.Scanner;
public class Pattern4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(i+ " ");
				
			}
			System.out.println();
		}
		sc.close();
	}

}
