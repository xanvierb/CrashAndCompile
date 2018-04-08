import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

 

class Hello {

    public static void main(String... a) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(reader.readLine());

    }

}


