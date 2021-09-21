package com.invoice.service.service;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.invoice.service.inparam.EfaturaAraIn;
import com.invoice.service.model.Efatura;

@Service
public class EfaturaService {

	@Autowired
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<Efatura> efaturaGetir(EfaturaAraIn param) {
		String sql="";

		if (param.getMusno() != null && !param.getMusno().equals("")) {
			sql = "SELECT OT.MUSNO,OT.FATURATRH,FROM odemetaksit OT" + 
					"	INNER JOIN efatura EF ON EF.ID=OT.EFATURAID " + 
					"	LEFT JOIN efatura EFT ON EFT.ID=OT.TEVKIFATEFATURAID " + 
					"	WHERE OT.SILINDI='H' AND OT.FATURAIPTAL=0 AND OT.ORJINAL='H' AND OT.MUSNO="+param.getMusno()+ 
					"	GROUP BY EF.UYUMSOFTID";	
		
		Query sorgu = em.createNativeQuery(sql);
		List<Object[]> result = sorgu.getResultList();

		List<Efatura> efaturaList = new ArrayList<Efatura>();
		if (result != null && result.size() > 0) {

			for (Object[] row : result) {
				Efatura b = new Efatura();
				b.setMUSNO(row[0] != null ? row[0].toString() : null);
				b.setFATURATRH(row[0] != null ? row[0].toString() : null);
				b.setEfatura(row[0] != null ? row[0].toString() : null);
				b.setTevkifat(row[0] != null ? row[0].toString() : null);
				
				efaturaList.add(b);
			}
		}

		return efaturaList;
		} else {
			return null;
		}
	}

}
