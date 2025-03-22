class InvalidException extends Exception{
    InvalidException(String S){
        super(S);
    }
}


public class ExceptionCreator {
    void ageProcessor(int age) throws InvalidException{
        if(age < 18){
            throw new InvalidException("UnderAge");
        }else{
            System.out.println("Welcome you lil slank!");
        }
    }

    public static void main(String[] args) {
        ExceptionCreator obj =  new ExceptionCreator();
        try {
            obj.ageProcessor(16);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
