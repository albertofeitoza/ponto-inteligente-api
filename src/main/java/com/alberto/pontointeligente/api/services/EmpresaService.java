package com.alberto.pontointeligente.api.services;
import java.util.Optional;
import com.alberto.pontointeligente.api.entities.Empresa;
public interface EmpresaService {
	/**
	* Retorna uma empresa dado um CNPJ
	*
	* @param cnpj
	* @return Empresa	
	*/
	Optional<Empresa> buscaPorCnpj(String cnpj);
	/**
	* Cadastrar uma empresa nova no Banco de dados
	*
	* @param empresa 
	* @return Empresa	
	*/
	Empresa persistir(Empresa empresa);
}

