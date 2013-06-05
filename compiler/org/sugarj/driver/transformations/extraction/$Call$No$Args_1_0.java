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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CallNoArgs_1_0");
    Fail100:
    { 
      IStrategoTerm b_117 = null;
      IStrategoTerm a_117 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consCallNoArgs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail100;
      a_117 = term.getSubterm(0);
      IStrategoList annos73 = term.getAnnotations();
      b_117 = annos73;
      term = c_21.invoke(context, a_117);
      if(term == null)
        break Fail100;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consCallNoArgs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_117));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}