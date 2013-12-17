package bag;

import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yahoo.pt.json.bag.BagAdapter;
import com.yahoo.pt.json.bag.BagItem;
import com.yahoo.pt.json.bag.BagState;

public class BagAdapterTest {

    Gson gson = new GsonBuilder().registerTypeAdapter(BagState.class,
            new BagAdapter()).create();

    @Test
    public void testSerialize() {
        BagItem bagItem = new BagItem("id1", null, "70*80");
        System.out.println("without Adapter:" + new Gson().toJson(bagItem));
        //  without Adapter:{"name":"id1","size":"70*80"}
        String json = gson.toJson(bagItem);
        String exp = "{\"name\":\"id1\",\"size\":\"70*80\"}";
        assert exp.equals(json);

        bagItem = new BagItem("id1", BagState.EMPTY, "70*80");
        System.out.println("without Adapter:" + new Gson().toJson(bagItem));
        // without Adapter:{"name":"id1","state":"EMPTY","size":"70*80"}
        json = gson.toJson(bagItem);
        exp = "{\"name\":\"id1\",\"state\":\"_empty\",\"size\":\"70*80\"}";
        assert exp.equals(json);
    }

    @Test
    public void testDeserialize() {
        String json = "{\"name\":\"id1\",\"size\":\"70*80\"}";
        BagItem bagItem = gson.fromJson(json, BagItem.class);
        System.out.println(bagItem);

        json = "{\"name\":\"id1\",\"state\":\"empty\",\"size\":\"70*80\"}";
        bagItem = gson.fromJson(json, BagItem.class);
        System.out.println(bagItem);

    }
}
