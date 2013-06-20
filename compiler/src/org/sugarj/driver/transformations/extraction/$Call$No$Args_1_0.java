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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CallNoArgs_1_0");
    Fail101:
    { 
      IStrategoTerm g_117 = null;
      IStrategoTerm f_117 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consCallNoArgs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail101;
      f_117 = term.getSubterm(0);
      IStrategoList annos74 = term.getAnnotations();
      g_117 = annos74;
      term = e_21.invoke(context, f_117);
      if(term == null)
        break Fail101;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consCallNoArgs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_117));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}