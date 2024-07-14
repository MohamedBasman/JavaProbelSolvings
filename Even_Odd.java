import java.util.Scanner;
class Even_Odd{
	public static void main(String[] args){
		Scanner n = new Scanner(System.in);
		System.out.println("Enter a number:");
		int x=n.nextInt();
			if(x%2==0){
				System.out.println("Even");
			}
			else{
				System.out.println("Odd");
			}
	}
}