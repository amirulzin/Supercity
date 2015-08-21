package com.opensource.supercity.model;

import org.apache.commons.csv.CSVRecord;

public interface CSVObject<T> {
    T fromCsvRecord(CSVRecord csvRecord);
}
