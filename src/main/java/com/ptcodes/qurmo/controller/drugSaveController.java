package com.ptcodes.qurmo.controller;

import com.ptcodes.qurmo.entity.drugCategory.BookReference;
import com.ptcodes.qurmo.entity.drugCategory.Nomenclature;
import com.ptcodes.qurmo.entity.drugCategory.otherCategory.*;
import com.ptcodes.qurmo.middleware.drugFileParser.DrugCsvParcer;
import org.jboss.resteasy.annotations.providers.multipart.MultipartForm;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/upload")
public class drugSaveController {

    @Inject
    DrugCsvParcer drugCsvParcer;

    @Inject
    Nomenclature nomenclature;
    @Inject
    BookReference bookReference;
    @Inject
    Actions actions;
    @Inject
    OtherUses otherUses;
    @Inject
    Appearance appearance;
    @Inject
    Criteria criteria;
    @Inject
    Distribution distribution;
    @Inject
    DosageAndTreatment dosageAndTreatment;
    @Inject
    Dravyaguna dravyaguna;
    @Inject
    Effects effects;
    @Inject
    MythologyReference mythologyReference;
    @Inject
    PurificationProcess purificationProcess;
    @Inject
    Types types;

    @POST
    @Path("/drug")
    @Consumes("multipart/form-data")
    public Response parseDrugCSVFile(@MultipartForm MultipartFormDataInput form) {

        saveFields();

        Response response = drugCsvParcer.drugsSaveUsingCSV(form);

        return response;
    }

    public void saveFields() {

        nomenclature.saveNomenclatureFields();
        bookReference.saveBookReferenceFields();
        actions.saveActionsFields();
        otherUses.saveOtherUsesFields();
        appearance.saveAppearanceFields();
        criteria.saveCriteriaFields();
        distribution.saveDistributionFields();
        dosageAndTreatment.saveDosageAndTreatmentFields();
        dravyaguna.saveDravyagunaFields();
        effects.saveEffectsFields();
        mythologyReference.saveMythologyReferenceFields();
        purificationProcess.savePurificationProcessFields();
        types.saveTypesFields();

    }
}
