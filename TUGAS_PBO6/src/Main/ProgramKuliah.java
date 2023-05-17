//Yogi Noviana 211401137

package Main;

/**
 *
 * @author ASUS
 */
import Interface.topik;
import Abstract.jenis;
import Class_Fitur.fitur;

public class ProgramKuliah {
    public static void main(String[] args) {
        topik matkul1 = new jenis("Pemrograman Berorientasi Objek (PBO)") {
            @Override
            public void belajar() {
                System.out.println("Mempelajari konsep, prinsip, dan teknik dalam pemrograman berbasis objek.");
            }
            
            @Override
            public void tampilkanInfo() {
                System.out.println("Ini adalah informasi tentang mata kuliah Pemrograman Berorientasi Objek (PBO).");
            }
        };
        
        topik matkul2 = new fitur("Jaringan Komputer");
        
        matkul1.belajar();
        matkul1.tampilkanInfo();
        matkul1.display();
        
        matkul2.belajar();
        matkul2.tampilkanInfo();
        matkul2.display();
    }
}
