package zinck.examples.factory;

import zinck.examples.component.insurance.Insurance;
import zinck.examples.component.insurance.RenterInsurance;

public class RenterInsuranceFactory extends InsuranceFactory {
    @Override
    public Insurance getInsurance() {
        return new RenterInsurance();
    }
}
