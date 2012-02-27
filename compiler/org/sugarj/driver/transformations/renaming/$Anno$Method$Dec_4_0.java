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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_16, Strategy v_16, Strategy w_16, Strategy x_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AnnoMethodDec_4_0");
    Fail44:
    { 
      IStrategoTerm d_105 = null;
      IStrategoTerm z_104 = null;
      IStrategoTerm a_105 = null;
      IStrategoTerm b_105 = null;
      IStrategoTerm c_105 = null;
      IStrategoTerm e_105 = null;
      IStrategoTerm f_105 = null;
      IStrategoTerm g_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAnnoMethodDec_4 != ((IStrategoAppl)term).getConstructor())
        break Fail44;
      z_104 = term.getSubterm(0);
      a_105 = term.getSubterm(1);
      b_105 = term.getSubterm(2);
      c_105 = term.getSubterm(3);
      IStrategoList annos30 = term.getAnnotations();
      d_105 = annos30;
      term = u_16.invoke(context, z_104);
      if(term == null)
        break Fail44;
      e_105 = term;
      term = v_16.invoke(context, a_105);
      if(term == null)
        break Fail44;
      f_105 = term;
      term = w_16.invoke(context, b_105);
      if(term == null)
        break Fail44;
      g_105 = term;
      term = x_16.invoke(context, c_105);
      if(term == null)
        break Fail44;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAnnoMethodDec_4, new IStrategoTerm[]{e_105, f_105, g_105, term}), checkListAnnos(termFactory, d_105));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}