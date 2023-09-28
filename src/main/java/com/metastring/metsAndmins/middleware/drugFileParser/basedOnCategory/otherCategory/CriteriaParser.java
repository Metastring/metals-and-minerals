package com.metastring.metsAndmins.middleware.drugFileParser.basedOnCategory.otherCategory;

import com.metastring.metsAndmins.entity.drugCategory.otherCategory.Criteria;

public class CriteriaParser {

    public static void parseCriteriaValues(String header, String value, Criteria criteria) {

        if (header.equals("Selection_Criteria")) {
            criteria.setSelectionCriteria(value);
        } else {
            criteria.setExclusionCriteria(value);
        }

    }
}
