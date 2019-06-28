package balta.io.ddd.demo.Utils;

import java.util.UUID;

public class GUIDUtils {

    public static String generateNewGuidNumbersOnlyAsString() {
        return UUID.randomUUID().toString().replace("-","").substring(0,10).toUpperCase();
    }

}
