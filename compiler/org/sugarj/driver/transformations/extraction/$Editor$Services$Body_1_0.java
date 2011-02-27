package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_31)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("EditorServicesBody_1_0");
    Fail286:
    { 
      IStrategoTerm l_154 = null;
      IStrategoTerm k_154 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consEditorServicesBody_1 != ((IStrategoAppl)term).getConstructor())
        break Fail286;
      k_154 = term.getSubterm(0);
      IStrategoList annos241 = term.getAnnotations();
      l_154 = annos241;
      term = c_31.invoke(context, k_154);
      if(term == null)
        break Fail286;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consEditorServicesBody_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_154));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}