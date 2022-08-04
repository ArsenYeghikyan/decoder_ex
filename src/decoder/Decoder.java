package decoder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Decoder {

    /**
     * @author: Arsen Yeghikyan
     * @param  str a new string
     * @return All finds by pattern are replaced by replace
     */

    public String getString(String str){

        Pattern p = Pattern.compile("[a-z]+");

        Matcher m = p.matcher(str);

        m.find();



        return m.replaceAll("replace");
    }

/**
@since 1.5
 */

    public void decode() {

        File fileBeforeDecode = new File("src/file_before_decode.txt");
        File fileAfterDecode = new File("src/file_after_decode.txt");


        try (BufferedReader br = new BufferedReader(new FileReader(fileBeforeDecode));
             BufferedWriter bw = new BufferedWriter(new FileWriter(fileAfterDecode))) {

          String line;

            while ((line = br.readLine()) != null) {


                bw.write(getString(line));
            }


        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
