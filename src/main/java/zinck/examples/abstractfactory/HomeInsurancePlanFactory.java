package zinck.examples.abstractfactory;

import zinck.examples.component.insurance.HomeInsurance;
import zinck.examples.component.insurance.Insurance;
import zinck.examples.component.property.Home;
import zinck.examples.component.property.Property;

public class HomeInsurancePlanFactory implements InsurancePlanAbstractFactory {
    @Override
    public Insurance getInsurance() {
        return new HomeInsurance();
    }

    @Override
    public Property getProperty() {
        return new Home();
    }
}
