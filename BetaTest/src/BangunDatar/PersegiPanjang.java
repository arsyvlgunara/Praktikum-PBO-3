package BangunDatar;

public class PersegiPanjang extends BangunDatar{
    public double panjang;
    public double lebar;

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double luas(double panjang, double lebar){
        double p = panjang;
        double l = lebar;
        return p*l;
    }

    public double keliling(double panjang, double lebar){
        double p = panjang;
        double l = lebar;
        return 2*(p+l);
    }
}
