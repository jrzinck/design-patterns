package zinck.examples.factory;

import zinck.examples.component.insurance.CarInsurance;
import zinck.examples.component.insurance.HomeInsurance;
import zinck.examples.component.insurance.Insurance;
import zinck.examples.component.insurance.RenterInsurance;

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
                throw new RuntimeException("what are you doing!?");
        }
    }
}
