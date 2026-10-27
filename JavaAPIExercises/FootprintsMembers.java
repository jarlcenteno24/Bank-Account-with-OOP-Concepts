import java.util.ArrayList;
import java.util.Iterator;

public class FootprintsMembers {
  public static void main(String[] args) {
    ArrayList<String> members = new ArrayList<String>();
    members.add("Pam");
    members.add("Jhqq");
    members.add("Rhotre");

    Iterator<String> iterator = members.iterator();

    System.out.println("Initial list: " + members);

    while (iterator.hasNext()) {
      String member = iterator.next();
      System.out.println(member);
    }
      if (members.equals("Pam")) {
      iterator.remove();
      }
      
    System.out.println("after removal: of \"Pam\": " + members);
  }
}
