package zinck.examples.abstractfactory;

import zinck.examples.component.insurance.Insurance;
import zinck.examples.component.insurance.RenterInsurance;
import zinck.examples.component.property.Property;
import zinck.examples.component.property.Rental;

public class RenterInsurancePlanFactory implements InsurancePlanAbstractFactory {
    @Override
    public Insurance getInsurance() {
        return new RenterInsurance();
    }

    @Override
    public Property getProperty() {
        return new Rental();
    }
}
