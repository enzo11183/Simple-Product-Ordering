
package lab1;

public class Siparis {
    private Urun urunler[];
    
    public Siparis(){
        this.urunler = new Urun[5];
    }

   
    public void urunEkle(Urun eklenecekurun){
        int i=0;
        while ( i < urunler.length && this.urunler[i]!=null ){
            i++;
            
        }
        if(i<urunler.length){
            urunler[i]=eklenecekurun;
        }
            
    }
    
    public Urun[] getUrunler(){
        return this.urunler;
    }
    public void urunleriGoster(){
        for (Urun gezitem : this.urunler) {
           System.out.println(gezitem); 
        }
        
    }
    public void urunCikar(Urun cikarilacakurun){
        /*int i=0;
        while ( i < urunler.length && this.urunler[i]!=cikarilacakurun ){
            i++;
            
        }
        if(i<urunler.length){
            urunler[i]=null;
        }*/
        for (int i = 0; i < this.urunler.length; i++) {
            if(urunler[i]==cikarilacakurun)
                urunler[i]=null;
        }
    }
    
    public double getToplamTutar(){
        double top=0;
        /*int i=0;
        while ( i < urunler.length && this.urunler[i]!=null ){
            top+= this.urunler[i].getFiyat();
            
        }
        */
        for (Urun gezitem: this.urunler) {
            if(gezitem!=null)
            top += gezitem.getFiyat();
        }
        return top;
    }
}
