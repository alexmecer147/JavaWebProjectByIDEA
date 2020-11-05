package package1;

import java.io.*;

/**
 * @author Kanfeer
 * @package_name package1
 * @date 2020/11/3 - 15:23
 * @project_name NewProjectByIDEA
 */
public class fileStreamTest {
    public static void main(String[] args) {
        try {
            byte bwrite[] = {11, 21, 3, 40, 5,88,6,78};
            OutputStream os = new FileOutputStream("F:/a.txt");
            for (int x=0;x < bwrite.length; x++){
                os.write(bwrite[x]);
            }
            os.close();

            InputStream is = new FileInputStream("F:/a.txt");
            int size = is.available();

            for (int i = 0;i < size;i++){
                System.out.println(is.read()+"|");
            }
            is.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
