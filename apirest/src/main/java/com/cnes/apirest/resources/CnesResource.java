package com.cnes.apirest.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cnes.apirest.models.Cnes;
import com.cnes.apirest.repository.CnesRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/cnes")
@Api(value="CNES Api REST")
@CrossOrigin(origins="*")
public class CnesResource {
	
	private static final Logger logger = LoggerFactory.getLogger(Cnes.class);
	
	@Autowired
	CnesRepository cnesRepository;
	
	@GetMapping("/todosAtivos")
	@ApiOperation(value="Retorna todas as CNES")
	public List<Cnes> listCnes(){
		return cnesRepository.findAll();
	}
	
	@GetMapping("/ativo/{id}")
	@ApiOperation(value="Retorna a CNES referente ao Id informado")
	public Cnes listCnesPorId(@PathVariable(value="id") int id) {
		Cnes cnes = cnesRepository.findById(id);
		if(cnes == null) {
			logger.info("Nenhum registro encontrado para o Id informado!");
			cnes = new Cnes();
		}
		return cnes;
	}
	
	@GetMapping("/Estado/{uf}")
	@ApiOperation(value="Retorna todas as CNES referentes a UF informada")
	public List<Cnes> listCnesPorUf(@PathVariable(value="uf") String uf){
		List<Cnes> respostaConsulta = cnesRepository.findByUf(uf);
		if(respostaConsulta == null || respostaConsulta.isEmpty()) {
			logger.info("Nenhum registro encontrado para o estado informado! Estado:" + uf );
		}
		return respostaConsulta;
	}
	
	@GetMapping("/Tipos/{dsTipoUnidade}")
	@ApiOperation(value="Retorna todas as CNES referentes ao tipo de unidade informado")
	public List<Cnes> listCnesPorTipo(@PathVariable(value="dsTipoUnidade") String dsTipoUnidade){
		List<Cnes> respostaConsulta = cnesRepository.findByDsTipoUnidade(dsTipoUnidade);
		if(respostaConsulta == null || respostaConsulta.isEmpty()) {
			logger.info("Nenhum registro encontrado para o tipo de unidade informado! Tipo de unidade: " + dsTipoUnidade);
		}
		return respostaConsulta;
	}
}
