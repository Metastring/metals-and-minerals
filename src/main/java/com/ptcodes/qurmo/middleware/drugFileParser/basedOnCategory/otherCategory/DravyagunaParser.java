package com.ptcodes.qurmo.middleware.drugFileParser.basedOnCategory.otherCategory;

import com.ptcodes.qurmo.entity.drugCategory.otherCategory.Dravyaguna;

public class DravyagunaParser {

    public static void parseDravyagunaValues(String header, String value, Dravyaguna dravyaguna) {

        if (header.equals("Rasa")) {
            dravyaguna.setRasa(value);
        } else if (header.equals("Vipaka")) {
            dravyaguna.setVipaka(value);
        } else if (header.equals("Virya")) {
            dravyaguna.setVirya(value);
        } else {
            dravyaguna.setGuna(value);
        }

    }
}
