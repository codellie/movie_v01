package moviev.common;

import io.cucumber.spring.CucumberContextConfiguration;
import moviev.PointApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { PointApplication.class })
public class CucumberSpingConfiguration {}
