package QuanLyHoaDonGiatUi;

public class GiatVeston extends GiatUi{
    private int soLuong;

    @Override
    public double tinhThanhTien() {
        return soLuong*getDonGia()+getPhuThu();
    }


    @Override
    public String toString() {
        return "GiatVeston{" +super.toString()+ ", soLuong=" + soLuong +", tinh thanh tien= "+tinhThanhTien()+ '}';
    }

    public GiatVeston() {
    }

    public GiatVeston(String maHoaDon, String ngayNhan, String tenKhachHang, boolean gioiTinh, String soDienThoai, 
            String diaChi, String loaiDichVu, double phuThu, double donGia, String trangThai, int soLuong) {
        super(maHoaDon, ngayNhan, tenKhachHang, gioiTinh, soDienThoai, diaChi, loaiDichVu, phuThu, donGia, trangThai);
        this.soLuong = soLuong;
    }


    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
}
