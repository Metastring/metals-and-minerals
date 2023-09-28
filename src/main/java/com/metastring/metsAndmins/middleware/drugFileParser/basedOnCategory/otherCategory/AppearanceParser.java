package com.metastring.metsAndmins.middleware.drugFileParser.basedOnCategory.otherCategory;

import com.metastring.metsAndmins.entity.drugCategory.otherCategory.Appearance;

public class AppearanceParser {

    public static void parseAppearanceValues(String header, String value, Appearance appearance) {

        if (header.equals("Appearance")) {
            appearance.setAppearance(value);
        }

    }
}
