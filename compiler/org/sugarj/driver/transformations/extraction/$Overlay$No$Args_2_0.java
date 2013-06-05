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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_18, Strategy f_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OverlayNoArgs_2_0");
    Fail61:
    { 
      IStrategoTerm z_108 = null;
      IStrategoTerm x_108 = null;
      IStrategoTerm y_108 = null;
      IStrategoTerm a_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consOverlayNoArgs_2 != ((IStrategoAppl)term).getConstructor())
        break Fail61;
      x_108 = term.getSubterm(0);
      y_108 = term.getSubterm(1);
      IStrategoList annos34 = term.getAnnotations();
      z_108 = annos34;
      term = e_18.invoke(context, x_108);
      if(term == null)
        break Fail61;
      a_109 = term;
      term = f_18.invoke(context, y_108);
      if(term == null)
        break Fail61;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consOverlayNoArgs_2, new IStrategoTerm[]{a_109, term}), checkListAnnos(termFactory, z_108));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}