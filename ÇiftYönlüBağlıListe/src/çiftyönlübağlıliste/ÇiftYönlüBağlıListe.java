/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package çiftyönlübağlıliste;

/**
 *
 * @author Celal
 */
public class ÇiftYönlüBağlıListe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ListeOlustur liste=new ListeOlustur();
        liste.basaEkle(5);
        liste.basaEkle(89);
        liste.sonaekle(65);
        liste.sonaekle(88);
        liste.arayaEkle(2, 3);
        liste.arayaEkle(0, 156);
        liste.bastanSil();
       // liste.sondanSil();
       //liste.aradanSil(1);
        liste.yazdir();
        
    }
    
}
