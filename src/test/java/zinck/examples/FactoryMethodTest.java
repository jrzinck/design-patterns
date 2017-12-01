package zinck.examples;

import org.junit.Test;
import zinck.examples.component.insurance.CarInsurance;
import zinck.examples.component.insurance.HomeInsurance;
import zinck.examples.component.insurance.Insurance;
import zinck.examples.component.insurance.RenterInsurance;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@SuppressWarnings("all")
public class FactoryMethodTest {
    @Test
    public void testBasicFactory() {
        Insurance carInsurance = createInsuranceByType("car");
        assertThat(carInsurance.getInsuranceType(), is("car"));
        Insurance homeInsurance = createInsuranceByType("home");
        assertThat(homeInsurance.getInsuranceType(), is("home"));
        Insurance renterInsurance = createInsuranceByType("renter");
        assertThat(renterInsurance.getInsuranceType(), is("renter"));
    }

    public Insurance createInsuranceByType(String insuranceType) {
        switch (insuranceType) {
            case "car":
                return new CarInsurance();
            case "home":
                return new HomeInsurance();
            case "renter":
                return new RenterInsurance();
            default:
                throw new RuntimeException("what are you doing!?");
        }
    }
}
