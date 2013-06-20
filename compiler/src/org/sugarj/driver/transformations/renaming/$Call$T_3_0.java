package org.sugarj.driver.transformations.renaming;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_16, Strategy w_16, Strategy x_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CallT_3_0");
    Fail109:
    { 
      IStrategoTerm d_109 = null;
      IStrategoTerm a_109 = null;
      IStrategoTerm b_109 = null;
      IStrategoTerm c_109 = null;
      IStrategoTerm e_109 = null;
      IStrategoTerm f_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consCallT_3 != ((IStrategoAppl)term).getConstructor())
        break Fail109;
      a_109 = term.getSubterm(0);
      b_109 = term.getSubterm(1);
      c_109 = term.getSubterm(2);
      IStrategoList annos97 = term.getAnnotations();
      d_109 = annos97;
      term = v_16.invoke(context, a_109);
      if(term == null)
        break Fail109;
      e_109 = term;
      term = w_16.invoke(context, b_109);
      if(term == null)
        break Fail109;
      f_109 = term;
      term = x_16.invoke(context, c_109);
      if(term == null)
        break Fail109;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consCallT_3, new IStrategoTerm[]{e_109, f_109, term}), checkListAnnos(termFactory, d_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}