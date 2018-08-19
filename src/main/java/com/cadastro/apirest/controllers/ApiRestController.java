package com.cadastro.apirest.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.apirest.models.Pessoa;
import com.cadastro.apirest.repository.PessoaRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "ApiRest Cadastros") 
@RestController
@RequestMapping("/apirest/cadastrar")
public class ApiRestController {
	@Autowired
	private PessoaRepository pr;

	@ApiOperation(value = "Mostra lista de pessoas") //Diz ao Swagger que essa operação REST deve ser documentado
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Pessoa> listaConvenios(){
		Iterable<Pessoa> listaConvenios = pr.findAll();
		return listaConvenios;
	}
	
	@ApiOperation(value = "Salva pessoa") //Diz ao Swagger que essa operação REST deve ser documentado
	@PostMapping()
	public ResponseEntity<?> cadastroConvenio(@RequestBody @Valid Pessoa pessoa, BindingResult result){
		if (result.hasErrors()) {
			 return ResponseEntity.badRequest().body(result.getFieldError());
		 }
		pr.save(pessoa);
		return ResponseEntity.ok(pessoa);
	}
	
	@ApiOperation(value = "Deleta pessoa") //Diz ao Swagger que essa operação REST deve ser documentado
	@DeleteMapping()
	public Pessoa deletaConvenio(@RequestBody Pessoa pessoa){
		pr.delete(pessoa);
		return pessoa;
	}		
}