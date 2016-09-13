package gov.sgk.sqep.test.base.spring.beans;

import gov.sgk.sgep.base.api.business.IBaseService;
import gov.sgk.sgep.base.api.model.prm.Il;
import gov.sgk.sqep.test.base.spring.model.BolumTest;
import gov.sgk.sqep.test.base.spring.model.DersTest;
import gov.sgk.sqep.test.base.spring.model.OgrenciTest;

public interface ITestServiceForBaseService extends IBaseService {

	void addIl (Il il);
	void addOgrenci (OgrenciTest ogrenci);
	void addDers (DersTest ders);
	void addBolum(BolumTest b);
}
