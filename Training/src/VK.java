import java.util.Scanner;

/**
 * 
 */

/**
 * @author HP
 *
 */
public class VK {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the odd value of n: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) /* Display alphabet M */
			{
				if( (j==0&& i<(n/2)) || 
						(j==n/2&&i<(n/2))
			
						) /* prints the alphabet M */
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" " );
			
			
			for(int j=0;j<n;j++)/* prints the alphabet k */ {
				if(j==0 || i+j==(n/2) || i-j==(n/2) ) /* prints the alphabet k */
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
