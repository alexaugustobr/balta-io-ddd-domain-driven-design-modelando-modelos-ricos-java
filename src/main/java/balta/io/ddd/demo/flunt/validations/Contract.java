package balta.io.ddd.demo.flunt.validations;

import balta.io.ddd.demo.flunt.notification.Notifiable;
import balta.io.ddd.demo.flunt.validations.contracts.IContract;

public class Contract extends Notifiable implements IContract {

    public final Contract requires() {
        return this;
    }

    public final Contract join(Notifiable... items) {
        if (items != null) {
            for (Notifiable notifiable : items) {
                if (notifiable.isInvalid()) {
                    this.addNotifications(notifiable.getNotificationList());
                }

            }

        }
        return this;
    }

//    TODO VERIFICAR SE METODO ATENDE A NECESSIDADE
//    public final Contract ifNotNull(Object parameterType, Function<Object, Contract> contractExpression) {
//        if (parameterType != null) {
//            contractExpression.apply(this);
//        }
//
//        return this;
//    }

    @Override
    public Contract getContract() {
        return this;
    }
}
