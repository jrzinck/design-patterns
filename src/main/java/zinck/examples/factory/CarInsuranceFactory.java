package zinck.examples.factory;

import zinck.examples.component.insurance.CarInsurance;
import zinck.examples.component.insurance.Insurance;

public class CarInsuranceFactory extends InsuranceFactory {
    @Override
    public Insurance getInsurance() {
        return new CarInsurance();
    }
}
