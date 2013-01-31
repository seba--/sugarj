package quest.lang.var;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import quest.lang.var.Variable;

/**
 * @author seba
 *
 */
public class VariableStringTextField extends JTextField implements Variable.ChangeListener<String> {
  private static final long serialVersionUID = 1L;

  final private Variable<String> var;
  
  public VariableStringTextField(final Variable<String> var) {
    this.var = var;
    var.addChangeListener(this);
    getDocument().addDocumentListener(new DocumentListener() {
      private void anyUpdate() {
        var.set(getText());
      }
      public void removeUpdate(DocumentEvent arg0) { anyUpdate(); }
      public void insertUpdate(DocumentEvent arg0) { anyUpdate(); }
      public void changedUpdate(DocumentEvent arg0) { anyUpdate(); }
    });
  }

  public void changed(String old, String now) {
    this.setText(now);
  }
}
