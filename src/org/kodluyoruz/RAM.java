package org.kodluyoruz;

/**
 * Bu sınıf bir RAM'i temsil eder.
 * TODO Bu sınıfı Hardware sınıfının alt sınıfı haline getirin.
 *
 * Her RAM'in Hardware sınıfındakilere ek olarak 2 özelliği vardır:
 *      - Hafıza boyutu (memory) (int türünde) Örnek: 8 GB, 16 GB vs.
 *      - Frekansı (frequency) (int türünde) Örnek: 3200 MHz, 3600 Mhz vs.
 *
 * TODO Bu 2 özellik ve bunların metotları için gereken kodları bu sınıfın içine yazın
 */
public class RAM extends Hardware
{
    protected int memory;
    protected  int frequency;

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }


    @Override
    public String getBrand() {
        return null;
    }

    @Override
    public double getPrice() {
        if (memory > 16) {
            for (int i = 16; i < memory ; i+=4) {
                if (i % 4 == 0){
                    price+=100;
                }
            }
        }

        if (frequency > 3600){
            for (int i = 400; i < frequency; i+=400) {
               if (i % 400 == 0){
                   price+=200;
               }
            }
        }
        return price;
    }

    @Override
    public int getPower() {
        if (power >= 1 && power <= 150) {
            this.power = power;
        }
        else {
            System.out.println("RAM gucu 1 ile 150 arasında olmalidir.");
        }
        return power;
    }

    /*
     * Eğer RAM'in hafızası 16 GB'tan fazlaysa, her 4 GB için fiyatı 100 TL artar.
     * Eğer RAM'in frekansı 3600 MHz'den fazlaysa, her 400 MHz için fiyatı 200 TL artar.
     * TODO buna göre Hardware sınıfındaki fiyat hesaplayan metodu bu sınıfta yeniden yazın
     */

}
