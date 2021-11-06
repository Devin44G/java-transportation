package transport;

public class HorseFromAbstract extends AbstractVehicle
{
  private String name;

  public HorseFromAbstract(String name, int fuel)
  {
    super(fuel);
    this.name = name;
  }

  public HorseFromAbstract(String name)
  {
    this.name = name;
  }

  @Override
  public String getPath()
  {
    return "Grass";
  }

  @Override
  public String getName()
  {
    return name;
  }

  @Override
  public String toString()
  {
    return "HorseFromAbstract name: " + name + "; fuel: " + fuel;
  }
}
