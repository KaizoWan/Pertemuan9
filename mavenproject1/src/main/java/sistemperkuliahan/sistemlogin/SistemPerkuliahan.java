/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemperkuliahan.sistemlogin;

/**
 *
 * @author A-2
 */
public class SistemPerkuliahan {
    private Perkuliahan[] dataPerkuliahans;
    private Dosen[] dataDosens;
    private Mahasiswa[] dataMahasiswas;
    private Staff[] dataStaffs;
    
    public SistemPerkuliahan() {    
    }

    public SistemPerkuliahan(Perkuliahan[] dataPerkuliahans, Dosen[] dataDosens, Mahasiswa[] dataMahasiswas, Staff[] dataStaffs) {
        this.dataPerkuliahans = dataPerkuliahans;
        this.dataDosens = dataDosens;
        this.dataMahasiswas = dataMahasiswas;
        this.dataStaffs = dataStaffs;
    }
    
    
    
}