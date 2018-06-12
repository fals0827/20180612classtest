import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    private Container cp ;
    private JPanel jpn = new JPanel();
    private JTextField jtf = new JTextField();
    private JButton jbtRun = new JButton("Run");
    private JLabel jlb = new JLabel();
    private JButton jbtExit = new JButton("EXIT");
    private Double v1 , v2 ;

    public MainFrame () {
        this.init();
    }

    private void init (){
        this.setBounds(300,300,500,300);
        cp = this.getContentPane();
        cp.add(jpn);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jpn.setLayout(null);
        jtf.setBounds(20,20,100,40);
        jbtRun.setBounds(130,20,80,40);
        jlb.setBounds(20,80,60,20);
        jbtExit.setBounds(130,80,80,40);
        jpn.add(jtf);
        jpn.add(jbtRun);
        jpn.add(jlb);
        jpn.add(jbtExit);

        jbtExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });

        jbtRun.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int test [] = new int[5];
                try {
                    v1 = Double.parseDouble(jtf.getText());
                    v2 = v1 * 0.62137;
                    jlb.setText(Double.toString(v2));
                    for (int i = 0 ; i <= 5 ; i ++){
                        test[i] = (int) Math.round(Math.random()*100);
                    }
                }catch (NumberFormatException e1){
                    JOptionPane.showMessageDialog(MainFrame.this,"請輸入數字");
                }catch (Exception e2){
                    JOptionPane.showMessageDialog(MainFrame.this,"未知錯誤，請聯絡子堯");
                }
            }
        });
    }
}
