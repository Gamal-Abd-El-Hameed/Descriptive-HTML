import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import static org.junit.jupiter.api.Assertions.*;
class WEB_COMPILERTest {


    @Test
    void sentenceTester() throws ParseException {

            InputStream stream = new ByteArrayInputStream("ADD LINK WITH TEXT \"DeepWeb\" AND WITH LINK \"https://www.deepweb.com/\" AND WITH FONT \"Black\" AND WITH COLOR \"Red\"\n\n"
                    .getBytes(StandardCharsets.UTF_8));
            WEB_COMPILER parser = new WEB_COMPILER(stream);
            assertEquals("<a href = \"https://www.deepweb.com/\" style = \"color:Red;font-family:Black;\">DeepWeb</a>\n", parser.Input());
    }
}