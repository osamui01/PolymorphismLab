package Models;

import Models.Helicopter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HelicopterTest {

    Helicopter helicopter;

    @BeforeEach
    public void setUp() {
        helicopter = new Helicopter("AH-64 Apache", "air", false,
                2, 3, 4100000);
    }

    @Test
    public void changeCarDescription () {
        assertThat(helicopter.carDescription()).isEqualTo("This is an air vehicle.");
    }

    @Test
    public void canChangeEngineCapacity () {
        helicopter.setEngineCapacity("1,696 shp");
        assertThat(helicopter.getEngineCapacity()).isEqualTo("1,696 shp");
    }

    @Test
    public void findTopSpeed () {
        String speed = helicopter.speed(293);
        assertThat(speed).isEqualTo("AH-64 Apache top speed is 293 km/h!");
    }
}
