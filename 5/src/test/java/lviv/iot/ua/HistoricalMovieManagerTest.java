package lviv.iot.ua;

import org.junit.Before;
import org.junit.Test;
import lviv.iot.ua.HistoricalMovie;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.*;

public class HistoricalMovieManagerTest {
    private List<HistoricalMovie> staff = new LinkedList<>();
    HistoricalMovie lamp = new Lamp("DualKEE", 12, "CeenOn", "Spring", 150, 25, BrandType.PIONEER);
    HistoricalMovie camera = new Camera("Lowa", "Spring", 1500, 15, BrandType.LG, , "2k-pro", "Superpower");
    HistoricalMovie microphone = new Microphone("Ultra", 7, "Rare_sound", "Spring",
            1200, 5, BrandType.REALTEC);
    private HistoricalMovie movie = null;
    HistoricalMovieManager historicalMovieManager = new HistoricalMovieManager();

    @Before
    public void setUp() {
       HistoricalMovieManager movie = new HistoricalMovieManager();

        movie.addGoods(lamp);
        movie.addGoods(camera);
        movie.addGoods(microphone);

    }

    @Test
    public void sortByPrice() {
       staff.add(camera);
       staff.add(lamp);
       staff.add(microphone);
        List<HistoricalMovieManager> goods = historicalMovieManager.sortByPrice();
        assertEquals(goods, historicalMovieManager);
    }

    @Test
    public void findByGroup() {

    }
}

