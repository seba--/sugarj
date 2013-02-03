package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Overlay$No$Args_2_0 extends Strategy 
{ 
  public static $Overlay$No$Args_2_0 instance = new $Overlay$No$Args_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_11, Strategy a_12)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OverlayNoArgs_2_0");
    Fail35:
    { 
      IStrategoTerm n_95 = null;
      IStrategoTerm l_95 = null;
      IStrategoTerm m_95 = null;
      IStrategoTerm o_95 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consOverlayNoArgs_2 != ((IStrategoAppl)term).getConstructor())
        break Fail35;
      l_95 = term.getSubterm(0);
      m_95 = term.getSubterm(1);
      IStrategoList annos26 = term.getAnnotations();
      n_95 = annos26;
      term = z_11.invoke(context, l_95);
      if(term == null)
        break Fail35;
      o_95 = term;
      term = a_12.invoke(context, m_95);
      if(term == null)
        break Fail35;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consOverlayNoArgs_2, new IStrategoTerm[]{o_95, term}), checkListAnnos(termFactory, n_95));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}