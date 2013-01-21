package org.sugarj.editor;

import org.eclipse.jface.text.DocumentEvent;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.imp.runtime.EditorState;
import org.strategoxt.imp.runtime.dynamicloading.IOnSaveService;

/**
 * @author Lennart Kats <lennart add lclnet.nl>
 */
public class SugarJOnSaveService implements IOnSaveService {

//  private final SugarJDescriptor descriptor;

  private final IOnSaveService baseService;
  
  public SugarJOnSaveService(SugarJDescriptor descriptor, IOnSaveService baseService) {
//    this.descriptor = descriptor;
    this.baseService = baseService;
  }

  @Override
  public void initialize(EditorState editor) {
    baseService.initialize(editor);
  }

  @Override
  public void documentAboutToBeChanged(DocumentEvent event) {
    baseService.documentAboutToBeChanged(event);
  }

  @Override
  public void documentChanged(DocumentEvent event) {
    baseService.documentChanged(event);
    // descriptor.reloadAllEditors(0);
  }

  @Override
  public void invokeOnSave(IStrategoTerm ast) {
    // TODO Auto-generated method stub
  }
}
