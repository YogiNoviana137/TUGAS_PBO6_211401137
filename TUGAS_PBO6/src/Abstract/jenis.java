//Yogi Noviana 211401137

package Abstract;

/**
 *
 * @author ASUS
 */

import Interface.topik;

// Kelas abstract untuk jenis mata kuliah
public abstract class jenis implements topik {
    protected String nama;
    
    public jenis(String nama) {
        this.nama = nama;
    }
    
    @Override
    public void display() {
        System.out.println("Mata Kuliah: " + nama);
    }
}
