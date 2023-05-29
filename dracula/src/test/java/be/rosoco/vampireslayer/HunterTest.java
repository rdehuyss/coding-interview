package be.rosoco.vampireslayer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Calendar;
import java.util.Date;

public class HunterTest {
    private Hunter hunter;

    @BeforeEach
    public void setup() {
        hunter = new Hunter();
    }

    @Test
    public void canHunt_givenDayTime_thenCannotHunt() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2014, Calendar.APRIL, 12, 16, 1);
        Date huntingTime = calendar.getTime();

        assertThat(hunter.canHunt(huntingTime)).isFalse();
    }

    @Test
    public void canHunt_givenNightTime_thenCanHunt() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2014, Calendar.APRIL, 12, 1, 1);
        Date huntingTime = calendar.getTime();

        assertThat(hunter.canHunt(huntingTime)).isTrue();
    }

}
