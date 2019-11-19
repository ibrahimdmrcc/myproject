
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

public class Car extends Vehicle {
    
    private int bodyDamage;                                                 //Sınıfa ait özelleikler.
    private int wheelDamage;
    private int doorDamage;
    
    Scanner scan = new Scanner(System.in);
    
  public Car()                                                              //Araba sınıfı için default constructor.
  {
      super();
  }
  
  public Car(String vehicleName , String color , int vehicleModel )         //Araba sınıfı için parametreli constructor.
  {
        
        super(vehicleName , color , vehicleModel );
        System.out.println("Araba Eklendi.\n");
  }
  
  void setDamage()                                                         //Arabaya hasar eklemek için bir metod.
  {   System.out.println("Gövde Hasarı Giriniz");
      int bodyDamage = scan.nextInt();
      
      System.out.println("Tekerlek Hasarı Giriniz");
      int wheelDamage = scan.nextInt();
      
      System.out.println("Kapı Hasarı Giriniz");
      int doorDamage = scan.nextInt();
      
      this.bodyDamage = bodyDamage;
      this.wheelDamage = wheelDamage;
      this.doorDamage = doorDamage;
      super.setDamage(bodyDamage+wheelDamage+doorDamage);
      
  } 
  void showDamage()                                                          //Hasar görüntülemek için bir metod.
  {
      if(super.getDamage() == 0)
          System.out.println("Aracın Hasar Kaydı Bulunmamaktadır.");
      else 
      {
          System.out.println("Gövde Hasarı :"+this.bodyDamage);
          System.out.println("Tekerlek Hasarı :"+this.wheelDamage);
          System.out.println("Kapı Hasarı :"+this.doorDamage);
          System.out.println("Toplam Hasar :"+super.getDamage());   
      }
      
  }         
  void showCarInfos(int num)                                                  //Arabanın bilgilerini görüntülemek için bir metod.
    { 
              System.out.print("\n");
              System.out.println("Araç #"+num);
              System.out.println("Araba Adı --> "+super.getVehicleName());
              System.out.println("Araba Rengi --> "+ super.getColor());
              System.out.println("Araba Modeli --> "+super.getVehicleModel());
              this.showDamage();
              System.out.println("\n");
    } 
  
}