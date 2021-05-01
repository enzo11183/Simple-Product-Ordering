/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Muhammed
 */
public class Musteri {
    private String ad;
    private String soyad;
    private Siparis siparisler[];
    
    public Musteri (String ad, String soyad){
        this.ad=ad;
        this.soyad=soyad;
        this.siparisler = new Siparis[3];
        for (int i = 0; i < siparisler.length; i++) {
            siparisler[i]=new Siparis();
            
        }
    }
    public void siparisBilgisi(int siparisNo){
        System.out.println(siparisNo+". siparise ait urun bilgileri: ");
         
        this.siparisler[siparisNo].urunleriGoster();
     
        
    }
    public void tumSiparisler(){
        System.out.println(this.ad+" "+ this.soyad+" adli musteriye ait siparis bilgileri: ");
        for (int i = 0; i < siparisler.length; i++) {
            siparisBilgisi(i);
            
        }
    }
    public void siparisVer(int siparisNo, Urun urun){
        this.siparisler[siparisNo].urunEkle(urun);
    }
    public void kacSiparis(String urunAdi){
       int kacsiparisicinde=0;
       int toplamkackez=0;
       int flag=0;
       
        for (int i = 0; i < siparisler.length; i++) {
            flag=0;
            //for (int j = 0; j < 5; j++) {
            for (Urun gezitem: siparisler[i].getUrunler()) {
               
  
                if(gezitem!=null){
                    if( gezitem.getAd().compareTo(urunAdi)==0){
                        flag++;
                        toplamkackez++;
                        if(flag==1){
                         kacsiparisicinde++;
                    }
                    
                }
            }
            
            }
        }
        System.out.println(kacsiparisicinde+" tane siparis icinde toplam "+toplamkackez+ " adet "+ urunAdi+" siparis edilmis.");
    }
    
    public void urunCikar(int siparisNo, Urun urunnesne){
        this.siparisler[siparisNo].urunCikar(urunnesne);
        
    }
    
    public void tumSiparislerdenurunCikar(Urun urunnesne){
        for (int i = 0; i < siparisler.length; i++) {
            this.siparisler[i].urunCikar(urunnesne);
        }
         
    }
    public double getSiparisTutari(int siparisNo){
       return siparisler[siparisNo].getToplamTutar();
    }
}
