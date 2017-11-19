package zinck.examples.factories;

import zinck.examples.components.CarInsurance;
import zinck.examples.components.Insurance;

public class CarInsuranceFactory extends InsuranceFactory {
    @Override
    public Insurance getInsurance() {
        return new CarInsurance();
    }
}
