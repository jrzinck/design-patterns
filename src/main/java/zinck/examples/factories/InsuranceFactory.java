package zinck.examples.factories;

import zinck.examples.components.BasicInsurance;
import zinck.examples.components.Insurance;

public class InsuranceFactory {
    public Insurance getInsurance() {
        return new BasicInsurance();
    }
}
