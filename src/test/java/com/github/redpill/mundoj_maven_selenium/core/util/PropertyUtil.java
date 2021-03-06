package com.github.redpill.mundoj_maven_selenium.core.util;

public class PropertyUtil {

    private static final String TARGET_URL = "targetUrl";
    private static final String TARGET_ENVIRONMENT = "targetEnvironment";

    public static String getTargetURL() {
	return System.getProperty(TARGET_URL);
    }

    public static String getTargetEnvironment() {
	return System.getProperty(TARGET_ENVIRONMENT);
    }
}
