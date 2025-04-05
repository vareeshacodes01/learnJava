import java.util.Scanner;

public class SumodFourthPower {
    public int fourthPower(int x){
        int sum=0;
        for(int i=1;i<=x;i++){
            sum=sum+(int)(Math.pow(i,4));
        }
        // System.out.println(sum);
        return sum;
    }
    public double mean(int x){
        int sum=0;
        for(int i=1;i<=x;i++){
            sum=sum+(int)(Math.pow(i,4));
        }
        double mean=sum/x; 
        return mean;   }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int x=sc.nextInt();
        SumodFourthPower sf=new SumodFourthPower();
       System.out.println(sf.fourthPower(x));
       System.out.println(sf.mean
       (x));
    }
}
