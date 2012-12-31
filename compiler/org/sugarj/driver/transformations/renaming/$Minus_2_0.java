package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Minus_2_0 extends Strategy 
{ 
  public static $Minus_2_0 instance = new $Minus_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_37, Strategy h_37)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Minus_2_0");
    Fail168:
    { 
      IStrategoTerm j_163 = null;
      IStrategoTerm e_163 = null;
      IStrategoTerm i_163 = null;
      IStrategoTerm k_163 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consMinus_2 != ((IStrategoAppl)term).getConstructor())
        break Fail168;
      e_163 = term.getSubterm(0);
      i_163 = term.getSubterm(1);
      IStrategoList annos138 = term.getAnnotations();
      j_163 = annos138;
      term = g_37.invoke(context, e_163);
      if(term == null)
        break Fail168;
      k_163 = term;
      term = h_37.invoke(context, i_163);
      if(term == null)
        break Fail168;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consMinus_2, new IStrategoTerm[]{k_163, term}), checkListAnnos(termFactory, j_163));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}