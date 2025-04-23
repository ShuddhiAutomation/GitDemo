package McafeeProject.Mercury;

public class LoopTest2 {

	
	public static void main(String[] args) {
		
		
		//nested  loop
		for(int i=0;i<=4;i++)//-outer loop
		{
			System.out.println("Entered inner loop"+i);
			for(int j=1;j<=4;j++)// inner loop
			{
			 System.out.println("Running Inner loop"+j);
				
			}
			
			System.out.println("finished inner loop"+i);
		}
		
		
		
		
	}
	
	
}
