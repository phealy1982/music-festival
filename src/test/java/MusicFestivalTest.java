import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by peterhealy on 29/09/2016.
 */
public class MusicFestivalTest {

    @Test public void should_be_able_to_book_a_band() throws Exception {
        MusicFestival musicFestival = new MusicFestival();

        musicFestival.book("the Beatles");

        assertThat(musicFestival.lineUp()).contains("the Beatles");
    }
}
