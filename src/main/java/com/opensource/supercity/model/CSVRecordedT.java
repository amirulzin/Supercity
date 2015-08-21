package com.opensource.supercity.model;

import org.apache.commons.csv.CSVRecord;

public interface CSVRecordedT<T> {
    T fromCsvRecord(CSVRecord csvRecord);
}
