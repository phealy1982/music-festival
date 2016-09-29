import java.util.ArrayList;
import java.util.List;

/**
 * Created by peterhealy on 29/09/2016.
 */
public class MusicFestival {
    private static final List<String> bands = new ArrayList<String>();

    public void bookBand(String band) {
        bands.add(band);
    }

    public List<String> lineup() {
        return bands;
    }
}
