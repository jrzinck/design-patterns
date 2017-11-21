package zinck.examples.abstractfactory;

import zinck.examples.component.insurance.Insurance;
import zinck.examples.component.property.Property;

public interface InsurancePlanAbstractFactory {
    Insurance getInsurance();
    Property getProperty();
}
