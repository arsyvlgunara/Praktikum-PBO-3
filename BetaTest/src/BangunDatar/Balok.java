package BangunDatar;

public class Balok extends PersegiPanjang {
    public double tinggi;

    @Override
    public double getPanjang() {
        return super.getPanjang();
    }

    @Override
    public void setPanjang(double panjang) {
        super.setPanjang(panjang);
    }

    @Override
    public double getLebar() {
        return super.getLebar();
    }

    @Override
    public void setLebar(double lebar) {
        super.setLebar(lebar);
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double volume(){
        double pa = panjang;
        double le = lebar;
        double ti = tinggi;
        return pa*le*ti;
    }
}
