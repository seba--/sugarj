package quest.lang.var;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import quest.lang.var.Variable;

/**
 * @author seba
 *
 */
public class VariableIntegerTextField extends JTextField implements Variable.ChangeListener<Integer> {
  private static final long serialVersionUID = 1L;

  final private Variable<Integer> var;
  
  public VariableIntegerTextField(final Variable<Integer> var) {
    this.var = var;
    var.addChangeListener(this);
    getDocument().addDocumentListener(new DocumentListener() {
      private void anyUpdate() {
        try {
          var.set(Integer.valueOf(getText()));
        } catch (NumberFormatException e) {
          var.set(0);
        }
      }
      public void removeUpdate(DocumentEvent arg0) { anyUpdate(); }
      public void insertUpdate(DocumentEvent arg0) { anyUpdate(); }
      public void changedUpdate(DocumentEvent arg0) { anyUpdate(); }
    });
  }

  public void changed(Integer old, Integer now) {
    this.setText(String.valueOf(now));
  }
}
