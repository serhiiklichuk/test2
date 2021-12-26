import static org.mockito.Mockito.verify;

import com.example.lib.main.test.Http;
import com.example.lib.main.test.ILogger;
import com.example.lib.main.test.INow;
import com.example.lib.main.test.Ihttp;
import com.example.lib.main.test.Main;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

public class MainClassTest {

    @Mock
    ILogger logger;

//    @Before
//    public void init() {
//        Mockito.
//    }

    @Test
    public void testIfNowIsNotMonday() {
        INow now = new FakeNow();
        Ihttp http = new Http();
        Assert.assertNull(new Main(now, logger, http).evaluate());
        verify(logger).debug("not monday");
    }
}
