import java.util.Scanner;

public class SumofSquare {
    public int square(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+(int)(Math.pow(i,2));
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        SumofSquare s=new SumofSquare();
        for(int i=1;i<=n;i++){
            sum=sum+s.square(i);
        }
        System.out.println(sum);
    }
}
