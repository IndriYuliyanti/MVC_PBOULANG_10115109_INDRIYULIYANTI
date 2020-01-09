/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.indri.latihanmvc.model;

import edu.indri.latihanmvc.event.PelangganListener;
import javax.swing.JOptionPane;


/**
 *
 * @author Nama : Indri Yuliyanti
 *         NIM  : 10115109
 *         KELAS: PBOULANG PERT 12
 */
public class PelangganModel {
    
    private String Nama;
    private String Email;
    private String Notelp;

    private PelangganListener pelangganlistener;

    public PelangganListener getPelangganlistener() {
        return pelangganlistener;
    }

    public void setPelangganlistener(PelangganListener pelangganlistener) {
        this.pelangganlistener = pelangganlistener;
    }
    
    
    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
        fireOnChange();
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
        fireOnChange();
    }

    public String getNotelp() {
        return Notelp;
    }

    public void setNotelp(String Notelp) {
        this.Notelp = Notelp;
        fireOnChange();
    }
    
    protected void fireOnChange(){
    if(pelangganlistener !=null){
      pelangganlistener.onChange(this);
    }
}
    public void resetForm(){
        setNama("");
        setEmail("");
        setNotelp("");
        
    }
    
    public void simpanForm(){
        JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        resetForm();
    }
  
}