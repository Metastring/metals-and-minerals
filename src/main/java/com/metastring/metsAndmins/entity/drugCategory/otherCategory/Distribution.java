package com.metastring.metsAndmins.entity.drugCategory.otherCategory;

import com.metastring.metsAndmins.entity.CommonFieldsMap;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@Data
@AllArgsConstructor
@ApplicationScoped
public class Distribution {

    @Inject
    CommonFieldsMap commonFieldsMap;

    public String occurrence;

    public Distribution() {

    }

    public void saveDistributionFields() {

        commonFieldsMap.saveFields("Occurence", "Distribution");
    }

}
