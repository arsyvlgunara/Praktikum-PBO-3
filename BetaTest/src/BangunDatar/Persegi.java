package BangunDatar;

public class Persegi extends BangunDatar{
    public double sisi;

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double luas() {

        return this.sisi * this.sisi;
    }

    @Override
    public double keliling() {
        return 4*sisi;
    }
}
