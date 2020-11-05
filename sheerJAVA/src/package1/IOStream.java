package package1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Kanfeer
 * @package_name package1
 * @date 2020/11/3 - 14:47
 * @project_name NewProjectByIDEA
 */
public class IOStream {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c;
        //使用System.in创建BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入字符，按下'q'键退出。");
        //读取字符
        do {
            c = (char) br.read();
            System.out.println(c);
        }while (c!='q');
    }

}
