import com.example.lib.main.test.INow;

public class FakeNow implements INow {

    @Override
    public boolean isMonday() {
        return false;
    }
}
