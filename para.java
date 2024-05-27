package mmmmm;
import java.util.*;
public class Paraenthesis {
	static void hello(ArrayList al,int open,int close,int n,String str)
	{
		if(str.length()==n*2) {
			//2->()()
			al.add(str);
			return;
		}
		if(open<n)
		{
			hello(al,open+1,close,n,str+"(");
		}
		if(close<open)
		{
			hello(al,open,close+1,n,str+")");
		}
	}

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		hello(al,0,0,n,"");
		System.out.println(al);
				
		
	}

}
