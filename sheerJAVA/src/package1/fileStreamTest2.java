package package1;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author Kanfeer
 * @package_name package1
 * @date 2020/11/3 - 15:35
 * @project_name NewProjectByIDEA
 */
public class fileStreamTest2 {
    public static void main(String[] args) throws Exception {
        File f = new File("F:/bb.txt");
        FileOutputStream fop = new FileOutputStream(f);
        //构造FileOutputStream对象，文件不存在会自动新建

        OutputStreamWriter writer = new OutputStreamWriter(fop, StandardCharsets.UTF_8);
        //构造OutputStreamWriter对象，参数可以指定编码

        writer.append("中文输入");
        //写入到缓冲区

        writer.append("\r\n");
        //换行

        writer.append("ENglish");
        //刷新缓冲区，写入到文件，如果下面以及没有写入内容了，直接close也会写入

        writer.close();
        //关闭写入流，同时会把缓冲区内容写入文件，所以上面的注释掉

        fop.close();
        //关闭输出流，释放系统资源

        FileInputStream fip = new FileInputStream(f);
        //构件FileInputStream对象

        InputStreamReader reader = new InputStreamReader(fip, StandardCharsets.UTF_8);
        //构造InputStreamReader 对象，编码与写入相同

        StringBuffer sb = new StringBuffer();
        while (reader.ready()){
            sb.append(reader.read());
            //转成char加到StringBuffer对象中
        }
        System.out.println(sb.toString());
        reader.close();

        fip.close();
    }
}
