package ashok.in.test;

import ashok.in.rest.WelcomeRestController;
import ashok.in.service.WelcomeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static com.jayway.jsonpath.Criteria.where;
import static org.mockito.Mockito.when;

@WebMvcTest(value = WelcomeRestController.class)
public class WelcomeRestControllerTest {

    @MockBean
    WelcomeService welcomeService;

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void testGetWelcomeMsg() throws Exception {

        //define mock object behaviour

       when(welcomeService.getMgs()).thenReturn("Welcome to ashok it");

        //prepare http get request

        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/welcome");


        //send the request and hold the request
        MvcResult mvcResult = mockMvc.perform(builder).andReturn();
        //validate the response
        MockHttpServletResponse response = mvcResult.getResponse();
        //String contentAsString = response.getContentAsString();
        int status = response.getStatus();
        Assertions.assertEquals(200 , status);
    }
    @Test
    public void testGetGreetMsg() throws Exception {

        //define mock object behaviour

        when(welcomeService.getGreetMsg()).thenReturn("Hello.");

        //prepare http get request

        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/greet");


        //send the request and hold the request
        MvcResult mvcResult = mockMvc.perform(builder).andReturn();
        //validate the response
        MockHttpServletResponse response = mvcResult.getResponse();
        //String contentAsString = response.getContentAsString();
        int status = response.getStatus();
        Assertions.assertEquals(200 , status);
    }

}
