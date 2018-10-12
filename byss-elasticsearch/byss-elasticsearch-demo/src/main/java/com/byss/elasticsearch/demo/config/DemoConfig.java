package com.byss.elasticsearch.demo.config;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 * @author boyang
 *
 */
@Configuration
public class DemoConfig {
	/**
     * es的构造
     * @return
     * @throws UnknownHostException
     */
    @Bean
    public TransportClient client() throws UnknownHostException {
 
        InetSocketTransportAddress node = new InetSocketTransportAddress(
                InetAddress.getByName("127.0.0.1"),
                9200
        );
 
        Settings settings = Settings.builder()
                .put("cluster.name", "wali")
                .build();
 
        TransportClient client =TransportClient.builder().settings(settings).build();
        client.addTransportAddress(node);
        return client;
    }

}
