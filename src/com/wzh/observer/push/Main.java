package com.wzh.observer.pull;

public class Main {
    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        SpreadSheet spreadSheet1 = new SpreadSheet();
        SpreadSheet spreadSheet2 = new SpreadSheet();
        Chart chart = new Chart();

        dataSource.addObserver(spreadSheet1);
        dataSource.addObserver(spreadSheet2);
        dataSource.addObserver(chart);

        dataSource.setValue(1);

    }
}
