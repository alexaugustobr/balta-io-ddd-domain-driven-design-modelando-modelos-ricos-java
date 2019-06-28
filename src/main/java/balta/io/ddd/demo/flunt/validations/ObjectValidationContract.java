package balta.io.ddd.demo.flunt.validations;

import balta.io.ddd.demo.flunt.notification.INotifiable;
import balta.io.ddd.demo.flunt.specifications.contracts.ISpecifications;

public interface ObjectValidationContract extends INotifiable, ISpecifications {

    default Contract isNull(Object obj, String property, String message) {
        if (obj != null)
            this.addNotification(property, message);

        return getContract();
    }

    default Contract isNotNull(Object obj, String property, String message) {
        if (obj == null)
            this.addNotification(property, message);

        return getContract();
    }

    default Contract areEquals(Object obj, Object comparer, String property, String message) {
        if (!obj.equals(comparer))
            this.addNotification(property, message);

        return getContract();
    }

    default Contract areNotEquals(Object obj, Object comparer, String property, String message) {
        if (obj.equals(comparer))
            this.addNotification(property, message);

        return getContract();
    }

}
