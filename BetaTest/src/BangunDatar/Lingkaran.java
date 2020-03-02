package BangunDatar;

public class Lingkaran extends BangunDatar{
    public final double phi = 3.14;
    public double r;

    public double getPhi() {
        return phi;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double luas(double r){
        return (float) (phi * Math.pow(this.r, 2));
    }

    public double keliling(double r){
        return (float) phi*2*r;
    }
}
