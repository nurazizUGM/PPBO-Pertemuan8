import types.JenisKelamin;

public class Salesman extends Karyawan {
    private int target = 0;
    private int penjualan = 0;

    Salesman(String nama, int gaji, JenisKelamin jenisKelamin) {
        super(nama, gaji, jenisKelamin);
        this.setNIK("S" + i);
    }

    int getTHR() {
        return this.penjualan >= this.target ? this.getGaji() * 2 : this.getGaji();
    }

    void setTarget(int target) {
        this.target = target;
    }

    void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }
}
