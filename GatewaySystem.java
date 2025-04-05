interface PaymentGateway {
    // double amount;
    public void processPayment(double amount);
    public void refund(double amount);
    // PaymentGateway()
    
}
 class Paypal implements PaymentGateway {
     double amount=5.8;
    public void processPayment(double amount){
        amount=amount+456.6;
        System.out.println("t.m="+amount);
    }
    public void refund(double amount){
        amount=amount-4.78;
        System.out.println("r.a="+amount);
    }
}
 class CreaditCard implements PaymentGateway {
    double amount=4.8;
    public void processPayment(double amount){
        amount=amount+456.6;
        System.out.println("t.m="+amount);
    }
    public void refund(double amount){
        // amount=amount-4.78;
        
        System.out.println("r.a="+amount);
    }
    
}
 class UPI implements PaymentGateway {
    double amount=6.8;
    public void processPayment(double amount){
        // amount=amount+456.6;
        System.out.println("t.m="+amount);
    }
    public void refund(double amount){
        // amount=amount-4.78;
        System.out.println("r.a="+amount);
    }
    
}

public class GatewaySystem {
    public static void main(String[] args) {
        Paypal  p=new Paypal();
        p.processPayment(45.0);

    }
}
