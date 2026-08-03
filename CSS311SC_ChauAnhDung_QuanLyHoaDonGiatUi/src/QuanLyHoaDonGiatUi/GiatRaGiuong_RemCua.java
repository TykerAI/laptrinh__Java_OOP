package QuanLyHoaDonGiatUi;

public class GiatRaGiuong_RemCua extends GiatUi{
    private double soKG;
    
    @Override
    public double tinhThanhTien() {
        return soKG*getDonGia()+getPhuThu();
    }


    @Override
    public String toString() {
        return "GiatRaGiuong_RemCua{" +super.toString()+ ", soKG=" + soKG +", tinh thanh tien= "+ tinhThanhTien()+ '}';
    }

    public GiatRaGiuong_RemCua() {
    }

    public GiatRaGiuong_RemCua(String maHoaDon, String ngayNhan, String tenKhachHang, boolean gioiTinh, String soDienThoai, 
            String diaChi, String loaiDichVu, double phuThu, double donGia, String trangThai, double soKG) {
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
