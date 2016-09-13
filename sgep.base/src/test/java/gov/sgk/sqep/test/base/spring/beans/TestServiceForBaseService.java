package gov.sgk.sqep.test.base.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gov.sgk.sgep.base.api.model.prm.Il;
import gov.sgk.sgep.base.business.BaseService;
import gov.sgk.sgep.base.spring.BusinessService;
import gov.sgk.sqep.test.base.spring.model.BolumTest;
import gov.sgk.sqep.test.base.spring.model.DersTest;
import gov.sgk.sqep.test.base.spring.model.OgrenciTest;

@BusinessService
@Transactional (readOnly=true)
@Service ("testService")
public class TestServiceForBaseService extends BaseService implements ITestServiceForBaseService {

	@Autowired
	ITestDAO testDao;
	
	@Override
	protected ITestDAO getDAO() {
		return testDao;
	}

	@Transactional (readOnly=false)
	@Override
	public void addIl(Il il) {
		addModel(il);
	}

	@Transactional (readOnly=false)
	@Override
	public void addOgrenci(OgrenciTest ogrenci) {
		addModel(ogrenci);
	}

	@Transactional (readOnly=false)
	@Override
	public void addDers(DersTest ders) {
		addModel(ders);
	}

	@Override
	public void addBolum(BolumTest b) {
		addModel(b);
	}

}
