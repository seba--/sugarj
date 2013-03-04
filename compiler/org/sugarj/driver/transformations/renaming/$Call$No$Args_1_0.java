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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_45)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CallNoArgs_1_0");
    Fail310:
    { 
      IStrategoTerm s_187 = null;
      IStrategoTerm r_187 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consCallNoArgs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail310;
      r_187 = term.getSubterm(0);
      IStrategoList annos257 = term.getAnnotations();
      s_187 = annos257;
      term = g_45.invoke(context, r_187);
      if(term == null)
        break Fail310;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consCallNoArgs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_187));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}