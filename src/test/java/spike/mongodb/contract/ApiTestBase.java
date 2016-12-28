package spike.mongodb.contract;

import com.github.macdao.moscow.ContractAssertion;
import com.github.macdao.moscow.ContractContainer;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spike.mongodb.HumanResourceApplication;

import java.nio.file.Paths;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = HumanResourceApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public abstract class ApiTestBase {
    private static final ContractContainer container = new ContractContainer(Paths.get("src/test/resources/contracts"));
    @Rule
    public final TestName name = new TestName();
    @Value("${local.server.port}")
    protected int port;

    protected Map<String, String> assertContract() {
        return assertContract(name.getMethodName());
    }

    protected Map<String, String> assertContract(String description) {
        return new ContractAssertion(container.findContracts(description))
                .setPort(port)
                .setExecutionTimeout(200)
                .assertContract();
    }
}
