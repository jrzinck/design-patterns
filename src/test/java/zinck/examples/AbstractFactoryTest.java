package zinck.examples;

import org.junit.Test;
import zinck.examples.abstractfactory.CarInsurancePlanFactory;
import zinck.examples.abstractfactory.HomeInsurancePlanFactory;
import zinck.examples.abstractfactory.InsurancePlanAbstractFactory;
import zinck.examples.abstractfactory.RenterInsurancePlanFactory;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AbstractFactoryTest {
    @Test
    public void testAbstractFactory() {
        InsurancePlanAbstractFactory insurancePlan = new CarInsurancePlanFactory();
        assertThat(insurancePlan.getInsurance().getInsuranceType(), is("car"));
        assertThat(insurancePlan.getProperty().getPropertyType(), is("car"));

        insurancePlan = new HomeInsurancePlanFactory();
        assertThat(insurancePlan.getInsurance().getInsuranceType(), is("home"));
        assertThat(insurancePlan.getProperty().getPropertyType(), is("home"));

        insurancePlan = new RenterInsurancePlanFactory();
        assertThat(insurancePlan.getInsurance().getInsuranceType(), is("renter"));
        assertThat(insurancePlan.getProperty().getPropertyType(), is("rental"));
    }
}
