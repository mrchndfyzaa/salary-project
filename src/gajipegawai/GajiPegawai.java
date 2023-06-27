/*
Studi Kasus :
Budi seorang mahasiswa FILKOM UB. Dengan penghasilan dari proyek proyek sebelumnya Budi
sekarang membuat sebuah software house sendiri, tetapi hal ini membuat masalah baru untuk Budi.
Budi tidak tahu bagaimana cara membayar semua pegawainya. Budipun membuat program
sederhana untuk menghitung total uang yang harus dibayar untuk gaji pegawainya.

Dalam software house milik Budi terdapat 3 jenis pegawai, 
Programmer, 
Researcher, dan 
Manager.

Setiap pegawai memiliki minimal gaji yaitu Rp. 3.000.000. Programmer terbagi menjadi beberapa
spesialisasi, yaitu 
Programmer Aplikasi, 
Programmer Game dan 
Programmer AI. 

Setiap Programmer
memiliki spesialisasi dan lamaKerja (perjamnya) dalam satu hari. Perhitungan gaji untuk Programmer
seperti berikut :
- Programmer Aplikasi digaji sebesar 3 juta + (lamaKerja * 4 juta)
- Programmer Game digaji sebesar 3 juta + (lamaKerja * 3 juta)
- Programmer AI digaji sebesar 3 juat + (lamaKerja * 5 juta)

Setiap Researcher memiliki total penelitian yang akan menjadi dasar untuk gaji. Researcher digaji
sebesar 3 juta + (total penelitian * 2 juta). Untuk Manager memiliki banyak pekerja yang dimanage,
dan digaji sebesar 3 juta + (banyak pekerja * 1 juta).
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gajipegawai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author march
 */
public class GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String nama;
        List<String> nama_saved = new ArrayList<>(); 
        
        String jabatan;
        String spesialisasi;
        
        System.out.print("Masukkan total pegawai : ");
        int jumlahPegawai = input.nextInt();
        input.nextLine();
        Data pegawaiKantor = new Data(jumlahPegawai);
        
        for (int i = 0; i < jumlahPegawai; i++) {
            System.out.print("Masukkan nama Pegawai ke-" + (i+1) + ": ");
            nama = input.nextLine();
            nama_saved.add(nama);
            System.out.print("Masukkan jabatan Pegawai ke-" + (i+1) + ": ");
            jabatan = input.nextLine();
            switch(jabatan){
                case "Programmer" -> {
                    System.out.print("Masukkan Spesialisasi Programmer ke-" + (i+1) + ": ");
                    spesialisasi = input.nextLine();
                    pegawaiKantor.setPegawai(new Programmer(nama, spesialisasi));
                }
                case "Researcher" -> {
                    pegawaiKantor.setPegawai(new Researcher(nama));
                }
                case "Manager" -> {
                    pegawaiKantor.setPegawai(new Manager(nama));
                }
            }
        }
        System.out.println("");
        System.out.println("======================");
        System.out.println("Hasil: ");
        pegawaiKantor.getData(nama_saved.get(0));
    }
    
}

class Data{
    private DataPegawai[] Pegawai;
    private int jumlahPegawai = 0;
    
    Data(){
        
    }
    
    Data(int jumlahPegawai){
        Pegawai = new DataPegawai[jumlahPegawai];
    }
    
    public void setPegawai(DataPegawai pegawaiFilkom){
        Pegawai[jumlahPegawai] = pegawaiFilkom;
        jumlahPegawai++;
    }
    
    public void getData(String nama){
        List<String> nama_saved = new ArrayList<>();

        for (DataPegawai Pegawai1 : Pegawai) {
            nama_saved.add(Pegawai1.toString());
        }
        
        for(String getNama : nama_saved) {
            System.out.println(getNama);
        }
    }
}
