package com.classes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {
        ClientService clientService = new ClientService();
        clientService.enregistrerClient("Doe", "John", "0123456789");
    }
}