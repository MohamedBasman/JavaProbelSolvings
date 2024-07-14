import java.util.Scanner;
//import java.lang.math;
class Last_Digit_A_pow_B{
	 public static void main(String[] args){
	 Scanner s = new Scanner(System.in);
	 System.out.println("Enter a Base number:");
	 int n1=s.nextInt();
	 System.out.println("Enter a Power number:");
	 int n2=s.nextInt();
	 long val=(long)Math.pow(n1,n2);
	 long ans=val%10;
	 System.out.println("Last Digit="+ans);
   }
}

