package balta.io.ddd.demo.paymentContext.shared;

import java.util.UUID;

public abstract class Entity {

    private UUID uuid = UUID.randomUUID();

    public Entity() {

    }

    public UUID getUuid() {
        return uuid;
    }
}
