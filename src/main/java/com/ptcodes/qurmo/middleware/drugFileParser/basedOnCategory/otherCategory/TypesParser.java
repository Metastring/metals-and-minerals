package com.ptcodes.qurmo.middleware.drugFileParser.basedOnCategory.otherCategory;

import com.ptcodes.qurmo.entity.drugCategory.otherCategory.Types;

public class TypesParser {

    public static void parseTypesValues(String header, String value, Types types) {

        if (header.equals("Types")) {
            types.setTypes(value);
        }
    }
}
