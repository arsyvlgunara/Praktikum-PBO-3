package BangunDatar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        int y;

        do {
            System.out.println("Bangun Datar");
            System.out.println("1. Persegi");
            System.out.println("2. Lingkaran");
            System.out.println("3. Persegi Panjang");
            System.out.println("4. Segitiga");
            System.out.println("5. Balok");
            System.out.println("6. Kubus");
            System.out.println("7. Silinder");
            System.out.println("8. Exit");
            System.out.print("Pilih : ");
            x = scan.nextInt();
            switch (x) {
                case 1:
                    double s;
                    Persegi per = new Persegi();
                    System.out.print("Input Sisi: ");
                    s = scan.nextDouble();
                    per.setSisi(s);
                    System.out.print("Luas: " + per.luas());
                    System.out.print("\nKeliling: " + per.keliling());
                    break;
                case 2:
                    double r;
                    Lingkaran ling = new Lingkaran();
                    System.out.print("Input Jari Jari: ");
                    r = scan.nextDouble();
                    ling.setR(r);
                    System.out.print("Luas: " + ling.luas());
                    System.out.print("\nKeliling: " + ling.keliling());
                    break;
                case 3:
                    double p, l;
                    PersegiPanjang pp = new PersegiPanjang();
                    System.out.print("Panjang: ");
                    p = scan.nextDouble();
                    pp.setPanjang(p);
                    System.out.print("Lebar: ");
                    l = scan.nextDouble();
                    pp.setLebar(l);
                    System.out.print("Luas: " + pp.luas());
                    System.out.print("\nKeliling: " + pp.keliling());
                    break;
                case 4:
                    double a, t;
                    Segitiga seg = new Segitiga();
                    System.out.print("Alas: ");
                    a = scan.nextDouble();
                    System.out.print("Tinggi: ");
                    t = scan.nextDouble();
                    seg.setAlas(a);
                    seg.setTinggi(t);
                    System.out.print("Luas: " + seg.luas());
                    System.out.print("\nKeliling: " + seg.keliling());
                    break;
                case 5:
                    double pa, le, ti;
                    Balok bal = new Balok();
                    System.out.print("Panjang: ");
                    pa = scan.nextDouble();
                    bal.setPanjang(pa);
                    System.out.print("Lebar: " + bal.getLebar());
                    le = scan.nextDouble();
                    bal.setLebar(le);
                    System.out.print("Tinggi: ");
                    ti = scan.nextDouble();
                    bal.setTinggi(ti);
                    System.out.print("Volume: " + bal.volume());
                    break;
                case 6:
                    double sisi;
                    Kubus kubus = new Kubus();
                    System.out.print("Sisi: ");
                    sisi = scan.nextDouble();
                    kubus.setSisi(sisi);
                    System.out.println("Volume: " + kubus.volume());
                    break;
                case 7:
                    double jari, tin;
                    Silinder sil = new Silinder();
                    System.out.print("Jari-Jari: ");
                    jari = scan.nextDouble();
                    sil.setR(jari);
                    System.out.print("Tinggi: ");
                    tin = scan.nextDouble();
                    sil.setTinggi(tin);
                    System.out.println("Volume: " + sil.volume());
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Gada cuy");
            }
            System.out.println("Ingin kembali ke menu? (1=Y / 2=N)");
            y = scan.nextInt();
        }while(y==1);
    }
}
