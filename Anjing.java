package tugas1PraktikumPBO;

public class Anjing extends Hewan implements Peliharaan {
    public Anjing(String nama, int umur) throws UmurError {
        super(nama, umur);
    }

    @Override
    public String Bersuara() {
        return "Menggonggong";
    }

    @Override
    public String toString() {
        return "Nama Anjing yaitu " + nama + ", umur " + umur + " tahun, dan " + Bersuara();
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
