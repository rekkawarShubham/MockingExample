import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class TestingService {
 @Test
    public void testProcessMethod(){
     SomeService s = Mockito.mock(SomeService.class);
     Mockito.when(s.doSomething()).thenReturn(10);


     Process p = new Process(s);
     String msg = p.processing();
     System.out.println(msg);
     Assert.assertEquals("After doing Something10",msg);

 }
}
