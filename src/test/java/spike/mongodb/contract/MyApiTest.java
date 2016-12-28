package spike.mongodb.contract;

import org.junit.Test;

public class MyApiTest extends ApiTestBase {
    @Test
    public void should_response_text_foo() throws Exception {
        assertContract();
    }
}