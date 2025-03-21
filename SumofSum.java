import java.util.Scanner;

public class SumofSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int k=sc.nextInt();3
        int sum=0;
           for(int i=1;i<=n;i++){
            sum=sum+n*(n+1)/2;
           }
        System.out.println(sum);
// problem 2nd:
        // int sum=0;
        // for(int i=0;i<=n;i++){
        //     sum=sum+i;
        // }
        // System.out.println(sum);
        //     int add=0;
        //     n==
        //     sum;
        //     for(int i=0;i<=sum;i++){
        //         add=add+1;
        //     }
        //     System.out.println(add);

    }
}
