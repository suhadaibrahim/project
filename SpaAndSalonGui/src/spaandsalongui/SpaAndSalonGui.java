package spaandsalongui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class SpaAndSalonGui extends javax.swing.JFrame {
    private JPanel contentPane;
    private JTable table;
    private JFrame frame;
    
    ArrayList<spaAndSalon>spaAndSalon;
    String header[] = new String[]{"Type of Treatment","Ala charte","Type of Package"};
    DefaultTableModel dtm;
    int row,col;
    
    public SpaAndSalonGui(){
        initComponents();
        ArrayList<spaAndSalon> spaAndSalonlist = new ArrayList<>();
        dtm = new DefaultTableModel (header,0);
        table.setModel(dtm);
        this.setLocationRelativeTo(null);
        
    }

    private void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(10,10,1360,700);
        contentPane = new JPanel();
        contentPane.setBackground(new color(250,128,114));
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBorder(new LineBorder(new color(128,0,0),3,true));
        panel.setBackground(new color(255,228,225));
        panel.setBounds(10,11,397,179);
        contentPane.add(panel);
        panel.setLayout(null);
        
        JLabel spaNewLabel = new JLabel("Spa & Salon");
        spaNewLabel.setFont(new Font("Script MT Bold",Font.PLAIN,40));
        spaNewLabel.setBounds(188,51,222,85);
        panel.add(spaNewLabel);
        
        JLabel spaNewLabel_1 = new JLabel("");
        spaNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        spaNewLabel_1.setIcon(new ImageIcon("C:\\Users\\user\\Pictures\\1024529.png"));
        spaNewLabel_1.setBounds(10,11,168,157);
        panel.add(spaNewLabel_1);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new LineBorder(new color(128,0,0),3,true));
        panel_1.setBackground(new color(255,228,225));
        panel_1.setBounds(417,11,917,492);
        contentPane.add(panel_1);
        panel_1.setLayout(null);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10,11,897,470);
        panel_1.add(scrollPane);
        
        
        table = new JTable();
        table.setFont(new Font("Comic Sans MS", Font.PLAIN,15));
        table.setModel(new DefaultTableModel(
             new Object[][]{
             },
                new String[]{
                    "Type of Treatment","Ala Charte","Type of Package"
                }
        ));
        table.getColumnModel().getColumn(0).setPreferredWidth(169);
	table.getColumnModel().getColumn(1).setPreferredWidth(78);
	table.getColumnModel().getColumn(2).setPreferredWidth(217);
	table.getColumnModel().getColumn(3).setPreferredWidth(158);
	scrollPane.setViewportView(table);
        
        JPanel panel_2 = new JPanel();
	panel_2.setBorder(new LineBorder(new Color(128, 0, 0), 3, true));
	panel_2.setBackground(new Color(255, 228, 225));
	panel_2.setBounds(10, 201, 397, 301);
	contentPane.add(panel_2);
	panel_2.setLayout(null);
        
        JLabel spaNewLabel_2 = new JLabel("Type of Treatment");
        spaNewLabel_2.setFont(new Font("Comic Sans MS",Font.PLAIN,18));
        spaNewLabel_2.setHorizontalAlignment(SwingConstants.TRAILING);
	spaNewLabel_2.setBounds(10, 11, 151, 56);
	panel_2.add(spaNewLabel_2);
        
        JLabel spaNewLabel_2_2 = new JLabel("Type of Package :");
	spaNewLabel_2_2.setHorizontalAlignment(SwingConstants.TRAILING);
	spaNewLabel_2_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
	spaNewLabel_2_2.setBounds(10, 147, 151, 56);
	panel_2.add(spaNewLabel_2_2);
        
        JComboBox comboBox_type = new JComboBox();
	comboBox_type.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
	comboBox_type.setModel(new DefaultComboBoxModel(new String[] {"- Please Select - ", "Massage", "Manicure Pedicure", "Facial", "Hair"}));
	comboBox_type.setBounds(171, 23, 201, 30);
	panel_2.add(comboBox_type);
        
        JComboBox comboBox_alacharte = new JComboBox();
	comboBox_alacharte.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
	comboBox_alacharte.setModel(new DefaultComboBoxModel(new String[] {"- Please Select - ", "Massage", "Manicure Pedicure", "Facial", "Hair"}));
	comboBox_alacharte.setBounds(171, 23, 201, 30);
	panel_2.add(comboBox_alacharte);
        
        JComboBox comboBox_pack = new JComboBox();
	comboBox_pack.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
	comboBox_pack.setModel(new DefaultComboBoxModel(new String[] {"- Please Select - ", "Massage", "Manicure Pedicure", "Facial", "Hair"}));
	comboBox_pack.setBounds(171, 23, 201, 30);
	panel_2.add(comboBox_pack);
        
        JPanel panel_3 = new JPanel();
        panel_3.setBorder(new LineBorder(new Color(128, 0, 0), 3, true));
	panel_3.setBackground(new Color(255, 228, 225));
	panel_3.setBounds(10, 513, 1324, 137);
	contentPane.add(panel_3);
	panel_3.setLayout(null);
        
        JButton btnNewButton = new JButton("ADD");
	btnNewButton.addActionListener((ActionEvent e) -> {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.addRow(new Object[] {
                comboBox_type.getSelectedItem(),
                comboBox_alacharte.getSelectedItem(),
                comboBox_pack.getSelectedItem(),
            });
            
            
            if(table.getSelectedRow() == -1) {
                if(table.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(null, "Beauty Store System", "Beauty Data Information",
                            JOptionPane.OK_OPTION);
                }
            }
        });
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 29));
		btnNewButton.setBounds(50, 36, 142, 67);
		panel_3.add(btnNewButton);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener((ActionEvent e) -> {
                    comboBox_type.setSelectedItem("- Please Select - ");
                    comboBox_alacharte.setSelectedItem("- Please Select - ");
                    comboBox_pack.setSelectedItem("- Please Select - ");
        });
		btnReset.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 29));
		btnReset.setBounds(215, 36, 142, 67);
		panel_3.add(btnReset);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener((ActionEvent e) -> {
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    if(table.getSelectedRow() == -1) {
                        if(table.getRowCount() == 0) {
                            JOptionPane.showMessageDialog(null, "No Data to delete", "Beauty Data Information",
                                    JOptionPane.OK_OPTION);
                        }else {
                            JOptionPane.showMessageDialog(null, "Select which data to delete", "Beauty Data Information",
                                    JOptionPane.OK_OPTION);
                        }
                    }else {
                        model.removeRow(table.getSelectedRow());
                    }
        });
		btnDelete.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 29));
		btnDelete.setBounds(568, 36, 166, 67);
		panel_3.add(btnDelete);
		
		JButton btnDisplay = new JButton("SAVE");
		btnDisplay.addActionListener((ActionEvent e) -> {
                    try{
                        File file = new File ("/Users/user/Desktop/DataBase.txt");
                        if(!file.exists()){
                            file.createNewFile();
                        }
                        try (FileWriter fw = new FileWriter(file.getAbsoluteFile()); BufferedWriter bw = new BufferedWriter(fw)) {
                            bw.write("- Spa And Salon Data Information -\n");
                            bw.write("Type of Treatment \t\tAla charte\t\tType of Package");
                            
                            for(int i = 0; i < table.getRowCount(); i++)
                            {
                                for(int j = 0; j < table.getColumnCount(); j++)
                                {
                                    bw.write(table.getModel().getValueAt(i, j) + "\t\t");
                                }
                                bw.write("\n");
                            }
                        }
                        JOptionPane.showConfirmDialog(frame, "Save To File", "Beauty Data Information",
                                JOptionPane.OK_OPTION);
                    }
                    catch(HeadlessException | IOException ex){
                    }
        });
           btnDisplay.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 29));
		btnDisplay.setBounds(949, 36, 180, 67);
		panel_3.add(btnDisplay);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener((ActionEvent e) -> {
                    frame = new JFrame();
                    if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit ?", "Beauty Data Information",
                            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
                        System.exit(0);
                    }
        });  
                btnExit.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 29));
		btnExit.setBounds(1152, 36, 142, 67);
		panel_3.add(btnExit);
	}


	
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
                    try {
                        SpaAndSalonGui frame1 = new SpaAndSalonGui();
                        frame1.setVisible(true);
                    }catch (Exception e) {
                    }
                });
                    }   
                }
		           
		                

		            
    

