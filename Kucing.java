package tugas1PraktikumPBO;

public class Kucing extends Hewan implements Peliharaan {
    public Kucing(String nama, int umur) throws UmurError {
        super(nama, umur);
    }

    @Override
    public String Bersuara() {
        return "Mengeong";
    }

    @Override
    public String toString() {
        return "Nama Kucing yaitu " + nama + ", umur " + umur + " tahun, dan " + Bersuara();
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public void play() {
        System.out.println("Bermain bersama " + nama);
    }
}
