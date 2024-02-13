package Models;

import Models.RangeRover;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RangeRoverTest {

    RangeRover rangeRover;

    @BeforeEach
    public void setUp() {
        rangeRover = new RangeRover("Velar", "land", false, 5,
                4, 64230);
    }

    @Test
    public void changeCarDescription () {
        assertThat(rangeRover.carDescription()).isEqualTo("This is a land vehicle.");
    }

    @Test
    public void checkDescription_noArg () {
        String expected = "This is a land vehicle.";
        String actual = rangeRover.carDescription();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void checkDescription_withArg () {
        String expected = "Range Rover Velar HSE";
        String actual = rangeRover.carDescription("Velar HSE");
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canChangePaintColour () {
        rangeRover.setPaintColour("Matte Black");
        assertThat(rangeRover.getPaintColour()).isEqualTo("Matte Black");
    }
}
