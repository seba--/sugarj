package quest.lang.var;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import quest.lang.var.Variable;

/**
 * @author seba
 *
 */
public class VariableBooleanTextField extends JTextField implements Variable.ChangeListener<Boolean> {
  private static final long serialVersionUID = 1L;

  final private Variable<Boolean> var;
  
  public VariableBooleanTextField(final Variable<Boolean> var) {
    this.var = var;
    var.addChangeListener(this);
    getDocument().addDocumentListener(new DocumentListener() {
      private void anyUpdate() {
        var.set(Boolean.valueOf(getText()));
      }
      public void removeUpdate(DocumentEvent arg0) { anyUpdate(); }
      public void insertUpdate(DocumentEvent arg0) { anyUpdate(); }
      public void changedUpdate(DocumentEvent arg0) { anyUpdate(); }
    });
  }

  public void changed(Boolean old, Boolean now) {
    this.setText(String.valueOf(now));
  }
}
