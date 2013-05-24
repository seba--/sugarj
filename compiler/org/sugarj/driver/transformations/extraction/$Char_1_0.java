package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Char_1_0 extends Strategy 
{ 
  public static $Char_1_0 instance = new $Char_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_344)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Char_1_0");
    Fail930:
    { 
      IStrategoTerm s_452 = null;
      IStrategoTerm r_452 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consChar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail930;
      r_452 = term.getSubterm(0);
      IStrategoList annos175 = term.getAnnotations();
      s_452 = annos175;
      term = x_344.invoke(context, r_452);
      if(term == null)
        break Fail930;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consChar_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_452));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}