
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hasar_Tespit2;

import java.util.ArrayList;


/**
 *
 * @author bmide
 */
public class Vehicle {
    
    ArrayList<Car> carArray = new ArrayList();   // Araba nesnelerini içerisinde tutan ArrayList.
    ArrayList<Ship>shipArray = new ArrayList();  // Gemi nesnelerini içerisinde tutan ArrayList.
    
    private String vehicleName;                    //Gemi ve Arabada ortak olan özellikler.
    private String color;
    private int vehicleModel;
    private int totalDamage;
    
    
    
    public Vehicle(String vehicleName , String color , int vehicleModel)
    {
        
        this.vehicleName=vehicleName;
        this.color=color;
        this.vehicleModel=vehicleModel;
        
    }
    public Vehicle()                                         //Parametresiz Taşıt Constructer.
    {
       
    }
    void menu()                                   //Ana menüdeki arayüz için metod.
    {
         System.out.println("[1] -> Taşıt Ekleme ");
         System.out.println("[2] -> Taşıt Görüntüleme ");
         System.out.println("[3] -> Taşıt Silme ");         
         System.out.println("[4] -> Taşıta Hasar Kaydı Girme ");         
         System.out.println("[0] -> Çıkış ");
         System.out.print("Seçiminiz : ");
    }
    void carAdd(Car a)                                      //Araba eklemek için metod.
    {
        carArray.add(a);
    }
    void carRemove(int a)                                   //Araba silmek için metod.
    {
        carArray.remove(a-1);
        System.out.println("Araba Başarıyla Silindi");
    }
    void shipAdd(Ship s)                                    //Gemi Eklemek için metod.
    {
        shipArray.add(s);
    }  
    void shipRemove(int s)                                  //Gemi silmek için metod.
    {
        shipArray.remove(s-1);
        System.out.println("Gemi Başarıylı Silindi");
    }   
    String getVehicleName()                             //Private özellik olan araç adını döndürmek için getter metodu.
    {
        return this.vehicleName;
    }    
     
    String getColor()                                   //Private özellik olan araç rengini döndürmek için getter metodu.
    {
        return this.color;
    }
    
    int  getVehicleModel()                              //Private özellik olan araç modelini döndürmek için getter metodu.
    {
        return this.vehicleModel;
        
    }
    void setDamage(int totalDamage)                     //Private özellik olan araç toplam hasarını değiştirmek için setter metodu.
    {
        this.totalDamage = totalDamage;
    }
    int getDamage()                                     //Private özellik olan araç toplam hasarını döndürmek için getter metodu.
    {
        return this.totalDamage;
    }
           
}