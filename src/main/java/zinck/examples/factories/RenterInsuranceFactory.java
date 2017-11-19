package zinck.examples.factories;

import zinck.examples.components.Insurance;
import zinck.examples.components.RenterInsurance;

public class RenterInsuranceFactory extends InsuranceFactory {
    @Override
    public Insurance getInsurance() {
        return new RenterInsurance();
    }
}
