package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Int_1_0 extends Strategy 
{ 
  public static $Int_1_0 instance = new $Int_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Int_1_0");
    Fail172:
    { 
      IStrategoTerm z_128 = null;
      IStrategoTerm y_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consInt_1 != ((IStrategoAppl)term).getConstructor())
        break Fail172;
      y_128 = term.getSubterm(0);
      IStrategoList annos141 = term.getAnnotations();
      z_128 = annos141;
      term = c_25.invoke(context, y_128);
      if(term == null)
        break Fail172;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consInt_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_128));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}