package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CallNoArgs_1_0");
    Fail75:
    { 
      IStrategoTerm l_103 = null;
      IStrategoTerm k_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consCallNoArgs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail75;
      k_103 = term.getSubterm(0);
      IStrategoList annos65 = term.getAnnotations();
      l_103 = annos65;
      term = u_14.invoke(context, k_103);
      if(term == null)
        break Fail75;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consCallNoArgs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}