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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDecNoArgs_1_0");
    Fail26:
    { 
      IStrategoTerm b_104 = null;
      IStrategoTerm z_103 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consRDecNoArgs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26;
      z_103 = term.getSubterm(0);
      IStrategoList annos3 = term.getAnnotations();
      b_104 = annos3;
      term = l_16.invoke(context, z_103);
      if(term == null)
        break Fail26;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consRDecNoArgs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}