/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.pbo2;

/**
 *
 * @author asus
 */
public class PraktikumPBO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* instansiasi obyek -> proses membuat obyek*/
        System.out.println("Keramik 1");
        MenentukanKeramik knv1 = new MenentukanKeramik(1000000, 30, 30, 10, 54000);
        System.out.println("Keramik: " + knv1.hitungKeramik() + " buah");
        System.out.println("Total Box: " + knv1.hitungBox() + " Box");
        System.out.println("Total biaya: " + knv1.hitungBiaya() + " rupiah");
        
        System.out.println("Keramik 2");
        MenentukanKeramik knv2 = new MenentukanKeramik(1000000, 40, 40, 5, 65000);
        System.out.println("Keramik: " + knv2.hitungKeramik() + " buah");
        System.out.println("Total Box: " + knv2.hitungBox() + " Box");
        System.out.println("Total biaya: " + knv2.hitungBiaya() +" rupiah");
        
        System.out.println("Keramik 3");
        MenentukanKeramik knv3 = new MenentukanKeramik(1000000, 40, 30, 8, 60000);
        System.out.println("Keramik: " + knv3.hitungKeramik() + " buah");
        System.out.println("Total Box: " + knv3.hitungBox() + " Box");
        System.out.println("Total biaya: " + knv3.hitungBiaya() + " rupiah");
    }
}