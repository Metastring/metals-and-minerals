package com.metastring.metsAndmins.middleware.drugFileParser.basedOnCategory.otherCategory;

import com.metastring.metsAndmins.entity.drugCategory.otherCategory.Distribution;

public class DistributionParser {

    public static void parseDistributionValues(String header, String value, Distribution distribution) {

        if (header.equals("Occurence")) {
            distribution.setOccurrence(value);
        }

    }
}
