import com.opensource.supercity.factory.ParserFactory;
import com.opensource.supercity.model.ConstructionData;
import com.opensource.supercity.model.CyberjayaDirectory;
import com.opensource.supercity.model.ParkingBay;
import org.apache.commons.csv.CSVRecord;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParserTest {
    @Test
    public void testParseCyberjayaDirectory() throws IOException {
        List<CSVRecord> csvRecords = ParserFactory.parseCSV("raw/Cyberjaya Directory with Coordinate Datasets 1.csv");
        ArrayList<CyberjayaDirectory> directories = new ArrayList<CyberjayaDirectory>(csvRecords.size());

        for (CSVRecord csvRecord : csvRecords) {
            directories.add(new CyberjayaDirectory().fromCsvRecord(csvRecord));
        }

        assert directories.size() > 0;

        for (int i = 0; i < 5; i++) {
            System.out.println(directories.get(i).toString());
        }
    }


    @Test
    public void testParkingBays() throws IOException {
        List<CSVRecord> csvRecords = ParserFactory.parseCSV("raw/Parking Bays.csv");
        ArrayList<ParkingBay> parkingBays = new ArrayList<ParkingBay>();
        for (CSVRecord csvRecord : csvRecords) {
            parkingBays.add(new ParkingBay().fromCsvRecord(csvRecord));
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(parkingBays.get(i).toString());
        }
    }

    @Test
    public void testConstructionDatas() throws IOException {
        List<CSVRecord> csvRecords = ParserFactory.parseCSV("raw/Cyberjaya Construction Data.csv");
        ArrayList<ConstructionData> constructionDatas = new ArrayList<ConstructionData>();
        for (CSVRecord csvRecord : csvRecords) {
            constructionDatas.add(new ConstructionData().fromCsvRecord(csvRecord));
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(constructionDatas.get(i).toString());
        }
    }

}
