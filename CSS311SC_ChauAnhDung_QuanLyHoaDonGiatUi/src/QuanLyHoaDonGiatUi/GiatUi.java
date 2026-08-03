package QuanLyHoaDonGiatUi;

public abstract class GiatUi implements IDichVu{
    private String maHoaDon, ngayNhan, tenKhachHang, soDienThoai, diaChi, loaiDichVu, trangThai; 
    private double phuThu, donGia;
    private boolean gioiTinh;


    @Override
    public String toString() {
        return maHoaDon + ", " + tenKhachHang +", "+(gioiTinh?"Nam":"Nu")+ ", " + soDienThoai + ", "+diaChi+ ", " + loaiDichVu + ", " + trangThai;
    }

    public GiatUi() {
    }

    public GiatUi(String maHoaDon, String ngayNhan, String tenKhachHang, boolean gioiTinh, String soDienThoai, String diaChi, String loaiDichVu, 
            double phuThu, double donGia, String trangThai) {
        this.tenKhachHang = tenKhachHang;
        this.maHoaDon = maHoaDon;
        this.ngayNhan = ngayNhan;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.loaiDichVu = loaiDichVu;
        this.phuThu = phuThu;
        this.donGia = donGia;
        this.trangThai = trangThai;
        this.gioiTinh = gioiTinh;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getNgayNhan() {
        return ngayNhan;
    }

    public void setNgayNhan(String ngayNhan) {
        this.ngayNhan = ngayNhan;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(String loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
    }

    public double getPhuThu() {
        return phuThu;
    }

    public void setPhuThu(double phuThu) {
        this.phuThu = phuThu;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }


    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
    
}
