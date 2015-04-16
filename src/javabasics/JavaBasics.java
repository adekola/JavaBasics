/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javabasics.Exercise6.AxeBehavior;
import javabasics.Exercise6.ClubBehavior;
import javabasics.Exercise6.King;
import javabasics.Exercise6.KnifeBehavior;
import javabasics.Exercise6.Knight;
import javabasics.Exercise6.Queen;
import javabasics.Exercise6.SwordBehavior;
import javabasics.Exercise6.Troll;
import javabasics.Exercise6.WeaponBehavior;
import javabasics.exercise1.Car;
import javabasics.exercise1.Customer;
import javabasics.exercise1.Rental;
import javabasics.exercise2.Line;
import javabasics.exercise2.Circle;
import javabasics.exercise2.Point;
import javabasics.exercise2.Triangle;
import javabasics.exercise3.Cage;
import javabasics.exercise3.Elephant;
import javabasics.exercise3.Lion;
import javabasics.exercise3.Zoo;
import javabasics.exercise5.*;
import javabasics.exercise7.BorderColor;
import javabasics.exercise7.BorderFill;
import javabasics.exercise7.Rectangle;
import javabasics.exercise7.Shape;
import javabasics.exercise11.*;
import javabasics.exercise10.ComplexShape;




/**
 *
 * @author kola
 */
public class JavaBasics {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    
    
    public static void main(String[] args) throws ParseException {
        //testRental();
        
       //testShapes();
        
       // testZoo();
        
        //testRestaurants();
       
       //testStrategyPattern();
       
       testFactoryMethod(); 
        
      // testCompositePattern(); 
       //testDecoratorPattern();
    }
    
    private static void testCompositePattern(){
        javabasics.exercise10.Circle c = new javabasics.exercise10.Circle();
        javabasics.exercise10.Rectangle r = new javabasics.exercise10.Rectangle();
                
        ComplexShape cs = new ComplexShape(new javabasics.exercise10.Shape[]{c, r});
        
        System.out.println(cs.Draw());
        System.out.println(cs.getShapeDetails());
    }

    private static void testFactoryMethod(){
       Kennel ken = new Kennel();
       Dog dog;
       String[] dogBreeds = new String[]{"Akita", "Borenji", "BullDog", "GoldenRetriever", "GreyHound"};
       
       for(String s: dogBreeds){
           dog = ken.createDog(s);
           System.out.println(dog.bark());
           System.out.println(dog.wagTail());
           System.out.println(dog.run());
           System.out.println("---------------------------");
       }
    }
    
    
    
    private static void testRestaurants(){
        AfricanMenuItem isi = new AfricanMenuItem("Isiewu", "Goat meat", false, 15.95);
        AfricanMenuItem egu = new AfricanMenuItem("Egusi", "Water melon soup", true, 3.70);
        
        IndianMenuItem korma =  new IndianMenuItem("Chicken Korma", "Spciy soup with some Chicken thrown in", false, 13.50);
        IndianMenuItem dal =  new IndianMenuItem("Dal", "Some nice beans-tasting goodness", true, 6.20);
        
        IndianaCurryMenu iMenu = new IndianaCurryMenu(new IndianMenuItem[]{korma, dal}, 6);
        
        ArrayList<AfricanMenuItem> list =  new ArrayList<>();
        list.add(isi);
        list.add(egu);
        AfricanMenu aMenu = new AfricanMenu(list);
        
        IndianaCurryRestaurant resto = new IndianaCurryRestaurant("City Centre, Lappeenranta", "Everyday until 10pm", iMenu);
        
        AfricanRestaurant afro = new AfricanRestaurant("City Centre, Helsinki", "Everyday except Tuesdays, Until 11pm", aMenu);
        
        Iterator it = afro.getMenu().createIterator();
        
        System.out.println("*****African Menu*******");
        
        while (it.hasNext()){
            System.out.println((AfricanMenuItem)it.next());
        }
        
        System.out.println("@@@@@@@@@Indiana Curry Menu@@@@@@@@@");
        it = resto.getMenu().createIterator();
        while (it.hasNext()){
            System.out.println((IndianMenuItem)it.next());
        }
    }
    
    private static void testZoo() {
        Lion li =  new Lion(4, "Flesh");
        
        Elephant el = new Elephant(4, "Grass");
        
        Cage lionCage = new Cage(3, li);
        Cage eleCage =  new Cage(4, el);
        
        Zoo zoo =  new Zoo(2, new Cage[]{lionCage, eleCage});
        
        System.out.println("Feeding the Animals");
        zoo.feedAnimals();
        
        
        System.out.println("Searching the Cages by Animal");
        
        System.out.println(String.format("%s found in Cage no: %s", li.getClass().getSimpleName(), zoo.searchCage(li)));
        
        System.out.println("Searching the Cages by Id");
        System.out.println(String.format("%s ,  found in Cage no: %s ", zoo.searchCage(3).toString(), 3));
    }

    private static void testRental() throws ParseException {
        // TODO code application logic here
        
        //A first set of instantiations and resevation
        
        Car car = new Car("Toyota", "Camry", 2012, "64tsge", "Yellow");
        
        Customer cus = new Customer("Adekola", "Adebayo", "Ade@kola.com", "7278262");
        
        long now = System.currentTimeMillis();
        
        Date endDate = new SimpleDateFormat("MM/dd/yyyy").parse("02/09/2015");
        
        Rental rent1 =  new Rental(cus, car, new Date(now), endDate);
       
        System.out.println(rent1.toString());
        
        //Another set of instantiations and resevation
        
        Car car1 = new Car("Nissan", "BlueBird", 1997, "Huygee", "Green");

        Customer cus1 = new Customer("Anifowoshe", "Alabi", "028087336", "ade@seun.com");
        
        Rental rent =  new Rental(cus1, car1, new Date(now), endDate);
       
        System.out.println(rent.toString());
    }
    
    private static void testShapes(){
        //Test the point class
        Point p =  new Point(3, 4);
        
        System.out.println(p.toString());
        
        Point x = new Point(4, 5);
        Point y = new Point(6, 8);
        
        Triangle tri =  new Triangle(3, new Point[]{p, x, y});
        
        Circle c =  new Circle(0, null);
        Line li =  new Line(2, new Point[]{x, y});
        
        System.out.println(c.getShapeDetails());
        
    }
    
    private static void testStrategyPattern(){
        King k = new King();
        WeaponBehavior wb = new SwordBehavior();
        k.setWeapon(wb);
        
        Queen q = new Queen();
        wb = new AxeBehavior();
        q.setWeapon(wb);
        
        Troll t = new Troll();
        wb = new ClubBehavior();
        t.setWeapon(wb);
        
        Knight kn = new Knight();
        wb = new KnifeBehavior();
        kn.setWeapon(wb);
        
        
        System.out.println(k.fight());
        System.out.println(q.fight());
        System.out.println(t.fight());
        System.out.println(kn.fight());
        
    }

    private static void testDecoratorPattern(){
        
        Shape rectangle = new Rectangle();
        System.out.println(rectangle.Draw());
        
        BorderFill bf = new BorderFill(rectangle);
        System.out.println(bf.setBorderFill("Dotted"));
        
        BorderColor bc =  new BorderColor(rectangle);
        System.out.println(bc.setBorderColor("Blue"));
        
        
    }

}
