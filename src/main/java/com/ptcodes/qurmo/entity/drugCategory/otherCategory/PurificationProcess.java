package com.ptcodes.qurmo.entity.drugCategory.otherCategory;

import com.ptcodes.qurmo.entity.CommonFieldsMap;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@Data
@AllArgsConstructor
@ApplicationScoped
public class PurificationProcess {

    @Inject
    CommonFieldsMap commonFieldsMap;

    public String dhanyabhraka;
    public String shodhana;
    public String marakagana;
    public String marana;
    public String bhasmaTests;
    public String amrutikarana;
    public String lohitikarana;
    public String satvapatana;
    public String satvashodhana;
    public String satvamarana;
    public String satvamrudukarana;
    public String druti;

    public PurificationProcess() {

    }

    public void savePurificationProcessFields() {

        commonFieldsMap.saveFields("Dhanyabhraka", "PurificationProcess");
        commonFieldsMap.saveFields("Shodhana", "PurificationProcess");
        commonFieldsMap.saveFields("Marakagana", "PurificationProcess");
        commonFieldsMap.saveFields("Marana", "PurificationProcess");
        commonFieldsMap.saveFields("Bhasma_Tests", "PurificationProcess");
        commonFieldsMap.saveFields("Amrutikarana", "PurificationProcess");
        commonFieldsMap.saveFields("Lohitikarana", "PurificationProcess");
        commonFieldsMap.saveFields("Satvapatana", "PurificationProcess");
        commonFieldsMap.saveFields("Satvashodhana", "PurificationProcess");
        commonFieldsMap.saveFields("Satvamarana", "PurificationProcess");
        commonFieldsMap.saveFields("Satvamrudukarana", "PurificationProcess");
        commonFieldsMap.saveFields("Druti", "PurificationProcess");
    }

}
