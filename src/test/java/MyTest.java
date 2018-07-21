import com.configuration.ConfigurationJavaBased;
import com.configuration.TestConfiguration;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = TestConfiguration.class)
public class MyTest {
@Autowired
    private WebApplicationContext wac;

    private MockMvc mockmvc;

@Before
    public void setUp(){
this.mockmvc= MockMvcBuilders.webAppContextSetup(this.wac).build();
}
@Test
    public void testController() throws Exception {
    this.mockmvc.perform(get("/application/getresponse","").accept(MediaType.APPLICATION_XML)).andDo(print()).andReturn();
}
}
