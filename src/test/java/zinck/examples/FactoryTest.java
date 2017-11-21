package zinck.examples;

import org.junit.Test;
import zinck.examples.component.insurance.Insurance;
import zinck.examples.factory.CarInsuranceFactory;
import zinck.examples.factory.HomeInsuranceFactory;
import zinck.examples.factory.InsuranceFactory;
import zinck.examples.factory.RenterInsuranceFactory;

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
