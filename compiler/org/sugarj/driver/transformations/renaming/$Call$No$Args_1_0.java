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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CallNoArgs_1_0");
    Fail74:
    { 
      IStrategoTerm o_103 = null;
      IStrategoTerm n_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consCallNoArgs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail74;
      n_103 = term.getSubterm(0);
      IStrategoList annos65 = term.getAnnotations();
      o_103 = annos65;
      term = x_14.invoke(context, n_103);
      if(term == null)
        break Fail74;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consCallNoArgs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}