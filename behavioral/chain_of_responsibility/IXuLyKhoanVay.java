package behavioral.chain_of_responsibility;

public interface IXuLyKhoanVay {
    IXuLyKhoanVay capCapHon(IXuLyKhoanVay iXuLyKhoanVay); // setSuccesstor
    String xuLyVay(int tienVay);
}
