package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.Id;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class IdController {
    private HashMap<String, Id> allIds;
    private CloseableHttpClient transactionClient = HttpClients.createDefault();

    Id myId;

    public ArrayList<Id> getIds() {
        return null;
    }

    public Id postId(Id id) throws IOException {

        // create json from id
        // call server, get json result Or error
        // result json to Id obj
        ObjectMapper om  = new ObjectMapper();
        String jsonString = om.writeValueAsString(id);
        HttpPost post = new HttpPost("http://zipcode.rocks:8085");
        StringEntity entity = new StringEntity(jsonString);
        post.setEntity(entity);
        post.setHeader("Accept", "application/json");
        post.setHeader("Content-type", "application/json");

        CloseableHttpResponse response = transactionClient.execute(post);
        HttpEntity httpEntity = response.getEntity();
        String json = EntityUtils.toString(httpEntity);
//        assertThat(response.getStatusLine().getStatusCode(), equalTo(200));
        transactionClient.close();

        return om.readValue(json, Id.class);
    }



//    String json = "{"id":1,"name":"John"}";
//    StringEntity entity = new StringEntity(json);
//    httpPost.setEntity(entity);
//    httpPost.setHeader("Accept", "application/json");
//    httpPost.setHeader("Content-type", "application/json");
//    string json = line at the top replaced with JSON of ID object

    public Id putId(Id id) {
        return null;
    }
 
}