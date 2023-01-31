package co.develhope.firstapi2.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialController {


    @GetMapping("/factorial/{n}")
    public Integer factorialCalculator(@PathVariable Integer n){
        Integer factorial = 1;
        for (Integer i= 2; i <= n; i++){
            factorial = factorial * i;
        }

        return factorial;
    }
    }
