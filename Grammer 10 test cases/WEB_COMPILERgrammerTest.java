import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import static org.junit.jupiter.api.Assertions.*;
class WEB_COMPILERgrammerTest {
    WEB_COMPILER parser;
    @Test
     public void grammarChecker() throws ParseException {
        String [] inputs = {"ADD PARAGRAPH WITH COLOR \"Blue\" WITH TEXT \"Hello\"\n",
                            "ADD WITH TEXT \"AHMED\"\n",
                            "ADD LINK WITH TEXT \"Happy Birthday\" AND WITH LINK \"https://www.br.com\"\n",
                            "ADD HEADING WITH TEXT \"WHAT HAPPEN\" AND WITH COLOR \"Red\" AND WITH FONT \"Arial\"\n",
                            "ADD HEADING AND WITH TEXT \"LOL\"\n",
                            "ADD PARAGRAPH WITH TEXT \" \" AND WITH FONT \" \" AND WITH COLOR \" \"\n",
                            "ADD LINK WITH TEXT \"GOOGLE ANNIVERSARY\" AND WITH LINK \"\"\n",
                            "ADD LINK WITH AND WITH TEXT \" \"\n",
                            "ADD HEADER WITH TEXT \"Mohammad\"\n\n",
                            "ADD LINK WITH TEXT \"Facebook\" AND WITH LINK \"http://facebook.com\"\n\n",
                            "ADD PARAGRAPH WITH NAME \"Ibraheem\"\n\n"};
        String [] expected = {"false", "false", "true", "true","false", "true", "false", "false","false", "true", "false"};

        for (int i = 0; i < inputs.length; i++)
            assertEquals(expected[i], tester(inputs[i]));
    }
    public String tester (String input){
        InputStream stream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        String result = "true";
        if (parser != null)
            parser.ReInit(stream);
        else
            parser = new WEB_COMPILER(stream);
        try {
            parser.Input();
        } catch (Exception e) {
            result = "false";
        }
        return result;
    }

}