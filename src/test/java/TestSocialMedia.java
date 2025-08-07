import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class TestSocialMedia {
    @BeforeEach
    void setUp() {
        Moderator moderator1 = new Moderator("moderator-01", "Lili", "lili@gmail.com", LocalDate.now());
        Admin admin1 = new Admin("Admin-01", "Corentin", "corentin@gmail.com", LocalDate.now());
    }

    @Test
    public void testSearchUserByName(){

    }

}
