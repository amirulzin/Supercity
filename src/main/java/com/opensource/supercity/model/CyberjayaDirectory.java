package com.opensource.supercity.model;

import org.apache.commons.csv.CSVRecord;


public class CyberjayaDirectory implements CSVObject<CyberjayaDirectory> {
    private String id;
    private String category;
    private String premise;
    private String phone;
    private String email;
    private String website;
    private String address;
    private String latitude;
    private String longitude;

    public CyberjayaDirectory() {
    }

    private CyberjayaDirectory(Builder builder) {
        address = builder.address;
        id = builder.id;
        category = builder.category;
        premise = builder.premise;
        phone = builder.phone;
        email = builder.email;
        website = builder.website;
        latitude = builder.latitude;
        longitude = builder.longitude;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getAddress() {
        return address;
    }

    public String getCategory() {
        return category;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getPhone() {
        return phone;
    }

    public String getPremise() {
        return premise;
    }

    public String getWebsite() {
        return website;
    }

    @Override
    public String toString() {
        return "CyberjayaDirectory{" +
                "id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", category='" + category + '\'' +
                ", premise='" + premise + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", website='" + website + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                '}';
    }

    @Override
    public CyberjayaDirectory fromCsvRecord(CSVRecord csvRecord) {
        return CyberjayaDirectory.newBuilder()
                                 .id(csvRecord.get("ID"))
                                 .category(csvRecord.get("CATEGORY"))
                                 .premise(csvRecord.get("PREMISE"))
                                 .phone(csvRecord.get("PHONE"))
                                 .email(csvRecord.get("EMAIL"))
                                 .website(csvRecord.get("WEBSITE"))
                                 .address(csvRecord.get("ADDRESS"))
                                 .latitude(csvRecord.get("LAT"))
                                 .longitude(csvRecord.get("LONGI"))
                                 .build();
    }

    public static final class Builder {
        private String address;
        private String id;
        private String category;
        private String premise;
        private String phone;
        private String email;
        private String website;
        private String latitude;
        private String longitude;

        private Builder() {
        }

        public Builder address(String val) {
            address = val;
            return this;
        }

        public Builder id(String val) {
            id = val;
            return this;
        }

        public Builder category(String val) {
            category = val;
            return this;
        }

        public Builder premise(String val) {
            premise = val;
            return this;
        }

        public Builder phone(String val) {
            phone = val;
            return this;
        }

        public Builder email(String val) {
            email = val;
            return this;
        }

        public Builder website(String val) {
            website = val;
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

        public CyberjayaDirectory build() {
            return new CyberjayaDirectory(this);
        }
    }
}
