
package lab1;

public class Urun {
    private final int ID;
    private String ad;
    private double fiyat;
    private static int zamSayisi;
    
    public Urun (int Id,String ad, double fiyat){
        this.ID=Id;
        this.ad=ad;
        this.fiyat = fiyat;
        
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getID() {
        return ID;
    }

    public double getFiyat() {
        return fiyat;
    }

    public static int getZamSayisi() {
        return zamSayisi;
    }
    public void zamYap(double zamOrani){
        this.fiyat = this.fiyat + this.fiyat * zamOrani;
            Urun.zamSayisi ++;
    }
    
    @Override
    public String toString(){
        String mesaj= "[ Utun adi: "+ this.getAd()+ ", Urun ID'si: "+this.getID()+ ", Urun fiyati: "+ this.getFiyat()+" ]";
                return mesaj;
    }
}
