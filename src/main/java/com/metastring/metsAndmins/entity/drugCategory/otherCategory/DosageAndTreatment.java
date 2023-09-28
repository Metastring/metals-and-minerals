package com.metastring.metsAndmins.entity.drugCategory.otherCategory;

import com.metastring.metsAndmins.entity.CommonFieldsMap;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@Data
@AllArgsConstructor
@ApplicationScoped
public class DosageAndTreatment {

    @Inject
    CommonFieldsMap commonFieldsMap;

    public String dose;
    public String anupana;
    public String pathya;
    public String apathya;

    public DosageAndTreatment() {

    }

    public void saveDosageAndTreatmentFields() {

        commonFieldsMap.saveFields("Dose", "DosageAndTreatment");
        commonFieldsMap.saveFields("Anupana", "DosageAndTreatment");
        commonFieldsMap.saveFields("Pathya", "DosageAndTreatment");
        commonFieldsMap.saveFields("Apathya", "DosageAndTreatment");
    }

}
