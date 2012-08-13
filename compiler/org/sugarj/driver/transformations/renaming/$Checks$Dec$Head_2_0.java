package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Checks$Dec$Head_2_0 extends Strategy 
{ 
  public static $Checks$Dec$Head_2_0 instance = new $Checks$Dec$Head_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_19, Strategy k_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ChecksDecHead_2_0");
    Fail53:
    { 
      IStrategoTerm d_110 = null;
      IStrategoTerm b_110 = null;
      IStrategoTerm c_110 = null;
      IStrategoTerm e_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consChecksDecHead_2 != ((IStrategoAppl)term).getConstructor())
        break Fail53;
      b_110 = term.getSubterm(0);
      c_110 = term.getSubterm(1);
      IStrategoList annos35 = term.getAnnotations();
      d_110 = annos35;
      term = j_19.invoke(context, b_110);
      if(term == null)
        break Fail53;
      e_110 = term;
      term = k_19.invoke(context, c_110);
      if(term == null)
        break Fail53;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consChecksDecHead_2, new IStrategoTerm[]{e_110, term}), checkListAnnos(termFactory, d_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}