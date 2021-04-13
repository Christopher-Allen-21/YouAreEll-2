package controllers;

import models.Id;
import org.apache.http.impl.client.CloseableHttpClient;

import java.util.List;

public class TransactionController {
    private String rootURL = "http://zipcode.rocks:8085";
    private MessageController msgCtrl;
    private IdController idCtrl;
    private CloseableHttpClient transactionClient;

    public TransactionController(MessageController m, IdController j) {}

    public List<Id> getIds() {
        return null;
    }
    public String postId(String idtoRegister, String githubName) {
        Id tid = new Id(idtoRegister, githubName);
        tid = idCtrl.postId(tid);
        return ("Id registered.");
    }

    public String makecall(String s, String get, String s1) {
        return null;
    }
}
