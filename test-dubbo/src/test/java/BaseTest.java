import com.song.dubbo.service.SayHelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author songjianhua
 * @date 2019-12-20 17:04
 * @description:
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application.xml"})
public class BaseTest {

    @Autowired
    private SayHelloService sayHelloService;

    @Test
    public void testSayHello() {
        sayHelloService.test();
    }
}
