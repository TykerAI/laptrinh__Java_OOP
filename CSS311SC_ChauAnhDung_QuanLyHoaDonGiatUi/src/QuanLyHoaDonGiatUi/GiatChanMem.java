package QuanLyHoaDonGiatUi;

public class GiatChanMem extends GiatUi{
    private double soKG;

    @Override
    public double tinhThanhTien() {
        return soKG*getDonGia()+getPhuThu();
    }

    @Override
    public String toString() {
        return "GiatChanMem{" +super.toString()+ ", soKG=" + soKG + ", tinh thanh tien= "+tinhThanhTien()+ '}';
    }

    public GiatChanMem() {
    }

    public GiatChanMem(String maHoaDon, String ngayNhan, String tenKhachHang, boolean gioiTinh, 
            String soDienThoai, String diaChi, String loaiDichVu, double phuThu, double donGia, String trangThai, double soKG) {
        super(maHoaDon, ngayNhan, tenKhachHang, gioiTinh, soDienThoai, diaChi, loaiDichVu, phuThu, donGia, trangThai);
        this.soKG = soKG;
    }

    public double getSoKG() {
        return soKG;
    }

    public void setSoKG(double soKG) {
        this.soKG = soKG;
    }
    
    
}
