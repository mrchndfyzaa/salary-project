/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gajipegawai;

/**
 *
 * @author march
 */
public abstract class DataPegawai {
    private int gajiAwal;
    private int totalGaji = 0;
    private String nama;
    
    DataPegawai(){
        
    }
    
    DataPegawai(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public double getGajiAwal(){
        return gajiAwal = 3000000;
    }
    
    public int getTotalGaji(int gaji){
        return totalGaji =+ gaji;
    }
    
    @Override
    public String toString(){
        return "\nNama  : " + getNama();
    }   
}

class Programmer extends DataPegawai{
    private int gaji;
    private String jabatanProgrammer;
    private int lamaKerja;
    
    Programmer(){
        
    }
    
    Programmer(String nama, String jabatanProgrammer){
        super(nama);
        super.getTotalGaji(gaji);
        this.jabatanProgrammer = jabatanProgrammer;   
    }
    
    public int getLamaKerja(){
        lamaKerja = (int) (10 * Math.random() + 0);
        return lamaKerja;
    }
    
    
    public int getTotalGaji(){
        if(jabatanProgrammer.equalsIgnoreCase("Programmer Aplikasi")){
            gaji = (int) (super.getGajiAwal() + (getLamaKerja() * 4000000));
        }
        else if(jabatanProgrammer.equalsIgnoreCase("Programmer Game")){
            gaji = (int) (super.getGajiAwal() + (getLamaKerja() * 3000000));
        }
        else if(jabatanProgrammer.equalsIgnoreCase("Programmer AI")){
            gaji = (int) (super.getGajiAwal() + (getLamaKerja() * 5000000));
        }
        return gaji;
    }
    
    @Override
    public String toString(){
        return "\nJabatan   : " + jabatanProgrammer + super.toString() + "\nGaji   : " + getTotalGaji();
    }
}

class Researcher extends DataPegawai{
    private int gaji;
    private int totalPenelitian;
    
    Researcher(){
        
    }
    
    Researcher(String nama){
        super(nama);
        super.getTotalGaji(gaji);
    }
    
    public int getTotalPenelitian(){
        totalPenelitian = (int) (10 * Math.random() + 0);
        return totalPenelitian;
    }
    
    public int getTotalGaji(){
        gaji = (int) (super.getGajiAwal() + (getTotalPenelitian() * 2000000));
        return gaji;
    }
    
    @Override
    public String toString(){
        return "\nJabatan   : Researcher" + super.toString() + "\nGaji   : " + getTotalGaji();
    }
}

class Manager extends DataPegawai{
    private int gaji;
    private int banyakPekerja;
    
    Manager(){
        
    }
    
    Manager(String nama){
        super(nama);
        super.getTotalGaji(gaji);
    }
    
    public int getBanyakPekerja(){
        banyakPekerja = (int) (10 * Math.random() + 0);
        return banyakPekerja;
    }
    
    public int getTotalGaji(){
        gaji = (int) (super.getGajiAwal() + (getBanyakPekerja() * 1000000));
        return gaji;
    }
    
    @Override
    public String toString(){
        return "\nJabatan   : Manager" + super.toString() + "\nGaji   : " + getTotalGaji();
    }
}
