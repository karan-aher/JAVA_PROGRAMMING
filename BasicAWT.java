// Practical no 14 Design a form using AWT
import java.awt.*;

public class BasicAWT {
    public static void main(String args[]) {
        Frame f = new Frame();
        f.setSize(400, 400);
        f.setVisible(true);
        f.setLayout(new FlowLayout());

        Label l1 = new Label();
        l1.setText("Enter Your Name");

        TextField tf = new TextField("Karan");

        Label l2 = new Label("Address");
        TextArea ta = new TextArea("", 4, 40);

        Button b = new Button("Submit");

        f.add(l1);
        f.add(tf);
        f.add(l2);
        f.add(ta);
        f.add(b);
    }
}
/*
  Output: A window will open with a label "Enter Your Name" and a text field
  with default value "Karan" and a label "Address" and a text area with 4 rows
 *and 40 columns and a button "Submit"
 */