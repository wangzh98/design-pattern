package com.behavior.wzh.command;

import com.behavior.wzh.command.fx.Button;

public class Main {
    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        AddCustomerCommand command = new AddCustomerCommand(service);
        Button button = new Button(command);
        button.click();
    }
}
