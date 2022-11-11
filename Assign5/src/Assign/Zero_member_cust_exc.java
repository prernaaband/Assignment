package Assign;

public class Zero_member_cust_exc {
	public static void checError(int num)throws Exception
	{
        int arr[]= {};
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]==0)
			{
			throw new Exception ("Zeromember error");
			}
			else 
			{
			System.out.println("you are welcome");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		try 
		{
			checError(2);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}


	}

}

