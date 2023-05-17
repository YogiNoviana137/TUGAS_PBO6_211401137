//Yogi Noviana 211401137

package Class_Fitur;

/**
 *
 * @author ASUS
 */
import Interface.topik;

// Kelas inner untuk fitur kuliah
public class fitur implements topik {
    private String nama;
    
    public fitur(String nama) {
        this.nama = nama;
    }
    
    @Override
    public void belajar() {
        System.out.println(" ");
        System.out.println("Mempelajari " + nama + " pada kuliah.");
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("Ini adalah informasi tentang mata kuliah " + nama + ".");
    }
    
    @Override
    public void display() {
        System.out.println("Fitur Kuliah: " + nama);
    }
}
