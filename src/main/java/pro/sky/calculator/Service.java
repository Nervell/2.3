package pro.sky.calculator;

@org.springframework.stereotype.Service
public class Service {

    public int addition(int num1, int num2) {
        return num1 + num2;
    }

    public int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        if (num2 == 0) {
            return -1;
        } else {
            return num1 / num2;
        }
    }

}