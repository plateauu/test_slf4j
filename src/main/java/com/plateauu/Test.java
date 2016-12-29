package com.plateauu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {

    private static final Logger logger = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        logger.info("Testujemy ");
        logger.warn("Testujemy ");
        logger.debug("Testujemy "); //tego nie chce
    }

}

