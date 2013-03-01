package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Rec_2_0 extends Strategy 
{ 
  public static $Rec_2_0 instance = new $Rec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_46, Strategy d_46)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Rec_2_0");
    Fail327:
    { 
      IStrategoTerm c_190 = null;
      IStrategoTerm a_190 = null;
      IStrategoTerm b_190 = null;
      IStrategoTerm d_190 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail327;
      a_190 = term.getSubterm(0);
      b_190 = term.getSubterm(1);
      IStrategoList annos273 = term.getAnnotations();
      c_190 = annos273;
      term = c_46.invoke(context, a_190);
      if(term == null)
        break Fail327;
      d_190 = term;
      term = d_46.invoke(context, b_190);
      if(term == null)
        break Fail327;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRec_2, new IStrategoTerm[]{d_190, term}), checkListAnnos(termFactory, c_190));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}