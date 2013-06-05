package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Explode$Cong_2_0 extends Strategy 
{ 
  public static $Explode$Cong_2_0 instance = new $Explode$Cong_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_21, Strategy e_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExplodeCong_2_0");
    Fail101:
    { 
      IStrategoTerm f_117 = null;
      IStrategoTerm d_117 = null;
      IStrategoTerm e_117 = null;
      IStrategoTerm g_117 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consExplodeCong_2 != ((IStrategoAppl)term).getConstructor())
        break Fail101;
      d_117 = term.getSubterm(0);
      e_117 = term.getSubterm(1);
      IStrategoList annos74 = term.getAnnotations();
      f_117 = annos74;
      term = d_21.invoke(context, d_117);
      if(term == null)
        break Fail101;
      g_117 = term;
      term = e_21.invoke(context, e_117);
      if(term == null)
        break Fail101;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consExplodeCong_2, new IStrategoTerm[]{g_117, term}), checkListAnnos(termFactory, f_117));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}