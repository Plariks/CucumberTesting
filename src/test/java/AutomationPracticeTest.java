import baseFunc.BaseFunc;
import org.junit.jupiter.api.Test;

public class AutomationPracticeTest {
    private BaseFunc baseFunc;
    private String URL = "www.delfi.lv";

    private AutomationPracticeTest(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    @Test
    public void checkDresses() {
        baseFunc.openPage(URL);
    }
}
