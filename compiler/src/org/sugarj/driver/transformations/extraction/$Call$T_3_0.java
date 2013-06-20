package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Call$T_3_0 extends Strategy 
{ 
  public static $Call$T_3_0 instance = new $Call$T_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_23, Strategy d_23, Strategy e_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CallT_3_0");
    Fail136:
    { 
      IStrategoTerm c_123 = null;
      IStrategoTerm z_122 = null;
      IStrategoTerm a_123 = null;
      IStrategoTerm b_123 = null;
      IStrategoTerm d_123 = null;
      IStrategoTerm e_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consCallT_3 != ((IStrategoAppl)term).getConstructor())
        break Fail136;
      z_122 = term.getSubterm(0);
      a_123 = term.getSubterm(1);
      b_123 = term.getSubterm(2);
      IStrategoList annos106 = term.getAnnotations();
      c_123 = annos106;
      term = c_23.invoke(context, z_122);
      if(term == null)
        break Fail136;
      d_123 = term;
      term = d_23.invoke(context, a_123);
      if(term == null)
        break Fail136;
      e_123 = term;
      term = e_23.invoke(context, b_123);
      if(term == null)
        break Fail136;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consCallT_3, new IStrategoTerm[]{d_123, e_123, term}), checkListAnnos(termFactory, c_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}