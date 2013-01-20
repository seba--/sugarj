package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Member_3_0 extends Strategy 
{ 
  public static $Member_3_0 instance = new $Member_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_38, Strategy v_38, Strategy w_38)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Member_3_0");
    Fail192:
    { 
      IStrategoTerm x_168 = null;
      IStrategoTerm u_168 = null;
      IStrategoTerm v_168 = null;
      IStrategoTerm w_168 = null;
      IStrategoTerm y_168 = null;
      IStrategoTerm z_168 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consMember_3 != ((IStrategoAppl)term).getConstructor())
        break Fail192;
      u_168 = term.getSubterm(0);
      v_168 = term.getSubterm(1);
      w_168 = term.getSubterm(2);
      IStrategoList annos161 = term.getAnnotations();
      x_168 = annos161;
      term = u_38.invoke(context, u_168);
      if(term == null)
        break Fail192;
      y_168 = term;
      term = v_38.invoke(context, v_168);
      if(term == null)
        break Fail192;
      z_168 = term;
      term = w_38.invoke(context, w_168);
      if(term == null)
        break Fail192;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consMember_3, new IStrategoTerm[]{y_168, z_168, term}), checkListAnnos(termFactory, x_168));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}