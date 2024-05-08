import types.JenisKelamin;
import types.TipeCuti;

public class Karyawan {
    static int i = 0;
    private String NIK;
    private String nama;
    private JenisKelamin jenisKelamin;
    private int gaji;
    private int jumlahCuti = 12;

    Karyawan(String nama, int gaji, JenisKelamin jenisKelamin) {
        i += 1;
        this.NIK = "K" + i;
        this.nama = nama;
        this.gaji = gaji;
        this.jenisKelamin = jenisKelamin;
    }

    int getTHR() {
        return this.gaji;
    }

    void tambahCuti(int jumlah) {
        this.jumlahCuti += jumlah;
    }

    void tambahCuti(TipeCuti tipe) {
        this.jumlahCuti += (tipe == TipeCuti.PERNIKAHAN ? 2 : this.jenisKelamin == JenisKelamin.PRIA ? 3 : 90);
    }

    String getNIK() {
        return this.NIK;
    }

    String getNama() {
        return this.nama;
    }

    int getGaji() {
        return this.gaji;
    }

    int getJumlahCuti() {
        return this.jumlahCuti;
    }

    void setNIK(String NIK) {
        this.NIK = NIK;
    }
}