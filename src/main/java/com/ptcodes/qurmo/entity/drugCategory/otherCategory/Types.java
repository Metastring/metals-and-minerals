package com.ptcodes.qurmo.entity.drugCategory.otherCategory;

import com.ptcodes.qurmo.entity.CommonFieldsMap;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@Data
@AllArgsConstructor
@ApplicationScoped
public class Types {

    @Inject
    CommonFieldsMap commonFieldsMap;

    public String types;

    public Types() {

    }

    public void saveTypesFields() {

        commonFieldsMap.saveFields("Types", "Types");
    }

}
