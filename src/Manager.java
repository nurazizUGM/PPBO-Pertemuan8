import types.JenisKelamin;
import types.TipeKantor;

public class Manager extends Karyawan {
    protected TipeKantor kantor;

    Manager(String nama, int gaji, JenisKelamin jenisKelamin, TipeKantor kantor) {
        super(nama, gaji, jenisKelamin);
        this.setNIK("M" + i);
        this.kantor = kantor;
    }

    int getTHR() {
        return this.getGaji() * 2 + (this.kantor == TipeKantor.PUSAT ? this.getGaji() : this.getGaji() / 2);
    }
}
