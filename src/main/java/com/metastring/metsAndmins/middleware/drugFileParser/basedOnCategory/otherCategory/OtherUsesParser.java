package com.metastring.metsAndmins.middleware.drugFileParser.basedOnCategory.otherCategory;

import com.metastring.metsAndmins.entity.drugCategory.otherCategory.OtherUses;

public class OtherUsesParser {

    public static void parseOtherUsesValues(String header, String value, OtherUses otherUses) {
        if (header.equals("Other_Uses")) {
            otherUses.setOtherUses(value);
        }

    }
}
