package br.com.xmacedo.casesofdesignpatternsinspringboot.abstractFactory;

public class PostgresConnection implements Connection {
    @Override
    public void conect() {
        System.out.println("Postgres Connection");
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Executing query: " + query);
    }

    @Override
    public void close() {
        System.out.println("Postgres Connection Closed");
    }
}
