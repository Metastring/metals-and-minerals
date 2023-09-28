package com.metastring.metsAndmins.middleware.drugFileParser.basedOnCategory.otherCategory;

import com.metastring.metsAndmins.entity.drugCategory.otherCategory.Types;

public class TypesParser {

    public static void parseTypesValues(String header, String value, Types types) {

        if (header.equals("Types")) {
            types.setTypes(value);
        }
    }
}
