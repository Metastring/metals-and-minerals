package com.ptcodes.qurmo.middleware.drugFileParser.basedOnCategory.otherCategory;

import com.ptcodes.qurmo.entity.drugCategory.otherCategory.Appearance;

public class AppearanceParser {

    public static void parseAppearanceValues(String header, String value, Appearance appearance) {

        if (header.equals("Appearance")) {
            appearance.setAppearance(value);
        }

    }
}
