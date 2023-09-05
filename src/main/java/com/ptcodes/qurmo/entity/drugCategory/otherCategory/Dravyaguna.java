package com.ptcodes.qurmo.entity.drugCategory.otherCategory;

import com.ptcodes.qurmo.entity.CommonFieldsMap;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@Data
@AllArgsConstructor
@ApplicationScoped
public class Dravyaguna {

    @Inject
    CommonFieldsMap commonFieldsMap;

    public String rasa;
    public String vipaka;
    public String virya;
    public String guna;

    public Dravyaguna() {

    }

    public void saveDravyagunaFields() {

        commonFieldsMap.saveFields("Rasa", "Dravyaguna");
        commonFieldsMap.saveFields("Vipaka", "Dravyaguna");
        commonFieldsMap.saveFields("Virya", "Dravyaguna");
        commonFieldsMap.saveFields("Guna", "Dravyaguna");
    }

}
