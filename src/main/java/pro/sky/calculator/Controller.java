package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping
@RestController
public class Controller {
    public final Service service;
    public Controller(Service service) {
        this.service = service;
    }
    @GetMapping(path = "/calculator")
    public String greetin() {
        return "Welcome to the calculator website!";
    }

    @GetMapping(path = "/calculator/plus")
    public String findSum(@RequestParam("num1") int num1,@RequestParam("num2") int num2) {
        return num1 + " + " + num2 + " = " + service.addition(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String findSubstraction(@RequestParam("num1") int num1,@RequestParam("num2") int num2) {
        return num1 + " - " + num2 + " = " + service.subtraction(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String findMultiplication(@RequestParam("num1") int num1,@RequestParam("num2") int num2) {
        return num1 + " * " + num2 + " = " + service.multiplication(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String findDivision(@RequestParam("num1") int num1,@RequestParam("num2") int num2) {
        if (service.divide(num1, num2) == -1) {
            return "Error";
        } else {
            return num1 + " / " + num2 + " = " + service.divide(num1, num2);
        }
    }
}
