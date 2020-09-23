import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ApplicationTester {
 @Mock
    CalculatorService cs;

 @InjectMocks
    Application app= new Application();

 @Test
    public void testadd(){
     when(cs.addtion(10,10)).thenReturn(20);
     int actual = app.add(10,10);
     int exp = 20;
     Assert.assertEquals(exp , actual);
 }
}
