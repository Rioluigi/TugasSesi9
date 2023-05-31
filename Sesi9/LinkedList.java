/*
Nama    = Rio Luigi Del Niery
NIM     = 20220040120
Class   = TI22J
 */
public class LinkedList {
    simpul head = null, posisi, pendahulu;

    public void isiData(String nim, String nama, int nilai) {
        simpul ptrBaru = new simpul(nim, nama, nilai);
        ptrBaru.berikutnya = head;
        head = ptrBaru;
    }

    public void tampilkan() {
        System.out.println("Isi Linked List");
        simpul penunjuk = head;
        while (penunjuk != null) {
            penunjuk.infoData();
            penunjuk = penunjuk.berikutnya;
        }
    }

    public boolean findData(String x) {
        posisi = head;
        pendahulu = null;
        boolean ditemukan = false;

        while (posisi != null) {
            String nama = posisi.nama;
            if (nama.compareTo(x) == 0) {
                ditemukan = true;
                break;
            }
            pendahulu = posisi;
            posisi = posisi.berikutnya;
        }
        return ditemukan;
    }

    public boolean hapusData(String x) {
        pendahulu = null;
        posisi = head;
        boolean ditemukan = findData(x);

        if (!ditemukan) {
            System.out.println("Data yang akan dihapus tidak ditemukan");
            return false;
        }

        if (pendahulu == null) {
            head = head.berikutnya;
        } else if (posisi.berikutnya == null) {
            pendahulu.berikutnya = null;
        } else {
            pendahulu.berikutnya = posisi.berikutnya;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList mahasiswa = new LinkedList();

        mahasiswa.isiData("20220040120", "Rio", 90);
        mahasiswa.isiData("20220040269", "Azril", 85);
        mahasiswa.isiData("20220040275", "Gilang", 100);
        mahasiswa.hapusData("Azriel");
        mahasiswa.tampilkan();
    }

    class simpul {
        String nim;
        String nama;
        int nilai;
        simpul berikutnya;

        public simpul(String nim, String nama, int nilai) {
            this.nim = nim;
            this.nama = nama;
            this.nilai = nilai;
            this.berikutnya = null;
        }

        public void infoData() {
            System.out.println("NIM: " + nim + ", Nama: " + nama + ", Nilai: " + nilai);
        }
    }
}