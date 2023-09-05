package com.ptcodes.qurmo.middleware.drugFileParser.basedOnCategory.otherCategory;

import com.ptcodes.qurmo.entity.drugCategory.otherCategory.Distribution;

public class DistributionParser {

    public static void parseDistributionValues(String header, String value, Distribution distribution) {

        if (header.equals("Occurence")) {
            distribution.setOccurrence(value);
        }

    }
}
