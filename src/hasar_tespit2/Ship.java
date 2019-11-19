/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hasar_Tespit2;

/**
 *
 * @author bmide
 */
import java.util.Scanner;

public class Ship extends Vehicle {
    
    private  int propellerDamage;                                       //Sınıfa özgü özellikler.
    private int bodyDamage;
    private int saleDamage;
    
    Scanner scan2 = new Scanner(System.in);
    
public Ship()                                                           //Parametresiz Gemi Constructer.
{
      super();
}
  
public Ship(String vehicleName , String color , int vehicleModel )      // Parametre Alan Gemi oluşturma constructer'ı. Aynı zamanda overloading
{       
        super(vehicleName , color , vehicleModel );                     
        System.out.println("Gemi Eklendi.\n");
}
  void setDamage()                                                     //Hasar eklemek için bir metod.
  {   
      System.out.println("Pervane Hasarı Giriniz");
      int propellerDamage = scan2.nextInt();
      
      System.out.println("Gövde Hasarı Giriniz");
      int bodyDamage = scan2.nextInt();
      
      System.out.println("Yelken Hasarı Giriniz");
      int saleDamage = scan2.nextInt();
      
      this.propellerDamage = propellerDamage;
      this.bodyDamage = bodyDamage;
      this.saleDamage = saleDamage;
      super.setDamage(propellerDamage+saleDamage+bodyDamage);
      
  } 
  void showDamage()                                                    //Hasar görünütülemek için metod.
  {
      if(super.getDamage() == 0)
          System.out.println("Geminin Hasar Kaydı Bulunmamaktadır.");
      else 
      {
          System.out.println("Pervane Hasarı :"+this.propellerDamage);
          System.out.println("Gövde Hasarı :"+this.bodyDamage);
          System.out.println("Yelken Hasarı :"+this.saleDamage);
          System.out.println("Toplam Hasar :"+super.getDamage());   
      }
      
  }
  void showShipInfos(int num)                                           //Gemi için bilgileri görüntüleyen metod.
    {
          { 
              System.out.print("\n");
              System.out.println("Gemi #"+num);
              System.out.println("Gemi Adı --> "+super.getVehicleName());
              System.out.println("Gemi Rengi --> "+ super.getColor());
              System.out.println("Gemi Modeli --> "+super.getVehicleModel());
              this.showDamage();
          }
          System.out.println("\n");
    }   
 
 
    
}
