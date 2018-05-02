package pattern;

public class PatternK {
	public static void main(String[] args) {
	int n=7;
	for(int i=0;i<n;i++)
	{
		for(int j=n/2;j<n;j++)
		{
			if(j==n/2||(i==j||i+j==n-1)&&j>=n/2)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
}

}
}



