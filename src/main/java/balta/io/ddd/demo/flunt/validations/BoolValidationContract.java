package balta.io.ddd.demo.flunt.validations;

import balta.io.ddd.demo.flunt.notification.INotifiable;
import balta.io.ddd.demo.flunt.specifications.contracts.ISpecifications;

public interface BoolValidationContract extends INotifiable, ISpecifications {

    default Contract isFalse(boolean val, String property, String message) {
        if (val) {
            addNotification(property, message);
        }

        return getContract();
    }

    default Contract isTrue(boolean val, String property, String message) {
        return isFalse(!val, property, message);
    }

}
