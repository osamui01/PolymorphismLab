package Models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DealershipTest {

    Dealership dealership;

    @BeforeEach
    public void setUp() {
        dealership = new Dealership("Raf's Fast Cars");
    }

    @Test
    public void canGetName () {
        assertThat(dealership.getName()).isEqualTo("Raf's Fast Cars");
    }

    @Test
    public void canAddVehicles () {
        Vehicle testVehicle = new RangeRover("Velar HSE", "Land", false, 5,
                4, 64320);
        Vehicle testVehicle2 = new Helicopter("AH-64 Apache", "Air", false,
                2, 3, 4100000);
        dealership.addVehicle(testVehicle);
        dealership.addVehicle(testVehicle2);
        assertThat(dealership.vehicleStockCount()).isEqualTo(2);
    }
}
