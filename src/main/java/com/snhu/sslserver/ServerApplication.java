package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

}

@RestController
class ServerController{
    //FIXME:  Add hash function to return the checksum value for the data string that should contain your name.
    @RequestMapping("/hash")
    public String myHash(){
        try {
            // Create an object of MessageDigest class using the java.security.MessageDigest library.
            // Initialize the object with your selection for an appropriate algorithm cipher.
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            String data = "Ryan Grunest";
            byte[] hashBytes = digest.digest(data.getBytes());

            // convert bytes to hex for display
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                hexString.append(String.format("%02x", b));
            }

            return "<p>data:" + data + " <br>Name of Cipher Algorithm used: SHA-256. <br>Value:" + hexString + "</p>";
        } catch (NoSuchAlgorithmException e) {
            return "Error: " + e.getMessage();
        }
    }
}
