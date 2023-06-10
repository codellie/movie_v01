package moviev.common;

import io.cucumber.spring.CucumberContextConfiguration;
import moviev.TicketApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { TicketApplication.class })
public class CucumberSpingConfiguration {}
