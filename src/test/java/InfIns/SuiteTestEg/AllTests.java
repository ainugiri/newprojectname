package InfIns.SuiteTestEg;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ LoginServiceTest.class, UserServiceTest.class })
public class AllTests {

}
