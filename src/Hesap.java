
public class Hesap {
    
    
    private String kullaniciAdi ;
    private String parola ;
    private  int bakiye ;
    
    
    
    public Hesap(String kullaniciAdi, String parola, int bakiye) {
        this.kullaniciAdi = kullaniciAdi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    
    public void  Parayatir(int yatirma){
        
        bakiye += yatirma;
        
        System.out.println("yeni bakiyeniz :" + bakiye);
    }
    
    public void paraCek(int cekme ){
        
        if (cekme > 1500 ){
            
            System.out.println("günlük en fazla 1500 lira çekebilisiniz ...");
            
        }
        if(cekme > bakiye){
            
            System.out.println("yetersiz bakiye ..."+ bakiye);
            
        }else{
            
            bakiye -= cekme ;
            System.out.println("kalan bakiyeniz : " +bakiye);
        }
    }

}
