INSERT INTO SGEP.YTK_FONKSIYON(ID, AKTIF_MI, EKLEME_ZAMANI, GUNCELLEME_ZAMANI, ISLEM_ID, KULLANICI, MODUL_ADI, SURUM, ISIM)
  VALUES('addTest', 'E', '2000-12-31 00:00:00.0', '2000-12-31 00:00:00.0', '1', 'sinan', 'STES', 0, 'addTest')
GO
INSERT INTO SGEP.YTK_FONKSIYON(ID, AKTIF_MI, EKLEME_ZAMANI, GUNCELLEME_ZAMANI, ISLEM_ID, KULLANICI, MODUL_ADI, SURUM, ISIM)
  VALUES('getPojoCachable', 'E', '2000-12-31 00:00:00.0', '2000-12-31 00:00:00.0', '1', 'sinan', 'STES', 0, 'getPojoCachable')
GO
INSERT INTO SGEP.YTK_FONKSIYON(ID, AKTIF_MI, EKLEME_ZAMANI, GUNCELLEME_ZAMANI, ISLEM_ID, KULLANICI, MODUL_ADI, SURUM, ISIM)
  VALUES('getPojoNotCachable', 'E', '2000-12-31 00:00:00.0', '2000-12-31 00:00:00.0', '1', 'sinan', 'STES', 0, 'getPojoNotCachable')
GO
INSERT INTO SGEP.YTK_FONKSIYON(ID, AKTIF_MI, EKLEME_ZAMANI, GUNCELLEME_ZAMANI, ISLEM_ID, KULLANICI, MODUL_ADI, SURUM, ISIM)
  VALUES('sadeceAdminCagirabilir', 'E', '2000-12-31 00:00:00.0', '2000-12-31 00:00:00.0', '1', 'sinan', 'STES', 0, 'sadeceAdminCagirabilir')
GO
INSERT INTO SGEP.YTK_FONKSIYON(ID, AKTIF_MI, EKLEME_ZAMANI, GUNCELLEME_ZAMANI, ISLEM_ID, KULLANICI, MODUL_ADI, SURUM, ISIM)
  VALUES('sadeceTestCagirabilir', 'E', '2000-12-31 00:00:00.0', '2000-12-31 00:00:00.0', '1', 'sinan', 'STES', 0, 'sadeceTestCagirabilir')
GO

INSERT INTO SGEP.YTK_ROL(ID, AKTIF_MI, EKLEME_ZAMANI, GUNCELLEME_ZAMANI, ISLEM_ID, KULLANICI, MODUL_ADI, SURUM, ISIM)
  VALUES('ROLE_ADMIN', 'E', '2000-12-31 00:00:00.0', '2000-12-31 00:00:00.0', '1', 'sinan', 'STES', 0, 'ROLE_ADMIN')
GO
INSERT INTO SGEP.YTK_ROL(ID, AKTIF_MI, EKLEME_ZAMANI, GUNCELLEME_ZAMANI, ISLEM_ID, KULLANICI, MODUL_ADI, SURUM, ISIM)
  VALUES('ROLE_TEST', 'E', '2000-12-31 00:00:00.0', '2000-12-31 00:00:00.0', '1', 'sinan', 'STES', 0, 'ROLE_TEST')
GO
INSERT INTO SGEP.YTK_ROL(ID, AKTIF_MI, EKLEME_ZAMANI, GUNCELLEME_ZAMANI, ISLEM_ID, KULLANICI, MODUL_ADI, SURUM, ISIM)
  VALUES('ROLE_TEST2', 'E', '2000-12-31 00:00:00.0', '2000-12-31 00:00:00.0', '1', 'sinan', 'EMEK', 0, 'ROLE_TEST')
GO

INSERT INTO SGEP.YTK_MENU(id, ekleme_zamani, guncelleme_zamani, kullanici, surum, islem_id, aktif_mi, modul_adi, sira, parent_id, ajax, update_id, icon, command, url, isim)
  VALUES('tescilIslemleri', '1899-12-31 00:00:00.0', NULL, 'sinan', '0', '1', 'E', 'STES', '1',NULL, 'E', NULL, NULL, NULL, NULL, 'tescilIslemleri')
GO
INSERT INTO SGEP.YTK_MENU(id, ekleme_zamani, guncelleme_zamani, kullanici, surum, islem_id, aktif_mi, modul_adi, sira, parent_id, ajax, update_id, icon, command, url, isim)
  VALUES('emeklilikIslemleri', '1899-12-31 00:00:00.0', NULL, 'sinan', '0', '1', 'E', 'EMEK', '2', NULL, 'E', NULL, NULL, NULL, NULL, 'emeklilikIslemleri')
GO
INSERT INTO SGEP.YTK_MENU(id, ekleme_zamani, guncelleme_zamani, kullanici, surum, islem_id, aktif_mi, modul_adi, sira, parent_id, ajax, update_id, icon, command, url, isim)
  VALUES('emeklilikGiris', '1899-12-31 00:00:00.0', NULL, 'sinan', '0', '1', 'E', 'EMEK', '1', 'emeklilikIslemleri', 'E',NULL, NULL, NULL, NULL, 'emeklilikGiris')
GO
INSERT INTO SGEP.YTK_MENU(id, ekleme_zamani, guncelleme_zamani, kullanici, surum, islem_id, aktif_mi, modul_adi, sira, parent_id, ajax, update_id, icon, command, url, isim)
  VALUES('tescilGiris', '1899-12-31 00:00:00.0', NULL, 'sinan', '0', '1', 'E', 'STES', '1', 'tescilIslemleri', 'E',NULL, NULL, NULL, NULL, 'tescilGiris')
GO
INSERT INTO SGEP.YTK_MENU(id, ekleme_zamani, guncelleme_zamani, kullanici, surum, islem_id, aktif_mi, modul_adi, sira, parent_id, ajax, update_id, icon, command, url, isim)
  VALUES('tescilIptal', '1899-12-31 00:00:00.0', NULL, 'sinan', '0', '1', 'E', 'STES', '2', 'tescilIslemleri', 'E',NULL, NULL, NULL, NULL, 'tescilIptal')
GO

INSERT INTO SGEP.YTK_ROL_FONKSIYON(ROL_ID, FONKSIYON_ID)
  VALUES('ROLE_TEST', 'getPojoCachable')
GO
INSERT INTO SGEP.YTK_ROL_FONKSIYON(ROL_ID, FONKSIYON_ID)
  VALUES('ROLE_TEST', 'addTest')
GO
INSERT INTO SGEP.YTK_ROL_FONKSIYON(ROL_ID, FONKSIYON_ID)
  VALUES('ROLE_TEST', 'getPojoNotCachable')
GO
INSERT INTO SGEP.YTK_ROL_FONKSIYON(ROL_ID, FONKSIYON_ID)
  VALUES('ROLE_TEST', 'sadeceTestCagirabilir')
GO
INSERT INTO SGEP.YTK_ROL_FONKSIYON(ROL_ID, FONKSIYON_ID)
  VALUES('ROLE_ADMIN', 'sadeceAdminCagirabilir')
GO
INSERT INTO SGEP.YTK_ROL_MENU(ROL_ID, MENU_ID)
  VALUES('ROLE_TEST', 'tescilGiris')
GO

