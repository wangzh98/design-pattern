package com.behavior.wzh.observer.pull;

public class SpreadSheet implements Observer {
    private DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("spreadSheet got update" + dataSource.getValue());
    }
}
