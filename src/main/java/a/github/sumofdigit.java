package a.github;

public class sumofdigit {

	public static void sumofdigit(int num)
	{
		int t=num;
		int r;
		int sumofdigit=0;
		while(num>0)
		{
		 r=num%10;
		 sumofdigit=sumofdigit+r;
		 num=num/10;
		}
		System.out.println("sum of digit "+sumofdigit);
	}
	
	public static void main(String[] args) {
		
		sumofdigit(112);
	}

}
