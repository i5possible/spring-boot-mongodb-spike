package spike.mongodb.contract;


import com.github.macdao.moscow.ContractAssertion;
import com.github.macdao.moscow.ContractContainer;
import org.junit.Test;

import java.nio.file.Paths;

public class ContractTest {
    private static final ContractContainer contractContainer = new ContractContainer(Paths.get(
            "src/test/resources/contracts"));

    @Test
    public void should_response_text_foo() throws Exception {
        new ContractAssertion(contractContainer.findContracts("should_response_text_foo"))
                .setPort(8090)
                .assertContract();
    }
}
