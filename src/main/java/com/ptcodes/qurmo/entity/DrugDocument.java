package com.ptcodes.qurmo.entity;

import com.ptcodes.qurmo.entity.drugCategory.BookReference;
import com.ptcodes.qurmo.entity.drugCategory.Nomenclature;
import com.ptcodes.qurmo.entity.drugCategory.otherCategory.*;
import lombok.Data;
import org.bson.types.ObjectId;

import java.util.Map;

@Data
public class DrugDocument {

    public ObjectId id;

    public Nomenclature nomenclature;
    public BookReference bookReference;
    public Types types;
    public MythologyReference mythologyReference;
    public Distribution distribution;
    public Appearance appearance;
    public Criteria criteria;
    public PurificationProcess purificationProcess;
    public Dravyaguna dravyaguna;
    public Actions actions;
    public OtherUses otherUses;
    public DosageAndTreatment dosageAndTreatment;
    public Effects effects;

    public Map<String, Object> dynamicFields;
}
