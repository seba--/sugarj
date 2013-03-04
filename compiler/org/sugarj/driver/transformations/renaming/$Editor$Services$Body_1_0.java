package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Editor$Services$Body_1_0 extends Strategy 
{ 
  public static $Editor$Services$Body_1_0 instance = new $Editor$Services$Body_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("EditorServicesBody_1_0");
    Fail37:
    { 
      IStrategoTerm j_126 = null;
      IStrategoTerm i_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consEditorServicesBody_1 != ((IStrategoAppl)term).getConstructor())
        break Fail37;
      i_126 = term.getSubterm(0);
      IStrategoList annos14 = term.getAnnotations();
      j_126 = annos14;
      term = i_27.invoke(context, i_126);
      if(term == null)
        break Fail37;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consEditorServicesBody_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}