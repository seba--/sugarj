package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Type$Name_2_0 extends Strategy 
{ 
  public static $Type$Name_2_0 instance = new $Type$Name_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_26, Strategy c_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TypeName_2_0");
    Fail171:
    { 
      IStrategoTerm c_132 = null;
      IStrategoTerm a_132 = null;
      IStrategoTerm b_132 = null;
      IStrategoTerm d_132 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consTypeName_2 != ((IStrategoAppl)term).getConstructor())
        break Fail171;
      a_132 = term.getSubterm(0);
      b_132 = term.getSubterm(1);
      IStrategoList annos152 = term.getAnnotations();
      c_132 = annos152;
      term = b_26.invoke(context, a_132);
      if(term == null)
        break Fail171;
      d_132 = term;
      term = c_26.invoke(context, b_132);
      if(term == null)
        break Fail171;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consTypeName_2, new IStrategoTerm[]{d_132, term}), checkListAnnos(termFactory, c_132));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}