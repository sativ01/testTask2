package ca.com.apigateway.testTask2;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SumTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private SumRepository sumRepository;

    @Before
    public void deleteOldData() throws Exception {
        sumRepository.deleteAll();
    }

    @Test
    public void repositoryExists() throws Exception {
        mockMvc.perform(get("/api")).andDo(print()).andExpect(status().isOk()).andExpect(
                jsonPath("$._links.sums").exists());
    }

    @Test
    public void addElement() throws Exception {
        mockMvc.perform(post("/api/sums").content((
                "{\"a\": 10, \"b\": 20}")))
                .andExpect(status().isCreated())
                .andExpect(header().string("Location", containsString("sums/")));
    }

    @Test
    public void getElement() throws Exception {
        mockMvc.perform(post("/api/sums").content((
                "{\"a\": 10, \"b\": 20}")))
                .andExpect(status().isCreated());

        mockMvc.perform(get("/api/sums/1"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.sum").value("30"));
    }
}