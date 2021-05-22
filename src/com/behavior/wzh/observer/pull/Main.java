package com.behavior.wzh.observer.pull;

public class Main {
    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        SpreadSheet spreadSheet1 = new SpreadSheet(dataSource);
        SpreadSheet spreadSheet2 = new SpreadSheet(dataSource);
        Chart chart = new Chart(dataSource);

        dataSource.addObserver(spreadSheet1);
        dataSource.addObserver(spreadSheet2);
        dataSource.addObserver(chart);

        dataSource.setValue(1);

    }
}
