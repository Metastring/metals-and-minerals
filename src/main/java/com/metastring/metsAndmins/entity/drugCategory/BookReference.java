package com.metastring.metsAndmins.entity.drugCategory;

import com.metastring.metsAndmins.entity.CommonFieldsMap;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@Data
@AllArgsConstructor
@ApplicationScoped
public class BookReference {

    @Inject
    CommonFieldsMap commonFieldsMap;

    public String book;
    public String textCode;
    public String pageNumber;
    public String shlokaNumber;

    public BookReference() {
    }

    public void saveBookReferenceFields() {

        commonFieldsMap.saveFields("Book", "BookReference");
        commonFieldsMap.saveFields("Text_Code", "BookReference");
        commonFieldsMap.saveFields("Page_Number", "BookReference");
        commonFieldsMap.saveFields("Shloka_Number", "BookReference");

    }

}
