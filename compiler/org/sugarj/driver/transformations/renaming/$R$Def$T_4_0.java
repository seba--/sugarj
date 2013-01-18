package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $R$Def$T_4_0 extends Strategy 
{ 
  public static $R$Def$T_4_0 instance = new $R$Def$T_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_42, Strategy b_42, Strategy c_42, Strategy d_42)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("RDefT_4_0");
    Fail269:
    { 
      IStrategoTerm c_179 = null;
      IStrategoTerm y_178 = null;
      IStrategoTerm z_178 = null;
      IStrategoTerm a_179 = null;
      IStrategoTerm b_179 = null;
      IStrategoTerm d_179 = null;
      IStrategoTerm e_179 = null;
      IStrategoTerm f_179 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consRDefT_4 != ((IStrategoAppl)term).getConstructor())
        break Fail269;
      y_178 = term.getSubterm(0);
      z_178 = term.getSubterm(1);
      a_179 = term.getSubterm(2);
      b_179 = term.getSubterm(3);
      IStrategoList annos216 = term.getAnnotations();
      c_179 = annos216;
      term = a_42.invoke(context, y_178);
      if(term == null)
        break Fail269;
      d_179 = term;
      term = b_42.invoke(context, z_178);
      if(term == null)
        break Fail269;
      e_179 = term;
      term = c_42.invoke(context, a_179);
      if(term == null)
        break Fail269;
      f_179 = term;
      term = d_42.invoke(context, b_179);
      if(term == null)
        break Fail269;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consRDefT_4, new IStrategoTerm[]{d_179, e_179, f_179, term}), checkListAnnos(termFactory, c_179));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}