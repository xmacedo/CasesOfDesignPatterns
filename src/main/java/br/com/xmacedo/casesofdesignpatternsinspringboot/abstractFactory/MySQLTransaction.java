package br.com.xmacedo.casesofdesignpatternsinspringboot.abstractFactory;

public class MySQLTransaction implements Transaction {
    @Override
    public void begin() {
        System.out.println("MySQL Transaction Begin");
    }

    @Override
    public void commit() {
        System.out.println("MySQL Transaction Commit");
    }

    @Override
    public void rollback() {
        System.out.println("MySQL Transaction Rollback");
    }
}
