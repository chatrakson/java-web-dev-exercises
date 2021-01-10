package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

public class CarTest {

    Car test_car;
    @Before
    public void createCarObject() {
        test_car = new Car("Toyota", "Prius", 10, 50);
    }

    @Test //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    public void emptyTest() {
        assertEquals(10, 10, .001);
    }

    @Test //TODO: constructor sets gasTankLevel properly
    public void testInitialGasTank() {
        assertEquals(10, test_car.getGasTankLevel(), .001);
    }
    @Test //TODO: gasTankLevel is accurate after driving within tank range
    public void testGasTankLevelAfterDriving() {
        test_car.drive(50);
        assertEquals(9, test_car.getGasTankLevel(), .001);
    }
    @Test //TODO: gasTankLevel is accurate after attempting to drive past tank range
    public void testGasTankAfterExceedingTankRange() {
        test_car.drive(test_car.getGasTankSize()*test_car.getMilesPerGallon() + 1000);
        assertEquals(0, test_car.getGasTankLevel(), .001);
    }
    @Test(expected = IllegalArgumentException.class) //TODO: can't have more gas than tank size, expect an exception
    public void testGasOverfillException() {
        test_car.addGas(5);
        fail("Shouldn't get here, car cannot have more gas in tank than the size of the tank");
    }

}
