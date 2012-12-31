package org.sugarj.driver.transformations.renameRules;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Prim$No$Args_1_0 extends Strategy 
{ 
  public static $Prim$No$Args_1_0 instance = new $Prim$No$Args_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_15)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PrimNoArgs_1_0");
    Fail84:
    { 
      IStrategoTerm i_105 = null;
      IStrategoTerm h_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consPrimNoArgs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail84;
      h_105 = term.getSubterm(0);
      IStrategoList annos77 = term.getAnnotations();
      i_105 = annos77;
      term = k_15.invoke(context, h_105);
      if(term == null)
        break Fail84;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consPrimNoArgs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_105));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}