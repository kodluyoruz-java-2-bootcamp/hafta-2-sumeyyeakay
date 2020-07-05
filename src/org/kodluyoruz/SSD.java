package org.kodluyoruz;

/**
 * Bu sınıf bir SSD'yi temsil eder.
 * TODO Bu sınıfı Hardware sınıfının alt sınıfı haline getirin.
 *
 * Her SSD'nin Hardware sınıfındakilere ek olarak 1 özelliği vardır:
 *      - Hafıza boyutu, GB cinsinden (memory) (int türünde) Örnek: 500 GB, 750 GB vs.
 *
 * TODO Bu özellik ve metotları için gereken kodları bu sınıfın içine yazın
 */
public class SSD extends Hardware
{
    protected  int memory;

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public SSD(String brand, double price, int power) {
        super(brand, price, power);
    }

    public SSD() {
    }

    @Override
    public String getBrand() {
        return brand;
    }
//9763,37
    @Override
    public double getPrice() {
        if (memory > 750){
            for (int i = 750; i < memory; i+=250) {
                if ((memory - i) >= 250 && i % 250 == 0){
                    price+=275;
                }
            }
        }
        return price;
    }

    @Override
    public int getPower() {
      return power;
    }
    /*
     * Eğer SSD'nin hafızası 750 GB'tan fazlaysa, her 250 GB için fiyatı 275 TL artar.
     * TODO buna göre Hardware sınıfındaki fiyat hesaplayan metodu bu sınıfta yeniden yazın
     */

}
