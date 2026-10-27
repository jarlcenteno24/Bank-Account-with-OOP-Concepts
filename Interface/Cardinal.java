package Interface;

public class Cardinal implements Interface {
  
  @Override
  public Boolean canFly() {
    return true;
  }

  @Override
  public Boolean canTalk() {
    return false;
  }

  @Override
  public Boolean canSwim() {
    return false;
  }

  public Boolean eatsMeat() {
    return false;
  }
}
