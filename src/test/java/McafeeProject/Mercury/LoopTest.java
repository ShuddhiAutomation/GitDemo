package McafeeProject.Mercury;

public class LoopTest {

	
	public static void main(String[] args) {
		
		//int i=0;
		/*
		 * while(i<10) { System.out.println("Print+"+ i); i++;
		 * 
		 * }
		 * 
		 */
		
		/*
		 * do { i++; System.out.println(i); }while(i<10);
		 */
		
		/*
		 * for(int i=1;i<=4;i++) { System.out.println("Outerloop started"); for(int
		 * j=1;j<=4;j++) { System.out.println("inner loop");
		 * 
		 * } System.out.println("Finished inner loop");
		 * 
		 * }
		 */
		
		
		
		int i,j,k=1;
		for (i=4;i>=0;i--)
		{
			for (j=1;j<=i;j++)
			{
				
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
			
		}
		
		
		
	}
	
	
}
