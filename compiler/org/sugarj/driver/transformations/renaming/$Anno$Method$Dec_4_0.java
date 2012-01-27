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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_15, Strategy y_15, Strategy z_15, Strategy a_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AnnoMethodDec_4_0");
    Fail39:
    { 
      IStrategoTerm e_104 = null;
      IStrategoTerm z_103 = null;
      IStrategoTerm b_104 = null;
      IStrategoTerm c_104 = null;
      IStrategoTerm d_104 = null;
      IStrategoTerm f_104 = null;
      IStrategoTerm h_104 = null;
      IStrategoTerm i_104 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAnnoMethodDec_4 != ((IStrategoAppl)term).getConstructor())
        break Fail39;
      z_103 = term.getSubterm(0);
      b_104 = term.getSubterm(1);
      c_104 = term.getSubterm(2);
      d_104 = term.getSubterm(3);
      IStrategoList annos30 = term.getAnnotations();
      e_104 = annos30;
      term = x_15.invoke(context, z_103);
      if(term == null)
        break Fail39;
      f_104 = term;
      term = y_15.invoke(context, b_104);
      if(term == null)
        break Fail39;
      h_104 = term;
      term = z_15.invoke(context, c_104);
      if(term == null)
        break Fail39;
      i_104 = term;
      term = a_16.invoke(context, d_104);
      if(term == null)
        break Fail39;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAnnoMethodDec_4, new IStrategoTerm[]{f_104, h_104, i_104, term}), checkListAnnos(termFactory, e_104));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}