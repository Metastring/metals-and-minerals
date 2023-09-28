package com.metastring.metsAndmins.entity.drugCategory.otherCategory;

import com.metastring.metsAndmins.entity.CommonFieldsMap;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@Data
@AllArgsConstructor
@ApplicationScoped
public class OtherUses {

    @Inject
    CommonFieldsMap commonFieldsMap;

    public String otherUses;

    public OtherUses() {

    }

    public void saveOtherUsesFields() {

        commonFieldsMap.saveFields("Other_Uses", "OtherUses");
    }
}
