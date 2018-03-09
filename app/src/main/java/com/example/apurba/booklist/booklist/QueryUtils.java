package com.example.apurba.booklist.booklist;

/*
 * Created by Apurba on 3/9/2018.
 */

import android.text.TextUtils;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class QueryUtils {

    private static String JSonResponse = "{\n" +
            " \"kind\": \"books#volumes\",\n" +
            " \"totalItems\": 92,\n" +
            " \"items\": [\n" +
            "  {\n" +
            "   \"kind\": \"books#volume\",\n" +
            "   \"id\": \"F1wgqlNi8AMC\",\n" +
            "   \"etag\": \"y44dCRjwgVk\",\n" +
            "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/F1wgqlNi8AMC\",\n" +
            "   \"volumeInfo\": {\n" +
            "    \"title\": \"Flowers for Algernon\",\n" +
            "    \"subtitle\": \"Full\",\n" +
            "    \"authors\": [\n" +
            "     \"David Rogers\",\n" +
            "     \"Daniel Keyes\"\n" +
            "    ],\n" +
            "    \"publisher\": \"Dramatic Publishing\",\n" +
            "    \"publishedDate\": \"1969\",\n" +
            "    \"description\": \"The compelling story of Charlie Gordon, willing victim of a strange experiment - a moron, a genius, a man in search of himself. Poignant, funny, tragic, but with a hope for the indomitable spirit of man, this unusual play tells a story you will long remember. It also offers a magnificent role.\",\n" +
            "    \"industryIdentifiers\": [\n" +
            "     {\n" +
            "      \"type\": \"ISBN_10\",\n" +
            "      \"identifier\": \"0871295377\"\n" +
            "     },\n" +
            "     {\n" +
            "      \"type\": \"ISBN_13\",\n" +
            "      \"identifier\": \"9780871295378\"\n" +
            "     }\n" +
            "    ],\n" +
            "    \"readingModes\": {\n" +
            "     \"text\": false,\n" +
            "     \"image\": true\n" +
            "    },\n" +
            "    \"pageCount\": 117,\n" +
            "    \"printType\": \"BOOK\",\n" +
            "    \"averageRating\": 5.0,\n" +
            "    \"ratingsCount\": 1,\n" +
            "    \"maturityRating\": \"NOT_MATURE\",\n" +
            "    \"allowAnonLogging\": false,\n" +
            "    \"contentVersion\": \"0.0.1.0.preview.1\",\n" +
            "    \"imageLinks\": {\n" +
            "     \"smallThumbnail\": \"http://books.google.com/books/content?id=F1wgqlNi8AMC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api\",\n" +
            "     \"thumbnail\": \"http://books.google.com/books/content?id=F1wgqlNi8AMC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api\"\n" +
            "    },\n" +
            "    \"language\": \"en\",\n" +
            "    \"previewLink\": \"http://books.google.com/books?id=F1wgqlNi8AMC&pg=PA3&dq=flowers+inauthor:keyes&hl=&cd=1&source=gbs_api\",\n" +
            "    \"infoLink\": \"http://books.google.com/books?id=F1wgqlNi8AMC&dq=flowers+inauthor:keyes&hl=&source=gbs_api\",\n" +
            "    \"canonicalVolumeLink\": \"https://books.google.com/books/about/Flowers_for_Algernon.html?hl=&id=F1wgqlNi8AMC\"\n" +
            "   },\n" +
            "   \"saleInfo\": {\n" +
            "    \"country\": \"BD\",\n" +
            "    \"saleability\": \"NOT_FOR_SALE\",\n" +
            "    \"isEbook\": false\n" +
            "   },\n" +
            "   \"accessInfo\": {\n" +
            "    \"country\": \"BD\",\n" +
            "    \"viewability\": \"PARTIAL\",\n" +
            "    \"embeddable\": true,\n" +
            "    \"publicDomain\": false,\n" +
            "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
            "    \"epub\": {\n" +
            "     \"isAvailable\": false\n" +
            "    },\n" +
            "    \"pdf\": {\n" +
            "     \"isAvailable\": false\n" +
            "    },\n" +
            "    \"webReaderLink\": \"http://play.google.com/books/reader?id=F1wgqlNi8AMC&hl=&printsec=frontcover&source=gbs_api\",\n" +
            "    \"accessViewStatus\": \"SAMPLE\",\n" +
            "    \"quoteSharingAllowed\": false\n" +
            "   },\n" +
            "   \"searchInfo\": {\n" +
            "    \"textSnippet\": \"... New York City and Chicago. There is one intermission. *Doubling: Doris - \\u003cbr\\u003e\\nNorma; Ellen - Nurse - Mrs. Mooney; Bernice-Mrs. Nemur; Mrs. Feldman- Connie \\u003cbr\\u003e\\n- Jackie Welber g; Gina - Chair lady -Anne Welberg; Joe-Mr. Harvey; Frank-Teen \\u003cbr\\u003e\\nAge Charlie. (These are just suggestions; parts can be divided many ways, \\u003cbr\\u003e\\npossibly making the cast smaller. Some very small parts can be eliminated.) \\u003cbr\\u003e\\nSETTING &quot;\\u003cb\\u003eFlowers\\u003c/b\\u003e for Algernon&quot; is played in drapes, with certain \\u003cb\\u003eFLOWERS\\u003c/b\\u003e FOR \\u003cbr\\u003e\\nALGERNON.\"\n" +
            "   }\n" +
            "  },\n" +
            "  {\n" +
            "   \"kind\": \"books#volume\",\n" +
            "   \"id\": \"_oG_iTxP1pIC\",\n" +
            "   \"etag\": \"3HbK5MXf3ds\",\n" +
            "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/_oG_iTxP1pIC\",\n" +
            "   \"volumeInfo\": {\n" +
            "    \"title\": \"Flowers for Algernon\",\n" +
            "    \"authors\": [\n" +
            "     \"Daniel Keyes\"\n" +
            "    ],\n" +
            "    \"publisher\": \"Houghton Mifflin Harcourt\",\n" +
            "    \"publishedDate\": \"2007-12-01\",\n" +
            "    \"description\": \"The beloved, classic story of a mentally disabled man whose experimental quest for intelligence mirrors that of Algernon, an extraordinary lab mouse.\",\n" +
            "    \"industryIdentifiers\": [\n" +
            "     {\n" +
            "      \"type\": \"ISBN_10\",\n" +
            "      \"identifier\": \"0547539630\"\n" +
            "     },\n" +
            "     {\n" +
            "      \"type\": \"ISBN_13\",\n" +
            "      \"identifier\": \"9780547539638\"\n" +
            "     }\n" +
            "    ],\n" +
            "    \"readingModes\": {\n" +
            "     \"text\": true,\n" +
            "     \"image\": false\n" +
            "    },\n" +
            "    \"pageCount\": 304,\n" +
            "    \"printType\": \"BOOK\",\n" +
            "    \"categories\": [\n" +
            "     \"Fiction\"\n" +
            "    ],\n" +
            "    \"averageRating\": 4.0,\n" +
            "    \"ratingsCount\": 159,\n" +
            "    \"maturityRating\": \"NOT_MATURE\",\n" +
            "    \"allowAnonLogging\": true,\n" +
            "    \"contentVersion\": \"1.11.9.0.preview.2\",\n" +
            "    \"panelizationSummary\": {\n" +
            "     \"containsEpubBubbles\": false,\n" +
            "     \"containsImageBubbles\": false\n" +
            "    },\n" +
            "    \"imageLinks\": {\n" +
            "     \"smallThumbnail\": \"http://books.google.com/books/content?id=_oG_iTxP1pIC&printsec=frontcover&img=1&zoom=5&source=gbs_api\",\n" +
            "     \"thumbnail\": \"http://books.google.com/books/content?id=_oG_iTxP1pIC&printsec=frontcover&img=1&zoom=1&source=gbs_api\"\n" +
            "    },\n" +
            "    \"language\": \"en\",\n" +
            "    \"previewLink\": \"http://books.google.com/books?id=_oG_iTxP1pIC&dq=flowers+inauthor:keyes&hl=&cd=2&source=gbs_api\",\n" +
            "    \"infoLink\": \"http://books.google.com/books?id=_oG_iTxP1pIC&dq=flowers+inauthor:keyes&hl=&source=gbs_api\",\n" +
            "    \"canonicalVolumeLink\": \"https://books.google.com/books/about/Flowers_for_Algernon.html?hl=&id=_oG_iTxP1pIC\"\n" +
            "   },\n" +
            "   \"saleInfo\": {\n" +
            "    \"country\": \"BD\",\n" +
            "    \"saleability\": \"NOT_FOR_SALE\",\n" +
            "    \"isEbook\": false\n" +
            "   },\n" +
            "   \"accessInfo\": {\n" +
            "    \"country\": \"BD\",\n" +
            "    \"viewability\": \"NO_PAGES\",\n" +
            "    \"embeddable\": false,\n" +
            "    \"publicDomain\": false,\n" +
            "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
            "    \"epub\": {\n" +
            "     \"isAvailable\": true\n" +
            "    },\n" +
            "    \"pdf\": {\n" +
            "     \"isAvailable\": true\n" +
            "    },\n" +
            "    \"webReaderLink\": \"http://play.google.com/books/reader?id=_oG_iTxP1pIC&hl=&printsec=frontcover&source=gbs_api\",\n" +
            "    \"accessViewStatus\": \"NONE\",\n" +
            "    \"quoteSharingAllowed\": false\n" +
            "   },\n" +
            "   \"searchInfo\": {\n" +
            "    \"textSnippet\": \"Oscar-winning film Charly starring Cliff Robertson and Claire Bloom-a mentally challenged man receives an operation that turns him into a genius...and introduces him to heartache.\"\n" +
            "   }\n" +
            "  },\n" +
            "  {\n" +
            "   \"kind\": \"books#volume\",\n" +
            "   \"id\": \"NlEvuAAACAAJ\",\n" +
            "   \"etag\": \"Ee5k3Fc8vYY\",\n" +
            "   \"selfLink\": \"https://www.googleapis.com/books/v1/volumes/NlEvuAAACAAJ\",\n" +
            "   \"volumeInfo\": {\n" +
            "    \"title\": \"Arujānon Ni Hanataba O\",\n" +
            "    \"authors\": [\n" +
            "     \"Daniel Keyes\",\n" +
            "     \"Yōko Watanabe\"\n" +
            "    ],\n" +
            "    \"publishedDate\": \"1995\",\n" +
            "    \"industryIdentifiers\": [\n" +
            "     {\n" +
            "      \"type\": \"ISBN_10\",\n" +
            "      \"identifier\": \"4062614030\"\n" +
            "     },\n" +
            "     {\n" +
            "      \"type\": \"ISBN_13\",\n" +
            "      \"identifier\": \"9784062614030\"\n" +
            "     }\n" +
            "    ],\n" +
            "    \"readingModes\": {\n" +
            "     \"text\": false,\n" +
            "     \"image\": false\n" +
            "    },\n" +
            "    \"pageCount\": 349,\n" +
            "    \"printType\": \"BOOK\",\n" +
            "    \"categories\": [\n" +
            "     \"Brain\"\n" +
            "    ],\n" +
            "    \"averageRating\": 4.0,\n" +
            "    \"ratingsCount\": 142,\n" +
            "    \"maturityRating\": \"NOT_MATURE\",\n" +
            "    \"allowAnonLogging\": false,\n" +
            "    \"contentVersion\": \"preview-1.0.0\",\n" +
            "    \"language\": \"en\",\n" +
            "    \"previewLink\": \"http://books.google.com/books?id=NlEvuAAACAAJ&dq=flowers+inauthor:keyes&hl=&cd=3&source=gbs_api\",\n" +
            "    \"infoLink\": \"http://books.google.com/books?id=NlEvuAAACAAJ&dq=flowers+inauthor:keyes&hl=&source=gbs_api\",\n" +
            "    \"canonicalVolumeLink\": \"https://books.google.com/books/about/Aruj%C4%81non_Ni_Hanataba_O.html?hl=&id=NlEvuAAACAAJ\"\n" +
            "   },\n" +
            "   \"saleInfo\": {\n" +
            "    \"country\": \"BD\",\n" +
            "    \"saleability\": \"NOT_FOR_SALE\",\n" +
            "    \"isEbook\": false\n" +
            "   },\n" +
            "   \"accessInfo\": {\n" +
            "    \"country\": \"BD\",\n" +
            "    \"viewability\": \"NO_PAGES\",\n" +
            "    \"embeddable\": false,\n" +
            "    \"publicDomain\": false,\n" +
            "    \"textToSpeechPermission\": \"ALLOWED\",\n" +
            "    \"epub\": {\n" +
            "     \"isAvailable\": false\n" +
            "    },\n" +
            "    \"pdf\": {\n" +
            "     \"isAvailable\": false\n" +
            "    },\n" +
            "    \"webReaderLink\": \"http://play.google.com/books/reader?id=NlEvuAAACAAJ&hl=&printsec=frontcover&source=gbs_api\",\n" +
            "    \"accessViewStatus\": \"NONE\",\n" +
            "    \"quoteSharingAllowed\": false\n" +
            "   }\n" +
            "  }\n" +
            "]\n" +
            "}";

    private QueryUtils(){

    }

    public static List<BookInfo> extractFeatureFromJson() {
        if (TextUtils.isEmpty(JSonResponse)) {
            return null;
        }
        List<BookInfo> books = new ArrayList<>();
        try {
            // build up a list of Earthquake objects with the corresponding data.
            JSONObject jsonObj = new JSONObject(JSonResponse);
            JSONArray items = jsonObj.getJSONArray("items");
            // looping through All features
            for (int i = 0; i < items.length(); i++){
                JSONObject book = items.getJSONObject(i);
                JSONObject volumeInfo = book.getJSONObject("volumeInfo");
                String tittle = volumeInfo.getString("title");
                JSONArray authors = volumeInfo.getJSONArray("authors");
                String author = authors.getString(0);// teaking the first author
                books.add(new BookInfo(tittle, author));
            }
        } catch (JSONException e) {
            Log.e("QueryUtils", "Problem parsing the book JSON results", e);
        }
        return books;
    }
}
