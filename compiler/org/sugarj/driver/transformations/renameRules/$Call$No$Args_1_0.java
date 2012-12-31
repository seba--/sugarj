package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_14)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CallNoArgs_1_0");
    Fail71:
    { 
      IStrategoTerm j_103 = null;
      IStrategoTerm i_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consCallNoArgs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail71;
      i_103 = term.getSubterm(0);
      IStrategoList annos65 = term.getAnnotations();
      j_103 = annos65;
      term = s_14.invoke(context, i_103);
      if(term == null)
        break Fail71;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consCallNoArgs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, j_103));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}