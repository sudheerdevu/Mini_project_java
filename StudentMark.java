import java.awt.EventQueue;
import javax.swing.JFrame; import javax.swing.JLabel;
import java.awt.Font; import javax.swing.JPanel;
import javax.swing.border.BevelBorder; import
java.awt.Color;
import javax.swing.JTextField; import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class StudentMark {
private JFrame frame; private JTextField sub1; private
JTextField sub2; private JTextField sub3; private JTextField
totalmarks; private JTextField average; private JTextField
grade;
/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
StudentMark window = new StudentMark(); window.frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}
/**
* Create the application.
*/
public StudentMark() {
initialize();
}
/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame(); frame.setBounds(100, 100, 558, 378);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);
JPanel panel = new JPanel();
panel.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.GRAY,
Color.LIGHT_GRAY, null, null));
panel.setBounds(23, 11, 498, 317);
frame.getContentPane().add(panel); panel.setLayout(null);
JLabel lblNewLabel = new JLabel("Student Mark Calculation System");
lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
lblNewLabel.setBounds(105, 11, 257, 26);
panel.add(lblNewLabel);
JLabel lblNewLabel_1 = new JLabel("Subject 1");
lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
lblNewLabel_1.setBounds(58, 64, 85, 14); panel.add(lblNewLabel_1);
JLabel lblNewLabel_1_1 = new JLabel("Subject 2");
lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
lblNewLabel_1_1.setBounds(58, 101, 85, 14);
panel.add(lblNewLabel_1_1);
JLabel lblNewLabel_1_1_1 = new JLabel("Subject 3");
lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
lblNewLabel_1_1_1.setBounds(58, 141, 85, 14);
panel.add(lblNewLabel_1_1_1);
JLabel lblNewLabel_1_1_1_1 = new JLabel("Total Marks");
lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
lblNewLabel_1_1_1_1.setBounds(58, 182, 85, 14);
panel.add(lblNewLabel_1_1_1_1);
JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Average");
lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
lblNewLabel_1_1_1_1_1.setBounds(58, 218, 85, 14);
panel.add(lblNewLabel_1_1_1_1_1);
JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Grade");
lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
lblNewLabel_1_1_1_1_1_1.setBounds(58, 257, 85, 14);
panel.add(lblNewLabel_1_1_1_1_1_1);
sub1 = new JTextField(); sub1.setBounds(164, 62, 110, 20);
panel.add(sub1); sub1.setColumns(10);
sub2 = new JTextField(); sub2.setColumns(10); sub2.setBounds(164, 99,
110, 20); panel.add(sub2);
sub3 = new JTextField(); sub3.setColumns(10); sub3.setBounds(164, 139,
110, 20); panel.add(sub3);
totalmarks = new JTextField(); totalmarks.setColumns(10);
totalmarks.setBounds(164, 180, 110, 20); panel.add(totalmarks);
average = new JTextField(); average.setColumns(10);
average.setBounds(164, 216, 110, 20);
panel.add(average);
grade = new JTextField(); grade.setColumns(10);
grade.setBounds(164, 255, 110, 20); panel.add(grade);
JButton btnAdd = new JButton("Add");
btnAdd.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int s1 = Integer.parseInt(sub1.getText()); int s2 =
Integer.parseInt(sub2.getText()); int s3 =
Integer.parseInt(sub3.getText()); int total = s1 + s2 + s3;
float avg = total/3;
totalmarks.setText(String.valueOf(total));
average.setText(String.valueOf(avg));
if(avg>45)
{
grade.setText("Passed");
}
else
{
grade.setText("Failed");
}
}
});
btnAdd.setFont(new Font("Tahoma",
Font.PLAIN, 12));
btnAdd.setBounds(356, 92, 68, 39);
panel.add(btnAdd);
JButton btnClear = new
JButton("Clear");
btnClear.addActionListener(new
ActionListener() {
public void
actionPerformed(ActionEvent e) {
sub1.setText("");
sub2.setText("");
sub3.setText("");
totalmarks.setText("");
average.setText(""); grade.setText("");
sub1.requestFocus();
}
});
btnClear.setFont(new Font("Tahoma",
Font.PLAIN, 12));
btnClear.setBounds(356, 157, 68, 39);
panel.add(btnClear);
JButton btnExit = new JButton("Exit");
btnExit.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
System.exit(0);
}
});
btnExit.setFont(new Font("Tahoma", Font.PLAIN, 12));
btnExit.setBounds(356, 215, 68, 39);
panel.add(btnExit);
}
}