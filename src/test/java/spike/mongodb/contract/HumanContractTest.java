package spike.mongodb.contract;

import org.junit.Test;

public class HumanContractTest extends ApiTestBase {
    @Test
    public void shouldInvokeServiceAndReturnAcceptedWhenCreateHuman() throws Exception {
        assertContract();
    }

    @Test
    public void shouldReturnHumanIsMatched() throws Exception {
        assertContract();
    }

    @Test
    public void shouldReturnNotFoundIfNoneMatch() throws Exception {
        assertContract();
    }

    @Test
    public void shouldInvokeServiceAndReturnAcceptedWhenUpdateHuman() throws Exception {
        assertContract();
    }

    @Test
    public void shouldInvokeDeleteHumanServiceAndReturnAccepted() throws Exception {
        assertContract();
    }


}
