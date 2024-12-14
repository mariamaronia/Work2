package davaleba2;

public class Work2 implements Amethod,Bmethod{
    public void replaceSymbolA(String input){
        String modifiedInput = input.replace('a','z');
        System.out.println(modifiedInput);
    }
    public void replaceSymbolB(String input){
        String modifiedInput = input.replace('b', 'w');
        System.out.println(modifiedInput);

    }
}
