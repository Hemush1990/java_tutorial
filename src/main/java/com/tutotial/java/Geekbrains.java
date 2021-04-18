package com.tutotial.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Geekbrains {
    public static void main(String[] args) throws IOException {
        ServerSocket serversocket = new ServerSocket(8080);
        System.out.println("Server is created successfully");

        Socket socket = serversocket.accept();
        System.out.println("The user connected");
       BufferedReader input =  new BufferedReader(
      new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
        PrintWriter output = new PrintWriter(socket.getOutputStream());
        output.println("HTTP/1.1 200 OK");
        output.println("<h1> Hello! </h1>");

        System.out.println(input.readLine());
    }
}
