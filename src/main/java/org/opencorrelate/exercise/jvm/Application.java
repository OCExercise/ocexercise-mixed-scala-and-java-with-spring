package org.opencorrelate.exercise.jvm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner
{

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) 
    {
        SpringApplication.run(Application.class);
    }

    @Override
    public void run(String... strings) throws Exception {
        Computer c = new Computer("ticonderoga");
        Person p = new Person("Prez", c);
        
        log.info("{} is running this on his computer named {}.", p, p.computer());
    }
}
