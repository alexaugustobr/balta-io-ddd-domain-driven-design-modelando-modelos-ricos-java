package balta.io.ddd.demo.flunt.validations;

import balta.io.ddd.demo.flunt.notification.INotifiable;
import balta.io.ddd.demo.flunt.specifications.contracts.ISpecifications;

import java.util.Date;

public interface DateTimeValidationContract extends INotifiable, ISpecifications {

    default Contract isGreaterThan(Date val, Date comparer, String property, String message) {
        if (!val.after(comparer)) {
            addNotification(property, message);
        }

        return this.getContract();
    }

    default Contract isGreaterOrEqualsThan(Date val, Date comparer, String property, String message) {
        if (!val.after(comparer) || !val.equals(comparer)) {
            addNotification(property, message);
        }

        return this.getContract();
    }

    default Contract isLowerThan(Date val, Date comparer, String property, String message) {
        if (!val.before(comparer)) {
            addNotification(property, message);
        }

        return this.getContract();
    }

    default Contract isLowerOrEqualsThan(Date val, Date comparer, String property, String message) {
        if (!val.before(comparer) || !val.equals(comparer)) {
            addNotification(property, message);
        }

        return this.getContract();
    }

    default Contract isBetween(Date val, Date from, Date to, String property, String message) {
        if (!((val.after(from)) && (val.before(to)))) {
            addNotification(property, message);
        }

        return this.getContract();
    }

    default Contract isNotNull(Date val, String property, String message) {
        if (val == null) {
            addNotification(property, message);
        }

        return this.getContract();
    }

}
