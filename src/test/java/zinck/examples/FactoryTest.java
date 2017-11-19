package zinck.examples;

import org.junit.Test;
import zinck.examples.components.Insurance;
import zinck.examples.factories.CarInsuranceFactory;
import zinck.examples.factories.HomeInsuranceFactory;
import zinck.examples.factories.InsuranceFactory;
import zinck.examples.factories.RenterInsuranceFactory;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactoryTest {
    @Test
    public void testInsuranceFactory() {
        InsuranceFactory insuranceFactory = new InsuranceFactory();

        Insurance basicInsurance = insuranceFactory.getInsurance();
        assertThat(basicInsurance.getInsuranceType(), is("basic"));

        insuranceFactory = new CarInsuranceFactory();
        Insurance carInsurance = insuranceFactory.getInsurance();
        assertThat(carInsurance.getInsuranceType(), is("car"));

        insuranceFactory = new HomeInsuranceFactory();
        Insurance homeInsurance = insuranceFactory.getInsurance();
        assertThat(homeInsurance.getInsuranceType(), is("home"));

        insuranceFactory = new RenterInsuranceFactory();
        Insurance renterInsurance = insuranceFactory.getInsurance();
        assertThat(renterInsurance.getInsuranceType(), is("renter"));
    }
}
