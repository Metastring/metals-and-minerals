package com.metastring.metsAndmins.request;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.metastring.metsAndmins.entity.DrugDocument;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.json.bind.JsonbBuilder;
import javax.ws.rs.core.Response;
import java.util.List;

@ApplicationScoped
public class DrugFileSave {

    @Inject
    MongoClient mongoClient;

    public static Response saveDrugFile(List<DrugDocument> drugDocumentList) {

        try (MongoClient client = MongoClients.create("mongodb+srv://msf:123@cluster0.hi676sp.mongodb.net/?retryWrites=true&w=majority")) {

            System.out.println("Trying connecting collection mongQur, mongoClientId => " + client);
            MongoCollection<Document> collection = client.getDatabase("mongQur").getCollection("finaltest");
            System.out.println("Collection mongQur connected successfully, mongoCollectionId => " + collection);

            for (DrugDocument drugDocument : drugDocumentList) {

                ObjectMapper mapper = new ObjectMapper();
                Document document = new Document()
                        .append("nomenclature", mapper.readValue(JsonbBuilder.create().toJson(drugDocument.getNomenclature()), Object.class))
                        .append("bookReference", mapper.readValue(JsonbBuilder.create().toJson(drugDocument.getBookReference()), Object.class))
                        .append("types", mapper.readValue(JsonbBuilder.create().toJson(drugDocument.getTypes()), Object.class))
                        .append("mythologyReference", mapper.readValue(JsonbBuilder.create().toJson(drugDocument.getMythologyReference()), Object.class))
                        .append("distribution", mapper.readValue(JsonbBuilder.create().toJson(drugDocument.getDistribution()), Object.class))
                        .append("appearance", mapper.readValue(JsonbBuilder.create().toJson(drugDocument.getAppearance()), Object.class))
                        .append("criteria", mapper.readValue(JsonbBuilder.create().toJson(drugDocument.getCriteria()), Object.class))
                        .append("purificationProcess", mapper.readValue(JsonbBuilder.create().toJson(drugDocument.getPurificationProcess()), Object.class))
                        .append("dravyaguna", mapper.readValue(JsonbBuilder.create().toJson(drugDocument.getDravyaguna()), Object.class))
                        .append("actions", mapper.readValue(JsonbBuilder.create().toJson(drugDocument.getActions()), Object.class))
                        .append("otherUses", mapper.readValue(JsonbBuilder.create().toJson(drugDocument.getOtherUses()), Object.class))
                        .append("dosageAndTreatment", mapper.readValue(JsonbBuilder.create().toJson(drugDocument.getDosageAndTreatment()), Object.class))
                        .append("effects", mapper.readValue(JsonbBuilder.create().toJson(drugDocument.getEffects()), Object.class))
                        .append("dynamicFields", new Document(drugDocument.getDynamicFields()));

                collection.insertOne(document);
            }
        } catch (Exception e) {
            System.out.println("Attempt connecting collection failed..");
            System.out.println(e);
        }

        return Response.ok().entity(drugDocumentList).build();
    }
}
