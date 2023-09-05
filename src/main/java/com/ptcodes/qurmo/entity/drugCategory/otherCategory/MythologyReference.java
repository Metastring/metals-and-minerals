package com.ptcodes.qurmo.entity.drugCategory.otherCategory;

import com.ptcodes.qurmo.entity.CommonFieldsMap;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@Data
@AllArgsConstructor
@ApplicationScoped
public class MythologyReference {

    @Inject
    CommonFieldsMap commonFieldsMap;

    public String mythologicalOrigin;

    public MythologyReference() {

    }

    public void saveMythologyReferenceFields() {

        commonFieldsMap.saveFields("Mythological_Origin", "MythologyReference");
    }

}
