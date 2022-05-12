package GUI;


import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import BUS.TaiKhoanBUS;
import DTO.TaiKhoanDTO;
import BUS.NhanVienBUS;
import DTO.NhanVienDTO;
import BUS.PhanQuyenBUS;
import BUS.Tool;
import DAO.TaiKhoanDAO;
import DTO.PhanQuyenDTO;
import java.awt.Color;
//import Excel.WorkWithFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.event.PrintJobEvent;
import javax.swing.SwingConstants;

public class LoginGUI extends javax.swing.JFrame {
    public static String taiKhoan;
    /**
     * Creates new form LoginForm
     */
    public LoginGUI() {
        initComponents();
        //Set vị trí xuất hiện của login ở giữa màn hình
        this.setLocationRelativeTo(null);
        // add event Enter
        //Tạo thêm tiện dụng khi có thêm ấn enter thay vì phải click chuột vào đăng nhập
        KeyAdapter ka = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                //nếu ấn enter sẽ click vào btnDangnhap
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    
                    btnDangnhap.doClick();
                }
            }
        };
        txtTendangnhap.addKeyListener(ka);
        txtMatkhau.addKeyListener(ka);

    }

    //Hàm tạo form đăng nhập
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_Login = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtTendangnhap = new javax.swing.JTextField();
        btnDangnhap = new javax.swing.JButton();
        txtMatkhau = new javax.swing.JPasswordField();
        btnHuy = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
//        jPanel1.setBackground(Color.decode("#AFEEFF"));
        jPanel1.setBackground(new java.awt.Color(3, 169, 244));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 255, 255)), javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

//        jLabel_Login.setBackground(Color.decode("#AFEEFF"));
        jLabel_Login.setBackground(new java.awt.Color(129, 212, 250));
        jLabel_Login.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel_Login.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Login.setText("ĐĂNG NHẬP");

//        jPanel2.setBackground(Color.decode("#AFEEFF"));
        jPanel2.setBackground(new java.awt.Color(128, 216, 255));

        txtTendangnhap.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtTendangnhap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtTendangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTendangnhapActionPerformed(evt);
            }
        });

        
        btnDangnhap.setBackground(Color.decode("#00E676"));
//        btnDangnhap.setBackground(new java.awt.Color(129, 212, 250));
        btnDangnhap.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDangnhap.setForeground(new java.awt.Color(255, 255, 255));
        btnDangnhap.setText("Đăng nhập");
        btnDangnhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDangnhapMouseClicked(evt);
            }
        });
        btnDangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnDangnhapActionPerformed(evt);
                } catch (Exception ex) {
                    Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        btnDangnhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnDangnhapKeyPressed(evt);
            }
        });

        txtMatkhau.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtMatkhau.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

         btnHuy.setBackground(Color.decode("#FF3D00"));
//        btnHuy.setBackground(new java.awt.Color(255, 144, 144));
        btnHuy.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnHuy.setForeground(new java.awt.Color(255, 255, 255));
        btnHuy.setText("Hủy");
        btnHuy.setAutoscrolls(true);
        btnHuy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHuyMouseClicked(evt);
            }
        });
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon/khachhang-30.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon/password-30.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 68, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTendangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDangnhap)))))
                .addGap(68, 68, 68))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTendangnhap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMatkhau, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
//        jLabel3.setIcon(SwingConstants.LEADING); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Icon/dangnhap-30.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel_Login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel_Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        System.exit(0);
    }                                      

    private void btnHuyMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void btnDangnhapKeyPressed(java.awt.event.KeyEvent evt) {                                       
        // TODO add your handling code here:
    }                                      
    
    
    //Sự kiện khi click vào nút đăng nhập
    private void btnDangnhapActionPerformed(java.awt.event.ActionEvent evt) throws Exception {  
        //tạo biến tentk
    	String tkString;
        tkString = txtTendangnhap.getText(); 
        //tạo biến mk
        String matKhau = txtMatkhau.getText(); 
        
        if(checkLogin(tkString, matKhau))
        {
            this.setVisible(false);
            GUImenu GiaoDien=new GUImenu();

        }
}                                           

    private void btnDangnhapMouseClicked(java.awt.event.MouseEvent evt) {                                         

    }                                        

    private void txtTendangnhapActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              
    
    //Hàm check đăng nhập
    public boolean checkLogin(String tenDangNhap, String matKhau)
    {

        //nếu không trống
       if(!checkEmpty())
       {
    		try {
    			TaiKhoanBUS.docDSTK(tenDangNhap, matKhau);
    		} catch (Exception e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		System.out.println(TaiKhoanBUS.dstk.size());
    	   if(TaiKhoanBUS.dstk.isEmpty())
           {
    		   JOptionPane.showMessageDialog(null, "Tài khoản không tồn tại");
    		   
           }else {
			      
           //duyệt arraylist tài khoản ở TaiKhoanBUS 
           for(int i=0; i< TaiKhoanBUS.dstk.size();i++)
           {
                //check tên đăng nhập nếu có trong danh sách tài khoản thì xét tiếp , không thì khi duyệt hết sẽ thông báo lại
//                if(TaiKhoanBUS.dstk.get(i).getTaiKhoan().equals(tenDangNhap))
//                {
                    //check mật khẩu nếu đúng thì ẩn form login và chạy form giao diện
                    if(TaiKhoanBUS.dstk.size() >0)
                    {
                    	taiKhoan = TaiKhoanBUS.dstk.get(i).getTaiKhoan();
                        Tool.IDNhanVienHienHanh = TaiKhoanBUS.timKiemMaNhanVienTheoTenTaiKhoan(TaiKhoanBUS.dstk.get(i).getTaiKhoan()); 
                        return true;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Mật khẩu không chính xác");
                        break;
                    }
                //}
//                if(i == TaiKhoanBUS.dstk.size() -1)
//                {
//                    JOptionPane.showMessageDialog(null, "Tài khoản không tồn tại");
//                }
                }
           }
       }
       return false;
    }
    //Hàm check xem các field có trống không
    public boolean checkEmpty()
    {
        if(txtTendangnhap.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Vui lòng điền tên đăng nhập");
            return true;
        }
        else if(txtMatkhau.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Vui lòng điền mật khẩu");
            return true;
        }
        return false;
    }
    public static String saveFileName = "temp";
    public static PhanQuyenDTO quyenLogin;
    public static NhanVienDTO nhanVienLogin;
    public static TaiKhoanDTO taiKhoanLogin;
    // Variables declaration - do not modify                     
    private javax.swing.JButton btnDangnhap;
    private javax.swing.JButton btnHuy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_Login;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtMatkhau;
    private javax.swing.JTextField txtTendangnhap;
    // End of variables declaration                   
}













