package BangunDatar;

public class Segitiga extends BangunDatar{
    public double alas;
    public double tinggi;

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double luas(double alas, double tinggi){
        return (alas*tinggi)/2;
    }

    public double keliling(double alas){
        return 3*alas;
    }
}
