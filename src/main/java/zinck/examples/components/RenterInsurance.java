package zinck.examples.components;

public class RenterInsurance implements Insurance {
    @Override
    public String getInsuranceType() {
        return "renter";
    }
}
