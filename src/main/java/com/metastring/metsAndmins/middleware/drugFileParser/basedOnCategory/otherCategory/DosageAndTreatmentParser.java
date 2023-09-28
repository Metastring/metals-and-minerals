package com.metastring.metsAndmins.middleware.drugFileParser.basedOnCategory.otherCategory;

import com.metastring.metsAndmins.entity.drugCategory.otherCategory.DosageAndTreatment;

public class DosageAndTreatmentParser {

    public static void parseDosageAndTreatmentValues(String header, String value, DosageAndTreatment dosageAndTreatment) {

        if (header.equals("Dose")) {
            dosageAndTreatment.setDose(value);
        } else if (header.equals("Anupana")) {
            dosageAndTreatment.setAnupana(value);
        } else if (header.equals("Pathya")) {
            dosageAndTreatment.setPathya(value);
        } else {
            dosageAndTreatment.setApathya(value);
        }

    }
}
