import types.JenisKelamin;
import types.TipeCuti;
import types.TipeKantor;

public class Main {
    public static void main(String[] args) {
        Karyawan aziz = new Karyawan("Aziz", 10000000, JenisKelamin.PRIA);
        Manager nur = new Manager("Nur", 20000000, JenisKelamin.PRIA, TipeKantor.PUSAT);

        Salesman sales1 = new Salesman("Sales1", 5000000, JenisKelamin.PRIA);
        sales1.setTarget(20);
        sales1.setPenjualan(22);

        Salesman sales2 = new Salesman("Sales2", 5000000, JenisKelamin.WANITA);
        sales2.setTarget(20);
        sales2.setPenjualan(5);

        System.out.println(aziz.getNIK());
        System.out.println(nur.getNIK());
        System.out.println(sales1.getNIK());
        System.out.println(sales2.getNIK());

        System.out.println(aziz.getTHR());
        System.out.println(nur.getTHR());
        System.out.println(sales1.getTHR());
        System.out.println(sales2.getTHR());

        aziz.tambahCuti(5);
        System.out.println(aziz.getJumlahCuti());

        nur.tambahCuti(TipeCuti.PERNIKAHAN);
        System.out.println(nur.getJumlahCuti());

        sales1.tambahCuti(TipeCuti.PERSALINAN);
        System.out.println(sales1.getJumlahCuti());

        sales2.tambahCuti(TipeCuti.PERSALINAN);
        System.out.println(sales2.getJumlahCuti());
    }
}