package com.metastring.metsAndmins.entity.drugCategory;

import com.metastring.metsAndmins.entity.CommonFieldsMap;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;


@Data
@AllArgsConstructor
@ApplicationScoped
public class Nomenclature {

    @Inject
    CommonFieldsMap commonFieldsMap;


    public String drugName;
    public String category;
    public String etymology;
    public String synonyms;

    public Nomenclature() {
    }

    public void saveNomenclatureFields() {

        commonFieldsMap.saveFields("Drug_Name", "Nomenclature");
        commonFieldsMap.saveFields("Class", "Nomenclature");
        commonFieldsMap.saveFields("Etymology", "Nomenclature");
        commonFieldsMap.saveFields("Synonyms", "Nomenclature");

    }


}
