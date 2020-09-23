import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mockito;

public class TestingArgMatchers {
SomeService s;
Process p;
  @Before
    public void init() {
      s = Mockito.mock(SomeService.class);
      p = new Process(s);
  }
  @Test
    public void testInt(){
      Mockito.when(s.somethingonint(Matchers.anyInt())).thenReturn(10);
      String out = p.processInt(23);
      Assert.assertEquals("Output is "+10,out);
  }
  @Test
  public void testbool(){
    Mockito.when(s.somethingonbool(Matchers.anyBoolean())).thenReturn(10);
    String out = p.processBool(true);
    Assert.assertEquals("Output is "+10,out);
  }
  @Test
  public void testfloat(){
    Mockito.when(s.somethingonfloat(Matchers.anyFloat())).thenReturn(10);
    String out = p.processFloat(33);
    Assert.assertEquals("Output is "+10,out);
  }
}
