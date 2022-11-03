/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2;
import javax.swing.JOptionPane;
/**
 *
 * @author RIDS
 */
public class Pangkat {
    private int angka;
    private int hasil;
    
    public int getAngka() {
        return angka;
    }
    
    public void setAngka(int angka) {
        this.angka = angka;
    }
    
    public void pangkat() {
        JOptionPane.showMessageDialog(null, "Menghitung pangkat 2");
        String input1 = JOptionPane.showInputDialog("Masukkan angka : ");
        int nilai1 = Integer.parseInt(input1);
        hasil = nilai1 * nilai1;
        JOptionPane.showMessageDialog(null, "pangkat 2 dari "+nilai1+"Adalah " + hasil);
    }
}
