package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Class$Or$Interface$Type_2_0 extends Strategy 
{ 
  public static $Class$Or$Interface$Type_2_0 instance = new $Class$Or$Interface$Type_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_30, Strategy u_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ClassOrInterfaceType_2_0");
    Fail205:
    { 
      IStrategoTerm d_148 = null;
      IStrategoTerm b_148 = null;
      IStrategoTerm c_148 = null;
      IStrategoTerm e_148 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consClassOrInterfaceType_2 != ((IStrategoAppl)term).getConstructor())
        break Fail205;
      b_148 = term.getSubterm(0);
      c_148 = term.getSubterm(1);
      IStrategoList annos179 = term.getAnnotations();
      d_148 = annos179;
      term = t_30.invoke(context, b_148);
      if(term == null)
        break Fail205;
      e_148 = term;
      term = u_30.invoke(context, c_148);
      if(term == null)
        break Fail205;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consClassOrInterfaceType_2, new IStrategoTerm[]{e_148, term}), checkListAnnos(termFactory, d_148));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}