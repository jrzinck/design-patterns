package zinck.examples.factory;

import zinck.examples.component.insurance.HomeInsurance;
import zinck.examples.component.insurance.Insurance;

public class HomeInsuranceFactory extends InsuranceFactory {
    @Override
    public Insurance getInsurance() {
        return new HomeInsurance();
    }
}
