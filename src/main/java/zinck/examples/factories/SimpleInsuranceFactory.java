package zinck.examples.factories;

import zinck.examples.components.CarInsurance;
import zinck.examples.components.HomeInsurance;
import zinck.examples.components.Insurance;
import zinck.examples.components.RenterInsurance;

public class SimpleInsuranceFactory {
    public Insurance getInsurance(String insuranceType) {
        switch (insuranceType) {
            case "car":
                return new CarInsurance();
            case "home":
                return new HomeInsurance();
            case "renter":
                return new RenterInsurance();
            default:
                throw new RuntimeException("what are you doing !?");
        }
    }
}
