package com.springhow.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloWorldApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(HelloWorldApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class);
    }


    @RequestMapping("/")
    String helloWorld() {
        return "<Html> <Head>  <title>      Example of center and BR tag       </title>      </Head>          <Body>           <!-- In this example we use the center tag which specify the content at centre of the webpage.-->   <center>       HTML tutorial in JavaTpoint <br> <!-- The BR tag is used to break a line. -->    CSS tutorial in JavaTpoint <br>      </cente     JavaScript tutorial in JavaTpoint <!-- Here BR tag is not used, so the next statement is in continuous with one space after this statement. -->   Jquery tutorial in JavaTpoint <br>  </Body>  </Html>  ";
    }

}
