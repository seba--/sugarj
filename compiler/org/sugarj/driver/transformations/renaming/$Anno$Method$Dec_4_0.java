package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Anno$Method$Dec_4_0 extends Strategy 
{ 
  public static $Anno$Method$Dec_4_0 instance = new $Anno$Method$Dec_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_30, Strategy g_30, Strategy h_30, Strategy i_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AnnoMethodDec_4_0");
    Fail80:
    { 
      IStrategoTerm x_137 = null;
      IStrategoTerm t_137 = null;
      IStrategoTerm u_137 = null;
      IStrategoTerm v_137 = null;
      IStrategoTerm w_137 = null;
      IStrategoTerm y_137 = null;
      IStrategoTerm c_138 = null;
      IStrategoTerm d_138 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consAnnoMethodDec_4 != ((IStrategoAppl)term).getConstructor())
        break Fail80;
      t_137 = term.getSubterm(0);
      u_137 = term.getSubterm(1);
      v_137 = term.getSubterm(2);
      w_137 = term.getSubterm(3);
      IStrategoList annos56 = term.getAnnotations();
      x_137 = annos56;
      term = f_30.invoke(context, t_137);
      if(term == null)
        break Fail80;
      y_137 = term;
      term = g_30.invoke(context, u_137);
      if(term == null)
        break Fail80;
      c_138 = term;
      term = h_30.invoke(context, v_137);
      if(term == null)
        break Fail80;
      d_138 = term;
      term = i_30.invoke(context, w_137);
      if(term == null)
        break Fail80;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consAnnoMethodDec_4, new IStrategoTerm[]{y_137, c_138, d_138, term}), checkListAnnos(termFactory, x_137));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}