package com.ptcodes.qurmo.middleware.drugFileParser.basedOnCategory.otherCategory;

import com.ptcodes.qurmo.entity.drugCategory.otherCategory.Actions;

public class ActionsParser {

    public static void parseActionValues(String header, String value, Actions actions) {
        if (header.equals("Karma")) {
            actions.setKarma(value);
        } else if (header.equals("Action_On_Doshas")) {
            actions.setActionOnDoshas(value);
        } else {
            actions.setActionOnDiseases(value);
        }
    }
}
