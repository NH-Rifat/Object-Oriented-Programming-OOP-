public class TextBox {
    private String text;

    public void setText(String text){
        this.text = text + " student" ;
    }

    public void clearText(){
        this.text="clear";
    }

    public void printText(){
        System.out.println(text);
    }
}
