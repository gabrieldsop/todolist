package br.com.gabriel1s1.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/primeiraRota")
//http://localhost:8080/-----

public class MinhaPrimeiraController {
/**
 * Metodos de acesso do HTTP
 * GET - Buscar informacao/dado
 * POST - Adicionar informacao/dado
 * PUT - Alterar informacao/dado
 * DELETE - Remover um dado/info
 * PATCH - Alterar somente uma parte da info/dado
 * 
 */
//Método  (Funcionalidade) de uma classe
@GetMapping("/primeiroMetodo")
    public String primeiraMensagem() {
        return "Funcionou";
    }
}
