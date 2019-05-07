package com.audience.admin.demo;

import com.ctrip.framework.apollo.openapi.client.ApolloOpenApiClient;
import com.ctrip.framework.apollo.openapi.dto.OpenAppNamespaceDTO;
import com.ctrip.framework.apollo.openapi.dto.OpenItemDTO;
import com.ctrip.framework.apollo.openapi.dto.OpenNamespaceDTO;

public class ThreadTest {

    public static void main(String[] args) {
        String portalUrl = "http://127.0.0.1:8070"; // portal url
        String token = "e505eee81310af522033bc38c367e9c7a073f82f"; // 申请的token
        ApolloOpenApiClient client = ApolloOpenApiClient.newBuilder()
                .withPortalUrl(portalUrl)
                .withToken(token)
                .build();
        OpenNamespaceDTO namespace = client.getNamespace("100004458", "dev", "default", "TEST1.wode");
        System.out.println(namespace.getNamespaceName());

//        OpenItemDTO openItemDTO = new OpenItemDTO();
//        openItemDTO.setKey("haha");
//        openItemDTO.setValue("hehe");
//        openItemDTO.setComment("ssss");
//        openItemDTO.setDataChangeCreatedBy("apollo");
//        client.createItem("100004458", "dev", "default", "TEST1.wode",openItemDTO);
//        client.getLatestActiveRelease()
    }

}
