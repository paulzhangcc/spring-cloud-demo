package com.paulzhangcc.demo;

import org.apache.commons.lang.StringUtils;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by paul on 2017/7/21.
 */
public class ElasticsearchStart {
    public static void main(String[] args) throws UnknownHostException {
        Settings settings = Settings.builder()
                .put("cluster.name", "elasticsearch")
                .put("client.transport.sniff", true)
                .put("client.transport.ignore_cluster_name", false)
                .put("client.transport.ping_timeout", "5s")
                .put("client.transport.nodes_sampler_interval", "5s")
                .build();
        String clusterNode = "127.0.0.1:9300";
        TransportClient client = TransportClient.builder().settings(settings).build();
        {
            String hostName = StringUtils.substringBeforeLast(clusterNode, ":");
            String port = StringUtils.substringAfterLast(clusterNode, ":");
            client.addTransportAddress(
                    new InetSocketTransportAddress(InetAddress.getByName(hostName), Integer.valueOf(port).intValue()));
        }

        SearchRequestBuilder responsebuilder = client.prepareSearch("pengrun").setTypes("loan");
        //responsebuilder.setQuery();
    }
}


