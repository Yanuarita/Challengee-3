import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class ReaderCsvTest {
    
    public static final String path = "C:/Users/User/Documents/data_sekolah.csv";

    public static List<String> parameterSource() {
        return List.of("C:/Users/User/Documents/data_sekolah.csv");

    }
    @Test
    void readerCsv() {
        ReaderCsv readerCsv =new ReaderCsv();
        List<String> result = readerCsv.readerCsv(path);

        try {

            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = "";
            String[] tempArr;
            int lengthofNum = 0;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

