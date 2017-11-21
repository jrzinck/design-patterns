package zinck.examples;

import org.junit.Test;
import zinck.examples.component.insurance.Insurance;
import zinck.examples.factory.SimpleInsuranceFactory;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SimpleFactoryTest {
    @Test
    public void testSimpleInsuranceFactory() {
        SimpleInsuranceFactory simpleInsuranceFactory = new SimpleInsuranceFactory();

        Insurance carInsurance = simpleInsuranceFactory.getInsurance("car");
        assertThat(carInsurance.getInsuranceType(), is("car"));
        Insurance homeInsurance = simpleInsuranceFactory.getInsurance("home");
        assertThat(homeInsurance.getInsuranceType(), is("home"));
        Insurance renterInsurance = simpleInsuranceFactory.getInsurance("renter");
        assertThat(renterInsurance.getInsuranceType(), is("renter"));
    }
}
