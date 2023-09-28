package com.metastring.metsAndmins.middleware.drugFileParser.basedOnCategory.otherCategory;

import com.metastring.metsAndmins.entity.drugCategory.otherCategory.MythologyReference;

public class MythologyReferenceParser {

    public static void parseMythologyReferenceValues(String header, String value, MythologyReference mythologyReference) {
        if (header.equals("Mythological_Origin")) {
            mythologyReference.setMythologicalOrigin(value);
        }
    }
}
