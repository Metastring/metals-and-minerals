package com.metastring.metsAndmins.middleware.drugFileParser.basedOnCategory;

import com.metastring.metsAndmins.entity.drugCategory.BookReference;

public class BookReferenceParser {
    
    public static void parseBookReferenceValues(String header, String value, BookReference bookReference) {
        
        if (header.equals("Book")) {
            bookReference.setBook(value);
        } else if (header.equals("Text_Code")) {
            bookReference.setTextCode(value);
        } else if (header.equals("Page_Number")) {
            bookReference.setPageNumber(value);
        } else {
            bookReference.setShlokaNumber(value);
        }
    }
}
