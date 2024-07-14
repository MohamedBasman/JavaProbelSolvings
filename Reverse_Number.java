import java.util.Scanner;
class Reverse_Number{
  public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=s.nextInt();
	int ans=0;
//using string buffer
	StringBuffer x = new StringBuffer(String.valueOf(n));
	StringBuffer y = x.reverse();
	System.out.println("Reversed No="+y);	
//using string builder
	StringBuilder sb = new StringBuilder();
	sb.append(n);
	StringBuilder f=sb.reverse();
	System.out.println("Reversed No="+f);

//using algorithm
	while(n!=0){
		ans=(ans*10)+n%10;
		n/=10;
	}
	System.out.println("Reversed No="+ans);
     }
} 

	 