package com.opensource.supercity.model;

import org.apache.commons.csv.CSVRecord;

public class ConstructionData implements CSVRecordedT<ConstructionData> {
    String id, developer, projectName, projectStatus, landSize, latitude, longitude;

    public ConstructionData(String id, String developer, String projectName, String projectStatus, String landSize, String latitude, String longitude) {
        this.id = id;
        this.developer = developer;
        this.projectName = projectName;
        this.projectStatus = projectStatus;
        this.landSize = landSize;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    private ConstructionData(Builder builder) {
        id = builder.id;
        developer = builder.developer;
        projectName = builder.projectName;
        projectStatus = builder.projectStatus;
        landSize = builder.landSize;
        latitude = builder.latitude;
        longitude = builder.longitude;
    }

    public ConstructionData() {

    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Override
    public ConstructionData fromCsvRecord(CSVRecord csvRecord) {
        return newBuilder().id(csvRecord.get("ID"))
                           .developer(csvRecord.get("DEVELOPER"))
                           .projectName(csvRecord.get("PROJECT_NAME"))
                           .projectStatus(csvRecord.get("PROJECT_STATUS"))
                           .landSize(csvRecord.get("LAND_SIZE"))
                           .latitude(csvRecord.get("LAT"))
                           .longitude(csvRecord.get("LONG"))
                           .build();
    }

    @Override
    public String toString() {
        return "ConstructionData{" +
                "id='" + id + '\'' +
                ", developer='" + developer + '\'' +
                ", projectName='" + projectName + '\'' +
                ", projectStatus='" + projectStatus + '\'' +
                ", landSize='" + landSize + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                '}';
    }

    public static final class Builder {
        private String id;
        private String developer;
        private String projectName;
        private String projectStatus;
        private String landSize;
        private String latitude;
        private String longitude;

        private Builder() {
        }

        public Builder id(String val) {
            id = val;
            return this;
        }

        public Builder developer(String val) {
            developer = val;
            return this;
        }

        public Builder projectName(String val) {
            projectName = val;
            return this;
        }

        public Builder projectStatus(String val) {
            projectStatus = val;
            return this;
        }

        public Builder landSize(String val) {
            landSize = val;
            return this;
        }

        public Builder latitude(String val) {
            latitude = val;
            return this;
        }

        public Builder longitude(String val) {
            longitude = val;
            return this;
        }

        public ConstructionData build() {
            return new ConstructionData(this);
        }
    }
}
