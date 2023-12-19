/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ikiliaramaagacı;
public class Btree {
    Node root;
    public Btree()
    {
        root =null;
    }
    Node newNode (int data)
    {
        root =new Node(data);
        System.out.println(data +"ağaç eklendi");     
        return root;
    }
 //   root =10;
    Node temp=root;
    Node insert (int data)
    {
        if(temp != null)
        {
            if(data < temp.data)
            {
            temp.leftChild.data=data;
            }
            if(data >= temp.data)
            {
            temp.rightChild.data=data;
            }
        }
        else
            root=newNode(data);
         
        return root;
    }
}
