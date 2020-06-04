/*task 2 */
select * from nhan_vien
where (HoTen like 'H%' or HoTen like 'T%' or HoTen like 'K%') and length(HoTen) < 15;
/*task 3*/
select * from khach_hang
where (DiaChi = 'Da Nang' or DiaChi = 'Quang Tri') and timestampdiff(YEAR,NgaySinh,curdate()) between 18 and 50;

/*task 4*/
select khach_hang.HoTen, count(hop_dong.IDHopDong) as SoLanDatPhong from khach_hang inner join hop_dong on khach_hang.IDKhachHang = hop_dong.IDKhachHang
inner join loai_khach on khach_hang.IDLoaiKhach = loai_khach.IDLoaiKhach where loai_khach.TenLoaiKhach = 'Diamond'
group by khach_hang.IDKhachHang order by SoLanDatPhong;

/*task 5*/
select khach_hang.IDKhachHang,khach_hang.HoTen,loai_khach.TenLoaiKhach,hop_dong.IDHopDong,dich_vu.TenDichVu,hop_dong.NgayLamHopDong,hop_dong.NgayKetThuc,
sum(dich_vu.ChiPhiThue + dich_vu_di_kem.DonVi * dich_vu_di_kem.Gia) as TongTien from khach_hang 
left join loai_khach on khach_hang.IDLoaiKhach = loai_khach.IDLoaiKhach
left join hop_dong on khach_hang.IDKhachHang = hop_dong.IDKhachHang
left join dich_vu on hop_dong.IDDichVu = dich_vu.IDDichVu
left join hop_dong_chi_tiet on hop_dong.IDHopDong = hop_dong_chi_tiet.IDHopDong
left join dich_vu_di_kem on hop_dong_chi_tiet.IDDichVuDiKem = dich_vu_di_kem.IDDichVuDiKem
group by hop_dong.IDHopDong;

/*task 6*/
select dich_vu.IDDichVu,dich_vu.TenDichVu,dich_vu.DienTich,dich_vu.ChiPhiThue, loai_dich_vu.TenLoaiDichVu, hop_dong.NgayLamHopDong from dich_vu
join loai_dich_vu on dich_vu.IDLoaiDichVu = loai_dich_vu.IDLoaiDichVu
join hop_dong on dich_vu.IDDichVu = hop_dong.IDDichVu
join khach_hang on hop_dong.IDKhachHang = khach_hang.IDKhachHang
where not exists (select hop_dong.IDHopDong from hop_dong where (hop_dong.NgayLamHopDong between '2019-1-1' and '2019-3-31') and hop_dong.IDDichVu = dich_vu.IDDichVu)
group by khach_hang.IDKhachHang;

/*task 7*/
select dich_vu.IDDichVu, dich_vu.TenDichVu,dich_vu.DienTich,dich_vu.SoNguoiToiDa,dich_vu.ChiPhiThue,loai_dich_vu.TenLoaiDichVu,hop_dong.NgayLamHopDong
from dich_vu
join loai_dich_vu on dich_vu.IDDichVu = loai_dich_vu.IDLoaiDichVu
join hop_dong on dich_vu.IDDichVu = hop_dong.IDDichVu
where exists (select hop_dong.IDHopDong from hop_dong where (year(hop_dong.NgayLamHopDong) = 2018 and hop_dong.IDDichVu = dich_vu.IDDichVu))
and not exists (select hop_dong.IDHopDong from hop_dong where (year(hop_dong.NgayLamHopDong) = 2019 and hop_dong.IDDichVu = dich_vu.IDDichVu))
group by dich_vu.IDDichVu;

/*task 8*/
select IDKhachHang,HoTen from khach_hang
group by khach_hang.HoTen;

select distinct HoTen from khach_hang;

select HoTen from khach_hang
union
select HoTen from khach_hang;

/*task 9*/
select hop_dong.IDHopDong,month(hop_dong.NgayLamHopDong),count(*) as 'Num of customer', sum(hop_dong.TongTien) from hop_dong
where year(hop_dong.NgayLamHopDong) =2019
group by month(hop_dong.NgayLamHopDong)
order by month(hop_dong.NgayLamHopDong) ASC;

/*task 10*/
select hop_dong.IDHopDong, hop_dong.NgayLamHopDong, hop_dong.NgayKetThuc, hop_dong.TienDatCoc, count(hop_dong_chi_tiet.IDHopDong) as SoLuongDiKem
from hop_dong
join hop_dong_chi_tiet on hop_dong.IDHopDong = hop_dong_chi_tiet.IDHopDong
join dich_vu_di_kem on hop_dong_chi_tiet.IDDichVuDiKem = dich_vu_di_kem.IDDichVuDiKem
group by hop_dong_chi_tiet.IDHopDong;

/*task 11*/
select dich_vu_di_kem.IDDichVuDiKem,dich_vu_di_kem.TenDichVuDiKem,loai_khach.TenLoaiKhach,khach_hang.HoTen,khach_hang.DiaChi from dich_vu_di_kem
inner join hop_dong_chi_tiet on dich_vu_di_kem.IDDichVuDiKem = hop_dong_chi_tiet.IDHopDongChiTiet
inner join hop_dong on hop_dong_chi_tiet.IDHopDong = hop_dong.IDHopDong
inner join khach_hang on hop_dong.IDKhachHang = khach_hang.IDKhachHang
inner join loai_khach on khach_hang.IDLoaiKhach = loai_khach.IDLoaiKhach
where loai_khach.TenLoaiKhach = 'Diamond' and (khach_hang.DiaChi = 'Quang Ngai' or khach_hang.DiaChi = 'Vinh');

/*Task 12*/
select hop_dong.IDHopDong,nhan_vien.HoTen,khach_hang.HoTen,khach_hang.SDT,dich_vu.TenDichVu,count(hop_dong_chi_tiet.IDHopDong) as SoLuongDichVuDiKem,hop_dong.TienDatCoc
from hop_dong
inner join nhan_vien on hop_dong.IDNhanVien = nhan_vien.IDNhanVien
inner join khach_hang on hop_dong.IDKhachHang = khach_hang.IDKhachHang
inner join dich_vu on hop_dong.IDDichVu = dich_vu.IDDichVu
inner join hop_dong_chi_tiet on hop_dong.IDHopDong = hop_dong_chi_tiet.IDHopDong
where exists (select dich_vu.IDDichVu where hop_dong.IDDichVu = dich_vu.IDDichVu and (( month(hop_dong.NgayLamHopDong) between 10 and 12) and (year(hop_dong.NgayLamHopDong) = 2019)))
and not exists (select dich_vu.IDDichVu where hop_dong.IDDichVu = dich_vu.IDDichVu and ((month(hop_dong.NgayLamHopDong) between 1 and 6 ) and (year(hop_dong.NgayLamHopDong) = 2019)))
group by hop_dong_chi_tiet.IDHopDong;

/*Task 13*/
select dich_vu_di_kem.IDDichVuDiKem,dich_vu_di_kem.TenDichVuDiKem,count(hop_dong_chi_tiet.IDDichVuDiKem) from dich_vu_di_kem
inner join hop_dong_chi_tiet on dich_vu_di_kem.IDDichVuDiKem = hop_dong_chi_tiet.IDDichVuDiKem
inner join hop_dong on hop_dong_chi_tiet.IDHopDong = hop_dong.IDHopDong
inner join khach_hang on hop_dong.IDKhachHang = khach_hang.IDKhachHang
group by dich_vu_di_kem.IDDichVuDiKem
order by count(hop_dong_chi_tiet.IDDichVuDiKem) desc
limit 3;

/*task 14*/
select hop_dong.IDHopDong,loai_dich_vu.TenLoaiDichVu,dich_vu_di_kem.TenDichVuDiKem,count(hop_dong_chi_tiet.IDDichVuDiKem) as SoLanSuDung
from dich_vu_di_kem
inner join hop_dong_chi_tiet on dich_vu_di_kem.IDDichVuDiKem = hop_dong_chi_tiet.IDDichVuDiKem
inner join hop_dong on hop_dong_chi_tiet.IDHopDong = hop_dong.IDHopDong
inner join dich_vu on hop_dong.IDDichVu=dich_vu.IDDichVu
inner join loai_dich_vu on dich_vu.IDLoaiDichVu = loai_dich_vu.IDLoaiDichVu
group by dich_vu_di_kem.IDDichVuDiKem
having count(hop_dong_chi_tiet.IDDichVuDiKem) = 1
order by count(hop_dong_chi_tiet.IDDichVuDiKem) asc;

/*task 15*/
select nhan_vien.IDNhanVien,nhan_vien.HoTen,trinh_do.IDTrinhDo,bo_phan.BoPhan,nhan_vien.SDT,nhan_vien.DiaChi,count(hop_dong.IDNhanVien) as SoLanKyHopDong
from nhan_vien
inner join trinh_do on nhan_vien.IDTrinhDo = trinh_do.IDTrinhDo
inner join bo_phan on nhan_vien.IDBoPhan = bo_phan.IDBoPhan
inner join hop_dong on nhan_vien.IDNhanVien = hop_dong.IDNhanVien
where year(hop_dong.NgayLamHopDong) between 2018 and 2019
group by nhan_vien.HoTen
having count(hop_dong.IDNhanVien) <= 3;


/*task 16*/
set sql_safe_updates = 0;
set foreign_key_checks = 0;
select*from nhan_vien;
select*from hop_dong;
delete from nhan_vien
where nhan_vien.IDNhanVien not in (select hop_dong.IDNhanVien from hop_dong where year(hop_dong.NgayLamHopDong) between 2017 and 2019 and hop_dong.IDNhanVien = nhan_vien.IDNhanVien);

/*task 17*/
update khach_hang
set IDLoaiKhach = 
