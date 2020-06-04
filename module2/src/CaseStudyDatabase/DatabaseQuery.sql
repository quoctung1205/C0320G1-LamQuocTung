DROP DATABASE IF EXISTS case_study;
CREATE DATABASE case_study;
USE case_study;

create table vi_tri(
IDViTri int auto_increment primary key,
TenVitri varchar(45) 
);
INSERT INTO `case_study`.`vi_tri` (`IDViTri`, `TenViTri`) VALUES (1, 'Receptionist');
INSERT INTO `case_study`.`vi_tri` (`IDViTri`, `TenViTri`) VALUES (2, 'Serve');
INSERT INTO `case_study`.`vi_tri` (`IDViTri`, `TenViTri`) VALUES (3, 'Expert');
INSERT INTO `case_study`.`vi_tri` (`IDViTri`, `TenViTri`) VALUES (4, 'Supervisor');
INSERT INTO `case_study`.`vi_tri` (`IDViTri`, `TenViTri`) VALUES (5, 'Manager');
INSERT INTO `case_study`.`vi_tri` (`IDViTri`, `TenViTri`) VALUES (6, 'Director');

create table trinh_do(
IDTrinhDo int auto_increment primary key,
TrinhDo varchar(45)
);
INSERT INTO `case_study`.`trinh_do` (`IDTrinhDo`, `TrinhDo`) VALUES (1, 'Intermediate');
INSERT INTO `case_study`.`trinh_do` (`IDTrinhDo`, `TrinhDo`) VALUES (2, 'College');
INSERT INTO `case_study`.`trinh_do` (`IDTrinhDo`, `TrinhDo`) VALUES (3, 'University');
INSERT INTO `case_study`.`trinh_do` (`IDTrinhDo`, `TrinhDo`) VALUES (4, 'After University');

create table bo_phan(
IDBoPhan int auto_increment primary key,
BoPhan varchar(45) not null
);
INSERT INTO `case_study`.`bo_phan` (`IDBoPhan`, `BoPhan`) VALUES (1, 'Sale-Marketing');
INSERT INTO `case_study`.`bo_phan` (`IDBoPhan`, `BoPhan`) VALUES (2, 'Administrative');
INSERT INTO `case_study`.`bo_phan` (`IDBoPhan`, `BoPhan`) VALUES (3, 'Serve');
INSERT INTO `case_study`.`bo_phan` (`IDBoPhan`, `BoPhan`) VALUES (4, 'Manager');


create table nhan_vien(
IDNhanVien int auto_increment primary key,
HoTen varchar(45) not null,
IDViTri int,
IDTrinhDo int,
IDBoPhan int,
NgaySinh date,
SoCMND varchar(45) not null,
Luong varchar(45) not null,
SDT varchar(45) not null,
Email varchar(45) not null,
DiaChi varchar(45) not null
);
insert into `case_study`.`nhan_vien` (`IDNhanVien`, `HoTen`, `IDViTri`, `IDTrinhDo`, `IDBoPhan`, `NgaySinh`, `SoCMND`, `Luong`,`SDT`,`Email`,`DiaChi`) values (1, 'Darelle Matches',1,3,4, '1967-03-08', '840452911', '15000000', '322-303-0070', 'dmatches0@blogger.com', '3 Ruskin Crossing');
insert into `case_study`.`nhan_vien` (`IDNhanVien`, `HoTen`, `IDViTri`, `IDTrinhDo`, `IDBoPhan`, `NgaySinh`, `SoCMND`, `Luong`,`SDT`,`Email`,`DiaChi`) values (2, 'Hobina Jendrich',6,3,4, '1996-02-14', '939415384', '150000000', '258-552-4655', 'bjendrich1@tuttocitta.it', '1445 Basil Alley');
insert into `case_study`.`nhan_vien` (`IDNhanVien`, `HoTen`, `IDViTri`, `IDTrinhDo`, `IDBoPhan`, `NgaySinh`, `SoCMND`, `Luong`,`SDT`,`Email`,`DiaChi`) values (3, 'Hoyal Feighney',5,2,2, '1961-10-15', '538792843', '10000000', '607-350-5970', 'rfeighney2@tripod.com', '52 Express Park');
insert into `case_study`.`nhan_vien` (`IDNhanVien`, `HoTen`, `IDViTri`, `IDTrinhDo`, `IDBoPhan`, `NgaySinh`, `SoCMND`, `Luong`,`SDT`,`Email`,`DiaChi`) values (4, 'Shandy Dowd',2,2,2, '1987-10-30', '278442655', '10000000', '500-107-0725', 'sdowd3@netvibes.com', '76 Laurel Avenue');
insert into `case_study`.`nhan_vien` (`IDNhanVien`, `HoTen`, `IDViTri`, `IDTrinhDo`, `IDBoPhan`, `NgaySinh`, `SoCMND`, `Luong`,`SDT`,`Email`,`DiaChi`) values (5, 'Raddie Pimley',2,2,2, '1981-03-16', '123824095', '10000000', '937-314-0615', 'rpimley4@icq.com', '548 3rd Center');
insert into `case_study`.`nhan_vien` (`IDNhanVien`, `HoTen`, `IDViTri`, `IDTrinhDo`, `IDBoPhan`, `NgaySinh`, `SoCMND`, `Luong`,`SDT`,`Email`,`DiaChi`) values (6, 'Conway Bullerwell',2,2,2, '1981-03-16', '791951366', '10000000', '199-864-6361', 'cbullerwell5@google.cn', '12 Utah Trail');
insert into `case_study`.`nhan_vien` (`IDNhanVien`, `HoTen`, `IDViTri`, `IDTrinhDo`, `IDBoPhan`, `NgaySinh`, `SoCMND`, `Luong`,`SDT`,`Email`,`DiaChi`) values (7, 'Elyse Denis',1,3,1, '1981-03-16', '839097439', '15000000', '322-270-9466', 'edenis6@boston.com', '166 Ridge Oak Way');
insert into `case_study`.`nhan_vien` (`IDNhanVien`, `HoTen`, `IDViTri`, `IDTrinhDo`, `IDBoPhan`, `NgaySinh`, `SoCMND`, `Luong`,`SDT`,`Email`,`DiaChi`) values (8, 'Heston Redmell',4,4,4, '1987-11-27', '653714580', '20000000', '260-664-2956', 'wredmell7@amazon.co.uk', '11634 Clove Alley');
insert into `case_study`.`nhan_vien` (`IDNhanVien`, `HoTen`, `IDViTri`, `IDTrinhDo`, `IDBoPhan`, `NgaySinh`, `SoCMND`, `Luong`,`SDT`,`Email`,`DiaChi`) values (9, 'Cherilynn Streather',5,4,4, '1987-11-27', '555862742', '8000000', '310-183-4463', 'cstreather8@mediafire.com', '7 Kensington Trail');
insert into `case_study`.`nhan_vien` (`IDNhanVien`, `HoTen`, `IDViTri`, `IDTrinhDo`, `IDBoPhan`, `NgaySinh`, `SoCMND`, `Luong`,`SDT`,`Email`,`DiaChi`) values (10, 'Clayborn Dand',3,3,3, '1987-11-27', '537342918', '8000000', '689-169-7705', 'cdand9@pen.io', '8026 Gina Parkway');
insert into `case_study`.`nhan_vien` (`IDNhanVien`, `HoTen`, `IDViTri`, `IDTrinhDo`, `IDBoPhan`, `NgaySinh`, `SoCMND`, `Luong`,`SDT`,`Email`,`DiaChi`) values (11, 'Jobye Einchcombe',4,4,4, '1976-05-11', '691805209', '15000000', '313-548-7217', 'jeinchcombea@theatlantic.com', '22 Upham Point');
insert into `case_study`.`nhan_vien` (`IDNhanVien`, `HoTen`, `IDViTri`, `IDTrinhDo`, `IDBoPhan`, `NgaySinh`, `SoCMND`, `Luong`,`SDT`,`Email`,`DiaChi`) values (12, 'Trove Mathevon',2,2,2, '1976-05-11', '783535926', '8000000', '598-966-6990', 'gmathevonb@usatoday.com', '1063 Oriole Parkway');
insert into `case_study`.`nhan_vien` (`IDNhanVien`, `HoTen`, `IDViTri`, `IDTrinhDo`, `IDBoPhan`, `NgaySinh`, `SoCMND`, `Luong`,`SDT`,`Email`,`DiaChi`) values (13, 'Aurel Antoniades',2,2,2, '1976-05-11', '175717331', '8000000', '947-766-1517', 'aantoniadesc@scientificamerican.com', '9837 Corscot Place');
insert into `case_study`.`nhan_vien` (`IDNhanVien`, `HoTen`, `IDViTri`, `IDTrinhDo`, `IDBoPhan`, `NgaySinh`, `SoCMND`, `Luong`,`SDT`,`Email`,`DiaChi`) values (14, 'Brana Van der Kruis',3,3,3, '1979-07-24', '393935265', '9000000', '795-809-3227', 'bvand@php.net', '202 Dayton Street');
insert into `case_study`.`nhan_vien` (`IDNhanVien`, `HoTen`, `IDViTri`, `IDTrinhDo`, `IDBoPhan`, `NgaySinh`, `SoCMND`, `Luong`,`SDT`,`Email`,`DiaChi`) values (15, 'Allix Aberdein',4,4,4, '1979-07-24', '124226546', '15000000', '602-888-6078', 'aaberdeine@google.cn', '3040 Sloan Circle');
insert into `case_study`.`nhan_vien` (`IDNhanVien`, `HoTen`, `IDViTri`, `IDTrinhDo`, `IDBoPhan`, `NgaySinh`, `SoCMND`, `Luong`,`SDT`,`Email`,`DiaChi`) values (16, 'Sallie Chainey',5,4,4, '1979-07-24', '659363521', '20000000', '482-121-1106', 'schaineyf@technorati.com', '842 6th Drive');
insert into `case_study`.`nhan_vien` (`IDNhanVien`, `HoTen`, `IDViTri`, `IDTrinhDo`, `IDBoPhan`, `NgaySinh`, `SoCMND`, `Luong`,`SDT`,`Email`,`DiaChi`) values (17, 'Mozelle Laight',1,1,1, '1990-08-14', '622025775', '8000000', '147-463-7447', 'mlaightg@umn.edu', '9804 Lakewood Pass');
insert into `case_study`.`nhan_vien` (`IDNhanVien`, `HoTen`, `IDViTri`, `IDTrinhDo`, `IDBoPhan`, `NgaySinh`, `SoCMND`, `Luong`,`SDT`,`Email`,`DiaChi`) values (18, 'Emmaline Hansie',1,1,1, '1990-08-14', '479700989', '8000000', '836-296-8175', 'ehansieh@microsoft.com', '8389 Carey Center');
insert into `case_study`.`nhan_vien` (`IDNhanVien`, `HoTen`, `IDViTri`, `IDTrinhDo`, `IDBoPhan`, `NgaySinh`, `SoCMND`, `Luong`,`SDT`,`Email`,`DiaChi`) values (19, 'Alida Thackwray',1,1,1, '1990-08-14', '308895420', '8000000', '425-266-3945', 'athackwrayi@123-reg.co.uk', '23755 Summit Alley');
insert into `case_study`.`nhan_vien` (`IDNhanVien`, `HoTen`, `IDViTri`, `IDTrinhDo`, `IDBoPhan`, `NgaySinh`, `SoCMND`, `Luong`,`SDT`,`Email`,`DiaChi`) values (20, 'Shurwood Cummings',1,2,2, '1976-07-24', '544790551', '8000000', '379-302-5076', 'scummingsj@gov.uk', '9 North Junction');
insert into `case_study`.`nhan_vien` (`IDNhanVien`, `HoTen`, `IDViTri`, `IDTrinhDo`, `IDBoPhan`, `NgaySinh`, `SoCMND`, `Luong`,`SDT`,`Email`,`DiaChi`) values (21, 'Tenny Cloney',1,2,2, '1976-07-24', '387661573', '8000000', '641-100-8342', 'dcloneyk@etsy.com', '6303 Lukken Pass');
insert into `case_study`.`nhan_vien` (`IDNhanVien`, `HoTen`, `IDViTri`, `IDTrinhDo`, `IDBoPhan`, `NgaySinh`, `SoCMND`, `Luong`,`SDT`,`Email`,`DiaChi`) values (22, 'Ulick Meere',1,2,2, '1976-07-24', '167859838', '8000000', '476-779-6037', 'umeerel@ihg.com', '62 Gerald Way');
insert into `case_study`.`nhan_vien` (`IDNhanVien`, `HoTen`, `IDViTri`, `IDTrinhDo`, `IDBoPhan`, `NgaySinh`, `SoCMND`, `Luong`,`SDT`,`Email`,`DiaChi`) values (23, 'Cheslie Tooley',1,3,3, '1993-06-21', '981865221', '8000000', '370-130-9622', 'ctooleym@free.fr', '0 Derek Hill');
insert into `case_study`.`nhan_vien` (`IDNhanVien`, `HoTen`, `IDViTri`, `IDTrinhDo`, `IDBoPhan`, `NgaySinh`, `SoCMND`, `Luong`,`SDT`,`Email`,`DiaChi`) values (24, 'Ginger Croyser',1,4,4, '1993-06-21', '290595797', '8000000', '617-645-3680', 'gcroysern@bandcamp.com', '2 Florence Court');
insert into `case_study`.`nhan_vien` (`IDNhanVien`, `HoTen`, `IDViTri`, `IDTrinhDo`, `IDBoPhan`, `NgaySinh`, `SoCMND`, `Luong`,`SDT`,`Email`,`DiaChi`) values (25, 'Tario Meenehan',2,4,4, '1993-06-21', '285609521', '8000000', '519-968-4319', 'mmeenehano@moonfruit.com', '2646 Petterle Street');
insert into `case_study`.`nhan_vien` (`IDNhanVien`, `HoTen`, `IDViTri`, `IDTrinhDo`, `IDBoPhan`, `NgaySinh`, `SoCMND`, `Luong`,`SDT`,`Email`,`DiaChi`) values (26, 'Linus Persehouse',2,3,3, '1993-04-20', '699464947', '10000000', '781-117-9914', 'lpersehousep@economist.com', '62 David Pass');
insert into `case_study`.`nhan_vien` (`IDNhanVien`, `HoTen`, `IDViTri`, `IDTrinhDo`, `IDBoPhan`, `NgaySinh`, `SoCMND`, `Luong`,`SDT`,`Email`,`DiaChi`) values (27, 'Kanya Barizeret',2,3,3, '1993-04-20', '442925316', '10000000', '100-948-6937', 'vbarizeretq@webnode.com', '0379 Macpherson Street');
insert into `case_study`.`nhan_vien` (`IDNhanVien`, `HoTen`, `IDViTri`, `IDTrinhDo`, `IDBoPhan`, `NgaySinh`, `SoCMND`, `Luong`,`SDT`,`Email`,`DiaChi`) values (28, 'Eric Kilmister',2,1,2, '1993-04-20', '710281870', '10000000', '536-914-4340', 'ekilmisterr@stanford.edu', '0786 Ilene Pass');
insert into `case_study`.`nhan_vien` (`IDNhanVien`, `HoTen`, `IDViTri`, `IDTrinhDo`, `IDBoPhan`, `NgaySinh`, `SoCMND`, `Luong`,`SDT`,`Email`,`DiaChi`) values (29, 'Kermaine Filipczak',2,2,1, '1975-01-23', '849886964', '10000000', '130-972-5456', 'gfilipczaks@altervista.org', '54 Anthes Hill');
insert into `case_study`.`nhan_vien` (`IDNhanVien`, `HoTen`, `IDViTri`, `IDTrinhDo`, `IDBoPhan`, `NgaySinh`, `SoCMND`, `Luong`,`SDT`,`Email`,`DiaChi`) values (30, 'Sinclare Leyburn',2,2,2, '1975-01-23', '707332391', '10000000', '294-295-9505', 'sleyburnt@surveymonkey.com', '31 Knutson Drive');


create table dich_vu_di_kem(
IDDichVuDiKem int auto_increment primary key,
TenDichVuDiKem varchar(45) not null,
Gia int not null,
DonVi int not null,
TrangThaiKhaDung varchar(45) not null
);
INSERT INTO `case_study`.`dich_vu_di_kem` (`IDDichVuDiKem`, `TenDichVuDiKem`,`Gia`,`DonVi`,`TrangThaiKhaDung`) VALUES (1, 'massage', '500000','1','available');
INSERT INTO `case_study`.`dich_vu_di_kem` (`IDDichVuDiKem`, `TenDichVuDiKem`,`Gia`,`DonVi`,`TrangThaiKhaDung`) VALUES (2, 'karaoke', '500000','1','available');
INSERT INTO `case_study`.`dich_vu_di_kem` (`IDDichVuDiKem`, `TenDichVuDiKem`,`Gia`,`DonVi`,`TrangThaiKhaDung`) VALUES (3, 'food', '300000','1','available');
INSERT INTO `case_study`.`dich_vu_di_kem` (`IDDichVuDiKem`, `TenDichVuDiKem`,`Gia`,`DonVi`,`TrangThaiKhaDung`) VALUES (4, 'drink', '100000','1','available');
INSERT INTO `case_study`.`dich_vu_di_kem` (`IDDichVuDiKem`, `TenDichVuDiKem`,`Gia`,`DonVi`,`TrangThaiKhaDung`) VALUES (5, 'rent a car for visit resort', '250000','1','available');


create table hop_dong_chi_tiet(
IDHopDongChiTiet int auto_increment primary key,
IDHopDong int,
IDDichVuDiKem int,
SoLuong int not null
);
insert into `case_study`.`hop_dong_chi_tiet` (`IDHopDongChiTiet`, `IDHopDong`, `IDDichVuDiKem`, `SoLuong`) values (1, 1, 1, 1);
insert into `case_study`.`hop_dong_chi_tiet` (`IDHopDongChiTiet`, `IDHopDong`, `IDDichVuDiKem`, `SoLuong`) values (2, 2, 2, 2);
insert into `case_study`.`hop_dong_chi_tiet` (`IDHopDongChiTiet`, `IDHopDong`, `IDDichVuDiKem`, `SoLuong`) values (3, 3, 3, 3);
insert into `case_study`.`hop_dong_chi_tiet` (`IDHopDongChiTiet`, `IDHopDong`, `IDDichVuDiKem`, `SoLuong`) values (4, 4, 4, 4);
insert into `case_study`.`hop_dong_chi_tiet` (`IDHopDongChiTiet`, `IDHopDong`, `IDDichVuDiKem`, `SoLuong`) values (5, 5, 5, 5);
insert into `case_study`.`hop_dong_chi_tiet` (`IDHopDongChiTiet`, `IDHopDong`, `IDDichVuDiKem`, `SoLuong`) values (6, 6, 1, 1);
insert into `case_study`.`hop_dong_chi_tiet` (`IDHopDongChiTiet`, `IDHopDong`, `IDDichVuDiKem`, `SoLuong`) values (7, 7, 2, 2);
insert into `case_study`.`hop_dong_chi_tiet` (`IDHopDongChiTiet`, `IDHopDong`, `IDDichVuDiKem`, `SoLuong`) values (8, 8, 3, 3);
insert into `case_study`.`hop_dong_chi_tiet` (`IDHopDongChiTiet`, `IDHopDong`, `IDDichVuDiKem`, `SoLuong`) values (9, 9, 4, 4);
insert into `case_study`.`hop_dong_chi_tiet` (`IDHopDongChiTiet`, `IDHopDong`, `IDDichVuDiKem`, `SoLuong`) values (10, 10, 5, 2);
insert into `case_study`.`hop_dong_chi_tiet` (`IDHopDongChiTiet`, `IDHopDong`, `IDDichVuDiKem`, `SoLuong`) values (11, 11, 1, 1);
insert into `case_study`.`hop_dong_chi_tiet` (`IDHopDongChiTiet`, `IDHopDong`, `IDDichVuDiKem`, `SoLuong`) values (12, 12, 2, 4);
insert into `case_study`.`hop_dong_chi_tiet` (`IDHopDongChiTiet`, `IDHopDong`, `IDDichVuDiKem`, `SoLuong`) values (13, 13, 3, 5);
insert into `case_study`.`hop_dong_chi_tiet` (`IDHopDongChiTiet`, `IDHopDong`, `IDDichVuDiKem`, `SoLuong`) values (14, 14, 4, 2);
insert into `case_study`.`hop_dong_chi_tiet` (`IDHopDongChiTiet`, `IDHopDong`, `IDDichVuDiKem`, `SoLuong`) values (15, 15, 5, 3);
insert into `case_study`.`hop_dong_chi_tiet` (`IDHopDongChiTiet`, `IDHopDong`, `IDDichVuDiKem`, `SoLuong`) values (16, 16, 1, 1);
insert into `case_study`.`hop_dong_chi_tiet` (`IDHopDongChiTiet`, `IDHopDong`, `IDDichVuDiKem`, `SoLuong`) values (17, 17, 2, 3);
insert into `case_study`.`hop_dong_chi_tiet` (`IDHopDongChiTiet`, `IDHopDong`, `IDDichVuDiKem`, `SoLuong`) values (18, 18, 3, 2);
insert into `case_study`.`hop_dong_chi_tiet` (`IDHopDongChiTiet`, `IDHopDong`, `IDDichVuDiKem`, `SoLuong`) values (19, 19, 4, 2);
insert into `case_study`.`hop_dong_chi_tiet` (`IDHopDongChiTiet`, `IDHopDong`, `IDDichVuDiKem`, `SoLuong`) values (20, 20, 5, 4);
insert into `case_study`.`hop_dong_chi_tiet` (`IDHopDongChiTiet`, `IDHopDong`, `IDDichVuDiKem`, `SoLuong`) values (21, 21, 1, 4);
insert into `case_study`.`hop_dong_chi_tiet` (`IDHopDongChiTiet`, `IDHopDong`, `IDDichVuDiKem`, `SoLuong`) values (22, 22, 2, 2);
insert into `case_study`.`hop_dong_chi_tiet` (`IDHopDongChiTiet`, `IDHopDong`, `IDDichVuDiKem`, `SoLuong`) values (23, 23, 3, 1);
insert into `case_study`.`hop_dong_chi_tiet` (`IDHopDongChiTiet`, `IDHopDong`, `IDDichVuDiKem`, `SoLuong`) values (24, 24, 4, 1);
insert into `case_study`.`hop_dong_chi_tiet` (`IDHopDongChiTiet`, `IDHopDong`, `IDDichVuDiKem`, `SoLuong`) values (25, 25, 5, 3);
insert into `case_study`.`hop_dong_chi_tiet` (`IDHopDongChiTiet`, `IDHopDong`, `IDDichVuDiKem`, `SoLuong`) values (26, 26, 1, 3);
insert into `case_study`.`hop_dong_chi_tiet` (`IDHopDongChiTiet`, `IDHopDong`, `IDDichVuDiKem`, `SoLuong`) values (27, 27, 2, 2);
insert into `case_study`.`hop_dong_chi_tiet` (`IDHopDongChiTiet`, `IDHopDong`, `IDDichVuDiKem`, `SoLuong`) values (28, 28, 3, 2);
insert into `case_study`.`hop_dong_chi_tiet` (`IDHopDongChiTiet`, `IDHopDong`, `IDDichVuDiKem`, `SoLuong`) values (29, 29, 4, 1);
insert into `case_study`.`hop_dong_chi_tiet` (`IDHopDongChiTiet`, `IDHopDong`, `IDDichVuDiKem`, `SoLuong`) values (30, 30, 5, 5);

create table hop_dong(
IDHopDong int auto_increment primary key,
IDNhanVien int,
IDKhachHang int,
IDDichVu int,
NgayLamHopDong date,
NgayKetThuc date,
TienDatCoc int,
TongTien int
);

insert into `case_study`.`hop_dong` (`IDHopDong`, `IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLamHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) values (1, 1, 1, 1, '2019-10-05', '2020-05-01', 7000000, 150000000);
insert into `case_study`.`hop_dong` (`IDHopDong`, `IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLamHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) values (2, 2, 2, 2, '2019-10-08', '2020-03-05', 6000000, 50000000);
insert into `case_study`.`hop_dong` (`IDHopDong`, `IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLamHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) values (3, 3, 3, 3, '2019-07-31', '2019-12-03', 5000000, 5000000);
insert into `case_study`.`hop_dong` (`IDHopDong`, `IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLamHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) values (4, 4, 4, 4, '2020-03-09', '2019-07-09', 100000, 200000);
insert into `case_study`.`hop_dong` (`IDHopDong`, `IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLamHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) values (5, 5, 5, 5, '2019-12-05', '2020-02-22', 7000000, 150000000);
insert into `case_study`.`hop_dong` (`IDHopDong`, `IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLamHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) values (6, 6, 6, 6, '2020-03-28', '2019-05-30', 6000000, 50000000);
insert into `case_study`.`hop_dong` (`IDHopDong`, `IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLamHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) values (7, 7, 7, 7, '2019-11-21', '2019-04-11', 5000000, 5000000);
insert into `case_study`.`hop_dong` (`IDHopDong`, `IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLamHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) values (8, 8, 8, 8, '2019-09-28', '2020-03-31', 100000, 200000);
insert into `case_study`.`hop_dong` (`IDHopDong`, `IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLamHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) values (9, 9, 9, 9, '2020-03-07', '2019-07-14', 7000000, 150000000);
insert into `case_study`.`hop_dong` (`IDHopDong`, `IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLamHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) values (10, 10, 10, 10, '2019-07-25', '2020-05-13', 6000000, 50000000);
insert into `case_study`.`hop_dong` (`IDHopDong`, `IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLamHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) values (11, 11, 11, 11, '2020-03-26', '2020-05-23', 5000000, 5000000);
insert into `case_study`.`hop_dong` (`IDHopDong`, `IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLamHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) values (12, 12, 12, 12, '2019-08-13', '2020-05-07', 100000, 200000);
insert into `case_study`.`hop_dong` (`IDHopDong`, `IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLamHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) values (13, 13, 13, 1, '2019-12-30', '2019-05-30', 7000000, 150000000);
insert into `case_study`.`hop_dong` (`IDHopDong`, `IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLamHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) values (14, 14, 14, 2, '2020-01-30', '2019-11-16', 6000000, 50000000);
insert into `case_study`.`hop_dong` (`IDHopDong`, `IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLamHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) values (15, 15, 15, 3, '2020-02-19', '2019-08-21', 5000000, 5000000);
insert into `case_study`.`hop_dong` (`IDHopDong`, `IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLamHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) values (16, 16, 16, 4, '2020-01-01', '2019-04-23', 100000, 200000);
insert into `case_study`.`hop_dong` (`IDHopDong`, `IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLamHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) values (17, 17, 17, 5, '2019-08-09', '2019-09-24', 7000000, 150000000);
insert into `case_study`.`hop_dong` (`IDHopDong`, `IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLamHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) values (18, 18, 18, 6, '2019-11-10', '2019-04-26', 6000000, 50000000);
insert into `case_study`.`hop_dong` (`IDHopDong`, `IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLamHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) values (19, 19, 19, 7, '2019-06-25', '2020-05-12', 5000000, 5000000);
insert into `case_study`.`hop_dong` (`IDHopDong`, `IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLamHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) values (20, 20, 20, 8, '2020-03-11', '2020-02-01', 100000, 200000);
insert into `case_study`.`hop_dong` (`IDHopDong`, `IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLamHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) values (21, 21, 21, 9, '2020-03-02', '2020-01-14', 7000000, 150000000);
insert into `case_study`.`hop_dong` (`IDHopDong`, `IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLamHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) values (22, 22, 22, 10, '2020-02-08', '2020-04-12', 6000000, 50000000);
insert into `case_study`.`hop_dong` (`IDHopDong`, `IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLamHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) values (23, 23, 23, 11, '2020-01-29', '2019-12-03', 5000000, 5000000);
insert into `case_study`.`hop_dong` (`IDHopDong`, `IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLamHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) values (24, 24, 24, 12, '2019-11-27', '2019-12-26', 100000, 200000);
insert into `case_study`.`hop_dong` (`IDHopDong`, `IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLamHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) values (25, 25, 25, 1, '2019-11-01', '2019-05-05', 7000000, 150000000);
insert into `case_study`.`hop_dong` (`IDHopDong`, `IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLamHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) values (26, 26, 26, 2, '2019-12-20', '2019-08-01', 6000000, 50000000);
insert into `case_study`.`hop_dong` (`IDHopDong`, `IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLamHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) values (27, 27, 27, 3, '2020-03-21', '2019-07-04', 5000000, 5000000);
insert into `case_study`.`hop_dong` (`IDHopDong`, `IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLamHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) values (28, 28, 28, 4, '2019-10-20', '2019-07-11', 100000, 200000);
insert into `case_study`.`hop_dong` (`IDHopDong`, `IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLamHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) values (29, 29, 29, 5, '2019-10-04', '2019-06-05', 7000000, 150000000);
insert into `case_study`.`hop_dong` (`IDHopDong`, `IDNhanVien`, `IDKhachHang`, `IDDichVu`, `NgayLamHopDong`, `NgayKetThuc`, `TienDatCoc`, `TongTien`) values (30, 30, 30, 6, '2019-09-03', '2019-04-06', 6000000, 50000000);

create table khach_hang(
IDKhachHang int auto_increment primary key,
IDLoaiKhach int,
HoTen varchar(45) not null,
NgaySinh date,
SoCMND varchar(45) not null,
SDT varchar(45) not null,
Email varchar(45) not null,
DiaChi varchar(45) not null
);
insert into `case_study`.`khach_hang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) values (1, 1, 'Shirline Beaushaw', '1983-08-06', '582169472', '620-390-1946', 'sbeaushaw0@booking.com', 'Da Nang');
insert into `case_study`.`khach_hang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) values (2, 2, 'Emmie De Carlo', '1996-07-12', '810168465', '140-538-7633', 'ede1@delicious.com', '6 Manufacturers Avenue');
insert into `case_study`.`khach_hang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) values (3, 3, 'Cecile Harmeston', '1997-06-14', '786891675', '420-418-9318', 'charmeston2@intel.com', 'Da Nang');
insert into `case_study`.`khach_hang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) values (4, 4, 'Lilias Braysher', '1962-08-21', '331920093', '282-340-0118', 'lbraysher3@engadget.com', '20 Elgar Parkway');
insert into `case_study`.`khach_hang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) values (5, 5, 'Janene Le land', '1981-05-05', '732779052', '578-508-5013', 'jle4@china.com.cn', 'Da Nang');
insert into `case_study`.`khach_hang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) values (6, 1, 'Buffy Carwardine', '2000-03-22', '964682310', '866-847-6400', 'bcarwardine5@apple.com', '5 Stone Corner Plaza');
insert into `case_study`.`khach_hang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) values (7, 2, 'Merilyn Frantzen', '1978-09-02', '294312380', '162-955-3765', 'mfrantzen6@360.cn', '2 2nd Avenue');
insert into `case_study`.`khach_hang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) values (8, 3, 'Hillery Maynard', '1966-02-16', '392203231', '771-600-6573', 'hmaynard7@elegantthemes.com', '3 Sachs Road');
insert into `case_study`.`khach_hang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) values (9, 4, 'Rori Abotson', '1963-08-02', '282746902', '832-865-7639', 'rabotson8@scribd.com', '0970 Brentwood Way');
insert into `case_study`.`khach_hang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) values (10, 5, 'Luella Locard', '1973-01-27', '534311893', '938-717-0354', 'llocard9@whitehouse.gov', '284 Donald Lane');
insert into `case_study`.`khach_hang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) values (11, 1, 'Rachele Sefton', '1964-01-25', '456889602', '214-913-5286', 'rseftona@comsenz.com', '8980 Golf Plaza');
insert into `case_study`.`khach_hang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) values (12, 2, 'Duffie Winkett', '1966-08-06', '454203547', '773-741-2950', 'dwinkettb@flavors.me', '72 Manufacturers Avenue');
insert into `case_study`.`khach_hang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) values (13, 3, 'Jolyn Evitts', '1978-02-23', '418678045', '433-934-9000', 'jevittsc@arstechnica.com', '3 2nd Terrace');
insert into `case_study`.`khach_hang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) values (14, 4, 'Jessee Pembery', '1982-10-04', '715716336', '894-957-2286', 'jpemberyd@japanpost.jp', '8054 Debs Trail');
insert into `case_study`.`khach_hang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) values (15, 5, 'Dina Dransfield', '1973-06-29', '876225298', '909-582-5168', 'ddransfielde@rambler.ru', '406 Washington Lane');
insert into `case_study`.`khach_hang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) values (16, 1, 'Allard Hartright', '1966-01-20', '917025442', '289-373-5662', 'ahartrightf@example.com', '10 Eastlawn Terrace');
insert into `case_study`.`khach_hang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) values (17, 2, 'Inez Yeandel', '1970-02-14', '508869625', '326-720-2061', 'iyeandelg@nifty.com', '30 Lake View Drive');
insert into `case_study`.`khach_hang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) values (18, 3, 'Samara MacWhan', '1965-12-22', '775657377', '383-135-5665', 'smacwhanh@issuu.com', '28320 Kennedy Hill');
insert into `case_study`.`khach_hang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) values (19, 4, 'Florry Helkin', '1989-09-17', '222886090', '635-364-2311', 'fhelkini@jugem.jp', 'Quang Tri');
insert into `case_study`.`khach_hang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) values (20, 5, 'Rufe Wedderburn', '1979-01-08','351716237', '354-826-1464', 'rwedderburnj@ibm.com', '0 Shopko Plaza');
insert into `case_study`.`khach_hang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) values (21, 1, 'Alaine Marskell', '1986-12-16', '586617585', '833-870-6309', 'amarskellk@wordpress.com', 'Da Nang');
insert into `case_study`.`khach_hang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) values (22, 2, 'Aleta Godding', '1968-10-10', '457356311', '813-501-4644', 'agoddingl@rambler.ru', '75 Michigan Pass');
insert into `case_study`.`khach_hang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) values (23, 3, 'Harmonie Davio', '1971-11-21', '206034362', '338-633-9827', 'hdaviom@ezinearticles.com', '7 Linden Street');
insert into `case_study`.`khach_hang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) values (24, 4, 'Abe Branwhite', '1969-03-23', '507036880', '218-814-7545', 'abranwhiten@creativecommons.org', 'Quang Tri');
insert into `case_study`.`khach_hang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) values (25, 5, 'Eugenio Troucher', '1973-08-13', '199036048', '393-458-9463', 'etrouchero@imgur.com', '4707 Sutteridge Trail');
insert into `case_study`.`khach_hang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) values (26, 1, 'Lurline Karlsson', '1969-04-28', '554690304', '884-766-2684', 'lkarlssonp@cyberchimps.com', '1 Derek Center');
insert into `case_study`.`khach_hang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) values (27, 2, 'Felike Troyes', '1996-08-18', '618181968', '593-722-9356', 'ftroyesq@fda.gov', '46 Little Fleur Pass');
insert into `case_study`.`khach_hang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) values (28, 3, 'Abdul Stiffell', '1961-05-15', '592270419', '655-445-3402', 'astiffellr@facebook.com', '41001 Ilene Avenue');
insert into `case_study`.`khach_hang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) values (29, 4, 'Ronnie Veale', '1967-03-18', '719524660', '891-388-9341', 'rveales@bbc.co.uk', 'Quang Tri');
insert into `case_study`.`khach_hang` (`IDKhachHang`, `IDLoaiKhach`, `HoTen`, `NgaySinh`, `SoCMND`, `SDT`, `Email`, `DiaChi`) values (30, 5, 'Wenona Strooband', '1965-08-29', '668910148', '463-183-7095', 'wstroobandt@economist.com', '09 Summit Hill');
create table loai_khach(
IDLoaiKhach int auto_increment primary key,
TenLoaiKhach varchar(45) not null
);
INSERT INTO `case_study`.`loai_khach` (`IDLoaiKhach`, `TenLoaiKhach`) VALUES (1, 'Diamond');
INSERT INTO `case_study`.`loai_khach` (`IDLoaiKhach`, `TenLoaiKhach`) VALUES (2, 'Platinium');
INSERT INTO `case_study`.`loai_khach` (`IDLoaiKhach`, `TenLoaiKhach`) VALUES (3, 'Gold');
INSERT INTO `case_study`.`loai_khach` (`IDLoaiKhach`, `TenLoaiKhach`) VALUES (4, 'Silver');
INSERT INTO `case_study`.`loai_khach` (`IDLoaiKhach`, `TenLoaiKhach`) VALUES (5, 'Member');

create table kieu_thue(
IDKieuThue int auto_increment primary key,
TenKieuThue varchar(45) not null,
Gia int not null
);
INSERT INTO `case_study`.`kieu_thue` (`IDKieuThue`, `TenKieuThue`, `Gia`) VALUES (1, 'Year', '150000000');
INSERT INTO `case_study`.`kieu_thue` (`IDKieuThue`, `TenKieuThue`, `Gia`) VALUES (2, 'Month', '50000000');
INSERT INTO `case_study`.`kieu_thue` (`IDKieuThue`, `TenKieuThue`, `Gia`) VALUES (3, 'Day', '5000000');
INSERT INTO `case_study`.`kieu_thue` (`IDKieuThue`, `TenKieuThue`, `Gia`) VALUES (4, 'Hour', '200000');


create table loai_dich_vu(
IDLoaiDichVu int auto_increment primary key,
TenLoaiDichVu varchar(45) not null
);
INSERT INTO `case_study`.`loai_dich_vu` (`IDLoaiDichVu`, `TenLoaiDichVu`) VALUES (1, 'Villa');
INSERT INTO `case_study`.`loai_dich_vu` (`IDLoaiDichVu`, `TenLoaiDichVu`) VALUES (2, 'House');
INSERT INTO `case_study`.`loai_dich_vu` (`IDLoaiDichVu`, `TenLoaiDichVu`) VALUES (3, 'Room');


create table dich_vu(
IDDichVu int auto_increment primary key,
TenDichVu varchar(45) not null,
DienTich int not null,
SoTang int not null,
SoNguoiToiDa varchar(45) not null,
ChiPhiThue varchar(45) not null,
IDKieuThue int,
IDLoaiDichVu int,
TrangThai varchar(45) not null
);
INSERT INTO `case_study`.`dich_vu` (`IDDichVu`, `TenDichVu`, `DienTich`, `SoTang`, `SoNguoiToiDa`, `ChiPhiThue`, `IDKieuThue`, `IDLoaiDichVu`, `TrangThai`) VALUES (1, 'Villa rent by year', '50', '4', '10', '150000000', '1', '1', 'Clear');
INSERT INTO `case_study`.`dich_vu` (`IDDichVu`, `TenDichVu`, `DienTich`, `SoTang`, `SoNguoiToiDa`, `ChiPhiThue`, `IDKieuThue`, `IDLoaiDichVu`, `TrangThai`) VALUES (2, 'Villa rent by month', '50', '4', '10', '50000000', '2', '1', 'Clear');
INSERT INTO `case_study`.`dich_vu` (`IDDichVu`, `TenDichVu`, `DienTich`, `SoTang`, `SoNguoiToiDa`, `ChiPhiThue`, `IDKieuThue`, `IDLoaiDichVu`, `TrangThai`) VALUES (3, 'Villa rent by day', '50', '4', '10', '5000000', '3', '1', 'Clear');
INSERT INTO `case_study`.`dich_vu` (`IDDichVu`, `TenDichVu`, `DienTich`, `SoTang`, `SoNguoiToiDa`, `ChiPhiThue`, `IDKieuThue`, `IDLoaiDichVu`, `TrangThai`) VALUES (4, 'Villa rent by hour', '50', '4', '10', '200000', '4', '1', 'Clear');
INSERT INTO `case_study`.`dich_vu` (`IDDichVu`, `TenDichVu`, `DienTich`, `SoTang`, `SoNguoiToiDa`, `ChiPhiThue`, `IDKieuThue`, `IDLoaiDichVu`, `TrangThai`) VALUES (5, 'House rent by year', '45', '3', '8', '150000000', '1', '2', 'Clear');
INSERT INTO `case_study`.`dich_vu` (`IDDichVu`, `TenDichVu`, `DienTich`, `SoTang`, `SoNguoiToiDa`, `ChiPhiThue`, `IDKieuThue`, `IDLoaiDichVu`, `TrangThai`) VALUES (6, 'House rent by month', '45', '3', '8', '50000000', '2', '2', 'Clear');
INSERT INTO `case_study`.`dich_vu` (`IDDichVu`, `TenDichVu`, `DienTich`, `SoTang`, `SoNguoiToiDa`, `ChiPhiThue`, `IDKieuThue`, `IDLoaiDichVu`, `TrangThai`) VALUES (7, 'House rent by day', '45', '3', '8', '5000000', '3', '2', 'Clear');
INSERT INTO `case_study`.`dich_vu` (`IDDichVu`, `TenDichVu`, `DienTich`, `SoTang`, `SoNguoiToiDa`, `ChiPhiThue`, `IDKieuThue`, `IDLoaiDichVu`, `TrangThai`) VALUES (8, 'House rent by hour', '45', '3', '8', '200000', '4', '2', 'Clear');
INSERT INTO `case_study`.`dich_vu` (`IDDichVu`, `TenDichVu`, `DienTich`, `SoTang`, `SoNguoiToiDa`, `ChiPhiThue`, `IDKieuThue`, `IDLoaiDichVu`, `TrangThai`) VALUES (9, 'Room rent by year', '40', '2', '6', '150000000', '1', '3', 'Clear');
INSERT INTO `case_study`.`dich_vu` (`IDDichVu`, `TenDichVu`, `DienTich`, `SoTang`, `SoNguoiToiDa`, `ChiPhiThue`, `IDKieuThue`, `IDLoaiDichVu`, `TrangThai`) VALUES (10, 'Room rent by month', '40', '2', '6', '50000000', '2', '3', 'Clear');
INSERT INTO `case_study`.`dich_vu` (`IDDichVu`, `TenDichVu`, `DienTich`, `SoTang`, `SoNguoiToiDa`, `ChiPhiThue`, `IDKieuThue`, `IDLoaiDichVu`, `TrangThai`) VALUES (11, 'Room rent by day', '40', '2', '6', '5000000', '3', '3', 'Clear');
INSERT INTO `case_study`.`dich_vu` (`IDDichVu`, `TenDichVu`, `DienTich`, `SoTang`, `SoNguoiToiDa`, `ChiPhiThue`, `IDKieuThue`, `IDLoaiDichVu`, `TrangThai`) VALUES (12, 'Room rent by hour', '40', '2', '6', '200000', '4', '3', 'Clear');


alter table nhan_vien
add foreign key(IDViTri) references vi_tri(IDViTri),
add foreign key(IDTrinhDo) references trinh_do(IDTrinhDo),
add foreign key(IDBoPhan) references bo_phan(IDBoPhan);

alter table hop_dong_chi_tiet
add foreign key (IDHopDong) references hop_dong(IDHopDong),
add foreign key (IDDichVuDiKem) references dich_vu_di_kem(IDDichVuDiKem);

alter table hop_dong
add foreign key (IDNhanVien) references nhan_vien(IDNhanVien),
add foreign key (IDKhachHang) references khach_hang(IDKhachHang),
add foreign key (IDDichVu) references dich_vu(IDDichVu);

alter table khach_hang
add foreign key (IDLoaiKhach) references loai_khach(IDLoaiKhach);

alter table dich_vu
add foreign key (IDKieuThue) references kieu_thue(IDKieuThue),
add foreign key (IDLoaiDichVu) references loai_dich_vu(IDLoaiDichVu);

