/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.indri.latihanmvc.controller;

import edu.indri.latihanmvc.model.PelangganModel;
import edu.indri.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author Nama : Indri Yuliyanti
 *         NIM  : 10115109
 *         KELAS: PBOULANG PERT 12
 */
public class PelangganController {
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    
    
    
  public void resetForm(PelangganView view){
      String Nama = view.getTxtNama().getText();
      String Email = view.getTxtEmail().getText();
      String Notelp = view.getTxtTelp().getText();
      
      if(Nama.equals("") && Email.equals("") && Notelp.equals("")){
      } else {
          model.resetForm();
      }
  }
  
  public void simpanForm(PelangganView view){
      
      String Nama = view.getTxtNama().getText();
      String Email = view.getTxtEmail().getText();
      String Notelp = view.getTxtTelp().getText();
      
      if(Nama.trim().equals("")){
          JOptionPane.showMessageDialog(view, "Nama masih kosong");
      }
      
      else if (Email.trim().equals("")){
          JOptionPane.showMessageDialog(view, "Email masih Kosong");
      }
      else if(Notelp.trim().equals("")){
          JOptionPane.showMessageDialog(view, "notelpon masih kosong");
      }
      else{
          model.simpanForm();
          
      }
  }  
}
