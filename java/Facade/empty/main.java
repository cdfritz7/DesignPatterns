import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class main{
  public static void main(String[] args){
    System.out.println("Running test");

    Facade my_facade = new Facade();
    String cur_time = my_facade.get_time();
    System.out.println("The Current Time is : " + cur_time);

    DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
    LocalDateTime sys_time = LocalDateTime.now();
    String sys_time_str = sys_time.format(formatter).substring(11, 19);

    assert cur_time.equals(sys_time_str) : "Facade time not equal to system time";

    System.out.println("passed test");
  }
}
