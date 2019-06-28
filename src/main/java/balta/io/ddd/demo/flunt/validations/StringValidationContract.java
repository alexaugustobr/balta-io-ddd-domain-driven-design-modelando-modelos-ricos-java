package balta.io.ddd.demo.flunt.validations;

import balta.io.ddd.demo.flunt.notification.INotifiable;
import balta.io.ddd.demo.flunt.specifications.contracts.ISpecifications;
import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface StringValidationContract extends INotifiable, ISpecifications {

    default Contract isNotNullOrEmpty(String val, String property, String message) {
        if (StringUtils.isBlank(val))
            this.addNotification(property, message);

        return getContract();
    }

    default Contract isNotNullOrWhiteSpace(String val, String property, String message) {
        if (StringUtils.isBlank(val))
            this.addNotification(property, message);

        return getContract();
    }


    default Contract isNullOrEmpty(String val, String property, String message) {
        if (!StringUtils.isBlank(val))
            this.addNotification(property, message);

        return getContract();
    }

    default Contract HasMinLen(String val, int min, String property, String message) {
        if (StringUtils.isBlank(val) || val.length() < min)
            this.addNotification(property, message);

        return getContract();
    }

    default Contract HasMaxLen(String val, int max, String property, String message) {
        if (StringUtils.isBlank(val) || val.length() > max)
            this.addNotification(property, message);

        return getContract();
    }

    default Contract HasLen(String val, int len, String property, String message) {
        if (StringUtils.isBlank(val) || val.length() != len)
            this.addNotification(property, message);

        return getContract();
    }

    default Contract Contains(String val, String text, String property, String message) {
        if (!val.contains(text))
            this.addNotification(property, message);

        return getContract();
    }

    default Contract AreEquals(String val, String text, String property, String message, boolean ignoreCase) {
        if (ignoreCase) {
            if (!StringUtils.equalsIgnoreCase(val, text)) this.addNotification(property, message);
        }

        if (!ignoreCase) {
            if (!StringUtils.equals(val, text)) this.addNotification(property, message);
        }

        return getContract();
    }

    default Contract AreNotEquals(String val, String text, String property, String message, boolean ignoreCase) {

        if (ignoreCase) {
            if (StringUtils.equalsIgnoreCase(val, text)) this.addNotification(property, message);
        }

        if (!ignoreCase) {
            if (StringUtils.equals(val, text)) this.addNotification(property, message);
        }

        return getContract();
    }

    default Contract isEmail(String email, String property, String message) {
        final String pattern = "^\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        return Matchs(email, pattern, property, message);
    }

    default Contract isEmailOrEmpty(String email, String property, String message) {
        if (StringUtils.isBlank(email))
            return getContract();

        return isEmail(email, property, message);
    }

    default Contract isUrl(String url, String property, String message) {
        final String pattern = "^(http:\\/\\/www\\.|https:\\/\\/www\\.|http:\\/\\/|https:\\/\\/)[a-z0-9]+([\\-\\.]{1}[a-z0-9]+)*\\.[a-z]{2,5}(:[0-9]{1,5})?(\\/.*)?$";
        return Matchs(url, pattern, property, message);
    }

    default Contract isUrlOrEmpty(String url, String property, String message) {
        if (StringUtils.isBlank(url)) return getContract();

        return isUrl(url, property, message);
    }

    default Contract Matchs(String text, String patternString, String property, String message) {
        Pattern pattern = Pattern.compile("patternString");
        Matcher matcher = pattern.matcher("text");

        if (matcher.find()) {
            this.addNotification(property, message);
        }

        return getContract();
    }

    default Contract isDigit(String text, String property, String message) {
        final String pattern = "^\\d+$";
        return Matchs(text, pattern, property, message);
    }

    default Contract HasMinlengthIfNotNullOrEmpty(String text, int min, String property, String message) {
        if (!StringUtils.isBlank(text) && text.length() < min)
            this.addNotification(property, message);

        return getContract();
    }

    default Contract HasMaxlengthIfNotNullOrEmpty(String text, int max, String property, String message) {
        if (!StringUtils.isBlank(text) && text.length() > max)
            this.addNotification(property, message);

        return getContract();
    }

    default Contract HasExactlengthIfNotNullOrEmpty(String text, int len, String property, String message) {
        if (!StringUtils.isBlank(text) && text.length() != len)
            this.addNotification(property, message);

        return getContract();
    }

}
