public class Context {

  public Strategy strategy;

  //set strategy to passed in value
  public void set_strategy(Strategy strategy){
    this.strategy = strategy;
  }

  //execute the current strategy
  public int execute_strategy(int num1, int num2) throws Exception{
    if(strategy != null)
      return this.strategy.execute(num1, num2);
    else
      throw new Exception("strategy of context must be set before call to execute_strategy");
  }
}
