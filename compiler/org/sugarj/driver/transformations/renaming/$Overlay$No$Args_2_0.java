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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_42, Strategy n_42)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OverlayNoArgs_2_0");
    Fail273:
    { 
      IStrategoTerm c_180 = null;
      IStrategoTerm a_180 = null;
      IStrategoTerm b_180 = null;
      IStrategoTerm d_180 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consOverlayNoArgs_2 != ((IStrategoAppl)term).getConstructor())
        break Fail273;
      a_180 = term.getSubterm(0);
      b_180 = term.getSubterm(1);
      IStrategoList annos220 = term.getAnnotations();
      c_180 = annos220;
      term = m_42.invoke(context, a_180);
      if(term == null)
        break Fail273;
      d_180 = term;
      term = n_42.invoke(context, b_180);
      if(term == null)
        break Fail273;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consOverlayNoArgs_2, new IStrategoTerm[]{d_180, term}), checkListAnnos(termFactory, c_180));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}