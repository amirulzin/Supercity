package com.opensource.supercity.model;

import org.apache.commons.csv.CSVRecord;

public class ParkingBay implements CSVRecordedT<ParkingBay> {
    String id;
    String parkingType;
    String parkingArea;
    String carAmount;
    String motorAmount;

    public ParkingBay(String carAmount, String id, String motorAmount, String parkingArea, String parkingType) {
        this.carAmount = carAmount;
        this.id = id;
        this.motorAmount = motorAmount;
        this.parkingArea = parkingArea;
        this.parkingType = parkingType;
    }

    private ParkingBay(Builder builder) {
        carAmount = builder.car;
        id = builder.id;
        parkingType = builder.parkingType;
        parkingArea = builder.parkingArea;
        motorAmount = builder.motor;
    }

    public ParkingBay() {
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getCarAmount() {
        return carAmount;
    }

    public String getId() {
        return id;
    }

    public String getMotorAmount() {
        return motorAmount;
    }

    public String getParkingArea() {
        return parkingArea;
    }

    public String getParkingType() {
        return parkingType;
    }

    @Override
    public ParkingBay fromCsvRecord(CSVRecord csvRecord) {
        return newBuilder()
                .id(csvRecord.get("ID"))
                .parkingType(csvRecord.get("PARKING_TYPE"))
                .parkingArea(csvRecord.get("PARKING_AREA"))
                .carAmount(csvRecord.get("CAR"))
                .motorAmount(csvRecord.get("MOTOR"))
                .build();
    }

    @Override
    public String toString() {
        return "ParkingBay{" +
                "id='" + id + '\'' +
                ", parkingType='" + parkingType + '\'' +
                ", parkingArea='" + parkingArea + '\'' +
                ", carAmount='" + carAmount + '\'' +
                ", motorAmount='" + motorAmount + '\'' +
                '}';
    }

    public static final class Builder {
        private String car;
        private String id;
        private String parkingType;
        private String parkingArea;
        private String motor;

        private Builder() {
        }

        public Builder carAmount(String val) {
            car = val;
            return this;
        }

        public Builder id(String val) {
            id = val;
            return this;
        }

        public Builder parkingType(String val) {
            parkingType = val;
            return this;
        }

        public Builder parkingArea(String val) {
            parkingArea = val;
            return this;
        }

        public Builder motorAmount(String val) {
            motor = val;
            return this;
        }

        public ParkingBay build() {
            return new ParkingBay(this);
        }
    }
}
