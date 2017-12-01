package zinck.examples;

import org.junit.Test;
import zinck.examples.component.insurance.CarInsurance;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SuperBasicFactoryTest {
    @Test
    public void testCreateCarInsurance() {
        CarInsurance carInsurance = createCarInsurance();
        assertThat(carInsurance.getInsuranceType(), is("car"));
    }

    private CarInsurance createCarInsurance() {
        return new CarInsurance();
    }
}
