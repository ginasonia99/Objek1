public class Main {

    public class Main {
        public static void main(String[] args) {
           Mahasiswa murid1=new Mahasiswa();Mahasiswa murid2=new Mahasiswa();Mahasiswa murid3=new Mahasiswa();

            murid1.nama = "ghina";
            murid1.npm  = 18630391;
            murid1.matkul = "pbo";
            murid1.dosen = "Rahman";
            murid1.kelas = 4D;
            murid1.nilai = 80;

            murid1.kuliah();
            murid1.ngerjakantugas();
            murid1.ujian();

            System.out.println(murid1.nilai);
            murid1.ujian();
            System.out.println(murid1.nilai);

        }
    }

}
