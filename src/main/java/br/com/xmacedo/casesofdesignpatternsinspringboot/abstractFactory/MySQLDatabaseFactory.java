package br.com.xmacedo.casesofdesignpatternsinspringboot.abstractFactory;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component("mysqlFactory")
@ConditionalOnProperty(name="db.type", havingValue = "mysql")
public class MySQLDatabaseFactory implements DatabaseFactory{

    @Override
    public Connection createConnection() {
        return new MySQLConnection();
    }

    @Override
    public Transaction createTransaction(){
        return new MySQLTransaction();
    }
}
