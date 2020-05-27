import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//class for getting the seconds portion of the current time
class Seconds{
  public String get(){
    DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
    LocalDateTime my_time = LocalDateTime.now();
    return my_time.format(formatter).substring(17, 19);
  }
}

//class for getting the minutes portion of the current time
class Minutes{
  public String get(){
    DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
    LocalDateTime my_time = LocalDateTime.now();
    return my_time.format(formatter).substring(14, 16);
  }
}

//class for getting the hours portion of the current time
class Hours{
  public String get(){
    DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
    LocalDateTime my_time = LocalDateTime.now();
    return my_time.format(formatter).substring(11, 13);
  }
}

/*
a simple interface for getting the current time, combines Seconds,
Hours and Minutes classes
*/
public class Facade{

  public String get_time(){
    Seconds sec = new Seconds();
    Minutes min = new Minutes();
    Hours hrs = new Hours();

    return sec.get() + ":" + min.get() + ":" + hrs.get();
  }

}
