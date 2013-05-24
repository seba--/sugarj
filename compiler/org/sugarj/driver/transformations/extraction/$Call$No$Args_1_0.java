package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Call$No$Args_1_0 extends Strategy 
{ 
  public static $Call$No$Args_1_0 instance = new $Call$No$Args_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_343)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CallNoArgs_1_0");
    Fail915:
    { 
      IStrategoTerm f_450 = null;
      IStrategoTerm e_450 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consCallNoArgs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail915;
      e_450 = term.getSubterm(0);
      IStrategoList annos160 = term.getAnnotations();
      f_450 = annos160;
      term = y_343.invoke(context, e_450);
      if(term == null)
        break Fail915;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consCallNoArgs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_450));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}