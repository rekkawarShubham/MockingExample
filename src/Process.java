public class Process {
    SomeService someService;

    public Process(SomeService s){
        this.someService = s;
    }

    public  String processing(){
        int a= someService.doSomething();
        return "After doing Something" + a;
    }
    public String processInt(int a) {
        int num = someService.somethingonint(a);
        return "Output is " + num;
    }
    public String processBool(Boolean a) {
        int b = someService.somethingonbool(a);
        return "Output is " + b;
    }
    public String processFloat(int a) {
        int num = someService.somethingonfloat(a);
        return "Output is " + num;
    }


}
