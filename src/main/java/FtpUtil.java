import org.apache.commons.net.ftp.FTPClient;

public class FtpUtil {

    public static void main(String[] args) {
        FTPClient ftpClient = new FTPClient();
        try{
            ftpClient.connect("",21);
            ftpClient.login("","");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}