import java.util.ArrayList;
import java.io.*;

public class main{
  public static void assertT(boolean b, String err) throws AssertionError{
    if(!b)
      throw new AssertionError(err);
  }

  public static void main(String[] args) throws Exception{

    //read in lines from a file
    System.out.println("Reading in file");
    File my_file = new File("./in.txt");
    BufferedReader br = new BufferedReader(new FileReader(my_file));

    String cur_str;
    ArrayList<String> lines = new ArrayList<String>();
    while((cur_str = br.readLine()) != null){
      lines.add(cur_str);
    }

    //run strategy for each line
    System.out.println("Running tests");
    Context my_context = new Context();
    int[] expected = {6, -13, -91, -44, 1, 0, 8};

    for(int i = 0; i < lines.size(); i++){
      String[] parts = lines.get(i).split(" ");
      String type = parts[0];
      int num1 = Integer.parseInt(parts[1]);
      int num2 = Integer.parseInt(parts[2]);

      //set the strategy based on the read in type
      switch(type){
        case "add" :
          my_context.set_strategy(new AddStrategy());
          break;

        case "subtract" :
          my_context.set_strategy(new SubtractStrategy());
          break;
      }

      //test that the strategy works
      assertT(my_context.execute_strategy(num1, num2) == expected[i], "invalid answer at index "+i);
    }

    System.out.println("Tests passed");
  }
}
