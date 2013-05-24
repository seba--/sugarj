package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_339, Strategy n_339)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OverlayNoArgs_2_0");
    Fail852:
    { 
      IStrategoTerm y_438 = null;
      IStrategoTerm w_438 = null;
      IStrategoTerm x_438 = null;
      IStrategoTerm z_438 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consOverlayNoArgs_2 != ((IStrategoAppl)term).getConstructor())
        break Fail852;
      w_438 = term.getSubterm(0);
      x_438 = term.getSubterm(1);
      IStrategoList annos98 = term.getAnnotations();
      y_438 = annos98;
      term = m_339.invoke(context, w_438);
      if(term == null)
        break Fail852;
      z_438 = term;
      term = n_339.invoke(context, x_438);
      if(term == null)
        break Fail852;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consOverlayNoArgs_2, new IStrategoTerm[]{z_438, term}), checkListAnnos(termFactory, y_438));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}