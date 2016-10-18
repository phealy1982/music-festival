import java.util.ArrayList;
import java.util.List;

/**
 * Created by peterhealy on 18/10/2016.
 */
public class MusicFestival {
    private List<String> bands = new ArrayList<String>();

    public void book(String band) {
        bands.add(band);
    }

    public List<String> lineUp() {
        return bands;
    }
}
