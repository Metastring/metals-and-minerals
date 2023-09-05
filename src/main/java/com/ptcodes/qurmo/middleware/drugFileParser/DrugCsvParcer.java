package com.ptcodes.qurmo.middleware.drugFileParser;


import com.ptcodes.qurmo.entity.CommonFieldsMap;
import com.ptcodes.qurmo.entity.DrugDocument;
import com.ptcodes.qurmo.entity.drugCategory.BookReference;
import com.ptcodes.qurmo.entity.drugCategory.Nomenclature;
import com.ptcodes.qurmo.entity.drugCategory.otherCategory.*;
import com.ptcodes.qurmo.middleware.drugFileParser.basedOnCategory.BookReferenceParser;
import com.ptcodes.qurmo.middleware.drugFileParser.basedOnCategory.NomenclatureParser;
import com.ptcodes.qurmo.middleware.drugFileParser.basedOnCategory.otherCategory.*;
import com.ptcodes.qurmo.request.DrugFileSave;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.jboss.resteasy.annotations.providers.multipart.MultipartForm;
import org.jboss.resteasy.plugins.providers.multipart.InputPart;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.core.Response;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ApplicationScoped
public class DrugCsvParcer {

    @Inject
    CommonFieldsMap commonFieldsMap;

    Map<String, String> fields = new HashMap<>();

    public Response drugsSaveUsingCSV(@MultipartForm MultipartFormDataInput form) {

        Response response = null;

        fields.putAll(commonFieldsMap.commonFields());
        System.out.println("main field size => " + fields.size());

        List<DrugDocument> drugDocumentList = new ArrayList<>();

        Map<String, List<InputPart>> data = form.getFormDataMap();
        for (Map.Entry<String, List<InputPart>> entry : data.entrySet()) {
            for (InputPart inputPart : entry.getValue()) {
                try (InputStream inputStream = inputPart.getBody(InputStream.class, null);
                     Reader fileReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                     CSVParser csvParser = CSVFormat.EXCEL.withFirstRecordAsHeader().parse(fileReader)) {

                    for (CSVRecord csvRecord : csvParser.getRecords()) {
                        // Skip processing if the entire row is empty or contains only empty values
                        if (csvRecord.toMap().values().stream().allMatch(String::isEmpty)) {
                            continue; // Skip this iteration
                        }

                        DrugDocument drugDocument = new DrugDocument();
                        Map<String, Object> dynamicFields = new HashMap<>();

                        Nomenclature nomenclature = new Nomenclature();
                        BookReference bookReference = new BookReference();

                        Actions actions = new Actions();
                        Appearance appearance = new Appearance();
                        Criteria criteria = new Criteria();
                        Distribution distribution = new Distribution();
                        DosageAndTreatment dosageAndTreatment = new DosageAndTreatment();
                        Dravyaguna dravyaguna = new Dravyaguna();
                        Effects effects = new Effects();
                        MythologyReference mythologyReference = new MythologyReference();
                        OtherUses otherUses = new OtherUses();
                        PurificationProcess purificationProcess = new PurificationProcess();
                        Types types = new Types();

                        for (String header : csvParser.getHeaderMap().keySet()) {

                            String value;
                            if (fields.containsKey(header)) {
                                value = fields.get(header);

                                if (value.equals("Nomenclature")) {
                                    NomenclatureParser.parseNomenclatureValues(header, csvRecord.get(header), nomenclature);
                                } else if (value.equals("BookReference")){
                                    BookReferenceParser.parseBookReferenceValues(header, csvRecord.get(header), bookReference);
                                } else if (value.equals("Actions")) {
                                    ActionsParser.parseActionValues(header, csvRecord.get(header), actions);
                                } else if (value.equals("Appearance")) {
                                    AppearanceParser.parseAppearanceValues(header, csvRecord.get(header), appearance);
                                } else if (value.equals("Criteria")) {
                                    CriteriaParser.parseCriteriaValues(header, csvRecord.get(header), criteria);
                                } else if (value.equals("Distribution")) {
                                    DistributionParser.parseDistributionValues(header, csvRecord.get(header), distribution);
                                } else if (value.equals("DosageAndTreatment")) {
                                    DosageAndTreatmentParser.parseDosageAndTreatmentValues(header, csvRecord.get(header), dosageAndTreatment);
                                } else if (value.equals("Dravyaguna")) {
                                    DravyagunaParser.parseDravyagunaValues(header, csvRecord.get(header), dravyaguna);
                                } else if (value.equals("Effects")) {
                                    EffectsParser.parseEffectsValues(header, csvRecord.get(header), effects);
                                } else if (value.equals("MythologyReference")) {
                                    MythologyReferenceParser.parseMythologyReferenceValues(header, csvRecord.get(header), mythologyReference);
                                } else if (value.equals("OtherUses")) {
                                    OtherUsesParser.parseOtherUsesValues(header, csvRecord.get(header), otherUses);
                                } else if (value.equals("PurificationProcess")) {
                                    PurificationProcessParser.parsePurificationProcessValues(header, csvRecord.get(header), purificationProcess);
                                } else {
                                    TypesParser.parseTypesValues(header, csvRecord.get(header), types);
                                }
                            } else {
                                dynamicFields.put(header, csvRecord.get(header));
                            }
                        }

                        drugDocument.setNomenclature(nomenclature);
                        drugDocument.setBookReference(bookReference);

                        drugDocument.setTypes(types);
                        drugDocument.setMythologyReference(mythologyReference);
                        drugDocument.setDistribution(distribution);
                        drugDocument.setAppearance(appearance);
                        drugDocument.setCriteria(criteria);
                        drugDocument.setPurificationProcess(purificationProcess);
                        drugDocument.setDravyaguna(dravyaguna);
                        drugDocument.setActions(actions);
                        drugDocument.setOtherUses(otherUses);
                        drugDocument.setDosageAndTreatment(dosageAndTreatment);
                        drugDocument.setEffects(effects);

                        drugDocument.setDynamicFields(dynamicFields);

                        drugDocumentList.add(drugDocument);

                    }


                } catch (IOException e) {
                    // Handle exception
                }

                response = DrugFileSave.saveDrugFile(drugDocumentList);

            }
        }

        return response;
    }
}
