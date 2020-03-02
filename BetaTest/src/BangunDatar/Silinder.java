package BangunDatar;

public class Silinder extends Lingkaran {
    public double tinggi;

    @Override
    public double getPhi() {
        return super.getPhi();
    }

    @Override
    public double getR() {
        return super.getR();
    }

    @Override
    public void setR(double r) {
        super.setR(r);
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double volume(){
        return (double) (phi * Math.pow(this.r, 2)*tinggi);
    }

}
