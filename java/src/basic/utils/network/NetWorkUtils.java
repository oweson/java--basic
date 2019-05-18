package basic.utils.network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetWorkUtils {


    public static boolean isNetworkAvailable(String ipAddress) {
        boolean returnBoolean = false;
        try {
            InetAddress ad = InetAddress.getByName(ipAddress);
            try {
                boolean state = ad.isReachable(5000);
                if (state) {
                    returnBoolean = true;
                } else {
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (UnknownHostException e) {
        }
        return returnBoolean;
    }

    public static void main(String[] args) {
        System.out.println(isNetworkAvailable("192.168.60.65"));
    }
}
