package PatternAssignment;

public class Pattern4 {
	
	
	public static void main(String[] args) {
		char ch='A';
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<5;j++)
			{
				System.out.print((char)(ch+i+j-2)+" ");
				
			}
			System.out.println();
		}

	}

}
