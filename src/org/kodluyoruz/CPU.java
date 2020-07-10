package org.kodluyoruz;

/**
 * Bu sınıf bir işlemciyi temsil eder.
 * TODO Bu sınıfı Hardware sınıfının alt sınıfı haline getirin.
 *
 * Her işlemcinin Hardware sınıfındakilere ek olarak 2 özelliği vardır:
 *      - Çekirdek sayısı (cores) (int türünde)
 *      - Thread sayısı (threads) (int türünde)
 *
 * TODO Bu 2 özellik ve bunların metotları için gereken kodları bu sınıfın içine yazın
 */
public class CPU extends Hardware
{
    private int cores;
    private int threads;

    public CPU(String brand, double price, int power) {
        super(brand, price, power);
    }
    public CPU() {

    }
    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public int getThreads() {
        return threads;
    }

    public void setThreads(int threads) {
        this.threads = threads;
    }
    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public double getPrice() {
        if (cores >= 6) {
            price += price*30/100;
        }
        return price;
    }
    @Override
    public int getPower() {
        if (power >= 1 && power <= 150) {
            this.power = power;
        }
        else {
            System.out.println("CPU'yu gucu 1 ile 150 arasında olmalidir.");
        }
        return power;
    }

    /*
     * Çekirdek sayısı 6 veya daha fazlaysa CPU'nun fiyatı %30 oranında artar.
     * TODO buna göre Hardware sınıfındaki fiyat hesaplayan metodu bu sınıfta yeniden yazın
     */

}
