package com.metastring.metsAndmins.entity.drugCategory.otherCategory;

import com.metastring.metsAndmins.entity.CommonFieldsMap;
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
