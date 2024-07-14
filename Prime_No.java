import java.util.Scanner;
class Prime_No{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();
        boolean Prime = true;
        if(n<=1){
            System.out.println("Not a prime number:");
        }
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    Prime=false;
                }
        }
        if(Prime){
            System.out.println("Prime number:");
        }
        else{
            System.out.println("Not a prime number:");
        }
    }
}