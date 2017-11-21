package zinck.examples.abstractfactory;

import zinck.examples.component.insurance.CarInsurance;
import zinck.examples.component.insurance.Insurance;
import zinck.examples.component.property.Car;
import zinck.examples.component.property.Property;

public class CarInsurancePlanFactory implements InsurancePlanAbstractFactory {
    @Override
    public Insurance getInsurance() {
        return new CarInsurance();
    }

    @Override
    public Property getProperty() {
        return new Car();
    }
}
