/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main4;

/**
 *
 * @author MOKLET-2
 */
public class Main4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Anak obj = new Anak(); // Objek untuk memanggil class Anak
        
        obj.judul("              PROGRAM DATA SISWA                 "); // Nilai dari method judul
        obj.biodata("Cansevva Argata", 1245, 11, "MIPA 2"); // Nilai dari method biodata
        obj.biodata("Adin", 1245, 11, "MIPA 2", "SMAN 1 CANDRAWAKALA"); // Nilai method biodata
        obj.nilai(96, 92, 94); // Nilai dari method nilai
        obj.nilai(96, 92, 94, 97); // Nilai dari method nilai
        obj.rataRata(96, 92, 94); // Nilai dari method rata-rata
        obj.rataRata(96, 92, 94, 97); // Nilai dari method rata-rata   
    }   
}
