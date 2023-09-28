package com.metastring.metsAndmins.entity.drugCategory.otherCategory;

import com.metastring.metsAndmins.entity.CommonFieldsMap;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@Data
@AllArgsConstructor
@ApplicationScoped
public class Actions {

    @Inject
    CommonFieldsMap commonFieldsMap;

    public String karma;
    public String actionOnDoshas;
    public String actionOnDiseases;

    public Actions() {
    }

    public void saveActionsFields() {

        commonFieldsMap.saveFields("Karma", "Actions");
        commonFieldsMap.saveFields("Action_On_Doshas", "Actions");
        commonFieldsMap.saveFields("Action_On_Diseases", "Actions");

    }
}
