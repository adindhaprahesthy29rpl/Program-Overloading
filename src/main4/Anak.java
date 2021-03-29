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
// Class Anak
public class Anak {
    
    // Method untuk judul
    public void judul (String judul){ 
        System.out.println(" "+judul);
    }
    
    // Method untuk biodata
    public void biodata (String nama, int noInduk, int kelas, String jurusan){ // Parameter
        System.out.println("Nama     : "+nama);
        System.out.println("No Induk : "+noInduk);
        System.out.println("Kelas    : "+kelas);
        System.out.println("Kelas    : "+jurusan);
    }
    
    // Method untuk biodata
    public void biodata (String nama, int noInduk, int kelas, String jurusan, String Sekolah){ // Parameter
        System.out.println("Sekolah  : "+Sekolah);
    }
    
    // Method untuk nilai
    public void nilai (int nilaiMm, int nilaiBi, int nilaiIpa){ // Parameter
        System.out.println("Nilai Matematika  : "+nilaiMm);
        System.out.println("Nilai B.Indonesia : "+nilaiBi);
        System.out.println("Nilai IPA         : "+nilaiIpa);
    }
    
    // Method untuk nilai
    public void nilai (int nilaiMm, int nilaiBi, int nilaiIpa, int nilaiBig){ // Parameter
        System.out.println("Nilai B.Inggris   : "+nilaiBig);
    }
    
    // Method untuk rata-rata
    public void rataRata (int nilaiMm, int nilaiBi, int nilaiIpa){ // Parameter
        System.out.println("Nilai Rata-Rata 3 Mata Pelajaran : "+(nilaiMm+nilaiBi+nilaiIpa/3)); // Menghitung rata-rata 3 mapel
    }
    
    // Method untuk rata-rata
    public void rataRata (int nilaiMm, int nilaiBi, int nilaiIpa, int nilaiBig){ // Parameter
        System.out.println("Nilai Rata-Rata 4 Mata Pelajaran : "+(nilaiMm+nilaiBi+nilaiIpa+nilaiBig/4)); // Menghitung rata-rata 4 mapel
    }
}
