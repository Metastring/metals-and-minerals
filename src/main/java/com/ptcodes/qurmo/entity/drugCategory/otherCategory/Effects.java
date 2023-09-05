package com.ptcodes.qurmo.entity.drugCategory.otherCategory;

import com.ptcodes.qurmo.entity.CommonFieldsMap;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@Data
@AllArgsConstructor
@ApplicationScoped
public class Effects {

    @Inject
    CommonFieldsMap commonFieldsMap;

    public String therapeuticActionOfSatva;
    public String effectsOfRawDrugUse;
    public String toxicEffects;

    public Effects() {

    }

    public void saveEffectsFields() {

        commonFieldsMap.saveFields("Therapeutic_Action_of_Satva", "Effects");
        commonFieldsMap.saveFields("Effects_of_Raw_Drug_Use", "Effects");
        commonFieldsMap.saveFields("Toxic_Effects", "Effects");
    }

}
