import java.util.ArrayList;
import java.util.List;

/**
 * Created by peterhealy on 29/09/2016.
 */
public class MusicFestival {
    private static final List<Band> bands = new ArrayList<Band>();

    public void bookBand(Band band) {
        bands.add(band);
    }

    public List<Band> lineup() {
        return bands;
    }
}
