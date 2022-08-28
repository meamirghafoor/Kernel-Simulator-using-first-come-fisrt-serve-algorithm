
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mr Amir Ghafoor
 */

public class Main_samulator extends javax.swing.JFrame {

    /**
     * Creates new form Main_samulator
     */
    String[] pid = new String[10]; // process ids
    int[] ar = new int[10]; // arrival times
    int[] bt = new int[10]; //burst or execution times
    int[] ct = new int[10]; //completion times
    int[] ta = new int[10]; // turn around times
    int[] wt = new int[10]; // waiting times
    float avgwt=0,avgta=0;
    int sz=-1;
    int total_wt = 0, total_tat = 0,total_exe=0,cpt=0;
    int total_pro=0;
    public Main_samulator() {
        initComponents();
        jLabel2.setText("@meamirghafoor");
        main_jobs.setRowHeight(25);
        process_new.setRowHeight(25);
    }
//    Timer tm;  
//    void FCFS_COPY(int i){
//        if(total_pro < sz){
//        if( i == 0)
//            {
//                ct[i] = ar[i] + bt[i];
//            }
//            else
//            {
//                if( ar[i] > ct[i-1])
//                {
//                    ct[i] = ar[i] + bt[i];
//                }
//                else{
//                    ct[i] = ct[i-1] + bt[i];
//                }
//            }
//            ta[i] = ct[i] - ar[i] ;
//            wt[i] = ta[i] - bt[i] ;
//            avgwt += wt[i] ;
//            avgta += ta[i] ;
//            main_jobs.setValueAt(pid[i], i,0);
//            main_jobs.setValueAt(ar[i], i,1);
//            main_jobs.setValueAt(bt[i], i,2);
//            main_jobs.setValueAt(ct[i], i,3);
//            main_jobs.setValueAt(wt[i], i,4);
//            main_jobs.setValueAt(ta[i], i,5);
//            avg_tat.setText(String.valueOf(avgta));
//            avg_wt.setText(String.valueOf(avgwt));
//            jTextArea1.setText(jTextArea1.getText()+pid[i]+" | ");
//            switch (total_pro) {
//                case 0 -> txt1.setText(pid[total_pro]);
//                case 1 -> {
//                    progress(p2,bt[total_pro],total_pro);
//                    txt2.setText(pid[total_pro]);
//                }
//                case 2 -> {
//                    progress(p3,bt[total_pro],total_pro);
//                    txt3.setText(pid[total_pro]);
//                }
//                case 3 -> {
//                    progress(p4,bt[total_pro],total_pro);
//                    txt4.setText(pid[total_pro]);
//                }
//                case 4 -> {
//                    progress(p5,bt[total_pro],total_pro);
//                    txt5.setText(pid[total_pro]);
//                }
//                case 5 -> {
//                    progress(p6,bt[total_pro],total_pro);
//                    txt6.setText(pid[total_pro]);
//                }
//                case 6 -> {
//                    progress(p7,bt[total_pro],total_pro);
//                    txt7.setText(pid[total_pro]);
//                }
//                case 7 -> {
//                    progress(p8,bt[total_pro],total_pro);
//                    txt8.setText(pid[total_pro]);
//                }
//                case 8 -> {
//                    progress(p9,bt[total_pro],total_pro);
//                    txt9.setText(pid[total_pro]);
//                }
//                case 9 -> {
//                    progress(p10,bt[total_pro],total_pro);
//                    txt10.setText(pid[total_pro]);
//                }
//                default -> {
//                        JOptionPane.showMessageDialog(null,"Samulater complete process", "Message",JOptionPane.INFORMATION_MESSAGE);
//                }
//            }
//             total_pro=total_pro+1;
//            }
//    }
     void FCFS(int n) 
    {
        for(int  i = 0 ; i < n; i++)
        {
            if( i == 0)
            {
                ct[i] = ar[i] + bt[i];
            }
            else
            {
                if( ar[i] > ct[i-1])
                {
                    ct[i] = ar[i] + bt[i];
                }
                else{
                    ct[i] = ct[i-1] + bt[i];
                }
            }
            ta[i] = ct[i] - ar[i] ;
            wt[i] = ta[i] - bt[i] ;
            avgwt += wt[i] ;
            avgta += ta[i] ;
           // progress(p1,bt[i]);
            main_jobs.setValueAt(pid[i], i,0);
            main_jobs.setValueAt(ar[i], i,1);
            main_jobs.setValueAt(bt[i], i,2);
            main_jobs.setValueAt(ct[i], i,3);
            main_jobs.setValueAt(wt[i], i,4);
            main_jobs.setValueAt(ta[i], i,5);
            avg_tat.setText(String.valueOf(avgta));
            avg_wt.setText(String.valueOf(avgwt));
            jTextArea1.setText(jTextArea1.getText()+pid[i]+" | ");
        }
    }
//int pro_plus=0;
//void progress(JProgressBar p,int time,int size){
//    tm = new Timer(5*time, (ActionEvent arg0) -> {
//        p.setValue(pro_plus++);
//        if(pro_plus>100 && total_pro<sz){
//            FCFS_COPY(total_pro);
//            System.out.println(sz);
//            System.out.println(total_pro);
//        }else if(total_pro>=sz){
//            System.out.print("Timer stoped");
//            tm.stop();
//        }
//    });tm.start();
//}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main_Panel = new javax.swing.JPanel();
        Scheduler_Panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        main_jobs = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        avg_wt = new javax.swing.JTextField();
        avg_tat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        p2 = new javax.swing.JProgressBar();
        jTextField9 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        p3 = new javax.swing.JProgressBar();
        jTextField11 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        p1 = new javax.swing.JProgressBar();
        jTextField13 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        p5 = new javax.swing.JProgressBar();
        jTextField15 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        p6 = new javax.swing.JProgressBar();
        jTextField17 = new javax.swing.JTextField();
        txt7 = new javax.swing.JTextField();
        p7 = new javax.swing.JProgressBar();
        jTextField19 = new javax.swing.JTextField();
        txt8 = new javax.swing.JTextField();
        p8 = new javax.swing.JProgressBar();
        jTextField21 = new javax.swing.JTextField();
        txt9 = new javax.swing.JTextField();
        p9 = new javax.swing.JProgressBar();
        jTextField23 = new javax.swing.JTextField();
        txt10 = new javax.swing.JTextField();
        p10 = new javax.swing.JProgressBar();
        p4 = new javax.swing.JProgressBar();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        New_process = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        process_new = new javax.swing.JTable();
        add1 = new javax.swing.JTextField();
        add2 = new javax.swing.JTextField();
        add3 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        choice_bar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kernel Simulator");
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Main_Panel.setBackground(new java.awt.Color(153, 153, 153));
        Main_Panel.setLayout(new java.awt.CardLayout());

        Scheduler_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        main_jobs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "P_ID", "Arrival Time", "Burst Time", "Complete", "Wait Time", "TurnAround Time"
            }
        ));
        main_jobs.setOpaque(false);
        jScrollPane1.setViewportView(main_jobs);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 500, 240));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Processes List");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Average waiting time");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 140, 25));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Average Turnaround time");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 160, 25));

        avg_wt.setEditable(false);
        jPanel1.add(avg_wt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 170, 25));

        avg_tat.setEditable(false);
        avg_tat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avg_tatActionPerformed(evt);
            }
        });
        jPanel1.add(avg_tat, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 170, 25));

        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 288, 500, 85));

        Scheduler_Panel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 520, 380));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Process ID");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 100, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("No");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Process Status");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 190, 40));

        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 350, 40));

        txt1.setEditable(false);
        jPanel2.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 90, -1));

        jTextField6.setEditable(false);
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("1");
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 60, 50, -1));

        jTextField7.setEditable(false);
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("2");
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 90, 50, -1));

        txt2.setEditable(false);
        jPanel2.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 90, -1));

        p2.setForeground(new java.awt.Color(0, 153, 0));
        p2.setStringPainted(true);
        jPanel2.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 90, 170, 20));

        jTextField9.setEditable(false);
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("3");
        jPanel2.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 50, -1));

        txt3.setEditable(false);
        jPanel2.add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 90, -1));

        p3.setForeground(new java.awt.Color(0, 153, 0));
        p3.setValue(10);
        p3.setStringPainted(true);
        jPanel2.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 120, 170, 20));

        jTextField11.setEditable(false);
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("4");
        jPanel2.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 150, 50, -1));

        txt4.setEditable(false);
        jPanel2.add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 90, -1));

        p1.setForeground(new java.awt.Color(0, 153, 0));
        p1.setValue(5);
        p1.setStringPainted(true);
        jPanel2.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 60, 170, 20));

        jTextField13.setEditable(false);
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setText("5");
        jPanel2.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 180, 50, -1));

        txt5.setEditable(false);
        jPanel2.add(txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 90, -1));

        p5.setForeground(new java.awt.Color(0, 153, 0));
        p5.setValue(20);
        p5.setStringPainted(true);
        jPanel2.add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 180, 170, 20));

        jTextField15.setEditable(false);
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setText("6");
        jPanel2.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 210, 50, -1));

        txt6.setEditable(false);
        jPanel2.add(txt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 90, -1));

        p6.setForeground(new java.awt.Color(0, 153, 0));
        p6.setValue(30);
        p6.setStringPainted(true);
        jPanel2.add(p6, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 210, 170, 20));

        jTextField17.setEditable(false);
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setText("7");
        jPanel2.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 240, 50, -1));

        txt7.setEditable(false);
        jPanel2.add(txt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 90, -1));

        p7.setForeground(new java.awt.Color(0, 153, 0));
        p7.setStringPainted(true);
        jPanel2.add(p7, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 240, 170, 20));

        jTextField19.setEditable(false);
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField19.setText("8");
        jPanel2.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 270, 50, -1));

        txt8.setEditable(false);
        jPanel2.add(txt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 90, -1));

        p8.setForeground(new java.awt.Color(0, 153, 0));
        p8.setValue(40);
        p8.setStringPainted(true);
        jPanel2.add(p8, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 270, 170, 20));

        jTextField21.setEditable(false);
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField21.setText("9");
        jPanel2.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 300, 50, -1));

        txt9.setEditable(false);
        jPanel2.add(txt9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 90, -1));

        p9.setForeground(new java.awt.Color(0, 153, 0));
        p9.setStringPainted(true);
        jPanel2.add(p9, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 300, 170, 20));

        jTextField23.setEditable(false);
        jTextField23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField23.setText("10");
        jPanel2.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 330, 50, -1));

        txt10.setEditable(false);
        jPanel2.add(txt10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 90, -1));

        p10.setForeground(new java.awt.Color(0, 153, 0));
        p10.setValue(50);
        p10.setStringPainted(true);
        jPanel2.add(p10, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 330, 170, 20));

        p4.setForeground(new java.awt.Color(0, 153, 0));
        p4.setStringPainted(true);
        jPanel2.add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 150, 170, 20));

        jLabel9.setBackground(new java.awt.Color(153, 153, 255));
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 49, 350, 324));

        Scheduler_Panel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 370, 380));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Gantt Chart");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 40));

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextArea1.setRows(1);
        jTextArea1.setAutoscrolls(false);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 775, 45));

        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 5, 890, 55));

        Scheduler_Panel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 900, 65));

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Algorithm");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 15, 80, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("FCFS");
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 15, 40, 30));

        Scheduler_Panel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 180, 60));

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Samulate Process");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 15, 140, 30));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setText("Reset Samulater");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 15, 150, 30));

        Scheduler_Panel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, 370, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Scheduler_Panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(805, 520, 115, 18));

        Main_Panel.add(Scheduler_Panel, "card2");

        New_process.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        process_new.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process ID", "Arrival Time", "Burst Time"
            }
        ));
        process_new.setOpaque(false);
        process_new.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                process_newMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(process_new);

        New_process.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 800, 250));

        add1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        add1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        New_process.add(add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 200, 30));

        add2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        add2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        New_process.add(add2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 200, 30));

        add3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        add3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        New_process.add(add3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 200, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Process ID");
        New_process.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 110, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Arrival Time");
        New_process.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 110, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Burst Time");
        New_process.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 110, 30));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setText("Create Process");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        New_process.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 120, 30));

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton5.setText("Update Process");
        jButton5.setEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        New_process.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 120, 30));

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton6.setText("Reset Fields");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        New_process.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 120, 30));

        jButton2.setText("Delete Process");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        New_process.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, 120, 30));

        Main_Panel.add(New_process, "card3");

        getContentPane().add(Main_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 540));

        choice_bar.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        jMenu1.setText("Process Management");

        jMenuItem4.setText("Simulator");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem1.setText("Create a process");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Update a process");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Delete a Process");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        choice_bar.add(jMenu1);

        jMenu2.setText("Memory Management");
        choice_bar.add(jMenu2);

        jMenu3.setText("I/O Management");
        choice_bar.add(jMenu3);

        jMenu4.setText("Other Operations");
        choice_bar.add(jMenu4);

        jMenu5.setText("About ");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        choice_bar.add(jMenu5);

        setJMenuBar(choice_bar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void avg_tatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avg_tatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_avg_tatActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        Scheduler_Panel.setVisible(true);
        New_process.setVisible(false);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        add1.setText(null);
        add2.setText(null);
        add3.setText(null);
        add1.setEditable(true);
        jButton5.setEnabled(false);
        jButton2.setEnabled(false);
        jButton4.setEnabled(true);
        jButton6.setEnabled(true);
        Scheduler_Panel.setVisible(false);
        New_process.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed
public static boolean isNumeric(String str,String str1) { 
  try {  
    Double.parseDouble(str);  
    Double.parseDouble(str1);  
    return true;
  } catch(NumberFormatException e){  
    return false;  
  }  
}
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) process_new.getModel();
        DefaultTableModel model2 = (DefaultTableModel) main_jobs.getModel();
        int total=process_new.getRowCount();
        if(total<=10){
        if(add1.getText().isEmpty() || add2.getText().isEmpty() || add3.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"All fields required", "Info",JOptionPane.ERROR_MESSAGE);
        }else if(isNumeric(add2.getText(),add3.getText())==false){
            JOptionPane.showMessageDialog(null,"Enter Arrival and Burst time in digits", "Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            boolean status=true;
            for(int i=0;i<process_new.getRowCount();i++){
                String value = process_new.getModel().getValueAt(i, 0).toString();
                if(value.equals(add1.getText())){
                    status=false;
                    break;
                }
            }
            if(status==true){
            Object[] obj={add1.getText(),add2.getText(),add3.getText()};
            Object[] obj1={add1.getText(),add2.getText(),add3.getText(),"0","0","0"};
            model.addRow(obj);
            model2.addRow(obj1);
            add1.setText(null);
            add2.setText(null);
            add3.setText(null);
            }else{
                JOptionPane.showMessageDialog(null,"Process already created against this ID ", "Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }else{
            JOptionPane.showMessageDialog(null,"Only 10 process can be create at a time", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        add1.setText(null);
        add2.setText(null);
        add3.setText(null);
        jButton5.setEnabled(false);
        jButton2.setEnabled(false);
        add1.setEditable(true);
        row=-1;
    }//GEN-LAST:event_jButton6ActionPerformed
//private Timer tam;
// public class prog implements ActionListener{
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            int val=p1.getValue();
//            if(val<100){
//                val++;
//                p1.setValue(val);
//            }else{
//                tam.stop();
//            }
//        }
//    
//    
//}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        if(sz!=-1){
//            tm.restart();
//            pro_plus=0;
//            sz=-1;
//            total_pro=0;
//            System.out.println("Timer restart");
//        }
        if(main_jobs.getRowCount()>0){
        avgwt=0;
        avgta=0;
        sz=main_jobs.getRowCount();
        for(int i=0;i<main_jobs.getRowCount();i++){
            String pid_p = main_jobs.getModel().getValueAt(i, 0).toString();
            int arival =  Integer.parseInt(main_jobs.getModel().getValueAt(i, 1).toString());
            int burst= Integer.parseInt(main_jobs.getModel().getValueAt(i, 2).toString());     
            pid[i]=pid_p;
            ar[i]=arival;
            bt[i]=burst;
        }
        FCFS(sz);
        }else{
            JOptionPane.showMessageDialog(null,"Please create procces then samulate", "Error",JOptionPane.ERROR_MESSAGE);
        }
////        progress(p1,bt[0],0);
//          tam=new Timer(50,new Main_samulator.prog());
//          tam.start();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        for(int i=0;i<main_jobs.getRowCount();i++){
            String pid_p = main_jobs.getModel().getValueAt(i, 0).toString();
            int arival =  Integer.parseInt(main_jobs.getModel().getValueAt(i, 1).toString());
            int burst= Integer.parseInt(main_jobs.getModel().getValueAt(i, 2).toString());    
            main_jobs.setValueAt(pid_p, i, 0);
            main_jobs.setValueAt(arival, i, 1);
            main_jobs.setValueAt(burst, i, 2);
            main_jobs.setValueAt("0", i, 3);
            main_jobs.setValueAt("0", i, 4);
            main_jobs.setValueAt("0", i, 5);
        }
        avgwt=0;
        avgta=0;
        jTextArea1.setText(null);
        avg_wt.setText(null);
        avg_tat.setText(null);
        p1.setValue(0);
        p2.setValue(0);
        p3.setValue(0);
        p4.setValue(0);
        p5.setValue(0);
        p6.setValue(0);
        p7.setValue(0);
        p8.setValue(0);
        p9.setValue(0);
        p10.setValue(0);
        txt1.setText(null);
        txt2.setText(null);
        txt3.setText(null);
        txt4.setText(null);
        txt5.setText(null);
        txt6.setText(null);
        txt7.setText(null);
        txt8.setText(null);
        txt9.setText(null);
        txt10.setText(null);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(row>-1){
            process_new.setValueAt(add1.getText(), row, 0);
            process_new.setValueAt(add2.getText(), row, 1);
            process_new.setValueAt(add3.getText(), row, 2);
            main_jobs.setValueAt(add1.getText(), row, 0);
            main_jobs.setValueAt(add2.getText(), row, 1);
            main_jobs.setValueAt(add3.getText(), row, 2);
            JOptionPane.showMessageDialog(null,"Process with id ("+add1.getText()+") update successfully", "Info",JOptionPane.INFORMATION_MESSAGE);
            row=-1;
            add1.setEditable(true);
            add1.setText(null);
            add2.setText(null);
            add3.setText(null);
            jButton5.setEnabled(false);
        jButton2.setEnabled(false);
        }else{
            JOptionPane.showMessageDialog(null,"Please select process from row then update", "Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed
int row=-1;
    private void process_newMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_process_newMouseClicked
        // TODO add your handling code here:
//        int row = main_jobs.getSelectedRow()+1;
        row=process_new.getSelectedRow();
        add1.setText( process_new.getModel().getValueAt(row, 0).toString());
        add2.setText(process_new.getModel().getValueAt(row, 1).toString());
        add3.setText(process_new.getModel().getValueAt(row, 2).toString());
        jButton5.setEnabled(true);
        jButton2.setEnabled(true);
        add1.setEditable(false);
    }//GEN-LAST:event_process_newMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(row>-1){
        int row1 = process_new.getSelectedRow();
        int modelRow = process_new.convertRowIndexToModel( row1 );
        DefaultTableModel model = (DefaultTableModel)process_new.getModel();
        model.removeRow( modelRow );
        int modelRow1 = main_jobs.convertRowIndexToModel( row1 );
        DefaultTableModel model1 = (DefaultTableModel)main_jobs.getModel();
        model1.removeRow( modelRow1 );
        jButton5.setEnabled(false);
        jButton2.setEnabled(false);
        add1.setText(null);
        add2.setText(null);
        add3.setText(null);
        add1.setEditable(true);
        row=-1;
        }else{
            JOptionPane.showMessageDialog(null,"Please select process from row then delete", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        add1.setText(null);
        add2.setText(null);
        add3.setText(null);
        add1.setEditable(false);
        jButton5.setEnabled(false);
        jButton2.setEnabled(false);
        jButton4.setEnabled(false);
        jButton6.setEnabled(true);
        Scheduler_Panel.setVisible(false);
        New_process.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        add1.setText(null);
        add2.setText(null);
        add3.setText(null);
        add1.setEditable(false);
        jButton5.setEnabled(false);
        jButton2.setEnabled(false);
        jButton4.setEnabled(false);
        jButton6.setEnabled(false);
        Scheduler_Panel.setVisible(false);
        New_process.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, """
                                            \nSoftware name : Kernel Samulator
                                            \nVersion : 2.0.1
                                            \nProject for : Operating System
                                            \nProject Code : 002
                                            \nDeveloper : Mr Amir Ghafoor
                                            \nTeam Member: Muhammad Ahmad
                                            \nInstructor: Zarmina Jahangir
                                            """, "Error",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenu5MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_samulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_samulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_samulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_samulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_samulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Main_Panel;
    private javax.swing.JPanel New_process;
    private javax.swing.JPanel Scheduler_Panel;
    private javax.swing.JTextField add1;
    private javax.swing.JTextField add2;
    private javax.swing.JTextField add3;
    private javax.swing.JTextField avg_tat;
    private javax.swing.JTextField avg_wt;
    private javax.swing.JMenuBar choice_bar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTable main_jobs;
    private javax.swing.JProgressBar p1;
    private javax.swing.JProgressBar p10;
    private javax.swing.JProgressBar p2;
    private javax.swing.JProgressBar p3;
    private javax.swing.JProgressBar p4;
    private javax.swing.JProgressBar p5;
    private javax.swing.JProgressBar p6;
    private javax.swing.JProgressBar p7;
    private javax.swing.JProgressBar p8;
    private javax.swing.JProgressBar p9;
    private javax.swing.JTable process_new;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt10;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt8;
    private javax.swing.JTextField txt9;
    // End of variables declaration//GEN-END:variables
}
