package org.csu.dp.experiment1.exp4;

/**
 * Created by sun on 2019/11/26
 */
public class IMAPConnectionFactory implements ConnectionFactory {

    public Connection getConnection() {
        return new IMAPConnection();
    }
}
