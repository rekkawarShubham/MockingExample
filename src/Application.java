public class Application {

    CalculatorService cs;
    public void setCalculatorService(CalculatorService s)
    {
        this.cs=s;
    }
    public int add(int a,int b){
      return cs.addtion(a,b);
    }
    public int sub(int a,int b){
        return  cs.substraction(a,b);
    } public int prod(int a,int b){
        return cs.product(a,b);
    } public int div(int a,int b){
        return cs.division(a,b);
    }
}
