package com.behavior.wzh.template;

public class Main {
    public static void main(String[] args) {
        Task task = new TransferMoneyTask();
        //task.doExecute();
        // 在同一个包下没用
        task.execute();
    }
}
