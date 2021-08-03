package tasks;

public class Prime {
	
	static boolean isprime(int x)
	{
		int i,m=0,flag=0;
		m=x/2;
		if(x==0 || x==1)
		{return false;}
		else
		{
			for(i=2;i<=m;i++)
			{
				if(x%i==0)
				{
					return false;
				}
			}
		if(flag==0)	
		{
			return true;
		}
		}
		return true;
	}
	public static void main(String[] args) {
		
		int arr[]= {2,9,5,7,34,37,63,69,19,45,83};
		for(int x:arr)
		{
			if(isprime(x))
				System.out.print(x+" ");
		}

	}

}