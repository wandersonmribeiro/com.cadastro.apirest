package com.cadastro.apirest.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.apirest.models.Usuario;
import com.cadastro.apirest.repository.UsuarioRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "ApiRest Cadastros") 
@RestController
@RequestMapping("/apirest/")
public class ApiRestController {
	
	@Autowired
	private UsuarioRepository ur;
	
	@ApiOperation(value = "Mostra lista de Usuario") //Diz ao Swagger que essa operação REST deve ser documentado	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Usuario> listaUsuarios(){
		Iterable<Usuario> listaUsuario = ur.findAll();
		return listaUsuario;
	}
	
	
	@ApiOperation(value = "Salva Usuario") //Diz ao Swagger que essa operação REST deve ser documentado
	@PostMapping()
	public ResponseEntity<?> cadastroConvenio(@RequestBody @Valid Usuario usuario, BindingResult result){
		if (result.hasErrors()) {
			 return ResponseEntity.badRequest().body(result.getFieldError());
		 }
		ur.save(usuario);
		return ResponseEntity.ok(usuario);
	}
	
	@ApiOperation(value = "Deleta Usuario") //Diz ao Swagger que essa operação REST deve ser documentado
	@DeleteMapping()
	public Usuario deletaConvenio(@RequestBody Usuario usuario){
		ur.delete(usuario);
		return usuario;
	}		
}