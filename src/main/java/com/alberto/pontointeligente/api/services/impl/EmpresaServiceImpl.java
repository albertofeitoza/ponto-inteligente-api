package com.alberto.pontointeligente.api.services.impl;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alberto.pontointeligente.api.entities.Empresa;
import com.alberto.pontointeligente.api.repositories.EmpresaRepository;
import com.alberto.pontointeligente.api.services.EmpresaService;

@Service
public class EmpresaServiceImpl implements EmpresaService {
   
		private static final Logger log = LoggerFactory.getLogger(EmpresaServiceImpl.class);
	
   		@Autowired
   		private EmpresaRepository empresaRepository;
	
		@Override
		public Optional<Empresa>buscaPorCnpj(String cnpj){
			log.info("Buscando Uma empresa para o CNPJ {}",cnpj );
			return Optional.ofNullable(empresaRepository.findByCnpj(cnpj));
		}
		
		@Override
		public Empresa persistir(Empresa empresa) {
	    log.info("Persistindo Empresa: {} ",empresa);
	    return this.empresaRepository.save(empresa);
		}
	}
