package com.ptcodes.qurmo.middleware.drugFileParser.basedOnCategory.otherCategory;

import com.ptcodes.qurmo.entity.drugCategory.otherCategory.Criteria;

public class CriteriaParser {

    public static void parseCriteriaValues(String header, String value, Criteria criteria) {

        if (header.equals("Selection_Criteria")) {
            criteria.setSelectionCriteria(value);
        } else {
            criteria.setExclusionCriteria(value);
        }

    }
}
