package com.metastring.metsAndmins.entity.drugCategory.otherCategory;

import com.metastring.metsAndmins.entity.CommonFieldsMap;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@Data
@AllArgsConstructor
@ApplicationScoped
public class Appearance {

    @Inject
    CommonFieldsMap commonFieldsMap;

    public String appearance;

    public Appearance() {

    }

    public void saveAppearanceFields() {

        commonFieldsMap.saveFields("Appearance", "Appearance");
    }
}
