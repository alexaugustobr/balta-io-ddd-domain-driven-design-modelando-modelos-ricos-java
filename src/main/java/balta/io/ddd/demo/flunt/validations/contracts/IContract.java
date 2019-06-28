package balta.io.ddd.demo.flunt.validations.contracts;

import balta.io.ddd.demo.flunt.specifications.contracts.ISpecifications;
import balta.io.ddd.demo.flunt.validations.*;

public interface IContract extends
        ISpecifications,
        BoolValidationContract,
        DateTimeValidationContract,
        NumberValidationContract,
        StringValidationContract,
        ObjectValidationContract {
}
