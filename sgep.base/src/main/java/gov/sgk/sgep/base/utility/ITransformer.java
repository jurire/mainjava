package gov.sgk.sgep.base.utility;

import gov.sgk.sgep.base.api.model.system.Kimlik;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis.KisiBilgisiSonucu;

public interface ITransformer {

	Kimlik transformKimlik(KisiBilgisiSonucu kisiBilgisiSonucu);
	
	//IsyeriBilgileri transformIsyeri(IsyeriBilgisiSonucu isyeriBilgisiSonucu);
}
