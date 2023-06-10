package moviev.common;

import io.cucumber.spring.CucumberContextConfiguration;
import moviev.ReserveApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { ReserveApplication.class })
public class CucumberSpingConfiguration {}
