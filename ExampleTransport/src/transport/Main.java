package transport;

// import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class Main
{
  private static List<AbstractVehicle> filterVehicles(List<AbstractVehicle> theList, CheckVehicle tester)
  {
    List<AbstractVehicle> tempList = new ArrayList<>();

    for (AbstractVehicle v : theList)
    {
      if (tester.test(v))
      {
        tempList.add(v);
      }
    }

    return tempList;
  }

  public static void main(String[] args)
  {
    System.out.println("Lesson 2!");
    System.out.println("\n*** WORKING WITH INTERFACES ***");

    Horse seabiscuit = new Horse("Seabiscuit");
    Horse affirmed = new Horse("Affirmed");
    Horse joe = new Horse("Joe");

    seabiscuit.eat(10);
    affirmed.eat(25);

    for (int i = 0; i < 3; i++)
    {
      seabiscuit.move();
    }

    System.out.println(seabiscuit.getName() + " " + seabiscuit.getFuelLevel());

    System.out.println("\n\n*** WORKING WITH ABSTRACT CLASSES ***");

    HorseFromAbstract secretariat = new HorseFromAbstract("Secretariat", 10);
    secretariat.addFuel(10);

    HorseFromAbstract eclipse = new HorseFromAbstract("Eclipse");
    eclipse.move(10);

    HorseFromAbstract trigger = new HorseFromAbstract("Trigger", 10);

    HorseFromAbstract seattleSlew = new HorseFromAbstract("Seattle Slew", 10);

    HorseFromAbstract americanPharoah = new HorseFromAbstract("American Pharoah", 10);

    Auto vw = new Auto(1, "EuroVan", 2000);
    Auto toyota = new Auto(10, "Tundra", 1998);
    Auto honda = new Auto(5, "Accord", 2003);

    vw.move();
    vw.move(5);

    // ArrayList - must tell it what the elements/types are . . .
    List<AbstractVehicle> myList = new ArrayList<>();
    myList.add(secretariat);
    myList.add(eclipse);
    myList.add(trigger);
    myList.add(seattleSlew);
    myList.add(americanPharoah);
    myList.add(vw);
    myList.add(toyota);
    myList.add(honda);

    System.out.println("\n*** Lists ***");
    System.out.println(myList);

    System.out.println("\n*** LAMBDA EXPRESSIONS ***");
    System.out.println("\n*** Sorting List ***");
    myList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
    myList.forEach((v) -> System.out.println(v.getName()));
    System.out.println();
    myList.sort((v1, v2) -> v1.getFuelLevel() - v2.getFuelLevel());
    myList.forEach((v) -> System.out.println(v));

    System.out.println("\n*** Filtering List ***");
    List<AbstractVehicle> filteredList = new ArrayList<>();

    filteredList = filterVehicles(myList, (v) -> v.getFuelLevel() < 0);
    filteredList.forEach((v) -> System.out.println(v));

    System.out.println();
    // Getting vehicles that have fuel > 0 AND are from the class HorseFromAbstract
    filteredList = filterVehicles(myList, (v) -> (v.getFuelLevel() > 0) && (v instanceof HorseFromAbstract));
    filteredList.forEach((v) -> System.out.println(v));
  }
}
