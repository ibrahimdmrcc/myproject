package Hasar_Tespit2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bmide
 */
import java.util.Scanner;
public class Hasar_Tespit2 {
    
    public static void main(String[] args) {
        
     
      Vehicle vehicle = new Vehicle();
      Scanner scan = new Scanner(System.in);
      for(;;)
      {
         vehicle.menu();
         int choose = scan.nextInt();

          if(choose == 0) 
              break;
          
          
          switch(choose)
          {
              case 1 :
                  System.out.println("[1] -> Araba Ekleme ");
                  System.out.println("[2] -> Gemi Ekleme ");
                  System.out.print("--> ");
                  int chooseAdd = scan.nextInt();
                  switch(chooseAdd)
                  {
                      case 1:
                          
                          System.out.print("Araç Adını Giriniz : ");
                          scan.nextLine();
                          String carname = scan.nextLine();
                          
                          System.out.print("Araç Rengini Giriniz : ");
                          String carcolor = scan.nextLine();
                          
                          System.out.print("Araç Modelini Giriniz : ");
                          int carage = scan.nextInt();
                          
                          Car car1 = new Car(carname , carcolor , carage);
                          vehicle.carAdd(car1);
                          
                          break;
                      case 2:
                          
                          System.out.print("Geminin Markasını Giriniz : ");
                          scan.nextLine();
                          String shipname = scan.nextLine();
                          
                          System.out.print("Gemi Rengini Giriniz : ");
                          String shipcolor = scan.nextLine();
                          
                          System.out.print("Gemi Modelini Giriniz : ");
                          int shipage = scan.nextInt();
                          
                          Ship ship1 = new Ship(shipname , shipcolor , shipage);
                          vehicle.shipAdd(ship1);
                          break;
                  }
                  
                  break;
                  
              case 2:
                  System.out.println("[1] -> Arabaları Görüntüle ");
                  System.out.println("[2] -> Gemileri Görüntüle ");
                  System.out.print("--> ");
                  int chooseShow = scan.nextInt();
                  switch(chooseShow)
                  {
                      case 1:
                          if(vehicle.carArray.size() == 0)
                            {  
                              System.out.println("Araba Bulunmamaktadır.\n\n");
                              break;
                            }
                          
                           int number = 1;
                           for(Car a : vehicle.carArray)
                            {   
                                a.showCarInfos(number);
                                number++;
                            }
                          break;
                      case 2:
                           if(vehicle.shipArray.size() == 0)
                            {  
                              System.out.println("Gemi Bulunmamaktadır.\n\n");
                              break;
                            }
                          int number1 = 1;
                          for(Ship s : vehicle.shipArray)
                          {
                              s.showShipInfos(number1);
                              number1++;
                          }
                          break;
                  }
                  break;
              case 3:
                  System.out.println("[1] -> Araba Silme ");
                  System.out.println("[2] -> Gemi Silme ");
                  System.out.print("--> ");
                  int chooseRemove = scan.nextInt();
                  switch(chooseRemove)
                  {
                      case 1:
                          int number = 1;
                          for(Car a : vehicle.carArray)
                            { 
                                a.showCarInfos(number);                                
                                number++;
                            }
                          System.out.print("Silmek İstediğiniz Araç Numarasını Giriniz :");
                          int remNumCar = scan.nextInt();
                          vehicle.carRemove(remNumCar);
                          break;
                      case 2:
                          int number1 = 1;
                          for(Ship s : vehicle.shipArray)
                          {
                              s.showShipInfos(number1);
                              number1++;
                          }
                          System.out.print("Silmek İstediğiniz Araç Numarasını Giriniz :");
                          int remNumShip = scan.nextInt();
                          vehicle.shipRemove(remNumShip);
                          break;
                          
                  }
                  break;
              case 4:
                  System.out.println("[1] -> Arabaya Hasar Kaydı Gir ");
                  System.out.println("[2] -> Gemiye Hasar Kaydı  Gir ");
                  System.out.print("--> ");
                  int chooseDamage = scan.nextInt();
                  switch(chooseDamage)
                  {
                      case 1:
                          int number = 1;
                          for(Car a : vehicle.carArray)
                            { 
                                a.showCarInfos(number);
                                number++;
                            }
                          System.out.print("Hasar Girmek İstediğiniz Araç No'su Giriniz :");
                          int damageNumCar = scan.nextInt();
                           Car c= vehicle.carArray.get(damageNumCar-1);
                           c.setDamage();
                          break;
                      case 2:
                          int number1 = 1;
                          for(Ship s : vehicle.shipArray)
                            { 
                                s.showShipInfos(number1);
                                number1++;
                            }
                          System.out.print("Hasar Girmek İstediğiniz Gemi No'su Giriniz :");
                          int damageNumShip = scan.nextInt();
                          Ship s = vehicle.shipArray.get(damageNumShip-1);
                          s.setDamage();
                          break;
                          
                  }
                  break;
                  
                  
          }
      }
     
            
        
    }   
}