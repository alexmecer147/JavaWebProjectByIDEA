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
        //����FileOutputStream�����ļ������ڻ��Զ��½�

        OutputStreamWriter writer = new OutputStreamWriter(fop, StandardCharsets.UTF_8);
        //����OutputStreamWriter���󣬲�������ָ������

        writer.append("��������");
        //д�뵽������

        writer.append("\r\n");
        //����

        writer.append("ENglish");
        //ˢ�»�������д�뵽�ļ�����������Լ�û��д�������ˣ�ֱ��closeҲ��д��

        writer.close();
        //�ر�д������ͬʱ��ѻ���������д���ļ������������ע�͵�

        fop.close();
        //�ر���������ͷ�ϵͳ��Դ

        FileInputStream fip = new FileInputStream(f);
        //����FileInputStream����

        InputStreamReader reader = new InputStreamReader(fip, StandardCharsets.UTF_8);
        //����InputStreamReader ���󣬱�����д����ͬ

        StringBuffer sb = new StringBuffer();
        while (reader.ready()){
            sb.append(reader.read());
            //ת��char�ӵ�StringBuffer������
        }
        System.out.println(sb.toString());
        reader.close();

        fip.close();
    }
}
