package com.gene.common.util.constant;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//@Component
//@ConfigurationProperties(prefix = "constant.util",locations = "classpath:constant.properties")

@Component
@ConfigurationProperties(prefix = "constant.util")
@PropertySource("classpath:constant.properties")
public class ConstantUtil {
    public static String SSO_URL;

    public static String getSsoUrl() {
        return SSO_URL;
    }

    public static void setSsoUrl(String ssoUrl) {
        SSO_URL = ssoUrl;
    }
}
