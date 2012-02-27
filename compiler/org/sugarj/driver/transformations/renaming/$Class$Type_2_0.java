package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Class$Type_2_0 extends Strategy 
{ 
  public static $Class$Type_2_0 instance = new $Class$Type_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_25, Strategy p_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ClassType_2_0");
    Fail158:
    { 
      IStrategoTerm c_129 = null;
      IStrategoTerm a_129 = null;
      IStrategoTerm b_129 = null;
      IStrategoTerm d_129 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consClassType_2 != ((IStrategoAppl)term).getConstructor())
        break Fail158;
      a_129 = term.getSubterm(0);
      b_129 = term.getSubterm(1);
      IStrategoList annos137 = term.getAnnotations();
      c_129 = annos137;
      term = o_25.invoke(context, a_129);
      if(term == null)
        break Fail158;
      d_129 = term;
      term = p_25.invoke(context, b_129);
      if(term == null)
        break Fail158;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consClassType_2, new IStrategoTerm[]{d_129, term}), checkListAnnos(termFactory, c_129));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}