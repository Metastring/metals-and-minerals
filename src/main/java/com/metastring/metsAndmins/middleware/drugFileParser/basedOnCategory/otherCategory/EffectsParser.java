package com.metastring.metsAndmins.middleware.drugFileParser.basedOnCategory.otherCategory;

import com.metastring.metsAndmins.entity.drugCategory.otherCategory.Effects;

public class EffectsParser {

    public static void parseEffectsValues(String header, String value, Effects effects) {
        if (header.equals("Therapeutic_Action_of_Satva")) {
            effects.setTherapeuticActionOfSatva(value);
        } else if (header.equals("Effects_of_Raw_Drug_Use")) {
            effects.setEffectsOfRawDrugUse(value);
        } else {
            effects.setToxicEffects(value);
        }
    }
}
