package tugas1PraktikumPBO;

abstract class Hewan {
    protected String nama;
    protected int umur;

    public Hewan(String nama, int umur) throws UmurError {
        if (umur < 0 || umur > 20) {
            throw new UmurError();
        }
        this.nama = nama;
        this.umur = umur;
    }

    public abstract String Bersuara();

    @Override
    public String toString() {
        return "Nama hewan yaitu " + nama + ", umur " + umur + " tahun, dan " + Bersuara();
    }
}
