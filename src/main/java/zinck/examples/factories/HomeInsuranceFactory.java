package zinck.examples.factories;

import zinck.examples.components.HomeInsurance;
import zinck.examples.components.Insurance;

public class HomeInsuranceFactory extends InsuranceFactory {
    @Override
    public Insurance getInsurance() {
        return new HomeInsurance();
    }
}
