package com.ptcodes.qurmo.middleware.drugFileParser.basedOnCategory;

import com.ptcodes.qurmo.entity.drugCategory.Nomenclature;

public class NomenclatureParser {

    public static void parseNomenclatureValues(String header, String value, Nomenclature nomenclature) {
        if (header.equals("Drug_Name")) {
            nomenclature.setDrugName(value);
        } else if (header.equals("Class")) {
            nomenclature.setCategory(value);
        } else if (header.equals("Etymology")) {
            nomenclature.setEtymology(value);
        } else {
            nomenclature.setSynonyms(value);
        }
    }
}
