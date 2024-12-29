package ashok.in.test;

import ashok.in.dao.MsgDao;
import ashok.in.service.WelcomeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class WelcomeServiceTest {

    @MockBean
    private MsgDao msgDao;

    @InjectMocks
    private WelcomeService welcomeService;

    @Test
    public void testGetWelcomeMsg(){
        when(msgDao.getMsg()).thenReturn("welcome dao");
        String mgs = welcomeService.getMgs();
        assertNotNull(mgs);
    }

    public void testGreetMsg(){
        when(msgDao.getMsg()).thenReturn("welcome dao greet");
        String greetMsg = welcomeService.getGreetMsg();
        assertNotNull(greetMsg);
    }

}
