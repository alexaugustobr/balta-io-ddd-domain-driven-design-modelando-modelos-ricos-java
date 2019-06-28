package balta.io.ddd.demo.paymentContext.shared;

import balta.io.ddd.demo.notification.Notifiable;

import java.util.UUID;

public abstract class Entity extends Notifiable {

    private UUID uuid = UUID.randomUUID();

    public Entity() {

    }

    public UUID getUuid() {
        return uuid;
    }
}
