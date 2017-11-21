package zinck.examples.factory;

import zinck.examples.component.insurance.BasicInsurance;
import zinck.examples.component.insurance.Insurance;

public class InsuranceFactory {
    public Insurance getInsurance() {
        return new BasicInsurance();
    }
}
