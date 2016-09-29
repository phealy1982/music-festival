import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by peterhealy on 29/09/2016.
 */
public class MusicFestivalTest {

    private MusicFestival musicFestival = new MusicFestival();

    @Test public void should_allow_band_to_be_booked() throws Exception {
        musicFestival.bookBand("Guns N Roses");
        assertThat(musicFestival.lineup()).contains("Guns N Roses");
    }

    @Test public void should_be_able_to_book_multiple_bands() throws Exception {
        musicFestival.bookBand("Guns N Roses");
        musicFestival.bookBand("Deftones");

        assertThat(musicFestival.lineup()).contains("Guns N Roses", "Deftones");
    }
}
