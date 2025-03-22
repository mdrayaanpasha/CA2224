abstract class PlayMessage {  
    abstract void message();  
}  

class VoiceMessage extends PlayMessage {  
    @Override  
    void message() {  
        System.out.println("Voice message...");  
    }  
}  

class TextMessage extends PlayMessage {  
    @Override  
    void message() {  
        System.out.println("Text message...");  
    }  
}  

class FaxMachine extends PlayMessage {  
    @Override  
    void message() {  
        System.out.println("Fax message...");  
    }  
}  

public class Message {  
    public static void main(String[] args) {  
        System.out.println("= = ABSTRACT CLASS USAGE = = \n Mohammed Rayaan Pasha \n 10-03-25\n");  
        
        PlayMessage VM = new VoiceMessage();  
        PlayMessage FM = new FaxMachine();  
        PlayMessage TM = new TextMessage();  

        VM.message();  
        FM.message();  
        TM.message();  
    }  
}
