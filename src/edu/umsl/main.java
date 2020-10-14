package edu.umsl;

import java.util.Base64;
import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        // Encoded String
        String encodedString = "SSBsb3ZlIG15IENNUCBTQ0kgMjI2MSBjbGFzcyBzbyBtdWNoLCBJIHdpc2ggSSBjb3VsZCBiZSBqdXN0IGFzIGNvb2wgYXMgbXkgcHJvZmVzc29y";

        // Decoding String into bytes
        byte[] decodedByte = Base64.getDecoder().decode(encodedString);

        // Converting the decoded byte back into a string
        String decodedString = new String(decodedByte);
        System.out.println(decodedString);

        // Ask user to enter a string
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String to encode: ");
        String preEncode = input.nextLine();

        // Encoding the string
        String postEncode = Base64.getEncoder().encodeToString(preEncode.getBytes());
        System.out.println("Your newly encoded string: " + postEncode);

    }
}
