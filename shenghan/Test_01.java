package shenghan;
import  javax.swing.*;


/**
 * @author zsh
 * @create 2020-10-21-0:17
 */
public class Test_01 {
    public static void main(String[] args) {
//        ����һ����������
        JFrame jf = new JFrame("���Դ���");   //��������
        jf.setSize(250,250);   //���ô��ڴ�С
        jf.setLocationRelativeTo(null);   //�Ѵ���λ�����õ���Ļ����
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);   //��������ڵĹرհ�ťʱ��������˳�

        //�����м�����(�������)
        JPanel panel = new JPanel();   //�������������ʹ��Ĭ�ϵĲ��ֹ�����

        //����һ�������������ť�������ҽ�����ӵ���������С�
        JButton btn = new JButton("���԰�ť");
        panel.add(btn);

        // 4. �� ������� ��Ϊ���ڵ�������� ���õ�����
        jf.setContentPane(panel);

        // 5. ��ʾ���ڣ�ǰ�洴������Ϣ�����ڴ��У�ͨ�� jf.setVisible(true) ���ڴ��еĴ�����ʾ����Ļ�ϡ�
        jf.setVisible(true);

    }
}
