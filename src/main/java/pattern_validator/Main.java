package pattern_validator;

import java.time.LocalDate;

import static pattern_validator.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Alice",
                "alice@mail.com",
                "+089876578",
                LocalDate.of(2020, 10, 1));

        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer);



        if (result != ValidationResult.SUCCESS){
            System.out.println(result.name());
            throw new IllegalStateException(result.name());
        }else {
            System.out.println(result);
        }
    }

}
