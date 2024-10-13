/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

/**
 *
 * @author Admin
 */
public class AuthorItem {
    int id;
    String name;
        
    public AuthorItem(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    @Override
    public String toString(){
        return name;
    }
}
