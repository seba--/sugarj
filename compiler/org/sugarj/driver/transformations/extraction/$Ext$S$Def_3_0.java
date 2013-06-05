package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Ext$S$Def_3_0 extends Strategy 
{ 
  public static $Ext$S$Def_3_0 instance = new $Ext$S$Def_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_19, Strategy e_19, Strategy f_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtSDef_3_0");
    Fail79:
    { 
      IStrategoTerm b_112 = null;
      IStrategoTerm y_111 = null;
      IStrategoTerm z_111 = null;
      IStrategoTerm a_112 = null;
      IStrategoTerm c_112 = null;
      IStrategoTerm d_112 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consExtSDef_3 != ((IStrategoAppl)term).getConstructor())
        break Fail79;
      y_111 = term.getSubterm(0);
      z_111 = term.getSubterm(1);
      a_112 = term.getSubterm(2);
      IStrategoList annos52 = term.getAnnotations();
      b_112 = annos52;
      term = d_19.invoke(context, y_111);
      if(term == null)
        break Fail79;
      c_112 = term;
      term = e_19.invoke(context, z_111);
      if(term == null)
        break Fail79;
      d_112 = term;
      term = f_19.invoke(context, a_112);
      if(term == null)
        break Fail79;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consExtSDef_3, new IStrategoTerm[]{c_112, d_112, term}), checkListAnnos(termFactory, b_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}