import net.glxn.qrgen.core.image.ImageType;
import net.glxn.qrgen.core.scheme.VCard;
import net.glxn.qrgen.javase.QRCode;

import java.io.*;

public class ContactApplication {
    public static void main(String[] args){
        VCard sandeep = new VCard("Sandeep Rawat")
                .setEmail("sandeep.rawat4@gmail.com")
                .setAddress("Hyderabad, India")
                .setTitle("Mister")
                .setCompany("OpenText")
                .setPhoneNumber("7799345525")
                .setWebsite("www.sandeep.com");
        ByteArrayOutputStream stream = QRCode.from(sandeep).stream();
        try(OutputStream outputStream = new FileOutputStream("/users/rawats/desktop/qrCode.jpg")) {
            stream.writeTo(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
