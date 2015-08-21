package com.opensource.supercity.factory;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

public class ParserFactory {

    public static List<CSVRecord> parseCSV(String path) throws IOException {
        CSVParser parser = CSVParser.parse(new File(path), Charset.defaultCharset(), CSVFormat.DEFAULT.withHeader()
                                                                                                      .withNullString("NULL"));
        try {
            return parser.getRecords();
        } finally {
            parser.close();
        }
    }

}
