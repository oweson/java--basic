/**
 * 
 */
package basic.river.io.scanning;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author <a href="http://www.waylau.com">waylau.com</a>
 * @date 2016年1月18日
 */
public class ScanXan {
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Scanner s = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader("e:/test.sql")));

            //s.useDelimiter(",\\s*");
            
            while (s.hasNextLine()) {
                System.out.println(s.next());
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
	}
}
