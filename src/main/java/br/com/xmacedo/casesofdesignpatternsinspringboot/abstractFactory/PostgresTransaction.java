package br.com.xmacedo.casesofdesignpatternsinspringboot.abstractFactory;

public class PostgresTransaction implements Transaction {
    @Override
    public void begin() {
        System.out.println("Postgres Transaction Begin");
    }

    @Override
    public void commit() {
        System.out.println("Postgres Transaction Commit");
    }

    @Override
    public void rollback() {
        System.out.println("Postgres Transaction Rollback");
    }
}
