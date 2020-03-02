package BangunDatar;

public class Kubus extends Persegi {
    @Override
    public double getSisi() {
        return super.getSisi();
    }

    @Override
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double volume(){
        return (Math.pow(this.sisi, 3));
    }
}
