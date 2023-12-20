/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package çiftyönlübağlıliste;

/**
 *
 * @author Celal
 */
public class ListeOlustur {

    Node head = null;
    Node tail = null;

    void basaEkle(int x) {
        Node eleman = new Node();
        eleman.data = x;
        if (head == null) {
            head = eleman;
            tail = eleman;
        } else {
            eleman.next = head;
            head.prive = eleman;
            head = eleman;

        }
    }

    void sonaekle(int x) {
        Node eleman = new Node();
        eleman.data = x;
        if (head == null) {
            head = eleman;
            tail = eleman;

        } else {
            tail.next = eleman;
            eleman.prive = tail;
            tail = eleman;

        }
    }

    void arayaEkle(int indis, int deger) {
        Node eleman = new Node();
        eleman.data = deger;
        if (head == null) {
            head = eleman;
            tail = eleman;
        }
        if (head != null && indis == 0) {
            eleman.next = head;
            head.prive = eleman;
            head = eleman;

        } else {
            int n = 0;
            Node temp = head;
            while (temp != null) {
                temp = temp.next;
                n++;
            }
            temp = head;
            if (indis > n) {
                tail.next = eleman;
                eleman.prive = tail;
                tail = eleman;

            } else {
                int i = 0;
                while (i != indis) {
                    temp = temp.next;
                    i++;
                }
                eleman.prive = temp.prive;
                temp.prive.next = eleman;

                eleman.next = temp;
                temp.prive = eleman.next;
            }

        }

    }

    void bastanSil() {
        head=head.next;
    }
    void sondanSil()
    {
    tail=tail.prive;
    tail.next=null;
    
    }
    void aradanSil(int indes)
    {
    Node Dugum1=head;
    Node Dugum2 = head;
    int i=0;
    while(i!=indes)
    {
    Dugum1=Dugum2;
    Dugum2=Dugum2.next;
    i++;
    
    }
    Dugum2.next.prive=Dugum1;
    Dugum1.next=Dugum2.next;
    
    
    }
    void yazdir() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
}
