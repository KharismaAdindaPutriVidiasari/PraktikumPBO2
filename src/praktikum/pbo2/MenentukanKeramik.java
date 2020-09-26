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
public class MenentukanKeramik {
    /* membuat atribut*/
    int luas;
    int panjang;
    int lebar;
    int isibox;
    int harga;
    
    //construct
    MenentukanKeramik(int L, int p, int l, int i, int h){
        this.luas = L;
        this.panjang = p;
        this.lebar = l;
        this.isibox = i;
        this.harga = h;
    }
    
    /*membuat methods*/
    int hitungKeramik (){
        int keramik;
        keramik=this.luas / (this.panjang * this.lebar);
        return keramik;
    }
    int hitungBox(){
        int box;
        box = (this.luas / (this.panjang * this.lebar)) / this.isibox;
        return box;
    }
    int hitungBiaya(){
        int biaya;
        biaya = ((this.luas / (this.panjang * this.lebar))) / this.isibox * this.harga;
        return biaya;
    }
}
