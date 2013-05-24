package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $R$Dec$No$Args_1_0 extends Strategy 
{ 
  public static $R$Dec$No$Args_1_0 instance = new $R$Dec$No$Args_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_340)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDecNoArgs_1_0");
    Fail870:
    { 
      IStrategoTerm f_442 = null;
      IStrategoTerm e_442 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consRDecNoArgs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail870;
      e_442 = term.getSubterm(0);
      IStrategoList annos116 = term.getAnnotations();
      f_442 = annos116;
      term = u_340.invoke(context, e_442);
      if(term == null)
        break Fail870;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consRDecNoArgs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_442));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}