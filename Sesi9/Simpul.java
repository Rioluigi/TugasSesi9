public class Simpul {
    String nim;
    String nama;
    int nilai;
    simpul berikutnya;

    public simpul(String xnim, String xnama, int xnilai){
        nim = xnim;
        nama = xnama;
        nilai = xnilai;
        berikutnya = null;
    }

    public void infoData(){
        System.out.println("NIM : " + nim);
        System.out.println("NAMA : " + nama);
        System.out.println("NILAI : " + nilai);
        System.out.println("Pointer Next " + berikutnya);
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        // Create and test instances of the simpul class
        simpul data1 = new simpul("20220040120", "Rio", 90);
        data1.infoData();

        simpul data2 = new simpul("20220040275", "Gilang", 85);
        data2.infoData();
    }
}