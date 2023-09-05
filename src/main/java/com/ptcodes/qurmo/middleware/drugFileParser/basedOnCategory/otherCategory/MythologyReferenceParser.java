package com.ptcodes.qurmo.middleware.drugFileParser.basedOnCategory.otherCategory;

import com.ptcodes.qurmo.entity.drugCategory.otherCategory.MythologyReference;

public class MythologyReferenceParser {

    public static void parseMythologyReferenceValues(String header, String value, MythologyReference mythologyReference) {
        if (header.equals("Mythological_Origin")) {
            mythologyReference.setMythologicalOrigin(value);
        }
    }
}
