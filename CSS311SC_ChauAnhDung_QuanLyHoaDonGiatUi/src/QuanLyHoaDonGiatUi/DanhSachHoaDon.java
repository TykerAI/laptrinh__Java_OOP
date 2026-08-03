package QuanLyHoaDonGiatUi;

import java.io.File;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;

public class DanhSachHoaDon {
    private ArrayList<IDichVu> a = new ArrayList<>();
    
    public void docFile(String tenFile){
        try {
            File f = new File(tenFile);
            if(f.exists()){
                System.out.println("ok File");
                Scanner read = new Scanner(f);
                while(read.hasNext()){
                    String line = read.nextLine();
                    String s[] = line.split(",");
                    for(int i=0;i<s.length;i++) s[i]=s[i].trim();
                    boolean gioiTinh = Boolean.parseBoolean(s[3]);
                    double phuThu = Double.parseDouble(s[7]);
                    double donGia = Double.parseDouble(s[8]);
                    double chiSo = Double.parseDouble(s[10]);
                    if(s[6].equalsIgnoreCase("Giặt Áo/Quần")) a.add(new GiatQuanAo(s[0], s[1], s[2], gioiTinh, s[4], s[5],s[6],phuThu,donGia,s[9],chiSo));
                    else if(s[6].equalsIgnoreCase("Giặt Giày")) a.add(new GiatGiay(s[0], s[1], s[2], gioiTinh, s[4], s[5],s[6],phuThu,donGia,s[9],(int)chiSo));
                    else if(s[6].equalsIgnoreCase("Giặt Chăn/Mền")) a.add(new GiatChanMem(s[0], s[1], s[2], gioiTinh, s[4], s[5],s[6],phuThu,donGia,s[9],chiSo));
                    else if(s[6].equalsIgnoreCase("Giặt Thú Nhồi Bông")) a.add(new GiatThuNhoiBong(s[0], s[1], s[2], gioiTinh, s[4], s[5],s[6],phuThu,donGia,s[9],(int)chiSo));
                    else if(s[6].equalsIgnoreCase("Giặt Bộ Veston")) a.add(new GiatVeston(s[0], s[1], s[2], gioiTinh, s[4], s[5],s[6],phuThu,donGia,s[9],(int)chiSo));
                    else a.add(new GiatRaGiuong_RemCua(s[0], s[1], s[2], gioiTinh, s[4], s[5],s[6],phuThu,donGia,s[9],chiSo));
                }
            }else System.out.println("ko co File");
            
        } catch (Exception e) {
        }
    }
    
    public void xuatFile(String tenFile){
        try {
            File f = new File(tenFile);
            PrintStream out = new PrintStream(f);
            for(IDichVu i :a){
                out.println(i);
            }
            out.close();
            System.out.println("Xuat File thanh cong");
        } catch (Exception e) {
        }
    }
    
    public boolean themDonHang(IDichVu b){
        String maDonHang = ((GiatUi)b).getMaHoaDon();
        for(IDichVu i:a){
            if(((GiatUi)i).getMaHoaDon().equalsIgnoreCase(maDonHang)) return false;
        }
        a.add(b);
        return true;
    }
    
    public boolean xoaDonHang(String maDonHang){
        for (int i = 0; i < a.size(); i++) {
            GiatUi don = (GiatUi) a.get(i);
            if (don.getMaHoaDon().equalsIgnoreCase(maDonHang)) {
                a.remove(i); 
                return true;
            }
        }
        return false; 
    }
    
    
    public double tinhTongDoanhThu() {
        double tong = 0;
        for (IDichVu i : a) {
            GiatUi don = (GiatUi) i;
            if (don.getTrangThai().equalsIgnoreCase("Hoàn Thành")) {
                tong += don.tinhThanhTien();
            }
        }
        return tong;
    }
    
    public int demDonDangXuLy() {
        int count = 0;
        for (IDichVu i : a) {
            GiatUi don = (GiatUi) i;
            if (don.getTrangThai().equalsIgnoreCase("Đang xử lý")) {
                count++;
            }
        }
        return count;
    }
    
    public int demKhachHang() {
        HashSet<String> tapKhachHang = new HashSet<>();
        for (IDichVu i : a) {
            GiatUi don = (GiatUi) i;
            tapKhachHang.add(don.getSoDienThoai());
        }
        return tapKhachHang.size(); 
    }

    public ArrayList<IDichVu> getDanhSach(){
        return a;
    }
    
    public ArrayList<IDichVu> timDonHang(String ma, String khach, String sdt, String diaChi, String dichVu, String khoiLuong, 
            String donGia, String phuThu, String ngay, Boolean gioiTinh) {
        ArrayList<IDichVu> ketQua = new ArrayList<>();
        for (IDichVu i : a) {
            GiatUi don = (GiatUi) i;
            boolean match = true; 
            if (!ma.isEmpty() && !don.getMaHoaDon().toLowerCase().contains(ma.toLowerCase())) match = false;
            if (!khach.isEmpty() && !don.getTenKhachHang().toLowerCase().contains(khach.toLowerCase())) match = false;
            if (!sdt.isEmpty() && !don.getSoDienThoai().contains(sdt)) match = false;
            if (!diaChi.isEmpty() && !don.getDiaChi().toLowerCase().contains(diaChi.toLowerCase())) match = false;
            if (!ngay.isEmpty() && !don.getNgayNhan().contains(ngay)) match = false;
            if (gioiTinh != null && don.isGioiTinh() != gioiTinh) match = false;
            if (!dichVu.isEmpty() && !dichVu.equals("Tất cả") && !don.getLoaiDichVu().equalsIgnoreCase(dichVu)) match = false;
            if (!donGia.isEmpty() && !String.valueOf(don.getDonGia()).contains(donGia)) match = false;
            if (!phuThu.isEmpty() && !String.valueOf(don.getPhuThu()).contains(phuThu)) match = false;
            if (match) ketQua.add(i);
        }
        return ketQua;
    }
    
    public boolean suaDonHang(IDichVu donMoi) {
        String maDonMoi = ((GiatUi) donMoi).getMaHoaDon();
        for (int i = 0; i < a.size(); i++) {
            GiatUi b = (GiatUi) a.get(i);
            if (b.getMaHoaDon().equalsIgnoreCase(maDonMoi)) {
                a.set(i, donMoi); 
                return true;
            }
        }
        return false;
    }

    public void sapXep(ArrayList<IDichVu> list, final boolean tangDan, final String tieuChi) {
            Collections.sort(list, new Comparator<IDichVu>() {
                @Override
                public int compare(IDichVu d1, IDichVu d2) {
                    if (tieuChi.equals("Tổng Tiền")) {
                        double tien1 = d1.tinhThanhTien();
                        double tien2 = d2.tinhThanhTien();
                        if (tangDan) return Double.compare(tien1, tien2);
                        else return Double.compare(tien2, tien1);
                    } else { // Ngày Nhận
                        try {
                            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                            Date date1 = sdf.parse(((GiatUi) d1).getNgayNhan());
                            Date date2 = sdf.parse(((GiatUi) d2).getNgayNhan());
                            if (tangDan) return date1.compareTo(date2);
                            else return date2.compareTo(date1);
                        } catch (Exception e) {
                            return 0;
                        }
                    }
                }
            });
        }

    public ArrayList<IDichVu> timMaxMin(ArrayList<IDichVu> danhSach, boolean isMax) {
        ArrayList<IDichVu> b = new ArrayList<>();
        if (danhSach.isEmpty()) return b;
        double target = danhSach.get(0).tinhThanhTien();
        for (IDichVu i : danhSach) {
            if (isMax) { if (i.tinhThanhTien() > target) target = i.tinhThanhTien(); }
            else { if (i.tinhThanhTien() < target) target = i.tinhThanhTien(); }
        }
        for (IDichVu i : danhSach) {
            if (i.tinhThanhTien() == target) b.add(i);
        }
        return b;
    }
}
