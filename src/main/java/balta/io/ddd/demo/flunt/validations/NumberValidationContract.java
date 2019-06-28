package balta.io.ddd.demo.flunt.validations;

import balta.io.ddd.demo.flunt.notification.INotifiable;
import balta.io.ddd.demo.flunt.specifications.contracts.ISpecifications;

public interface NumberValidationContract extends INotifiable, ISpecifications {

    default Contract isGreaterThan(Number val, Number comparer, String property, String message) {

        if (val.floatValue() <= comparer.floatValue())
            addNotification(property, message);

        return getContract();
    }

    default Contract isGreaterOrEqualsThan(Number val, Number comparer, String property, String message) {
        if (val.floatValue() < comparer.floatValue() || val.floatValue() == comparer.floatValue())
            addNotification(property, message);

        return getContract();
    }

    default Contract isLowerThan(Number val, Number comparer, String property, String message) {
        if (val.floatValue() >= comparer.floatValue())
            addNotification(property, message);

        return getContract();
    }

    default Contract isLowerOrEqualsThan(Number val, Number comparer, String property, String message) {
        if (val.floatValue() > comparer.floatValue())
            addNotification(property, message);

        return getContract();
    }

    default Contract areEquals(Number val, Number comparer, String property, String message) {
        if (val.floatValue() != comparer.floatValue())
            addNotification(property, message);

        return getContract();
    }

    default Contract areNotEquals(Number val, Number comparer, String property, String message) {
        if (val.floatValue() == comparer.floatValue())
            addNotification(property, message);

        return getContract();
    }

    default Contract isBetween(Number val, Number from, Number to, String property, String message) {
        if (!(val.floatValue() > from.floatValue() && val.floatValue() < to.floatValue()))
            addNotification(property, message);

        return getContract();
    }

    default Contract isNotNull(Number val, String property, String message) {
        if (val == null)
            addNotification(property, message);

        return getContract();
    }

}
