package lviv.iot.ua;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class HistoricalMovieManager extends HistoricalMovie {

    private LinkedList<HistoricalMovie> staffList = new LinkedList<>();

    //            HistoricalMovie equipment = new HistoricalMovie();
//            equipment.addGoods(new Lamp("SuperDiod+", 12, 15, 150, "Pioneer"));
//            equipment.addGoods(new Camera("27.pK.pro", "HardBlock1.2",
//                    12, 1500, "LG"));
//            equipment.addGoods(new Microphone("medium", 15, 25, 1, 500, "LG"));
//
//
//    }
    public List<HistoricalMovieManager> sortByPrice() {
        this.staffList.sort(Comparator.comparing(HistoricalMovieManager::getCost));
        return this;
    }

    public List<HistoricalMovie> findByGroup(final BrandType goodsType) {
        List<HistoricalMovie> result = new LinkedList<>();
        staffList.stream().filter((staff) ->
                ((staff.getBrandType() == goodsType
                ))).forEachOrdered(foundStaff -> {
            result.add(foundStaff);
        });
        return result;
    }

    public void addGoods(final HistoricalMovie goods) {
        staffList.add(goods);
    }
}