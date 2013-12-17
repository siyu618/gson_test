package bag;

import org.testng.annotations.Test;

import com.yahoo.pt.json.bag.BagState;

public class BagStateTest {
    
    @Test
    public void test() {
        for (BagState bagState : BagState.values()) {
            System.out.println(bagState);
        }
    }

}
