package Onlinetest;
import java.io.File;
import java.io.FileOutputStream;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class QrCode {
public static void main(String[] args)throws Exception {
new FileOutputStream(new File("D:\\QR.jpg")).write(QRCode.from("Hi Santhosh. This is sample to genrate QR code using java ").to(ImageType.JPG).stream().toByteArray());
System.out.println("success");
}
}