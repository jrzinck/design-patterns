package zinck.examples.component.insurance;

public class RenterInsurance implements Insurance {
    @Override
    public String getInsuranceType() {
        return "renter";
    }
}
