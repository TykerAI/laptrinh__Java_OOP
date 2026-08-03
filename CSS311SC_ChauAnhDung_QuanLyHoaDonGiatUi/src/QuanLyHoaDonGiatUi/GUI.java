package QuanLyHoaDonGiatUi;
import QuanLyHoaDonGiatUi.GiatUi;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GUI extends javax.swing.JFrame {
    DefaultTableModel dtm = new DefaultTableModel();
    DanhSachHoaDon quanLy = new DanhSachHoaDon();
    
    private int cheDoHienTai = 1;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GUI.class.getName());

    
    private ArrayList<IDichVu> ketQuaTimKiem = new ArrayList<>(); 
    private ArrayList<IDichVu> danhSachHienTai = new ArrayList<>();
    
    public GUI() {
        initComponents();
        this.setResizable(false);
        txtKhachHang.requestFocus();
        dtm = (DefaultTableModel) tblHienThi.getModel();
        
        setupSidebarButton(btnTaoDon, "add.png", "Tạo đơn");
        setupSidebarButton(btnXoaDon, "delete.png", "Xóa đơn");
        setupSidebarButton(btnSuaDon, "edit.png", "Sửa đơn");
        setupSidebarButton(btnTraCuu, "search.png", "Tìm đơn");
        
        setupSidebarButton(btnDocFile, "folder_open.png", "Đọc file");
        setupSidebarButton(btnXuatFile, "file_export.png", "Xuất file");
        setupSidebarButton(btnLamMoi, "refresh.png", "Làm mới");
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        menuDangXuLy = new javax.swing.JMenuItem();
        menuHoanThanh = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlSidepar = new javax.swing.JPanel();
        btnTraCuu = new javax.swing.JButton();
        btnTaoDon = new javax.swing.JButton();
        btnDocFile = new javax.swing.JButton();
        btnXuatFile = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        btnXoaDon = new javax.swing.JButton();
        btnSuaDon = new javax.swing.JButton();
        lblHeThong = new javax.swing.JLabel();
        lblChinh = new javax.swing.JLabel();
        pnlThongKe = new javax.swing.JPanel();
        lblTongDonHomNay = new javax.swing.JLabel();
        lblDangXuLy = new javax.swing.JLabel();
        lblKhachHang_thongKe = new javax.swing.JLabel();
        lblDoanhThuHomNay = new javax.swing.JLabel();
        pnlLog = new javax.swing.JPanel();
        lblLog = new javax.swing.JLabel();
        pnlCenter = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHienThi = new javax.swing.JTable();
        pnlActionBar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbxSapXep = new javax.swing.JComboBox<>();
        btnTang = new javax.swing.JButton();
        btnGiam = new javax.swing.JButton();
        btnMax = new javax.swing.JButton();
        btnMin = new javax.swing.JButton();
        pnlRight = new javax.swing.JPanel();
        btnChucNang = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblLoaiDichVu = new javax.swing.JLabel();
        lblChiSo = new javax.swing.JLabel();
        txtKhachHang = new javax.swing.JTextField();
        lblSoDienThoai = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        cbxDichVu = new javax.swing.JComboBox<>();
        txtKhoiLuong = new javax.swing.JTextField();
        lblDonGia = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        txtPhuThu = new javax.swing.JTextField();
        lblPhuThu = new javax.swing.JLabel();
        chkPhanLoai = new javax.swing.JCheckBox();
        chkKiemTra = new javax.swing.JCheckBox();
        lblMaDonHang = new javax.swing.JLabel();
        txtMaDonHang = new javax.swing.JTextField();
        lblNgayNhan = new javax.swing.JLabel();
        txtNgayNhan = new javax.swing.JTextField();
        lblThongTinDonHang = new javax.swing.JLabel();
        lblGioiTinh = new javax.swing.JLabel();
        lblDiaChi = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        rbtNu = new javax.swing.JRadioButton();
        rbtNam = new javax.swing.JRadioButton();

        menuDangXuLy.setText("Đang Xử Lý");
        menuDangXuLy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDangXuLyActionPerformed(evt);
            }
        });
        jPopupMenu1.add(menuDangXuLy);

        menuHoanThanh.setText("Hoàn Thành");
        menuHoanThanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHoanThanhActionPerformed(evt);
            }
        });
        jPopupMenu1.add(menuHoanThanh);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ HÓA ĐƠN GIẶT ỦI");
        setBackground(new java.awt.Color(18, 18, 18));

        pnlSidepar.setBackground(new java.awt.Color(51, 51, 51));
        pnlSidepar.setForeground(new java.awt.Color(10, 10, 10));

        btnTraCuu.setBackground(new java.awt.Color(10, 10, 10));
        btnTraCuu.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnTraCuu.setForeground(new java.awt.Color(200, 200, 200));
        btnTraCuu.setText("Tìm Đơn");
        btnTraCuu.setBorder(null);
        btnTraCuu.setContentAreaFilled(false);
        btnTraCuu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTraCuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraCuuActionPerformed(evt);
            }
        });

        btnTaoDon.setBackground(new java.awt.Color(10, 10, 10));
        btnTaoDon.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnTaoDon.setForeground(new java.awt.Color(200, 200, 200));
        btnTaoDon.setText("Tạo Đơn");
        btnTaoDon.setBorder(null);
        btnTaoDon.setContentAreaFilled(false);
        btnTaoDon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTaoDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoDonActionPerformed(evt);
            }
        });

        btnDocFile.setBackground(new java.awt.Color(10, 10, 10));
        btnDocFile.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnDocFile.setForeground(new java.awt.Color(200, 200, 200));
        btnDocFile.setText("Đọc File");
        btnDocFile.setBorder(null);
        btnDocFile.setContentAreaFilled(false);
        btnDocFile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDocFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocFileActionPerformed(evt);
            }
        });

        btnXuatFile.setBackground(new java.awt.Color(10, 10, 10));
        btnXuatFile.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnXuatFile.setForeground(new java.awt.Color(200, 200, 200));
        btnXuatFile.setText("Xuất File");
        btnXuatFile.setBorder(null);
        btnXuatFile.setContentAreaFilled(false);
        btnXuatFile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXuatFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatFileActionPerformed(evt);
            }
        });

        btnLamMoi.setBackground(new java.awt.Color(10, 10, 10));
        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnLamMoi.setForeground(new java.awt.Color(200, 200, 200));
        btnLamMoi.setText("Làm Mới");
        btnLamMoi.setBorder(null);
        btnLamMoi.setContentAreaFilled(false);
        btnLamMoi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        btnXoaDon.setBackground(new java.awt.Color(10, 10, 10));
        btnXoaDon.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnXoaDon.setForeground(new java.awt.Color(200, 200, 200));
        btnXoaDon.setText("Xóa Đơn");
        btnXoaDon.setBorder(null);
        btnXoaDon.setContentAreaFilled(false);
        btnXoaDon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaDonActionPerformed(evt);
            }
        });

        btnSuaDon.setBackground(new java.awt.Color(10, 10, 10));
        btnSuaDon.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnSuaDon.setForeground(new java.awt.Color(200, 200, 200));
        btnSuaDon.setText("Sửa Đơn");
        btnSuaDon.setBorder(null);
        btnSuaDon.setContentAreaFilled(false);
        btnSuaDon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSuaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaDonActionPerformed(evt);
            }
        });

        lblHeThong.setBackground(new java.awt.Color(150, 150, 150));
        lblHeThong.setText("HỆ THỐNG");

        lblChinh.setBackground(new java.awt.Color(150, 150, 150));
        lblChinh.setText("CHÍNH");

        javax.swing.GroupLayout pnlSideparLayout = new javax.swing.GroupLayout(pnlSidepar);
        pnlSidepar.setLayout(pnlSideparLayout);
        pnlSideparLayout.setHorizontalGroup(
            pnlSideparLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSideparLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(pnlSideparLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblHeThong)
                    .addComponent(lblChinh, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
            .addComponent(btnDocFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSideparLayout.createSequentialGroup()
                .addGroup(pnlSideparLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLamMoi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXuatFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(btnSuaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTraCuu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnXoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTaoDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlSideparLayout.setVerticalGroup(
            pnlSideparLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSideparLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblChinh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTaoDon)
                .addGap(18, 18, 18)
                .addComponent(btnXoaDon)
                .addGap(18, 18, 18)
                .addComponent(btnSuaDon)
                .addGap(18, 18, 18)
                .addComponent(btnTraCuu)
                .addGap(47, 47, 47)
                .addComponent(lblHeThong)
                .addGap(6, 6, 6)
                .addComponent(btnDocFile)
                .addGap(18, 18, 18)
                .addComponent(btnXuatFile)
                .addGap(18, 18, 18)
                .addComponent(btnLamMoi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlThongKe.setBackground(new java.awt.Color(51, 51, 51));

        lblTongDonHomNay.setText("Tổng đơn");

        lblDangXuLy.setText("Đang xử lý");

        lblKhachHang_thongKe.setText("Khách hàng");

        lblDoanhThuHomNay.setText("Doanh Thu");

        javax.swing.GroupLayout pnlThongKeLayout = new javax.swing.GroupLayout(pnlThongKe);
        pnlThongKe.setLayout(pnlThongKeLayout);
        pnlThongKeLayout.setHorizontalGroup(
            pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongKeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTongDonHomNay, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(232, 232, 232)
                .addComponent(lblDoanhThuHomNay, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194)
                .addComponent(lblDangXuLy, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175)
                .addComponent(lblKhachHang_thongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );
        pnlThongKeLayout.setVerticalGroup(
            pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongKeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTongDonHomNay, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDangXuLy, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKhachHang_thongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDoanhThuHomNay, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlLog.setBackground(new java.awt.Color(51, 51, 51));

        lblLog.setText("⚡ SYSTEM LOG...");

        javax.swing.GroupLayout pnlLogLayout = new javax.swing.GroupLayout(pnlLog);
        pnlLog.setLayout(pnlLogLayout);
        pnlLogLayout.setHorizontalGroup(
            pnlLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblLog, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        pnlLogLayout.setVerticalGroup(
            pnlLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogLayout.createSequentialGroup()
                .addComponent(lblLog, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );

        pnlCenter.setBackground(new java.awt.Color(51, 51, 51));

        tblHienThi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Đơn", "Ngày Nhận", "Khách Hàng", "Giới Tính", "Số Điện Thoại", "Địa Chỉ", "Dịch Vụ", "Đơn Giá", "Chỉ Số", "Phụ Thu", "Tổng Tiền", "Trạng Thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHienThi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHienThiMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblHienThiMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblHienThi);
        if (tblHienThi.getColumnModel().getColumnCount() > 0) {
            tblHienThi.getColumnModel().getColumn(0).setResizable(false);
            tblHienThi.getColumnModel().getColumn(1).setResizable(false);
            tblHienThi.getColumnModel().getColumn(2).setResizable(false);
            tblHienThi.getColumnModel().getColumn(3).setResizable(false);
            tblHienThi.getColumnModel().getColumn(4).setResizable(false);
            tblHienThi.getColumnModel().getColumn(5).setResizable(false);
            tblHienThi.getColumnModel().getColumn(6).setResizable(false);
            tblHienThi.getColumnModel().getColumn(7).setResizable(false);
            tblHienThi.getColumnModel().getColumn(8).setResizable(false);
            tblHienThi.getColumnModel().getColumn(9).setResizable(false);
            tblHienThi.getColumnModel().getColumn(10).setResizable(false);
            tblHienThi.getColumnModel().getColumn(11).setResizable(false);
        }
        javax.swing.table.DefaultTableCellRenderer centerRenderer = new javax.swing.table.DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(javax.swing.JLabel.CENTER);

        tblHienThi.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        tblHienThi.getColumnModel().getColumn(7).setCellRenderer(centerRenderer);
        tblHienThi.getColumnModel().getColumn(8).setCellRenderer(centerRenderer);
        tblHienThi.getColumnModel().getColumn(9).setCellRenderer(centerRenderer);
        tblHienThi.getColumnModel().getColumn(10).setCellRenderer(centerRenderer);
        tblHienThi.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);

        pnlActionBar.setBackground(new java.awt.Color(70, 73, 75));

        jLabel2.setText("Lọc đơn:");
        pnlActionBar.add(jLabel2);

        cbxSapXep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tổng Tiền", "Ngày Nhận" }));
        cbxSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSapXepActionPerformed(evt);
            }
        });
        pnlActionBar.add(cbxSapXep);

        btnTang.setText("↑ Tăng");
        btnTang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTangActionPerformed(evt);
            }
        });
        pnlActionBar.add(btnTang);

        btnGiam.setText("↓ Giảm");
        btnGiam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiamActionPerformed(evt);
            }
        });
        pnlActionBar.add(btnGiam);

        btnMax.setText("Max");
        btnMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaxActionPerformed(evt);
            }
        });
        pnlActionBar.add(btnMax);

        btnMin.setText("Min");
        btnMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinActionPerformed(evt);
            }
        });
        pnlActionBar.add(btnMin);

        javax.swing.GroupLayout pnlCenterLayout = new javax.swing.GroupLayout(pnlCenter);
        pnlCenter.setLayout(pnlCenterLayout);
        pnlCenterLayout.setHorizontalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlActionBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCenterLayout.setVerticalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlActionBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlRight.setBackground(new java.awt.Color(51, 51, 51));
        pnlRight.setForeground(new java.awt.Color(30, 30, 30));

        btnChucNang.setBackground(new java.awt.Color(0, 122, 204));
        btnChucNang.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnChucNang.setForeground(new java.awt.Color(255, 255, 255));
        btnChucNang.setText("Thêm đơn");
        btnChucNang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChucNangActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(150, 150, 150));
        jLabel1.setText("Khách hàng:");

        lblLoaiDichVu.setBackground(new java.awt.Color(150, 150, 150));
        lblLoaiDichVu.setText("Loại dịch vụ:");

        lblChiSo.setBackground(new java.awt.Color(150, 150, 150));
        lblChiSo.setText("Khối lượng (kg): ");

        txtKhachHang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 60, 60)));
        txtKhachHang.setCaretColor(new java.awt.Color(255, 255, 255));

        lblSoDienThoai.setBackground(new java.awt.Color(150, 150, 150));
        lblSoDienThoai.setText("Số điện thoại: ");

        txtSDT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 60, 60)));
        txtSDT.setCaretColor(new java.awt.Color(255, 255, 255));
        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });

        cbxDichVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giặt Áo/Quần ", "Giặt Giày", "Giặt Ra Giường/Rèm Cửa", "Giặt Chăn/Mền", "Giặt Bộ Veston", "Giặt Thú Nhồi Bông" }));
        cbxDichVu.setBorder(null);
        cbxDichVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDichVuActionPerformed(evt);
            }
        });

        txtKhoiLuong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 60, 60)));
        txtKhoiLuong.setCaretColor(new java.awt.Color(255, 255, 255));
        txtKhoiLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKhoiLuongActionPerformed(evt);
            }
        });

        lblDonGia.setBackground(new java.awt.Color(150, 150, 150));
        lblDonGia.setText("Đơn giá (VNĐ): ");

        txtDonGia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 60, 60)));
        txtDonGia.setCaretColor(new java.awt.Color(255, 255, 255));

        txtPhuThu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 60, 60)));
        txtPhuThu.setCaretColor(new java.awt.Color(255, 255, 255));

        lblPhuThu.setBackground(new java.awt.Color(150, 150, 150));
        lblPhuThu.setText("Phụ thu tẩy ố (VNĐ):");

        chkPhanLoai.setText("Đã phân loại màu");
        chkPhanLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPhanLoaiActionPerformed(evt);
            }
        });

        chkKiemTra.setText("Đã kiểm tra kỹ túi quần áo");
        chkKiemTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkKiemTraActionPerformed(evt);
            }
        });

        lblMaDonHang.setBackground(new java.awt.Color(150, 150, 150));
        lblMaDonHang.setText("Mã đơn hàng:");

        txtMaDonHang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 60, 60)));
        txtMaDonHang.setCaretColor(new java.awt.Color(255, 255, 255));

        lblNgayNhan.setBackground(new java.awt.Color(150, 150, 150));
        lblNgayNhan.setText("Ngày nhận (ngày/tháng/năm) :");

        txtNgayNhan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 60, 60)));
        txtNgayNhan.setCaretColor(new java.awt.Color(255, 255, 255));

        lblThongTinDonHang.setFont(new java.awt.Font("Segoe UI", 3, 23)); // NOI18N
        lblThongTinDonHang.setText("NHẬP THÔNG TIN ĐƠN HÀNG");

        lblGioiTinh.setBackground(new java.awt.Color(150, 150, 150));
        lblGioiTinh.setText("Giới tính:");

        lblDiaChi.setBackground(new java.awt.Color(150, 150, 150));
        lblDiaChi.setText("Địa chỉ:");

        txtDiaChi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 60, 60)));
        txtDiaChi.setCaretColor(new java.awt.Color(255, 255, 255));

        buttonGroup1.add(rbtNu);
        rbtNu.setText("Nữ");

        buttonGroup1.add(rbtNam);
        rbtNam.setSelected(true);
        rbtNam.setText("Nam");

        javax.swing.GroupLayout pnlRightLayout = new javax.swing.GroupLayout(pnlRight);
        pnlRight.setLayout(pnlRightLayout);
        pnlRightLayout.setHorizontalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRightLayout.createSequentialGroup()
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRightLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(chkKiemTra)
                        .addGap(38, 38, 38)
                        .addComponent(chkPhanLoai)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlRightLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlRightLayout.createSequentialGroup()
                                    .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlRightLayout.createSequentialGroup()
                                            .addComponent(rbtNam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(rbtNu, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblMaDonHang)
                                            .addComponent(lblPhuThu)
                                            .addComponent(txtPhuThu, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNgayNhan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblNgayNhan, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addComponent(txtMaDonHang)
                                        .addComponent(lblGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(41, 41, 41))
                                .addGroup(pnlRightLayout.createSequentialGroup()
                                    .addComponent(lblLoaiDichVu)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(pnlRightLayout.createSequentialGroup()
                                .addComponent(cbxDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)))
                        .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRightLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDonGia)
                                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlRightLayout.createSequentialGroup()
                                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtKhoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                    .addComponent(lblSoDienThoai)
                                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblChiSo))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRightLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblThongTinDonHang)))
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(pnlRightLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(btnChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlRightLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbxDichVu, txtDonGia, txtKhachHang, txtKhoiLuong, txtMaDonHang, txtNgayNhan, txtPhuThu, txtSDT});

        pnlRightLayout.setVerticalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRightLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(lblThongTinDonHang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaDonHang)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaDonHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGioiTinh)
                    .addComponent(lblSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtNu)
                    .addComponent(rbtNam)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChiSo)
                    .addComponent(lblLoaiDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKhoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhuThu)
                    .addComponent(lblDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhuThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgayNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDiaChi))
                .addGap(18, 18, 18)
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgayNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkKiemTra, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkPhanLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pnlRightLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtDonGia, txtKhachHang, txtKhoiLuong, txtMaDonHang, txtNgayNhan, txtPhuThu, txtSDT});

        pnlRightLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, lblChiSo, lblDonGia, lblLoaiDichVu, lblMaDonHang, lblNgayNhan, lblPhuThu, lblSoDienThoai});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlSidepar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pnlCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSidepar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDocFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocFileActionPerformed
        try {
            // TODO add your handling code here:
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(null); 
            String tenFile = fc.getSelectedFile().getPath();
            quanLy.getDanhSach().clear();
            quanLy.docFile(tenFile);
            loadData(quanLy.getDanhSach());
            JOptionPane.showMessageDialog(this, "Đọc File thành công", "Thông báo",JOptionPane.INFORMATION_MESSAGE);
            lblLog.setText("⚡ SYSTEM LOG:   [OK] Đọc thành công file: " + tenFile );
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnDocFileActionPerformed
    
    private void tblHienThiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHienThiMouseReleased
        // TODO add your handling code here:
        if (evt.getClickCount() == 1 && !evt.isPopupTrigger()) {
            int row = tblHienThi.getSelectedRow();
            if (row != -1) {
                thayDoiGiaoDien(3); 
                
                txtMaDonHang.setText(tblHienThi.getValueAt(row, 0).toString());
                txtNgayNhan.setText(tblHienThi.getValueAt(row, 1).toString());
                txtKhachHang.setText(tblHienThi.getValueAt(row, 2).toString());
                String gioiTinhStr = tblHienThi.getValueAt(row, 3).toString();
                if(gioiTinhStr.equalsIgnoreCase("Nam")) {
                    rbtNam.setSelected(true);
                } else {
                    rbtNu.setSelected(true);
                }
                txtSDT.setText(tblHienThi.getValueAt(row, 4).toString());
                txtDiaChi.setText(tblHienThi.getValueAt(row, 5).toString());
                cbxDichVu.setSelectedItem(tblHienThi.getValueAt(row, 6).toString());
                
                String donGiaTho = tblHienThi.getValueAt(row, 7).toString().replaceAll("[^0-9]", "");
                txtDonGia.setText(donGiaTho);
                
                String chiSo = tblHienThi.getValueAt(row, 8).toString().split(" ")[0]; 
                txtKhoiLuong.setText(chiSo);
                
                String phuThu = tblHienThi.getValueAt(row, 9).toString().replaceAll("[^0-9]", "");
                txtPhuThu.setText(phuThu);
            }
        }       
        
        if (evt.isPopupTrigger()) {
            int row = tblHienThi.rowAtPoint(evt.getPoint());
            if (row != -1) {
                tblHienThi.setRowSelectionInterval(row, row); 
                jPopupMenu1.show(evt.getComponent(), evt.getX(), evt.getY()); 
            }
        }
    }//GEN-LAST:event_tblHienThiMouseReleased

    private void menuHoanThanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHoanThanhActionPerformed
        // TODO add your handling code here:
        int row = tblHienThi.getSelectedRow();
        if (row != -1) {
            String ma = tblHienThi.getValueAt(row, 0).toString();
            danhSachHienTai = new ArrayList<>(quanLy.getDanhSach());
            for (IDichVu dv : danhSachHienTai) {
                GiatUi don = (GiatUi) dv;
                if (don.getMaHoaDon().equalsIgnoreCase(ma)) {
                    don.setTrangThai("Hoàn Thành"); 
                    break;
                }
            }
            loadData(danhSachHienTai); 
            lblLog.setText("⚡ SYSTEM LOG:  [OK] Cập nhật thành công trạng thái 'Hoàn Thành' đơn có mã là " + ma);
        }
    }//GEN-LAST:event_menuHoanThanhActionPerformed

    private void menuDangXuLyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDangXuLyActionPerformed
        // TODO add your handling code here:
        int row = tblHienThi.getSelectedRow();
        if (row != -1) {
            String ma = tblHienThi.getValueAt(row, 0).toString();
            danhSachHienTai = new ArrayList<>(quanLy.getDanhSach());
            for (IDichVu dv : danhSachHienTai) {
                GiatUi don = (GiatUi) dv;
                if (don.getMaHoaDon().equalsIgnoreCase(ma)) {
                    don.setTrangThai("Đang xử lý"); 
                    break;
                }
            }
            loadData(danhSachHienTai); 
            lblLog.setText("⚡ SYSTEM LOG:   [OK] Cập nhật thành công trạng thái đơn có mã " + ma + " thành 'Đang xử lý'.");
        }
    }//GEN-LAST:event_menuDangXuLyActionPerformed

    private void chkPhanLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPhanLoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPhanLoaiActionPerformed

    private void txtKhoiLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKhoiLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKhoiLuongActionPerformed

    private void cbxDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDichVuActionPerformed
        // TODO add your handling code here:
        if (cbxDichVu.getSelectedItem() == null) {
            lblChiSo.setText("Khối lượng/Số lượng:");
            return; 
        }
        
        String dichVu = cbxDichVu.getSelectedItem().toString();
        if (dichVu.equalsIgnoreCase("Giặt Áo/Quần ") || dichVu.equalsIgnoreCase("Giặt Ra Giường/Rèm Cửa") || dichVu.equalsIgnoreCase("Giặt Chăn/Mền")) {
            lblChiSo.setText("Khối lượng (kg):");
        } else {
            lblChiSo.setText("Số lượng:");
        }
    }//GEN-LAST:event_cbxDichVuActionPerformed

    private void thayDoiGiaoDien(int cheDo) {
        cheDoHienTai = cheDo;
        lblThongTinDonHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtKhachHang.setText(""); txtSDT.setText(""); txtDiaChi.setText("");txtDonGia.setText(""); 
        txtKhoiLuong.setText(""); txtMaDonHang.setText(""); txtNgayNhan.setText(""); txtPhuThu.setText("");
        rbtNam.setSelected(true);
        
        txtKhachHang.setEnabled(true); txtKhoiLuong.setEnabled(true);
        txtDonGia.setEnabled(true); txtPhuThu.setEnabled(true);
        cbxDichVu.setEnabled(true); txtNgayNhan.setEnabled(true);
        chkKiemTra.setEnabled(true); chkPhanLoai.setEnabled(true);
        txtMaDonHang.setEnabled(true); txtSDT.setEnabled(true);
        

        switch (cheDo) {
            case 1: 
                lblThongTinDonHang.setText("NHẬP THÔNG TIN ĐƠN HÀNG");
                btnChucNang.setText("Thêm đơn");
                lblLog.setText("⚡ SYSTEM LOG: [OK] Chuyển sang chế độ 'Tạo đơn'");
                break;
                
            case 2: 
                lblThongTinDonHang.setText("TÌM THÔNG TIN ĐƠN HÀNG");
                btnChucNang.setText("Tìm đơn");
                chkKiemTra.setEnabled(false); chkPhanLoai.setEnabled(false); 
                buttonGroup1.clearSelection(); cbxDichVu.setSelectedIndex(-1);
                lblLog.setText("⚡ SYSTEM LOG: [OK] Chuyển sang chế độ 'Tìm đơn'");
                break;
                
            case 3: 
                lblThongTinDonHang.setText("SỬA THÔNG TIN ĐƠN HÀNG");
                btnChucNang.setText("Cập nhật");
                txtMaDonHang.setEnabled(false);
                chkKiemTra.setEnabled(false); chkPhanLoai.setEnabled(false);
                lblLog.setText("⚡ SYSTEM LOG: [OK] Chuyển sang chế độ 'Sửa đơn'");
                break;
        }
    }
    
    private void xuLyThemDon() {
        String khachHang = txtKhachHang.getText().trim();
        String maDonHang = txtMaDonHang.getText().trim();
        String soDienThoai = txtSDT.getText().trim();
        String ngayNhan = txtNgayNhan.getText().trim();
        String loaiDichVu = cbxDichVu.getSelectedItem() != null ? cbxDichVu.getSelectedItem().toString().trim() : "";
        String diaChi = txtDiaChi.getText().trim();
        String chiSoStr = txtKhoiLuong.getText().trim();
        String donGiaStr = txtDonGia.getText().trim();
        String phuThuStr = txtPhuThu.getText().trim();
        boolean gioiTinh = rbtNam.isSelected();
        
        if(!chkKiemTra.isSelected() && !chkPhanLoai.isSelected()) {
            JOptionPane.showMessageDialog(this,"Vui lòng tick vào ô 'Đã kiểm tra kỹ túi quần áo' và 'Đã phân loại màu' ", "Vi phạm nội quy", JOptionPane.ERROR_MESSAGE);
            lblLog.setText("⚡ SYSTEM LOG:   [ERROR] Thêm thất bại ! Vui lòng tick vào ô 'Đã kiểm tra kỹ túi quần áo' và 'Đã phân loại màu'");
             return;
        } else if(!chkPhanLoai.isSelected()){
            JOptionPane.showMessageDialog(this,"Vui lòng tick vào ô 'Đã phân loại màu' ", "Vi phạm nội quy", JOptionPane.ERROR_MESSAGE);
            lblLog.setText("⚡ SYSTEM LOG:   [ERROR] Thêm thất bại ! Vui lòng tick vào ô 'Đã phân loại màu'");
            return;
        } else if(!chkKiemTra.isSelected()) { 
            JOptionPane.showMessageDialog(this,"Vui lòng tick vào ô 'Đã kiểm tra kỹ túi quần áo'", "Vi phạm nội quy", JOptionPane.ERROR_MESSAGE);
            lblLog.setText("⚡ SYSTEM LOG:   [ERROR] Thêm thất bại ! Vui lòng tick vào ô 'Đã kiểm tra kỹ túi quần áo'");
            return;
        }
        
        if (maDonHang.isEmpty() || khachHang.isEmpty() || chiSoStr.isEmpty() || donGiaStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ các trường thông tin!","Thông báo",JOptionPane.ERROR_MESSAGE);
            lblLog.setText("⚡ SYSTEM LOG:   [ERROR] Vui lòng nhập đầy đủ các trường thông tin!");
            return;
        }
        
        try {
            double chiSo = Double.parseDouble(chiSoStr);
            double donGia = Double.parseDouble(donGiaStr);
            double phuThu = Double.parseDouble(phuThuStr);      

            IDichVu b = null;
            if(loaiDichVu.contains("Giặt Áo/Quần")) b = new GiatQuanAo(maDonHang, ngayNhan, khachHang, gioiTinh, soDienThoai, diaChi, loaiDichVu, phuThu, donGia, "Đang xử lý", chiSo);
            else if(loaiDichVu.contains("Giặt Giày")) b = new GiatGiay(maDonHang, ngayNhan, khachHang, gioiTinh, soDienThoai, diaChi, loaiDichVu, phuThu, donGia, "Đang xử lý", (int) chiSo);
            else if(loaiDichVu.contains("Giặt Bộ Veston")) b = new GiatVeston(maDonHang, ngayNhan, khachHang,gioiTinh, soDienThoai, diaChi, loaiDichVu, phuThu, donGia, "Đang xử lý", (int) chiSo);
            else if(loaiDichVu.contains("Giặt Ra Giường/Rèm Cửa")) b = new GiatRaGiuong_RemCua(maDonHang, ngayNhan, khachHang, gioiTinh,  soDienThoai, diaChi, loaiDichVu, phuThu, donGia, "Đang xử lý", chiSo);
            else if(loaiDichVu.contains("Giặt Chăn/Mền")) b = new GiatChanMem(maDonHang, ngayNhan, khachHang, gioiTinh, soDienThoai, diaChi, loaiDichVu, phuThu, donGia, "Đang xử lý", chiSo);
            else b = new GiatThuNhoiBong(maDonHang, ngayNhan, khachHang, gioiTinh, soDienThoai, diaChi, loaiDichVu, phuThu, donGia, "Đang xử lý", (int)chiSo);

            if(quanLy.themDonHang(b)) {
                danhSachHienTai = new ArrayList<>(quanLy.getDanhSach());
                loadData(danhSachHienTai); 
                thayDoiGiaoDien(1);
                JOptionPane.showMessageDialog(rootPane, "Thêm thành công");
                lblLog.setText("⚡ SYSTEM LOG: [OK] Đã thêm đơn " + maDonHang);
            } else {
                JOptionPane.showMessageDialog(this, "Trùng mã hóa đơn!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                lblLog.setText("⚡ SYSTEM LOG:   [ERROR] Thêm thất bại ! Vì trùng mã hóa đơn là '"+maDonHang+"'");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "'Khối lượng', 'Đơn giá', 'Phụ thu' không hợp lệ. Vui lòng nhập đúng định dạng!");
            lblLog.setText("⚡ SYSTEM LOG:   [ERROR] 'Khối lượng', 'Đơn giá', 'Phụ thu' không hợp lệ. Vui lòng nhập đúng định dạng!");
        }
    }
    private void xuLyTimDon() {
        String khachHang = txtKhachHang.getText().trim();
        String maDonHang = txtMaDonHang.getText().trim();
        String soDienThoai = txtSDT.getText().trim();
        String ngayNhan = txtNgayNhan.getText().trim();
        String loaiDichVu = cbxDichVu.getSelectedItem() != null ? cbxDichVu.getSelectedItem().toString().trim() : "";
        String diaChi = txtDiaChi.getText().trim();
        String chiSoStr = txtKhoiLuong.getText().trim();
        String donGiaStr = txtDonGia.getText().trim();
        String phuThuStr = txtPhuThu.getText().trim();
        boolean gioiTinh = rbtNam.isSelected();
        Boolean gioiTinhSearch = null;
        
        if (danhSachHienTai == null || danhSachHienTai.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không có Dữ Liệu. Vui lòng 'Đọc File' hoặc 'Tạo đơn'", "Thông báo", JOptionPane.WARNING_MESSAGE);
            lblLog.setText("⚡ SYSTEM LOG: [ERROR] Không có Dữ Liệu ");
            return; 
        }
        
        if (rbtNam.isSelected()) gioiTinhSearch = true;
        else if (rbtNu.isSelected()) gioiTinhSearch = false;

        ArrayList<IDichVu> kq = quanLy.timDonHang(maDonHang, khachHang, soDienThoai, diaChi, loaiDichVu, chiSoStr, donGiaStr, phuThuStr, ngayNhan, gioiTinhSearch);

        if (kq.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            lblLog.setText("⚡ SYSTEM LOG: [ERROR] Không tìm thấy đơn!");
            danhSachHienTai = new ArrayList<>(quanLy.getDanhSach()); 
            return;
        } else {
            danhSachHienTai = new ArrayList<>(kq); 
        }
        loadData(danhSachHienTai); 
        lblLog.setText("⚡ SYSTEM LOG: [OK] Đã hiển thị " + danhSachHienTai.size() + " đơn.");
    }
    
    private void xuLySuaDon() {
        String khachHang = txtKhachHang.getText().trim();
        String maDonHang = txtMaDonHang.getText().trim();
        String soDienThoai = txtSDT.getText().trim();
        String ngayNhan = txtNgayNhan.getText().trim();
        String loaiDichVu = cbxDichVu.getSelectedItem() != null ? cbxDichVu.getSelectedItem().toString().trim() : "";
        String diaChi = txtDiaChi.getText().trim();
        String chiSoStr = txtKhoiLuong.getText().trim();
        String donGiaStr = txtDonGia.getText().trim();
        String phuThuStr = txtPhuThu.getText().trim();
        boolean gioiTinh = rbtNam.isSelected();
        
        if (danhSachHienTai == null || danhSachHienTai.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không có Dữ Liệu. Vui lòng 'Đọc File' hoặc 'Tạo đơn'", "Thông báo", JOptionPane.WARNING_MESSAGE);
            lblLog.setText("⚡ SYSTEM LOG: [ERROR] Không có Dữ Liệu ");
            return; 
        }
        
        if (chiSoStr.isEmpty() || donGiaStr.isEmpty() || phuThuStr.isEmpty() || diaChi.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin 'Khối lương/Số lượng', 'Đơn giá' và 'Phụ thu' để cập nhật!", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
            lblLog.setText("⚡ SYSTEM LOG: [ERROR] Vui lòng nhập đầy đủ thông tin 'Khối lương/Số lượng', 'Đơn giá' và 'Phụ thu' để cập nhật! ");
            return;
        }

        double chiSo = Double.parseDouble(chiSoStr);
        double donGia = Double.parseDouble(donGiaStr);
        double phuThu = Double.parseDouble(phuThuStr);

        String trangThaiCu = "Đang xử lý";
        for(IDichVu dv : quanLy.getDanhSach()){
            if(((GiatUi)dv).getMaHoaDon().equalsIgnoreCase(maDonHang)){
                trangThaiCu = ((GiatUi)dv).getTrangThai();
                break;
            }
        }

        IDichVu b = null;
        if(loaiDichVu.equalsIgnoreCase("Giặt Áo/Quần")) b = new GiatQuanAo(maDonHang, ngayNhan, khachHang, gioiTinh, soDienThoai, diaChi, loaiDichVu, phuThu, donGia, trangThaiCu, chiSo);
        else if(loaiDichVu.equalsIgnoreCase("Giặt Giày")) b = new GiatGiay(maDonHang, ngayNhan, khachHang, gioiTinh, soDienThoai, diaChi, loaiDichVu, phuThu, donGia, trangThaiCu, (int) chiSo);
        else if(loaiDichVu.equalsIgnoreCase("Giặt Bộ Veston")) b = new GiatVeston(maDonHang, ngayNhan, khachHang, gioiTinh, soDienThoai, diaChi, loaiDichVu, phuThu, donGia, trangThaiCu, (int) chiSo);
        else if(loaiDichVu.equalsIgnoreCase("Giặt Ra Giường/Rèm Cửa")) b = new GiatRaGiuong_RemCua(maDonHang, ngayNhan, khachHang, gioiTinh, soDienThoai, diaChi, loaiDichVu, phuThu, donGia, trangThaiCu, chiSo);
        else if(loaiDichVu.equalsIgnoreCase("Giặt Chăn/Mền")) b = new GiatChanMem(maDonHang, ngayNhan, khachHang, gioiTinh, soDienThoai, diaChi, loaiDichVu, phuThu, donGia, trangThaiCu, chiSo);
        else b = new GiatThuNhoiBong(maDonHang, ngayNhan, khachHang, gioiTinh, soDienThoai, diaChi, loaiDichVu, phuThu, donGia, trangThaiCu, (int)chiSo);

        if (quanLy.suaDonHang(b)) {
            danhSachHienTai = new ArrayList<>(quanLy.getDanhSach());
            loadData(danhSachHienTai); 
            thayDoiGiaoDien(1);
            JOptionPane.showMessageDialog(this, "Cập nhật thành công đơn: " + maDonHang);
            lblLog.setText("⚡ SYSTEM LOG: [OK] Đã sửa thông tin đơn " + maDonHang);
        }else {
            JOptionPane.showMessageDialog(rootPane, "Không tìm thấy mã đơn hàng '"+maDonHang+"'", "Lỗi",JOptionPane.ERROR_MESSAGE);
            lblLog.setText("⚡ SYSTEM LOG: [ERROR] Không tìm thấy mã đơn hàng '"+maDonHang+"'");
        }
    }
    
    private void btnChucNangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChucNangActionPerformed
        try {
            switch (cheDoHienTai) {
            case 1: xuLyThemDon(); break; 
            case 2: xuLyTimDon(); break; 
            case 3: xuLySuaDon(); break; 
            }
        } catch (NumberFormatException ex) { 
            JOptionPane.showMessageDialog(this, "Lỗi: Khối lượng, đơn giá và Phụ Thu phải là SỐ!", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
            lblLog.setText("⚡ SYSTEM LOG:   [ERROR] Khối lượng, Đơn giá và Phụ Thu sai định dạng.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi nhập dữ liệu, vui lòng kiểm tra lại !", "Thông báo", JOptionPane.ERROR_MESSAGE);
            lblLog.setText("⚡ SYSTEM LOG:   [ERROR] " + e.getMessage());
        }
    }//GEN-LAST:event_btnChucNangActionPerformed

    private void chkKiemTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkKiemTraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkKiemTraActionPerformed

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
        dtm.setRowCount(0);
        quanLy.getDanhSach().clear();
        danhSachHienTai.clear();
        txtKhachHang.setText(""); txtSDT.setText(""); txtDonGia.setText("");txtKhoiLuong.setText("");txtMaDonHang.setText("");
        txtNgayNhan.setText("");txtPhuThu.setText("");
        txtKhachHang.requestFocus();
        capNhatThongKe();
        JOptionPane.showMessageDialog(this, "Dữ liệu đã được làm mới thành công!",  "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        lblLog.setText("⚡ SYSTEM LOG:   [OK] Làm mới giao diện đơn thành công ! " );
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnXuatFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatFileActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser fc = new JFileChooser();
            fc.showSaveDialog(null);
            String tenFile = fc.getSelectedFile().getPath();
            quanLy.xuatFile(tenFile);
            JOptionPane.showMessageDialog(this, "Xuất File thành công !",  "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            lblLog.setText("⚡ SYSTEM LOG:   [OK] Xuất File thành công vào thư mục: " + tenFile);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnXuatFileActionPerformed

    private void tblHienThiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHienThiMouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1 && evt.getClickCount() == 1) {
            int row = tblHienThi.getSelectedRow();
            if (row != -1) {
                thayDoiGiaoDien(3); 
                
                String gioiTinhStr = tblHienThi.getValueAt(row, 3).toString();
                if(gioiTinhStr.equalsIgnoreCase("Nam")) rbtNam.setSelected(true);
                else rbtNu.setSelected(true);
                
                txtMaDonHang.setText(tblHienThi.getValueAt(row, 0).toString());
                txtNgayNhan.setText(tblHienThi.getValueAt(row, 1).toString());
                txtKhachHang.setText(tblHienThi.getValueAt(row, 2).toString());
                txtSDT.setText(tblHienThi.getValueAt(row, 4).toString());
                txtDiaChi.setText(tblHienThi.getValueAt(row, 5).toString());
                cbxDichVu.setSelectedItem(tblHienThi.getValueAt(row, 6).toString());
                
                txtDonGia.setText(tblHienThi.getValueAt(row, 7).toString().replaceAll("[^0-9]", ""));
                txtKhoiLuong.setText(tblHienThi.getValueAt(row, 8).toString().replaceAll("[^0-9.]", "")); 
                txtPhuThu.setText(tblHienThi.getValueAt(row, 9).toString().replaceAll("[^0-9]", ""));

                lblLog.setText("⚡ SYSTEM LOG: [INFO] Đã load dữ liệu đơn " + txtMaDonHang.getText() + " lên form để sửa.");
            }
        }
    }//GEN-LAST:event_tblHienThiMouseClicked

    private void btnTaoDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoDonActionPerformed
        // TODO add your handling code here:
        thayDoiGiaoDien(1);
    }//GEN-LAST:event_btnTaoDonActionPerformed

    private void btnXoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaDonActionPerformed
        // TODO add your handling code here:
            String maDon = JOptionPane.showInputDialog(this, "Nhập vào mã hóa đơn cần xóa: ","Xóa hóa đơn theo mã",JOptionPane.ERROR_MESSAGE);
            if (maDon == null || maDon.trim().isEmpty()) {
                return;
            }
            if(quanLy.xoaDonHang(maDon)) {
                JOptionPane.showMessageDialog(this, "Đã xóa thành công hóa đơn có mã là: "+maDon,"Xóa hóa đơn theo mã",JOptionPane.ERROR_MESSAGE);
                danhSachHienTai = new ArrayList<>(quanLy.getDanhSach());
                loadData(danhSachHienTai);
                lblLog.setText("⚡ SYSTEM LOG:   [OK] Đã xóa thành công đơn " + maDon);
                return;
            }
            else {
                JOptionPane.showMessageDialog(this, "Lỗi! Không tồn tại mã hóa đơn cần xóa","Lỗi không tìm thấy mã hóa đơn",JOptionPane.ERROR_MESSAGE);
                lblLog.setText("⚡ SYSTEM LOG:   [ERROR] Xóa thất bại vì không có mã hóa đơn là '" + maDon+"'");
            }
    }//GEN-LAST:event_btnXoaDonActionPerformed

    private void btnSuaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaDonActionPerformed
        // TODO add your handling code here:
        thayDoiGiaoDien(3);
    }//GEN-LAST:event_btnSuaDonActionPerformed

    private void btnTraCuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraCuuActionPerformed
        // TODO add your handling code here:
        thayDoiGiaoDien(2);
    }//GEN-LAST:event_btnTraCuuActionPerformed

    private void cbxSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSapXepActionPerformed
        // TODO add your handling code here:
        String sapXep = cbxSapXep.getSelectedItem().toString();
        if(sapXep.equalsIgnoreCase("Ngày Nhận")) {
            btnMin.setVisible(false); btnMax.setVisible(false);
        }else {
            btnMin.setVisible(true); btnMax.setVisible(true);
        }
    }//GEN-LAST:event_cbxSapXepActionPerformed

    private void btnTangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTangActionPerformed
        // TODO add your handling code here:
        if (danhSachHienTai == null || danhSachHienTai.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không có Dữ Liệu. Vui lòng 'Đọc File' hoặc 'Tạo đơn'", "Thông báo", JOptionPane.WARNING_MESSAGE);
            lblLog.setText("⚡ SYSTEM LOG: [ERROR] Không có Dữ Liệu ");
            return; 
        }
        
        String tieuChi = cbxSapXep.getSelectedItem().toString();
        quanLy.sapXep(danhSachHienTai, true, tieuChi); 
        loadData(danhSachHienTai); 
        lblLog.setText("⚡ SYSTEM LOG: [INFO] Sắp xếp TĂNG DẦN theo " + tieuChi);
    }//GEN-LAST:event_btnTangActionPerformed

    private void btnGiamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiamActionPerformed
        // TODO add your handling code here:
        if (danhSachHienTai == null || danhSachHienTai.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không có Dữ Liệu. Vui lòng 'Đọc File' hoặc 'Tạo đơn'", "Thông báo", JOptionPane.WARNING_MESSAGE);
            lblLog.setText("⚡ SYSTEM LOG: [ERROR] Không có Dữ Liệu ");
            return; 
        }
        String tieuChi = cbxSapXep.getSelectedItem().toString();
        quanLy.sapXep(danhSachHienTai, false, tieuChi); 
        loadData(danhSachHienTai); 
        lblLog.setText("⚡ SYSTEM LOG: [INFO] Sắp xếp GIẢM DẦN theo " + tieuChi);
    }//GEN-LAST:event_btnGiamActionPerformed

    private void btnMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaxActionPerformed
        // TODO add your handling code here:
        if (danhSachHienTai == null || danhSachHienTai.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không có Dữ Liệu. Vui lòng 'Đọc File' hoặc 'Thêm đơn'", "Thông báo", JOptionPane.WARNING_MESSAGE);
            lblLog.setText("⚡ SYSTEM LOG: [ERROR] Không có Dữ Liệu ");
            return; 
        }
        danhSachHienTai = quanLy.timMaxMin(danhSachHienTai, true); 
        loadData(danhSachHienTai);
        lblLog.setText("⚡ SYSTEM LOG: [INFO] Lọc thành công các đơn có Tổng Tiền CAO NHẤT");
    }//GEN-LAST:event_btnMaxActionPerformed

    private void btnMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinActionPerformed
        // TODO add your handling code here:
        if (danhSachHienTai == null || danhSachHienTai.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không có Dữ Liệu. Vui lòng 'Đọc File' hoặc 'Thêm đơn'", "Thông báo", JOptionPane.WARNING_MESSAGE);
            lblLog.setText("⚡ SYSTEM LOG: [ERROR] Không có Dữ Liệu ");
            return; 
        }
        danhSachHienTai = quanLy.timMaxMin(danhSachHienTai, false); 
        loadData(danhSachHienTai);
        lblLog.setText("⚡ SYSTEM LOG: [INFO] Lọc thành công các đơn có Tổng Tiền THẤP NHẤT");
    }//GEN-LAST:event_btnMinActionPerformed
    
    public void loadData(ArrayList<IDichVu> danhSachHienThi){
        this.danhSachHienTai = danhSachHienThi;
        dtm.setRowCount(0);
        for(IDichVu i:danhSachHienThi){
            String s="";
            if(i instanceof GiatQuanAo ) s= ((GiatQuanAo) i).getSoKG() +" (kg)";
            if(i instanceof GiatRaGiuong_RemCua) s=((GiatRaGiuong_RemCua) i).getSoKG()+" (kg)";
            if(i instanceof GiatChanMem) s=((GiatChanMem) i).getSoKG()+" (kg)";
            if(i instanceof GiatGiay) s= (int)((GiatGiay) i).getSoLuong()+" đôi";
            if(i instanceof GiatVeston) s=(int)((GiatVeston) i).getSoLuong()+" bộ";
            if(i instanceof GiatThuNhoiBong) s=(int)((GiatThuNhoiBong) i).getSoLuong()+" con";
            
            DecimalFormat df = new DecimalFormat("#,###");
            
            dtm.addRow(new Object[]{
                    ((GiatUi)i).getMaHoaDon(), ((GiatUi)i).getNgayNhan(),((GiatUi)i).getTenKhachHang(), (((GiatUi)i).isGioiTinh()?"Nam":"Nữ"), 
                    ((GiatUi)i).getSoDienThoai(), ((GiatUi)i).getDiaChi(),
                    ((GiatUi)i).getLoaiDichVu(), df.format(((GiatUi)i).getDonGia()) , s, df.format(((GiatUi)i).getPhuThu()), 
                    df.format(((GiatUi)i).tinhThanhTien()), ((GiatUi)i).getTrangThai()
                });
        }
        capNhatThongKe();
    }
    
    public void capNhatThongKe() {
        DecimalFormat df = new DecimalFormat("#,### VNĐ");
        lblTongDonHomNay.setText("Tổng đơn: " + quanLy.getDanhSach().size());
        lblDoanhThuHomNay.setText("Doanh thu: " + df.format(quanLy.tinhTongDoanhThu()));
        lblDangXuLy.setText("Đang xử lý: " + quanLy.demDonDangXuLy());
        lblKhachHang_thongKe.setText("Khách hàng: " + quanLy.demKhachHang());
    }
    
    public static void main(String args[]) {
            try {
                javax.swing.UIManager.setLookAndFeel(new com.formdev.flatlaf.FlatDarkLaf());
            } catch (Exception ex) {
                System.err.println("Lỗi: Không thể khởi động FlatLaf!");
            }

            java.awt.EventQueue.invokeLater(() -> new GUI().setVisible(true));
    }
    
    private void setupSidebarButton(javax.swing.JButton btn, String iconName, String text) {
        btn.setText(text);
        btn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        btn.setContentAreaFilled(true);
        btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn.putClientProperty("JButton.arc", 999);
        btn.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));

        java.awt.Color NORMAL = new java.awt.Color(51, 51, 51);
        java.awt.Color HOVER = new java.awt.Color(75, 75, 75);

        btn.setBackground(NORMAL);
        btn.setForeground(new java.awt.Color(200, 200, 200));
        btn.setIconTextGap(15);

        try {
            java.net.URL url = getClass().getResource("/icons/" + iconName);
            if (url != null) {
                btn.setIcon(new javax.swing.ImageIcon(url));
            }
        } catch (Exception e) {
            System.err.println("Lỗi load icon: " + iconName);
        }

        btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn.setBackground(HOVER);
                btn.setForeground(java.awt.Color.WHITE);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn.setBackground(NORMAL);
                btn.setForeground(new java.awt.Color(200, 200, 200));
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChucNang;
    private javax.swing.JButton btnDocFile;
    private javax.swing.JButton btnGiam;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnMax;
    private javax.swing.JButton btnMin;
    private javax.swing.JButton btnSuaDon;
    private javax.swing.JButton btnTang;
    private javax.swing.JButton btnTaoDon;
    private javax.swing.JButton btnTraCuu;
    private javax.swing.JButton btnXoaDon;
    private javax.swing.JButton btnXuatFile;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxDichVu;
    private javax.swing.JComboBox<String> cbxSapXep;
    private javax.swing.JCheckBox chkKiemTra;
    private javax.swing.JCheckBox chkPhanLoai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblChiSo;
    private javax.swing.JLabel lblChinh;
    private javax.swing.JLabel lblDangXuLy;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblDoanhThuHomNay;
    private javax.swing.JLabel lblDonGia;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblHeThong;
    private javax.swing.JLabel lblKhachHang_thongKe;
    private javax.swing.JLabel lblLoaiDichVu;
    private javax.swing.JLabel lblLog;
    private javax.swing.JLabel lblMaDonHang;
    private javax.swing.JLabel lblNgayNhan;
    private javax.swing.JLabel lblPhuThu;
    private javax.swing.JLabel lblSoDienThoai;
    private javax.swing.JLabel lblThongTinDonHang;
    private javax.swing.JLabel lblTongDonHomNay;
    private javax.swing.JMenuItem menuDangXuLy;
    private javax.swing.JMenuItem menuHoanThanh;
    private javax.swing.JPanel pnlActionBar;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlLog;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JPanel pnlSidepar;
    private javax.swing.JPanel pnlThongKe;
    private javax.swing.JRadioButton rbtNam;
    private javax.swing.JRadioButton rbtNu;
    private javax.swing.JTable tblHienThi;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtKhachHang;
    private javax.swing.JTextField txtKhoiLuong;
    private javax.swing.JTextField txtMaDonHang;
    private javax.swing.JTextField txtNgayNhan;
    private javax.swing.JTextField txtPhuThu;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables
}
