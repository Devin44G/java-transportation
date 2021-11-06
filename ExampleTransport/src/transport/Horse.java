package transport;

// Child class
public class Horse implements Animal, Vehicle
{
  // Declaring Properties
  private int fuel = 0;
  private String name;

  public Horse(String name)
  {
    this.name = name;
  }

  // Implementing interface methods
  @Override
  public void move()
  {
    fuel--;
  }

  @Override
  public void eat(int i)
  {
    fuel += i;
  }

  @Override
  public String speak()
  {
    return "Neigh";
  }

  @Override
  public String getPath()
  {
    return "Grass";
  }

  @Override
  public int getFuelLevel()
  {
    return fuel;
  }

  @Override
  public void addFuel(int i)
  {
    eat(i);
  }

  // Getters / Setters

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  @Override
  public String toString()
  {
    return "Horse name: " + name + "; fuel: " + fuel;
  }
}
