package org.kodluyoruz;

/**
 * Bu sınıf bilgisayar donanımları için hazırlanmış bir üst sınıftır.
 *
 * Her donanım için ortak olan 3 özellik vardır:
 *      - Markası (brand) (String türünde) Örnek: AMD, Intel, Nvidia, Samsung vs.
 *      - Fiyatı (price) (double türünde)
 *      - Çalışırken harcayacağı güç (power) (int türünde) Not: 1 ile 150 arasında bir değer verebilirsiniz.
 *
 * TODO Bu 3 özellik ve bunların metotları için gereken kodları bu sınıfın içine yazın
 */
public abstract class Hardware
{
    protected String brand;
    protected double price;
    protected int power;

    public Hardware(String brand, double price, int power) {
        this.brand = brand;
        this.price = price;
        this.power = power;
    }
    public Hardware() {

    }
    public abstract String getBrand();
    public abstract double getPrice();
    public abstract int getPower();

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPower(int power) {
        this.power = power;
    }

}
