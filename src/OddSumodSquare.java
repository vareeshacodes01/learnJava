import java.util.Scanner;

public class OddSumodSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum=sum+(int)(Math.pow(i,2));
            }
        }
        System.out.println(sum);
    }
}
