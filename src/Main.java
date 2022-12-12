
public class Main {
    
   
    public static void main(String[] args) {
        
         ATM atm = new ATM();
         Hesap hesap = new Hesap("mehmet öğüt ","1234",4500);
         
         atm.calis(hesap    );
         System.out.println("programdan çıkıyor ...");
         
         
    }
    
    
    
}
