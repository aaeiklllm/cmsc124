import groovy.util.logging.Log
import java.util.logging.FileHandler
import java.util.logging.SimpleFormatter

@Log
class MainClass
{
   static void main(String[] args) {
        String message = 'Hello, user!'
        println message
        FileHandler handler = new FileHandler("demo.log", true);
        handler.setFormatter(new SimpleFormatter())
        log.addHandler(handler)
        
        log.info(message)

        
    }
}

