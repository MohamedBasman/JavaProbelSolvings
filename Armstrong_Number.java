import java.util.Scanner;
class Armstrong_Number{
  public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=s.nextInt();
	int ans=0;
	int cmp=n;
	int tmp; 
	while(n!=0){
		tmp=n%10;
		tmp=tmp*tmp*tmp;
		ans+=tmp;
		n/=10;
	}
	if(cmp==ans){
		System.out.println("Armstrong Number");
	}
	else{
		System.out.println("Not a Armstrong Number");
	}
    }	
}
		 	
 	