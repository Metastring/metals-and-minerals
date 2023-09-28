package com.metastring.metsAndmins.entity.drugCategory.otherCategory;

import com.metastring.metsAndmins.entity.CommonFieldsMap;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@Data
@AllArgsConstructor
@ApplicationScoped
public class Criteria {

    @Inject
    CommonFieldsMap commonFieldsMap;

    public String selectionCriteria;
    public String exclusionCriteria;

    public Criteria() {

    }

    public void saveCriteriaFields() {

        commonFieldsMap.saveFields("Selection_Criteria", "Criteria");
        commonFieldsMap.saveFields("Exclusion_Criteria", "Criteria");
    }

}
