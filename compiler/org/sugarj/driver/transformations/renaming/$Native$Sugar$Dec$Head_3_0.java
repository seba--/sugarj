package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Native$Sugar$Dec$Head_3_0 extends Strategy 
{ 
  public static $Native$Sugar$Dec$Head_3_0 instance = new $Native$Sugar$Dec$Head_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_17, Strategy r_17, Strategy s_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("NativeSugarDecHead_3_0");
    Fail21:
    { 
      IStrategoTerm b_105 = null;
      IStrategoTerm y_104 = null;
      IStrategoTerm z_104 = null;
      IStrategoTerm a_105 = null;
      IStrategoTerm c_105 = null;
      IStrategoTerm d_105 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consNativeSugarDecHead_3 != ((IStrategoAppl)term).getConstructor())
        break Fail21;
      y_104 = term.getSubterm(0);
      z_104 = term.getSubterm(1);
      a_105 = term.getSubterm(2);
      IStrategoList annos3 = term.getAnnotations();
      b_105 = annos3;
      term = q_17.invoke(context, y_104);
      if(term == null)
        break Fail21;
      c_105 = term;
      term = r_17.invoke(context, z_104);
      if(term == null)
        break Fail21;
      d_105 = term;
      term = s_17.invoke(context, a_105);
      if(term == null)
        break Fail21;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consNativeSugarDecHead_3, new IStrategoTerm[]{c_105, d_105, term}), checkListAnnos(termFactory, b_105));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}