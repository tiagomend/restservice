package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



/*
 * Esta anotação marca a classe como um controlador
 * onde cada método retorna um objeto de domínio em
 * vez de uma view. É uma abreviação para incluir
 * @Controller e @ResponseBody
 */
@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    /**
     * Permiti realizar operações atômicas (incrementar, decrementar,
     * adicionar, subtrair e comparar) de forma segura entre 
     * multiplas threads.
     */
    private final AtomicLong counter = new AtomicLong();

    /**
     * Mapeia a requisição HTTP GET de /greeting para o método greeting()
     */
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){
        /**
         * @RequestParam vincula o valor do parâmetro da string de consulta "name" ao
         * parâmetro name do método greeting(). Se o parâmetro name estiver ausente na
         * solicitação, o defaultValue de "World" será usado.
         */
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
