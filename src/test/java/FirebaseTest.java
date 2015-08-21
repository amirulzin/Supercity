import com.opensource.supercity.model.FirebaseAdapter;
import org.junit.Test;

public class FirebaseTest {
    @Test
    public void testConnection() throws InterruptedException {
        new FirebaseAdapter().setup();
    }
}
