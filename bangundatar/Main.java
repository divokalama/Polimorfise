package bangundatar;

public class Main {
    public static void main(String[] args) {
        
        bangundatar bangunDatar = new bangundatar();
        persegi persegi1 = new persegi(4);
        segitiga segitiga1 = new segitiga(6, 3);
        lingkaran lingkaran1 = new lingkaran(50);
        
        // memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();
        
        System.out.println("Luas persegi: " + persegi1.luas());
        System.out.println("keliling persegi: " + persegi1.keliling());
        System.out.println("Luas segitiga: " + segitiga1.luas());
        System.out.println("Luas lingkaran: " + lingkaran1.luas());
        System.out.println("keliling lingkaran: " + lingkaran1.keliling());
    }
}