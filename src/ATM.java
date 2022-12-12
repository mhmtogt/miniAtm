
import java.util.Scanner;


public class ATM {
    public void calis(Hesap hesap){
        
        Login login = new  Login();
        
        Scanner scanner = new Scanner(System.in);   
        
        System.out.println("bankamıza hoşlgeldiniz ...");
        
        System.out.println("*************************");
        
        System.out.println("kullanici girisi ");

        int giris_hakkı = 3 ;

        while(true){

        if(login.login(hesap)){
            
            System.out.println("giris basarılı ");
            break;
        }
        else {
            
            System.out.println("giriz basarısız ...");
            giris_hakkı -= 1;
            System.out.println("kalan giris hakkı :"+ giris_hakkı);
            
        }
        if (giris_hakkı == 0  ){
            
            System.out.println("üzgüm 3 defa yanlış şifre girdiniz kartınız bloke oldu");
            return;
        }
    }
        
        System.out.println("************************************************");
        
        String islemler = "1 bakiye görüntüle " 
                         +"2 para yatisma "
                         +"3 para cekme "
                         +"çıkış için q'ya basınız ";
        
        System.out.println(islemler);
        System.out.println("***********************************************");
        
        
            while(true){
                
                System.out.println("lütfen bir islem seciniz");
                String islem =scanner.nextLine();
            
                
                if(islem.equals("q")){
                    
                    
                    System.out.println("islemi bittir ...");
                    break;
                }else if (islem.equals("1")){
                    
                    System.out.println("bakiyeniz "+ hesap.getBakiye());
                }
                else if (islem.equals("2")){
                    
                    System.out.println("yatırmak istediğiniz tutar : ");
                    int tutar = scanner.nextInt();
                    scanner.nextLine();
                    
                    
                    hesap.Parayatir(3432);
                }
                else if (islem.equals(3)){
                    
                    System.out.println("çekmek istediğiniz tutarını giriniz lütfen ");
                    int tutar = scanner.nextInt();
                    scanner.nextLine();
                    
                    hesap.paraCek(34334);
                }
                else {
                    
                    System.out.println("geçersiz işlerm ");
                }
            }
        
        
        
    }
}
