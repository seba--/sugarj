package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Amb$Name_1_0 extends Strategy 
{ 
  public static $Amb$Name_1_0 instance = new $Amb$Name_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_31)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AmbName_1_0");
    Fail222:
    { 
      IStrategoTerm p_150 = null;
      IStrategoTerm o_150 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consAmbName_1 != ((IStrategoAppl)term).getConstructor())
        break Fail222;
      o_150 = term.getSubterm(0);
      IStrategoList annos196 = term.getAnnotations();
      p_150 = annos196;
      term = r_31.invoke(context, o_150);
      if(term == null)
        break Fail222;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consAmbName_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, p_150));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}