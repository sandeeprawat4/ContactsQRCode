import net.glxn.qrgen.core.image.ImageType;
import net.glxn.qrgen.core.scheme.VCard;
import net.glxn.qrgen.javase.QRCode;

import java.io.*;

public class ContactApplication {
    public static void main(String[] args){
        VCard sandeep = new VCard("John Doe")
                .setEmail("xyz@abc.com")
                .setAddress("USA")
                .setTitle("Mister")
                .setCompany("ABC Corp")
                .setPhoneNumber("999999999")
                .setWebsite("www.abc.com");
        ByteArrayOutputStream stream = QRCode.from(sandeep).stream();
        try(OutputStream outputStream = new FileOutputStream("/users/qrCode.jpg")) {
            stream.writeTo(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
