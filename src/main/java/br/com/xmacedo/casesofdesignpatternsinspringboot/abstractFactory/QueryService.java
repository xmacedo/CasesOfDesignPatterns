package br.com.xmacedo.casesofdesignpatternsinspringboot.abstractFactory;

import org.springframework.beans.factory.annotation.Qualifier;

public class QueryService {
    private final DatabaseFactory databaseFactory;

    public QueryService(@Qualifier("mysqlFactory") DatabaseFactory databaseFactory) {
        this.databaseFactory = databaseFactory;
    }

    public void executeQuery(String query) {
        Connection connection = databaseFactory.createConnection();
        Transaction transaction = databaseFactory.createTransaction();

        try {
            connection.conect();
            connection.executeQuery(query);

            transaction.begin();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            connection.close();
        }
    }
}
